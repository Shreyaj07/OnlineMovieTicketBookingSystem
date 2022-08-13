package SourseCode;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class login_update {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/movieticketbooking", "root", "root");
			
			Scanner sc = new Scanner(System.in);
			
			//System.out.println("Enter Email ID: ");
			String Email = sc.next();
			//System.out.println("Enter new Password: ");
			String new_Password = sc.next();
			
			String query = " update login set Password=? where Email=?";
			
			PreparedStatement preparedStmt = con.prepareStatement(query);
			preparedStmt.setString(1, new_Password);
	        preparedStmt.setString (2, Email);
	        
			int no = preparedStmt.executeUpdate();
			preparedStmt.close();					
			if(no==1) {
				System.out.println("Password updated sucessfully!!");
			}
			else {
				System.out.println("Email not found");
			}
			  	    
	          con.close();
	          
		} catch (Exception e) {
			System.err.println("Got an exception!");
			System.out.println(e);
		}
	}

}
