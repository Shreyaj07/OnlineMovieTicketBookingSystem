package guiApplication;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.TextField;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.DropMode;
import javax.swing.SwingConstants;

import SourseCode.login;
import javaSourseCode.LoginInput;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLayeredPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;

public class RegisterationPage extends JFrame{

	private JFrame frame;
	private JLayeredPane panel;
	private JTextField textField_2;
	private JButton btnNewButton;
	private JTextPane txtpnAge;
	private JTextPane txtpnEmail;
	private JPasswordField passwordField;
	private JButton btnNewButton_1;
	private  JLabel tpane;
	/**
	 * Launch the application.
	 */
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterationPage window = new RegisterationPage();
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
	public RegisterationPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setSize(450, 300);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTextPane txtpnWelcomeToGui = new JTextPane();
		txtpnWelcomeToGui.setForeground(Color.WHITE);
		txtpnWelcomeToGui.setBackground(new Color(0, 0, 0));
		txtpnWelcomeToGui.setFont(new Font("Times New Roman", Font.BOLD, 16));
		txtpnWelcomeToGui.setText("                               Welcome  Register Yourself");
		frame.getContentPane().add(txtpnWelcomeToGui, BorderLayout.NORTH);
		
		panel = new JLayeredPane();
		tpane = new JLabel("center bottom");
//		frame.getContentPane().add(tpane,BorderLayout.CENTER);
		panel.add(tpane,JLayeredPane.DEFAULT_LAYER);
		panel.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(255, 127, 80)));
		panel.setForeground(Color.BLACK);
		panel.setBackground(Color.BLACK);
		frame.getContentPane().add(panel,BorderLayout.CENTER);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tempus Sans ITC", Font.BOLD, 15));
		textField_2.setColumns(10);
		
		btnNewButton = new JButton("Proceed");
		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.setForeground(new Color(218, 165, 32));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String email=textField_2.getText();
				String pass=passwordField.getText();
				LoginInput l=new LoginInput(email,pass);
				login lng=new login(l);
				Transaction tra=new Transaction();
				Main mn=new Main();
//				mn.MainWindow();
			}
		});
		btnNewButton.setFont(new Font("Tempus Sans ITC", Font.BOLD, 15));
		
		txtpnAge = new JTextPane();
		txtpnAge.setBackground(Color.BLACK);
		txtpnAge.setForeground(Color.WHITE);
		txtpnAge.setFont(new Font("Tempus Sans ITC", Font.BOLD, 15));
		txtpnAge.setText("Email");
		
		txtpnEmail = new JTextPane();
		txtpnEmail.setBackground(Color.BLACK);
		txtpnEmail.setForeground(Color.WHITE);
		txtpnEmail.setFont(new Font("Tempus Sans ITC", Font.BOLD, 15));
		txtpnEmail.setText("Password");
		
		passwordField = new JPasswordField();
		passwordField.setForeground(Color.BLACK);
		passwordField.setBackground(Color.WHITE);
		passwordField.setFont(new Font("HP Simplified Jpan", Font.BOLD, 16));
		
		btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.setBackground(new Color(0, 0, 0));
		btnNewButton_1.setForeground(new Color(218, 165, 32));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_2.setText("");
				passwordField.setText("");
			}
		});
		btnNewButton_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 15));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(139)
					.addComponent(btnNewButton)
					.addGap(37)
					.addComponent(btnNewButton_1)
					.addContainerGap(96, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(55)
							.addComponent(txtpnEmail, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(66)
							.addComponent(txtpnAge, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addComponent(passwordField, GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
						.addComponent(textField_2))
					.addGap(71))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(40)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
						.addComponent(textField_2)
						.addComponent(txtpnAge))
					.addGap(25)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
						.addComponent(passwordField)
						.addComponent(txtpnEmail))
					.addPreferredGap(ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton_1)
						.addComponent(btnNewButton))
					.addGap(22))
		);
		panel.setLayout(gl_panel);
	}

}
