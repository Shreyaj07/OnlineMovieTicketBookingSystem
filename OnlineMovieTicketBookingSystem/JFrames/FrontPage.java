package guiApplication;

import java.awt.EventQueue;
import javax.swing.JFrame;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.JDesktopPane;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.Color;

public class FrontPage extends JFrame {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrontPage window = new FrontPage();
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
	public FrontPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setSize(1000, 600);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(0, 0, 0));
		panel.setBackground(Color.BLACK);
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 252, 430, -254);
		panel.add(scrollPane);
		Image img1=new ImageIcon(this.getClass().getResource("/Sing2.jpg")).getImage().getScaledInstance(225, 238, Image.SCALE_DEFAULT);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		Image img2=new ImageIcon(this.getClass().getResource("/Sing2.jpg")).getImage().getScaledInstance(225, 238, Image.SCALE_DEFAULT);
		lblNewLabel_1.setIcon(new ImageIcon(img2));
		lblNewLabel_1.setBounds(68, 150, 204, 238);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		Image img3=new ImageIcon(this.getClass().getResource("/Dune.jpg")).getImage().getScaledInstance(225, 238, Image.SCALE_DEFAULT);
		lblNewLabel_2.setIcon(new ImageIcon(img3));
		lblNewLabel_2.setBounds(381, 150, 209, 238);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBackground(new Color(204, 0, 102));
		Image img4=new ImageIcon(this.getClass().getResource("/harry potter.jpg")).getImage().getScaledInstance(225, 238, Image.SCALE_DEFAULT);
		lblNewLabel_3.setIcon(new ImageIcon(img4));
		lblNewLabel_3.setBounds(706, 150, 204, 238);
		panel.add(lblNewLabel_3);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBounds(10, 35, 420, -37);
		panel.add(desktopPane);
		
		JButton btnNewButton = new JButton("SingIn");
		btnNewButton.setForeground(new Color(218, 165, 32));
		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("Tempus Sans ITC", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegisterationPage rp=new RegisterationPage();
//				rp.NewScreen();
				
			}
		});
		
		btnNewButton.setBounds(654, 23, 100, 36);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Login");
		btnNewButton_1.setForeground(new Color(218, 165, 32));
		btnNewButton_1.setBackground(new Color(0, 0, 0));
		btnNewButton_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 15));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginPage lp=new LoginPage();
				
			}
		});
		btnNewButton_1.setBounds(807, 23, 106, 36);
		panel.add(btnNewButton_1);
		
		JTextPane txtpnLetsparty = new JTextPane();
		txtpnLetsparty.setBackground(Color.BLACK);
		txtpnLetsparty.setForeground(Color.WHITE);
		txtpnLetsparty.setFont(new Font("Viner Hand ITC", Font.BOLD, 21));
		txtpnLetsparty.setText("LetsParty ...Enjoy Life");
		txtpnLetsparty.setBounds(10, 8, 313, 46);
		panel.add(txtpnLetsparty);
		
		JTextPane txtpnComedy = new JTextPane();
		txtpnComedy.setForeground(new Color(218, 165, 32));
		txtpnComedy.setBackground(new Color(0, 0, 0));
		txtpnComedy.setFont(new Font("Viner Hand ITC", Font.BOLD, 20));
		txtpnComedy.setText("Comedy");
		txtpnComedy.setBounds(145, 412, 106, 46);
		panel.add(txtpnComedy);
		
		JTextPane txtpnAction = new JTextPane();
		txtpnAction.setFont(new Font("Viner Hand ITC", Font.BOLD, 20));
		txtpnAction.setForeground(new Color(218, 165, 32));
		txtpnAction.setBackground(new Color(0, 0, 0));
		txtpnAction.setText("Action");
		txtpnAction.setBounds(445, 411, 100, 47);
		panel.add(txtpnAction);
		
		JTextPane txtpnAdventure = new JTextPane();
		txtpnAdventure.setFont(new Font("Viner Hand ITC", Font.BOLD, 20));
		txtpnAdventure.setForeground(new Color(218, 165, 32));
		txtpnAdventure.setBackground(new Color(0, 0, 0));
		txtpnAdventure.setText("Adventure");
		txtpnAdventure.setBounds(754, 411, 133, 46);
		panel.add(txtpnAdventure);
	}
}
