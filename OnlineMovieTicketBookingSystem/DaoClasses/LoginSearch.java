package SourseCode;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javaSourseCode.CustomerInput;
import javaSourseCode.LoginInput;
import javaSourseCode.LoginSearchInput;

public class LoginSearch {

	public boolean Search(LoginSearchInput lsi) {
		boolean go=false;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/movieticketbooking", "root",
					"123456789");
			
	
			
			String query = "select * from login where Email='"+lsi.getMaillogin()+"'";
			
			PreparedStatement preparedStmt = con.prepareStatement(query);
			//preparedStmt.setString(1,lsi.getMaillogin());
			ResultSet rs=preparedStmt.executeQuery(query);	  
			
			
			while(rs.next())
			{
				return true;
			}
			
//	          con.close();
	          
		} catch (Exception e) {
			System.err.println("Got an exception!");
			System.out.println(e);
		}
		
		return false;
	}
		
	

}
