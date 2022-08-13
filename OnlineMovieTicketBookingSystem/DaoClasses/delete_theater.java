package SourseCode;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class delete_theater {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/movieticketbooking", "root",
					"root");
			
			Scanner sc = new Scanner(System.in);
			//System.out.println("Enter Theater ID: ");
			int T_id = sc.nextInt();
						
			String query = " delete from theater where Th_id = ?;";
			
			PreparedStatement preparedStmt = con.prepareStatement(query);
			  preparedStmt.setInt(1, T_id);
	          
	          boolean no = preparedStmt.execute();	   
	          con.close();
	          if(no==true) {
	        	  System.out.println("Table updated!");
	          } else {
	        	  System.out.println("ID not found!");
	          }
	          
		} catch (Exception e) {
			System.err.println("Got an exception!");
			System.out.println(e);
		}
	}

}
