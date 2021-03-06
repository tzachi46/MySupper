package BL.TransportsEmployess;

import java.util.LinkedList;
import java.util.Vector;

import SharedClasses.TransportsEmployess.Driver;
import SharedClasses.TransportsEmployess.Employee;
import SharedClasses.TransportsEmployess.EmployeeRestriction;
import SharedClasses.TransportsEmployess.EmployeeSpeciality;
import SharedClasses.TransportsEmployess.Message;
import SharedClasses.Pair;
import SharedClasses.StorageSuppliers.Order;
import SharedClasses.StorageSuppliers.OrderProduct;
import SharedClasses.TransportsEmployess.Shift;
import SharedClasses.TransportsEmployess.Site;
import SharedClasses.TransportsEmployess.Transport;
import SharedClasses.TransportsEmployess.Truck;

public interface BL {
	/*		EMPLOYEES		*/
	Vector<Pair<Shift,String>> fetchAllEmployeeShifts(int id);

    void sortDatesPair(Vector<Pair<Shift,String>> vec);

    public enum checkedStat
    {
        checked_in,
        already_checked,
        not_checked_in,
    }

    //employeeTable
    boolean addEmployee(String id, String salary, String private_name, String last_name, String start_of_employment_date, String end_of_employment_date, String rank , String bankAccount,String address,int day);
    boolean updateEmployee(String id, String salary, String private_name, String last_name, String start_of_employment_date, String end_of_employment_date, String rank , String bankAccount,String address, int day);
    boolean deleteEmployee(String id);
    Employee fetchEmployee(String id);
    boolean addShift(String date, String type,int manager,int cashier,int storekeeper ,int carrier,String address);
    boolean initShift(Shift shift);
    boolean deleteShift(String type, String date, String address);
    Shift fetchShift(String type, String date, String address);
    Vector<Shift> getEmptyShifts(String address);
    public Vector<Shift> fetchInitializedShifts(String address);
    Vector<Shift> getUptoDate(Vector<Shift> vec);
    boolean addEmployeeSpeciality(int id, String specialization);
    boolean deleteEmployeeSpeciality(int id, String specialization);
    boolean insertEmployeeRestriction(int id, int day, String type);
    boolean deleteEmployeeRestriction(int id, int day, String type);
    EmployeeRestriction fetchEmployeeRestriction(int id, int day, String type);
    EmployeeSpeciality[] getSpecsOf(int id);
    void sortDates(Vector<Shift> notSorted);
    boolean addEmployeeShift(Shift shift,Employee emp, String specialization);

    Vector<EmployeeRestriction> fetchAllEmployeeRestrictions(int id);
    Vector<Employee> getPossibleWorkers (Shift shift, String specialization);

    void reduce(Vector<Integer> vecOpt1, Vector<Employee> vecMan, Vector<Employee> vecCash);

    /*		TRANSPORTS		*/
  //*****	Trucks	*****//
  	public boolean createTruck(int truckNumber, String model, double weight, double maxWeight, int requiredLicenseType);
  	public boolean checkTruckExist(int truckNumber);	//Was checkTruckLicenceExist
  	public boolean updateTruck(int truckNumber, String model, double weight, double maxWeight, int requiredLicenseType);
  	public Truck fetchTruck(int truckNumber);
  	public boolean deleteTruck(int truckNumber);
  	//*******************//
  	
  	//***** Drivers *****//
  	public boolean insertDriver(Driver driver);
  	public boolean checkDriverExist(int ID);		//Was checkDriverIdExist
  	//public boolean updateDriver(int ID, String firstName, String lastName, int licenseType);
  	public Driver fetchDriver(int ID);
  	public boolean deleteDriver(int ID);
  	public boolean deleteOnlyDriver(int id);
  	//*******************//
  	
  	//***** Sites *****//
  	public boolean createSite(String address, String phoneNumber, String contactName, /*int isStore,*/ int areaCode);		
  	public boolean updateSite(String address, String phoneNumber, String contactName, int areaCode);
  	public Site fetchSite(String address);
  	public boolean deleteSite(String address);
  	//*****************//
  	
  	//***** Transports *****//
  	public boolean createTransport(String date, String time, int truckNumber, int driverID, int companyID/*String source*/,
  							double weight, int sourceDoc, String address);
  	public Transport fetchTransport(String date, String time, int numberOfTruck);
  	public boolean updateTransport(String date, String time, int truckNumber, int driverID, int companyID/*String source*/,
  							double weight,String address);
  /*	public boolean deleteTransport(String date, String time, int truckNumber);*/
  	public boolean addSiteToTransport(String date, String time, int truckNumber, int docCode, String hourOfArr);
  	/*public boolean deleteSiteFromTransport(String date, String time, int truckNumber, String siteAddress);*/
  //	public Vector<Pair<String, String>> getTransportDests(String date, String hour, int truckNumber);
  	//**********************//
  	
  	public Vector<Driver> fetchAvailableDrivers(String addressStore, String date, String time);
  	Vector<Pair<String,Integer>> fetchShiftAccupations(Shift shift);
  	public Vector<Pair<Employee,String>> fetchEmployeesInShift(String address, Shift shift);
  	public boolean cheakAvailableStoreKeepers(String addressStore, String date, String time);

  	boolean updateDriver(int id, int parseInt);
  	public Vector<Pair<String,String>> getHoursOfArrival(Transport trans);
	public boolean checkIfTruckAvilable(String date,String time,int truckNumber);

	Vector<String> getNotHandledMessages(String workAddress);
	Vector<String> getHandledMessages(String workAddress);

	Vector<Order> getUndeliveredOrders();

	boolean addreesAtTransport(String address, Transport transport);

	String getArrivalTime(String addres, Transport transport);
	public boolean checkTransportToOrder(Order order);

	/*
     * NEW (edited 26.5 by Ofir): get transports whose driver's id = id
     */
	Vector<Transport> getRelevantTransports(int id);

	/*
     * NEW (edited 26.5 by Ofir): Sort vector of transports by date
     */
	void sortTrans(Vector<Transport> vec);
	/*
     * NEW (edited 26.5 by Ofir): Sort vector of Pair<time, address> by date
     */
	void sortDests(Vector<Pair<String, String>> vec);

	/*
	 * NEW (28.5): check if pid in list
	 */
	boolean checkPidInList(LinkedList<OrderProduct> list, String pid);

	Vector<Integer> getTransportOrders(String date, String hour, int truckNo);
	boolean checkReplacement(Truck truck);

	void updateMessgae(Message msg);

	int compareDates(String d1, String d2);

}
