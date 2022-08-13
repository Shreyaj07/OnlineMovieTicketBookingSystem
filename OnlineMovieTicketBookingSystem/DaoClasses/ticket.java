package SourseCode;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

import javaSourseCode.TicketInput;

public class ticket {
	

	public ticket(TicketInput tk){
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/movieticketbooking", "root",
					"123456789");
			
//			Scanner sc = new Scanner(System.in);
//			//System.out.println("Enter ticket id: ");
//			int ti_id = sc.nextInt();
//			//System.out.println("Enter Ticket type: ");
//			String T_type = sc.next();
//			//System.out.println("Enter Price: ");
//			int price = sc.nextInt();
//			//System.out.println("Enter Customer ID: ");
//			int c_id = sc.nextInt();
//			//System.out.println("Enter show ID: ");
//			int s_id = sc.nextInt();
			
			
			String query = " insert into ticket (Tkt_id, Tkt_type, price, C_id, Show_id)  values (?, ?, ?, ?, ?);";
			
			PreparedStatement preparedStmt = con.prepareStatement(query);
//			  preparedStmt.setInt(1, ti_id);
	          preparedStmt.setString (2, tk.getType());
	          preparedStmt.setInt(3, tk.getPrice());
//	          preparedStmt.setInt(4, c_id);
//	          preparedStmt.setInt(5, s_id);
//	          
	          preparedStmt.execute();	  
	          System.out.println("Ticket Booked!");
	          con.close();
	          
		} catch (Exception e) {
			System.err.println("Got an exception!");
			System.out.println(e);
		}
	}

}
