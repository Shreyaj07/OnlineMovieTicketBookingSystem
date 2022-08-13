package SourseCode;

import java.util.*;

import javaSourseCode.CustomerInput;

import java.sql.*;

public class Customer_input {
	public Customer_input(CustomerInput c) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/movieticketbooking", "root",
					"123456789");
//here movieticketbooking is database name, root is username and password
			
			
			String query = " insert into customer (C_id, Cname, PhNo, Age, NoOfSeats)  values (?, ?, ?, ?, ?);";
			
			PreparedStatement preparedStmt = con.prepareStatement(query);
			  preparedStmt.setInt(1, c.getCid());
	          preparedStmt.setString (2, c.getName());
	          preparedStmt.setString(3, c.getMob());
	          preparedStmt.setInt(4, c.getAge());
	          preparedStmt.setInt(5, c.getSeat());

	          // execute the preparedstatement
	          preparedStmt.executeUpdate();	         
	          System.out.println("Record added!");
	          con.close();
	          
		} catch (Exception e) {
			System.err.println("Got an exception!");
			System.out.println(e);
		}
	}
}