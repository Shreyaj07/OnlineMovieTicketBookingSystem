package SourseCode;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class update_Theater {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/movieticketbooking", "root",
					"root");
			
			Scanner sc = new Scanner(System.in);
			//System.out.println("Enter Theater ID: ");
			int T_id = sc.nextInt();
			//System.out.println("Enter number of Screens: ");
			int screens = sc.nextInt();
			
			String query = " update theater set no_of_screens = ? where Th_id = ?;";
			
			PreparedStatement preparedStmt = con.prepareStatement(query);
			  preparedStmt.setInt(1, screens);
	          preparedStmt.setInt (2, T_id);
	          
	          int no = preparedStmt.executeUpdate();	          
	          con.close();
	          if(no==1) {
	        	  System.out.println("Table Updated!");
	          } else {
	        	  System.out.println("ID not found!");
	          }
	           
		} catch (Exception e) {
			System.err.println("Got an exception!");
			System.out.println(e);
		}
	}

}
