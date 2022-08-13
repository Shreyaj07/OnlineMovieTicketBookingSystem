package guiApplication;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.BoxLayout;
import java.awt.Font;
import javax.swing.JToolBar;

import SourseCode.LoginSearch;
import javaSourseCode.LoginSearchInput;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.border.MatteBorder;

public class LoginPage extends JFrame{

	private JFrame frame;
	private final JPanel panel = new JPanel();
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage window = new LoginPage();
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
	public LoginPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		panel.setBackground(Color.BLACK);
		frame.getContentPane().add(panel, BorderLayout.SOUTH);
		frame.setSize(400, 300);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(255, 140, 0)));
		panel_1.setBackground(Color.BLACK);
		frame.getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(null);
		
		
		textField = new JTextField();
		textField.setFont(new Font("Tempus Sans ITC", Font.BOLD, 15));
		textField.setBounds(158, 71, 140, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setForeground(new Color(255, 165, 0));
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//insert into table jdbc connection
				String mail=textField.getText();
				String p=passwordField.getText();
				LoginSearchInput ls=new LoginSearchInput(mail,p);
				LoginSearch l=new LoginSearch();
				boolean con=l.Search(ls);
				if(con)
				{
					Main m=new Main();
					m.MainWindow();
					
				}
				else if(!con){
					RegisterationPage pq=new RegisterationPage();
					pq.NewScreen();
				}
				
			}
		});
		btnNewButton.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		btnNewButton.setBounds(158, 181, 89, 23);
		panel_1.add(btnNewButton);
		
		JTextPane txtpnEmail = new JTextPane();
		txtpnEmail.setForeground(new Color(255, 140, 0));
		txtpnEmail.setBackground(Color.BLACK);
		txtpnEmail.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		txtpnEmail.setText("Email");
		txtpnEmail.setBounds(53, 71, 89, 20);
		panel_1.add(txtpnEmail);
		
		JTextPane txtpnPassword = new JTextPane();
		txtpnPassword.setForeground(new Color(255, 140, 0));
		txtpnPassword.setBackground(Color.BLACK);
		txtpnPassword.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		txtpnPassword.setText("Password");
		txtpnPassword.setBounds(43, 120, 102, 20);
		panel_1.add(txtpnPassword);
		
		JTextPane txtpnLoginPage = new JTextPane();
		txtpnLoginPage.setBackground(Color.BLACK);
		txtpnLoginPage.setForeground(new Color(255, 228, 181));
		txtpnLoginPage.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		txtpnLoginPage.setText("  Login Page");
		txtpnLoginPage.setBounds(133, 0, 109, 23);
		panel_1.add(txtpnLoginPage);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.BOLD, 19));
		passwordField.setBounds(158, 120, 140, 20);
		panel_1.add(passwordField);
		
		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.setForeground(new Color(255, 165, 0));
		btnNewButton_1.setBackground(new Color(0, 0, 0));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				passwordField.setText("");
				
			}
		});
		btnNewButton_1.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		btnNewButton_1.setBounds(270, 181, 89, 23);
		panel_1.add(btnNewButton_1);
	}
}
