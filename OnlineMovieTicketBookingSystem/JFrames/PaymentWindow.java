package guiApplication;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextPane;

import javaSourseCode.CustomerInput;
import javaSourseCode.TicketInput;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextArea;

public class PaymentWindow extends JFrame {

	private JFrame frame;
	private JPanel panel;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;

	/**
	 * Launch the application.
	 */
	public static void Payment() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PaymentWindow window = new PaymentWindow();
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
	public PaymentWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void my_update(String name,int seats,String type, int total) {
		lblNewLabel.setText("Name \t\t:"+name);
		lblNewLabel_1.setText("Total seat \t:"+Integer.toString(seats)+"/"+type);
		lblNewLabel_2.setText("Amount \t\t:"+Integer.toString(total));
		
	}
	 void initialize() {
		frame = new JFrame();
		frame.setSize(500,300);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout());
		
		JTextArea txtrEnjoyYourShow = new JTextArea();
		txtrEnjoyYourShow.setForeground(new Color(255, 127, 80));
		txtrEnjoyYourShow.setBackground(Color.BLACK);
		txtrEnjoyYourShow.setFont(new Font("Edwardian Script ITC", Font.BOLD, 30));
		txtrEnjoyYourShow.setText("Enjoy Your Show...");
		txtrEnjoyYourShow.setBounds(10, 177, 237, 51);
		panel.add(txtrEnjoyYourShow);
		
		lblNewLabel = new JLabel();
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setBounds(66, 26, 227, 27);
		panel.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel();
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(63, 68, 240, 27);
		panel.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel();
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		//lblNewLabel_2.setLabelFor(lblNewLabel_2);
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(66, 105, 237, 26);
		panel.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel();
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		//lblNewLabel_3.setLabelFor(lblNewLabel_3);
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(66, 141, 227, 26);
		panel.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("Pay");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btnNewButton, "Thank You \n Visit again");
				
			}
		});
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setFont(new Font("Tempus Sans ITC", Font.BOLD, 20));
		btnNewButton.setForeground(new Color(255, 127, 80));
		btnNewButton.setBounds(277, 180, 119, 36);
		panel.add(btnNewButton, BorderLayout.SOUTH);
		
		
	}
}
