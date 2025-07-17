package task_12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Task_12 {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		String db_url="jdbc:mysql://localhost:3306";
		
		String username="root";
		
		String password = "root";
		
		Connection connection = DriverManager.getConnection(db_url, username, password);
		
		String Create_DB = "Create database employee_DB";
		
		String useDB = "use employee_DB";
		
		String CreateTable = "create table employee_table (empcode int, empname varchar(25), empage int, esalary int)";
		
		String insert = "insert into employee_table values (101,'Jenny',25,10000), (102,'Jacky',30,20000), (103,'Joe',20,40000), (104,'John',20,40000), (105,'Shameer',25,90000)";
				
		String select = "select * from employee_table";
		
		Statement smt = connection.createStatement();
		
		smt.execute(Create_DB);
		
		smt.execute(useDB);
		
		smt.execute(CreateTable);
		
		smt.execute(insert);
		
		ResultSet result = smt.executeQuery(select);
		
		while(result.next()) {
			System.out.println(result.getInt("empcode")+"||"+result.getString("empname")+"||"+result.getInt("empage")+"||"+result.getInt("esalary"));
		}
		
		connection.close();
	}

}
