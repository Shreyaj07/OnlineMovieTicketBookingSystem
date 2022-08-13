package SourseCode;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class theater {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/movieticketbooking", "root",
					"123456789");
			
			Scanner sc = new Scanner(System.in);
			//System.out.println("Enter Theater ID: ");
			int T_id = sc.nextInt();
			//System.out.println("Enter Theater Name: ");
			String T_name = sc.next();
			//System.out.println("Enter Location: ");
			String Location = sc.next();
			//System.out.println("Enter no. of Screens: ");
			int screen = sc.nextInt();
			
			String query = " insert into theater (Th_id, ThName, location, no_of_screens)" + " values (?, ?, ?, ?);";
			
			PreparedStatement preparedStmt = con.prepareStatement(query);
			  preparedStmt.setInt(1, T_id);
	          preparedStmt.setString (2, T_name);
	          preparedStmt.setString (3, Location);
	          preparedStmt.setInt(4, screen);
	          
	          preparedStmt.execute();	  
	          System.out.println("Theater added!");
	          con.close();
	          
		} catch (Exception e) {
			System.err.println("Got an exception!");
			System.out.println(e);
		}
	}

}
