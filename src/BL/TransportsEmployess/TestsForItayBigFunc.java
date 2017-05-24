package BL.TransportsEmployess;

import DAL.DAL;
import DAL.DAL_imp;
import SharedClasses.TransportsEmployess.Driver;
import SharedClasses.TransportsEmployess.Employee;
import SharedClasses.TransportsEmployess.EmployeeRestriction;
import SharedClasses.TransportsEmployess.EmployeeSpeciality;
import SharedClasses.TransportsEmployess.Site;
import SharedClasses.TransportsEmployess.Transport;
import SharedClasses.TransportsEmployess.Truck;
import SharedClasses.TransportsEmployess.Employee.Rank;

public class TestsForItayBigFunc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BLimp bl = new BLimp();
		DAL dal_imp = DAL_imp.getDALImp();
		
		dal_imp.insertSite(new Site("Base", "0111111111", "yoniz",  123));
		dal_imp.insertSite(new Site("ofir street", "0111111111", "ofir",  123));
		dal_imp.insertSite(new Site("dov street", "0111111111", "dov",  123));
		dal_imp.insertSite(new Site("rosh street", "0111111111", "rosh", 123));
		
		//ceo
		dal_imp.insertEmployee(new Employee(111111111, "ceo1", "ceo1", 50000, "04/19/2017", "", "123456/leumi/123/15%/10%", Rank.logisticManeger, "ofir street", 7));
		
		//3 admins
		dal_imp.insertEmployee(new Employee(911111111, "admin1", "admin1", 50000, "04/19/2017", "", "123456/leumi/123/15%/10%", Rank.storeManeger, "ofir street", 7));
		dal_imp.insertEmployee(new Employee(922222222, "admin2", "admin2", 50000, "04/19/2017", "", "123456/leumi/123/15%/10%", Rank.storeManeger, "dov street", 7));
		dal_imp.insertEmployee(new Employee(933333333, "admin3", "admin3", 50000, "04/19/2017", "", "123456/leumi/123/15%/10%", Rank.storeManeger, "rosh street", 7));
	
		// 18 regular employees 6 per Store
		dal_imp.insertEmployee(new Employee(611111111, "regular1", "regular1", 50000, "04/19/2017", "", "123456/leumi/123/15%/10%", Rank.regular, "ofir street", 7));
		dal_imp.insertEmployee(new Employee(622222222, "regular2", "regular2", 50000, "04/19/2017", "", "123456/leumi/123/15%/10%", Rank.regular, "ofir street", 7));
		dal_imp.insertEmployee(new Employee(633333333, "regular3", "regular3", 50000, "04/19/2017", "", "123456/leumi/123/15%/10%", Rank.regular, "ofir street", 7));
		dal_imp.insertEmployee(new Employee(644444444, "regular4", "regular4", 50000, "04/19/2017", "", "123456/leumi/123/15%/10%", Rank.regular, "ofir street", 7));
		dal_imp.insertEmployee(new Employee(655555555, "regular5", "regular5", 50000, "04/19/2017", "", "123456/leumi/123/15%/10%", Rank.regular, "ofir street", 7));
		dal_imp.insertEmployee(new Employee(666666666, "regular6", "regular6", 50000, "04/19/2017", "", "123456/leumi/123/15%/10%", Rank.regular, "ofir street", 7));
		
		dal_imp.insertEmployee(new Employee(677777777, "regular7", "regular7", 50000, "04/19/2017", "", "123456/leumi/123/15%/10%", Rank.regular, "dov street", 7));
		dal_imp.insertEmployee(new Employee(688888888, "regular8", "regular8", 50000, "04/19/2017", "", "123456/leumi/123/15%/10%", Rank.regular, "dov street", 7));
		dal_imp.insertEmployee(new Employee(699999999, "regular9", "regular9", 50000, "04/19/2017", "", "123456/leumi/123/15%/10%", Rank.regular, "dov street", 7));
		dal_imp.insertEmployee(new Employee(711111111, "regular10", "regular10", 50000, "04/19/2017", "", "123456/leumi/123/15%/10%", Rank.regular, "dov street", 7));
		dal_imp.insertEmployee(new Employee(722222222, "regular11", "regular11", 50000, "04/19/2017", "", "123456/leumi/123/15%/10%", Rank.regular, "dov street", 7));
		dal_imp.insertEmployee(new Employee(733333333, "regular12", "regular12", 50000, "04/19/2017", "", "123456/leumi/123/15%/10%", Rank.regular, "dov street", 7));
		
		
		dal_imp.insertEmployee(new Employee(744444444, "regular13", "regular13", 50000, "04/19/2017", "", "123456/leumi/123/15%/10%", Rank.regular, "rosh street", 7));
		dal_imp.insertEmployee(new Employee(755555555, "regular14", "regular14", 50000, "04/19/2017", "", "123456/leumi/123/15%/10%", Rank.regular, "rosh street", 7));
		dal_imp.insertEmployee(new Employee(766666666, "regular15", "regular15", 50000, "04/19/2017", "", "123456/leumi/123/15%/10%", Rank.regular, "rosh street", 7));
		dal_imp.insertEmployee(new Employee(777777777, "regular16", "regular16", 50000, "04/19/2017", "", "123456/leumi/123/15%/10%", Rank.regular, "rosh street", 7));
		dal_imp.insertEmployee(new Employee(788888888, "regular17", "regular17", 50000, "04/19/2017", "", "123456/leumi/123/15%/10%", Rank.regular, "rosh street", 7));
		dal_imp.insertEmployee(new Employee(799999999, "regular18", "regular18", 50000, "04/19/2017", "", "123456/leumi/123/15%/10%", Rank.regular, "rosh street", 7));
		
		// reuglar emps speaciality
		dal_imp.insertEmployeeSpeciality(new EmployeeSpeciality(611111111, "StoreKeeper"));
		dal_imp.insertEmployeeSpeciality(new EmployeeSpeciality(622222222, "StoreKeeper"));
		dal_imp.insertEmployeeSpeciality(new EmployeeSpeciality(633333333, "StoreKeeper"));
		dal_imp.insertEmployeeSpeciality(new EmployeeSpeciality(644444444, "StoreKeeper"));
		dal_imp.insertEmployeeSpeciality(new EmployeeSpeciality(655555555, "StoreKeeper"));
		dal_imp.insertEmployeeSpeciality(new EmployeeSpeciality(666666666, "StoreKeeper"));
		dal_imp.insertEmployeeSpeciality(new EmployeeSpeciality(677777777, "StoreKeeper"));
		dal_imp.insertEmployeeSpeciality(new EmployeeSpeciality(688888888, "StoreKeeper"));
		dal_imp.insertEmployeeSpeciality(new EmployeeSpeciality(699999999, "StoreKeeper"));
		dal_imp.insertEmployeeSpeciality(new EmployeeSpeciality(711111111, "StoreKeeper"));
		dal_imp.insertEmployeeSpeciality(new EmployeeSpeciality(722222222, "StoreKeeper"));
		dal_imp.insertEmployeeSpeciality(new EmployeeSpeciality(733333333, "StoreKeeper"));
		dal_imp.insertEmployeeSpeciality(new EmployeeSpeciality(744444444, "StoreKeeper"));
		dal_imp.insertEmployeeSpeciality(new EmployeeSpeciality(755555555, "StoreKeeper"));
		dal_imp.insertEmployeeSpeciality(new EmployeeSpeciality(766666666, "StoreKeeper"));
		dal_imp.insertEmployeeSpeciality(new EmployeeSpeciality(777777777, "StoreKeeper"));
		dal_imp.insertEmployeeSpeciality(new EmployeeSpeciality(788888888, "StoreKeeper"));
		dal_imp.insertEmployeeSpeciality(new EmployeeSpeciality(799999999, "StoreKeeper"));
		
		
		// manegers speaciality
		dal_imp.insertEmployeeSpeciality(new EmployeeSpeciality(211111111, "StoreKeeper"));
		dal_imp.insertEmployeeSpeciality(new EmployeeSpeciality(222222222, "StoreKeeper"));
		dal_imp.insertEmployeeSpeciality(new EmployeeSpeciality(233333333, "StoreKeeper"));
		dal_imp.insertEmployeeSpeciality(new EmployeeSpeciality(244444444, "StoreKeeper"));
		dal_imp.insertEmployeeSpeciality(new EmployeeSpeciality(255555555, "StoreKeeper"));
		dal_imp.insertEmployeeSpeciality(new EmployeeSpeciality(266666666, "StoreKeeper"));
		
		dal_imp.insertEmployeeSpeciality(new EmployeeSpeciality(211111111, "ShiftManager"));
		dal_imp.insertEmployeeSpeciality(new EmployeeSpeciality(222222222, "ShiftManager"));
		dal_imp.insertEmployeeSpeciality(new EmployeeSpeciality(233333333, "ShiftManager"));
		dal_imp.insertEmployeeSpeciality(new EmployeeSpeciality(244444444, "ShiftManager"));
		dal_imp.insertEmployeeSpeciality(new EmployeeSpeciality(255555555, "ShiftManager"));
		dal_imp.insertEmployeeSpeciality(new EmployeeSpeciality(266666666, "ShiftManager"));
		
		dal_imp.insertEmployeeSpeciality(new EmployeeSpeciality(211111111, "Carrier"));
		dal_imp.insertEmployeeSpeciality(new EmployeeSpeciality(222222222, "Carrier"));
		dal_imp.insertEmployeeSpeciality(new EmployeeSpeciality(233333333, "Carrier"));
		dal_imp.insertEmployeeSpeciality(new EmployeeSpeciality(244444444, "Carrier"));
		dal_imp.insertEmployeeSpeciality(new EmployeeSpeciality(255555555, "Carrier"));
		dal_imp.insertEmployeeSpeciality(new EmployeeSpeciality(266666666, "Carrier"));
		
		dal_imp.insertEmployeeSpeciality(new EmployeeSpeciality(211111111, "Cashier"));
		dal_imp.insertEmployeeSpeciality(new EmployeeSpeciality(222222222, "Cashier"));
		dal_imp.insertEmployeeSpeciality(new EmployeeSpeciality(233333333, "Cashier"));
		dal_imp.insertEmployeeSpeciality(new EmployeeSpeciality(244444444, "Cashier"));
		dal_imp.insertEmployeeSpeciality(new EmployeeSpeciality(255555555, "Cashier"));
		dal_imp.insertEmployeeSpeciality(new EmployeeSpeciality(266666666, "Cashier"));
		
		///  cant work in day of work
		dal_imp.insertEmployeeRestriction(new EmployeeRestriction(211111111, 7, "morning"));
		dal_imp.insertEmployeeRestriction(new EmployeeRestriction(211111111, 7, "evening"));
		dal_imp.insertEmployeeRestriction(new EmployeeRestriction(222222222, 7, "morning"));
		dal_imp.insertEmployeeRestriction(new EmployeeRestriction(222222222, 7, "evening"));
		dal_imp.insertEmployeeRestriction(new EmployeeRestriction(233333333, 7, "morning"));
		dal_imp.insertEmployeeRestriction(new EmployeeRestriction(233333333, 7, "evening"));
		dal_imp.insertEmployeeRestriction(new EmployeeRestriction(244444444, 7, "morning"));
		dal_imp.insertEmployeeRestriction(new EmployeeRestriction(244444444, 7, "evening"));
		dal_imp.insertEmployeeRestriction(new EmployeeRestriction(255555555, 7, "morning"));
		dal_imp.insertEmployeeRestriction(new EmployeeRestriction(255555555, 7, "evening"));
		dal_imp.insertEmployeeRestriction(new EmployeeRestriction(266666666, 7, "morning"));
		dal_imp.insertEmployeeRestriction(new EmployeeRestriction(266666666, 7, "evening"));
		
		dal_imp.insertEmployeeRestriction(new EmployeeRestriction(611111111, 7, "morning"));
		dal_imp.insertEmployeeRestriction(new EmployeeRestriction(611111111, 7, "evening"));
		dal_imp.insertEmployeeRestriction(new EmployeeRestriction(622222222, 7, "morning"));
		dal_imp.insertEmployeeRestriction(new EmployeeRestriction(622222222, 7, "evening"));
		dal_imp.insertEmployeeRestriction(new EmployeeRestriction(633333333, 7, "morning"));
		dal_imp.insertEmployeeRestriction(new EmployeeRestriction(633333333, 7, "evening"));
		dal_imp.insertEmployeeRestriction(new EmployeeRestriction(644444444, 7, "morning"));
		dal_imp.insertEmployeeRestriction(new EmployeeRestriction(644444444, 7, "evening"));
		dal_imp.insertEmployeeRestriction(new EmployeeRestriction(655555555, 7, "morning"));
		dal_imp.insertEmployeeRestriction(new EmployeeRestriction(655555555, 7, "evening"));
		dal_imp.insertEmployeeRestriction(new EmployeeRestriction(666666666, 7, "morning"));
		dal_imp.insertEmployeeRestriction(new EmployeeRestriction(666666666, 7, "evening"));
		dal_imp.insertEmployeeRestriction(new EmployeeRestriction(677777777, 7, "morning"));
		dal_imp.insertEmployeeRestriction(new EmployeeRestriction(677777777, 7, "evening"));
		dal_imp.insertEmployeeRestriction(new EmployeeRestriction(688888888, 7, "morning"));
		dal_imp.insertEmployeeRestriction(new EmployeeRestriction(688888888, 7, "evening"));
		dal_imp.insertEmployeeRestriction(new EmployeeRestriction(699999999, 7, "morning"));
		dal_imp.insertEmployeeRestriction(new EmployeeRestriction(699999999, 7, "evening"));
		dal_imp.insertEmployeeRestriction(new EmployeeRestriction(711111111, 7, "morning"));
		dal_imp.insertEmployeeRestriction(new EmployeeRestriction(711111111, 7, "evening"));
		dal_imp.insertEmployeeRestriction(new EmployeeRestriction(722222222, 7, "morning"));
		dal_imp.insertEmployeeRestriction(new EmployeeRestriction(722222222, 7, "evening"));
		dal_imp.insertEmployeeRestriction(new EmployeeRestriction(733333333, 7, "morning"));
		dal_imp.insertEmployeeRestriction(new EmployeeRestriction(733333333, 7, "evening"));
		dal_imp.insertEmployeeRestriction(new EmployeeRestriction(744444444, 7, "morning"));
		dal_imp.insertEmployeeRestriction(new EmployeeRestriction(744444444, 7, "evening"));
		dal_imp.insertEmployeeRestriction(new EmployeeRestriction(755555555, 7, "morning"));
		dal_imp.insertEmployeeRestriction(new EmployeeRestriction(755555555, 7, "evening"));
		dal_imp.insertEmployeeRestriction(new EmployeeRestriction(766666666, 7, "morning"));
		dal_imp.insertEmployeeRestriction(new EmployeeRestriction(766666666, 7, "evening"));
		dal_imp.insertEmployeeRestriction(new EmployeeRestriction(777777777, 7, "morning"));
		dal_imp.insertEmployeeRestriction(new EmployeeRestriction(777777777, 7, "evening"));
		dal_imp.insertEmployeeRestriction(new EmployeeRestriction(788888888, 7, "morning"));
		dal_imp.insertEmployeeRestriction(new EmployeeRestriction(788888888, 7, "evening"));
		dal_imp.insertEmployeeRestriction(new EmployeeRestriction(799999999, 7, "morning"));
		dal_imp.insertEmployeeRestriction(new EmployeeRestriction(799999999, 7, "evening"));

	/*	///maneger driiving licence
		dal_imp.insertDriver(new Driver(211111111, "maneger1", "maneger1", 50000, "04/19/2017", "", "123456/leumi/123/15%/10%", Rank.shiftManager, "ofir street", 7,21));
		dal_imp.insertDriver(new Driver(222222222, "maneger2", "maneger2", 50000, "04/19/2017", "", "123456/leumi/123/15%/10%", Rank.shiftManager, "ofir street", 7,21));
		dal_imp.insertDriver(new Driver(233333333, "maneger3", "maneger3", 50000, "04/19/2017", "", "123456/leumi/123/15%/10%", Rank.shiftManager, "dov street", 7,21));
		dal_imp.insertDriver(new Driver(244444444, "maneger4", "maneger4", 50000, "04/19/2017", "", "123456/leumi/123/15%/10%", Rank.shiftManager, "dov street", 7,21));
		dal_imp.insertDriver(new Driver(255555555, "maneger5", "maneger5", 50000, "04/19/2017", "", "123456/leumi/123/15%/10%", Rank.shiftManager, "rosh street", 7,21));
		dal_imp.insertDriver(new Driver(266666666, "maneger5", "maneger5", 50000, "04/19/2017", "", "123456/leumi/123/15%/10%", Rank.shiftManager, "rosh street", 7,21));*/
		
		///some of ofiirs store are truck drivers
		dal_imp.insertEmployeeSpeciality(new EmployeeSpeciality(611111111, "Carrier"));
		dal_imp.insertEmployeeSpeciality(new EmployeeSpeciality(622222222, "Carrier"));
		dal_imp.insertEmployeeSpeciality(new EmployeeSpeciality(633333333, "Carrier"));
		dal_imp.insertEmployeeSpeciality(new EmployeeSpeciality(644444444, "Carrier"));
		dal_imp.insertEmployeeSpeciality(new EmployeeSpeciality(655555555, "Carrier"));
		dal_imp.insertEmployeeSpeciality(new EmployeeSpeciality(666666666, "Carrier"));
		
		dal_imp.insertDriver(new Driver(611111111, "regular1", "regular1", 50000, "04/19/2017", "", "123456/leumi/123/15%/10%", Rank.regular, "ofir street", 7,31));
		dal_imp.insertDriver(new Driver(622222222, "regular2", "regular2", 50000, "04/19/2017", "", "123456/leumi/123/15%/10%", Rank.regular, "ofir street", 7,31));
		dal_imp.insertDriver(new Driver(633333333, "regular3", "regular3", 50000, "04/19/2017", "", "123456/leumi/123/15%/10%", Rank.regular, "ofir street", 7,31));
		dal_imp.insertDriver(new Driver(644444444, "regular4", "regular4", 50000, "04/19/2017", "", "123456/leumi/123/15%/10%", Rank.regular, "ofir street", 7,31));
		dal_imp.insertDriver(new Driver(655555555, "regular5", "regular5", 50000, "04/19/2017", "", "123456/leumi/123/15%/10%", Rank.regular, "ofir street", 7,31));
		dal_imp.insertDriver(new Driver(666666666, "regular6", "regular6", 50000, "04/19/2017", "", "123456/leumi/123/15%/10%", Rank.regular, "ofir street", 7,31));
		//insert trucks
		
		dal_imp.insertTruck(new Truck(11111111, "subaro", 1000, 30, 10));
		dal_imp.insertTruck(new Truck(22222222, "subaro", 1000, 50, 15));
		dal_imp.insertTruck(new Truck(33333333, "subaro", 1000, 50, 20));
		dal_imp.insertTruck(new Truck(44444444, "subaro", 1000, 60, 25));
		dal_imp.insertTruck(new Truck(55555555, "subaro", 1000, 70, 30));
		dal_imp.insertTruck(new Truck(66666666, "subaro", 1000, 100, 45));
		
	}

}