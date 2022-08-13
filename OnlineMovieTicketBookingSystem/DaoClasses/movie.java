package SourseCode;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class movie {
	public static void main(String args[]) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/movieticketbooking", "root", "root");
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Movie ID: ");
			int M_Id = sc.nextInt();
			System.out.println("Enter Movie name: ");
			String M_name = sc.next();
			System.out.println("Enter Duration: ");
			int duration_in_mins = sc.nextInt();
			System.out.println("Enter release date: ");
			String date = sc.next();
			java.util.Date format = new SimpleDateFormat("yyyy-mm-dd").parse(date);
			java.sql.Date date1 = new java.sql.Date(format.getTime());
			
			String query = " insert into movie (M_id, MName, duration_in_mins, Release_dt)" + " values (?, ?, ?, ?);";
			
			PreparedStatement preparedStmt = con.prepareStatement(query);
			  preparedStmt.setInt(1, M_Id);
	          preparedStmt.setString (2, M_name);
	          preparedStmt.setInt(3, duration_in_mins);
	          preparedStmt.setDate(4, date1);
	          
	          preparedStmt.execute();	  
	          System.out.println("Movie added!");
	          con.close();
	          
		} catch (Exception e) {
			System.err.println("Got an exception!");
			System.out.println(e);
		}
	}
}
