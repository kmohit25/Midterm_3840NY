package design;


import java.io.IOException;
import java.sql.SQLException;

public class FortuneEmployee {

	/**
	 * FortuneEmployee class has a main methods where you will be able to create Object from
	 * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible 
	 * to use with proper business work flow.Think as a Software Architect, Product Designer and 
	 * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
	 * more to design an application that will meet for fortune 500 Employee Information
	 * Services.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 *
	 **/
	public static void main(String[] args) throws SQLException, IOException, ClassNotFoundException {

		EmployeeInfo first_employee = new EmployeeInfo(10011);

		EmployeeInfo second_employee = new EmployeeInfo("Mike",10012);

		EmployeeInfo third_employee = new EmployeeInfo("John",10013);



		EmployeeInfo.nestedclass nestedrefff = third_employee.new nestedclass();

		nestedrefff.nestedMethod();



		second_employee.setName("People And Tech");

		System.out.println(second_employee.getName());



		EmployeeInfo.calculateEmployeeBonus(10000,7);

		EmployeeInfo.calculateEmployeePension(10000);


//
//		ConnectDB connection = new ConnectDB();
//
//		connection.insertProfileToMySql("employees","column1","column2");

	}



}
