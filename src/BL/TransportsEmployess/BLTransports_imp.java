package BL.TransportsEmployess;

import java.util.Vector;

import DAL.HR_TR.DALhrtrManager;
import SharedClasses.TransportsEmployess.Driver;
import SharedClasses.Pair;
import SharedClasses.TransportsEmployess.Site;
import SharedClasses.TransportsEmployess.Transport;
import SharedClasses.TransportsEmployess.TransportDestination;
import SharedClasses.TransportsEmployess.Truck;

public class BLTransports_imp implements BLTransports {

	//Fields
	DALhrtrManager dal;
	
	public BLTransports_imp() {
		dal = DALhrtrManager.getDALImp();
	}

	@Override
	public boolean createTruck(int truckNumber, String model, double weight, double maxWeight,
			int requiredLicenseType) {
		return dal.insertTruck(new Truck(truckNumber,model,weight,maxWeight, requiredLicenseType));
	}

	@Override
	public boolean checkTruckExist(int truckNumber) {
		return dal.fetchTruck(truckNumber) != null;
	}

	@Override
	public boolean updateTruck(int truckNumber, String model, double weight, double maxWeight,
			int requiredLicenseType) {
		return dal.updateTruck(new Truck(truckNumber,model,weight,maxWeight, requiredLicenseType));
	}

	@Override
	public Truck fetchTruck(int truckNumber) 
	{
		return dal.fetchTruck(truckNumber);
	}

	@Override
	public boolean deleteTruck(int truckNumber) {
		return dal.deleteTruck(truckNumber);
	}

	@Override
	public boolean checkDriverExist(int ID) {
		return dal.fetchDriver(ID) != null;
	}
	
	@Override
	public Driver fetchDriver(int ID) 
	{
		return dal.fetchDriver(ID);
	}

	@Override
	public boolean deleteDriver(int ID) {
		return dal.deleteEmployee(ID);
	}

	@Override
	public boolean createSite(String address, String phoneNumber, String contactName, /*int isStore,*/ int areaCode) {
		boolean res = dal.insertSite(new Site(address,phoneNumber,contactName, /*isStore,*/areaCode));
		DAL.Inventory.InvDALManager.getInstance().addProductsInNewStore(address);
		return res;
	}

	

	@Override
	public boolean updateSite(String address, String phoneNumber, String contactName, int areaCode) {
		return dal.updateSite(new Site(address,phoneNumber,contactName,areaCode));
	}

	@Override
	public Site fetchSite(String address) {
		return dal.fetchSite(address);
	}

	@Override
	public boolean deleteSite(String address) {
		return dal.deleteSite(address);
	}

	public boolean createTransport(String date, String time, int truckNumber, int driverID, int companyID/*String csource*/,
			double weight, int sourceDoc, String address) {
		return dal.insertTransport(new Transport(driverID, truckNumber, companyID, date, time, weight,sourceDoc,address));
	}

	/*@Override
	public boolean updateTransport(String date, String time, int truckNumber, int driverID, int companyIDString source,
			double weight, int sourceDoc, String address) {
	///	if(dal.checkLicenceAndWeight(driverID, truckNumber, weight)){
			return dal.updateTransport(new Transport(driverID, truckNumber, companyID, date, time, weight, sourceDoc,address));
	///	}
	///	return false;
	}*/

	@Override
	public Transport fetchTransport(String date, String time, int truckNumber) {
		return dal.fetchTransport(date, time, truckNumber);
	}
/*
	@Override
	public boolean deleteTransport(String date, String time, int truckNumber) {
		return dal.deleteTransport(date, time, truckNumber);
	}*/

	@Override
	public boolean addSiteToTransport(String date, String time, int truckNumber, int docCode, String hourOfArr)
	{
		return dal.insertTransportDestination(new TransportDestination(truckNumber, date, time, docCode , hourOfArr));
	}

/*	@Override
	public boolean deleteSiteFromTransport(String date, String time, int truckNumber, String siteAddress) {
		return dal.deleteTransportDestination(truckNumber,siteAddress,date,time);
	}*/


	@Override
	public Vector<Driver> fetchAvailableDrivers(String addressStore, String date, String time) 
	{
		if(time.equals("morning") || time.equals("evening"))
			return dal.fetchAvailableDrivers(addressStore, date, time);
		//Check shift type
		String type="morning";
		int hour = Integer.parseInt(time.substring(0, 2));
		if(hour<24 && hour>=12)
			type="evening";
		return dal.fetchAvailableDrivers(addressStore, date, type);
	}

	@Override
	public boolean insertDriver(Driver driver)
	{
		return dal.insertDriver(driver);
	}

	public boolean updateDriver(int id, int lio) 
	{
		return dal.updateDriver(id,lio);
	}

	@Override
	public String getTransportDests(String date, String hour, int truckNumber) {
		return dal.getTransportDests(date, hour, truckNumber);
	}

	@Override
	public Vector<Pair<String,String>> getHoursOfArrival(Transport trans) 
	{
		return dal.getHoursOfArrival(trans);
	}

	@Override
	public boolean checkIfTruckAvilable(String date,String time, int truckNumber) 
	{
		int transHour = Integer.parseInt(time.substring(0,2));
		Vector<Pair<String, Integer>> vec = dal.fetchtrucksAndDates(date);
		for(int i=0 ; i<vec.size(); i++){
			int hour = Integer.parseInt((vec.elementAt(i).getKey()).substring(0, 2));
			if(vec.elementAt(i).getValue()==truckNumber){ //Check if same truck
				if(Math.abs(transHour-hour)<12) //Check if at the same shift
					return false;
			}
		}
		return true;
	}

	public Vector<String> getNotHandledMessages(String workAddress) {
		// TODO CHANGE TO MESSAGES!!!!
		Vector<Pair<String, Integer>> messages = dal.getMessages(workAddress, false);
		Vector<String> ans = new Vector<String>();
		for(int i=0; i<messages.size(); i++){
			ans.add("Order number "+messages.elementAt(i).getValue().intValue()+" was added at "+messages.elementAt(i).getKey());
		}
		return ans;
	}

	public Vector<String> getHandledMessages(String workAddress) {
		// TODO CHANGE TO MESSAGES!!!!
		Vector<Pair<String, Integer>> messages = dal.getMessages(workAddress, true);
		Vector<String> ans = new Vector<String>();
		for(int i=0; i<messages.size(); i++){
			ans.add("Order number "+messages.elementAt(i).getValue().intValue()+" was added at "+messages.elementAt(i).getKey());
		}
		return ans;
	}
	
	@Override
	public boolean checkLicenceAndWeight(int driverId, int truckNo, double weight){
		return dal.checkLicenceAndWeight(driverId, truckNo, weight);
	}
	
	public Vector<Integer> fetchAvailableTrucks(String date, String shift){
		return this.dal.fetchAvailableTrucks(date, shift);
	}

	@Override
	public Vector<Integer> getOrdersInTransport(Transport trans) {
			return dal.getOrdersInTransport(trans);
	}

	public String getArrivalTime(int orderNumber, Transport transport) {

		return dal.fetchTransportDestination(transport.getTruckNo(),
				transport.getCompanyID(), 
				transport.getDateOfDep(), transport.getHourOfDep()).getHourOfArr();
	}

}
