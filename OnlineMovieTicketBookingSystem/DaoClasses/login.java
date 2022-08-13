package SourseCode;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

import javaSourseCode.LoginInput;
// public login(LoginInput li) 
public class login {
	static final String JDBC_DRIVER="com.mysql.cj.jdbc.Driver";
	static final String DB_URL="jdbc:mysql://localhost:3306/movieticketbooking";
	static final String USER="root";
	static final String PASS="123456789";
	public login(LoginInput li)
		  {
		try {
			Class.forName(JDBC_DRIVER);
			Connection con = DriverManager.getConnection(DB_URL,USER,PASS);
			Scanner sc=new Scanner(System.in);
			
			
//			System.out.println("Enter email");
//			String email=sc.next();
//			System.out.println("Enter pass");
//			String pas=sc.next();
			String query = " insert into login (Email, Password) values (?, ?)";
			
			PreparedStatement preparedStmt = con.prepareStatement(query);
			  preparedStmt.setString(1,li.getEmail());
	          preparedStmt.setString (2, li.getPass());
	          
	          preparedStmt.executeUpdate();	  
	          System.out.println("Log in Successfull!");
	          con.close();
	          
		} catch (Exception e) {
			System.err.println("Got an exception!");
			System.out.println(e);
		}
	}
}
