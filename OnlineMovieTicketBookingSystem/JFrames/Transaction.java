package guiApplication;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JSlider;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.SpinnerNumberModel;

import SourseCode.Customer_input;
import SourseCode.ticket;
import javaSourseCode.CustomerInput;
import javaSourseCode.TicketInput;
import javax.swing.border.MatteBorder;

public class Transaction extends JFrame{

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	int cid=0;
	/**
	 * Launch the application.
	 */
	public static void TransactionWindow(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Transaction window = new Transaction();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Transaction() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setSize(500,300);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(255, 140, 0)));
		panel.setBackground(new Color(0, 0, 0));
		panel.setLayout(null);
		
		JTextPane txtpnName = new JTextPane();
		txtpnName.setBackground(Color.BLACK);
		txtpnName.setForeground(Color.WHITE);
		txtpnName.setFont(new Font("Tempus Sans ITC", Font.BOLD, 14));
		txtpnName.setText("Name");
		txtpnName.setBounds(49, 45, 76, 20);
		panel.add(txtpnName);
		
		JTextPane txtpnMobileNo = new JTextPane();
		txtpnMobileNo.setForeground(Color.WHITE);
		txtpnMobileNo.setBackground(Color.BLACK);
		txtpnMobileNo.setFont(new Font("Tempus Sans ITC", Font.BOLD, 13));
		txtpnMobileNo.setText("Mobile No");
		txtpnMobileNo.setBounds(49, 77, 76, 20);
		panel.add(txtpnMobileNo);
		
		JTextPane txtpnSeats = new JTextPane();
		txtpnSeats.setForeground(Color.WHITE);
		txtpnSeats.setBackground(Color.BLACK);
		txtpnSeats.setFont(new Font("Tempus Sans ITC", Font.BOLD, 14));
		txtpnSeats.setText("Seats");
		txtpnSeats.setBounds(49, 109, 76, 20);
		panel.add(txtpnSeats);
		
		JTextPane txtpnType = new JTextPane();
		txtpnType.setBackground(Color.BLACK);
		txtpnType.setForeground(Color.WHITE);
		txtpnType.setFont(new Font("Tempus Sans ITC", Font.BOLD, 15));
		txtpnType.setText("Type");
		txtpnType.setBounds(49, 171, 76, 27);
		panel.add(txtpnType);
		
		textField = new JTextField();
		textField.setFont(new Font("Tempus Sans ITC", Font.BOLD, 15));
		textField.setBounds(200, 45, 96, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 14));
		textField_1.setBounds(200, 77, 96, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JTextPane txtpnAge = new JTextPane();
		txtpnAge.setBackground(Color.BLACK);
		txtpnAge.setForeground(Color.WHITE);
		txtpnAge.setFont(new Font("Tempus Sans ITC", Font.BOLD, 13));
		txtpnAge.setText("Age");
		txtpnAge.setBounds(49, 11, 38, 20);
		panel.add(txtpnAge);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setModel(new SpinnerNumberModel(new Integer(18), new Integer(18), null, new Integer(1)));
		spinner_1.setBounds(200, 14, 96, 20);
		panel.add(spinner_1);
		
		String[] types = { "Gold", "Silver", "Platinum"};
		 
		SimpleDateFormat sdf = new SimpleDateFormat( "dd MMM yyyy hh:mm:ss" );
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(new Integer(1), new Integer(1), null, new Integer(1)));
		spinner.setBounds(200, 109, 96, 20);
		panel.add(spinner);
		
		JComboBox comboBox = new JComboBox(types);
		comboBox.setBackground(Color.WHITE);
		comboBox.setSelectedIndex(2);
		comboBox.setBounds(200, 176, 96, 22);
		panel.add(comboBox);
		
		String[] Movie= {"NoTimeToDie","Sing2","the lost city","GhostBusters","dracula","SpiderMan","Eternals","Dune"};
		JComboBox comboBox_1 = new JComboBox(Movie);
		comboBox.setBackground(Color.WHITE);
		comboBox.setSelectedIndex(0);
		comboBox_1.setBounds(200, 140, 120, 22);
		panel.add(comboBox_1);
		
		
		JButton btnNewButton = new JButton("Continue");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int price=0;
				++cid;
				String name= textField.getText();
				String mob=textField_1.getText();
				int seats=(Integer) spinner.getValue();
				String type = (String)comboBox. getSelectedItem();
				String movie=(String)comboBox_1. getSelectedItem();
				int spinnerage=(Integer)spinner.getValue();
				int age=spinnerage+17;
				CustomerInput ci=new CustomerInput(cid,name,mob,seats,type,age);
				Customer_input c_i=new Customer_input(ci);
				if(type.equals("Gold"))
				{
					price=500;
				}
				else if(type.equals("Platinum"))
				{
					price=800;
				}
				else {
					price=400;
				}
				int total=price*seats;
				System.out.println("price "+total);
				System.out.println("Movie name "+ name);
				System.out.println("type "+type);
				System.out.println("seats :"+seats);
				TicketInput tk=new TicketInput(type,price);
				ticket t=new ticket(tk);
				PaymentWindow pw=new PaymentWindow();
				pw.my_update(name, seats, type, total);
				//pw.setVisible(true);
				//pw.Payment();	
				
			}
		});
		btnNewButton.setFont(new Font("Tempus Sans ITC", Font.BOLD, 14));
		btnNewButton.setBounds(324, 217, 102, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("cancel");
		btnNewButton_1.setBackground(Color.BLACK);
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				//Reset(comboBox_1);
			}

			
		});
		btnNewButton_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 13));
		btnNewButton_1.setBounds(225, 217, 89, 23);
		panel.add(btnNewButton_1);
		
		JTextPane txtpnMovie = new JTextPane();
		txtpnMovie.setBackground(Color.BLACK);
		txtpnMovie.setForeground(Color.WHITE);
		txtpnMovie.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		txtpnMovie.setText("Movie");
		txtpnMovie.setBounds(49, 140, 76, 20);
		panel.add(txtpnMovie);
		
		
		
	}
}
