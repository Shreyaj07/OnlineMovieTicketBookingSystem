package guiApplication;

import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import javax.swing.ScrollPaneLayout;

import java.awt.Font;
import java.awt.Image;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import java.awt.event.AdjustmentListener;
import java.awt.event.AdjustmentEvent;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main extends JFrame{

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void MainWindow() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
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
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setSize(1200, 800);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
//		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
//		JScrollPane scrollPane = new JScrollPane(panel);
//		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); //Makes objects add vertically and centered
//	    scrollPane.setPreferredSize(new Dimension(500, 450));
//	    panel.add(scrollPane, BorderLayout.CENTER);
//		JScrollPane scrPane = new JScrollPane(panel);
//		frame.add(scrPane);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(Color.ORANGE);
		Image img=new ImageIcon(this.getClass().getResource("/Dune.jpg")).getImage().getScaledInstance(225, 238, Image.SCALE_DEFAULT);
		panel.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setBounds(0, 0, 0, 0);
		panel.add(lblNewLabel_4);
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(38, 78, 202, 223);
		panel.add(lblNewLabel);
		
		JTextPane txtpnDune = new JTextPane();
		txtpnDune.setFont(new Font("Sitka Text", Font.BOLD, 15));
		txtpnDune.setForeground(Color.WHITE);
		txtpnDune.setText("         DUNE\r\n7.00 | 2 hr | 12/4/22\r\n");
		txtpnDune.setBackground(Color.BLACK);
		txtpnDune.setBounds(72, 326, 170, 55);
		panel.add(txtpnDune);
		
		JTextPane txtpnLetsEnjoyThe = new JTextPane();
		txtpnLetsEnjoyThe.setFont(new Font("Viner Hand ITC", Font.BOLD, 22));
		txtpnLetsEnjoyThe.setText("      Let's Enjoy The Moment");
		txtpnLetsEnjoyThe.setBounds(429, 0, 329, 42);
		panel.add(txtpnLetsEnjoyThe);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBackground(Color.ORANGE);
		Image img2=new ImageIcon(this.getClass().getResource("/Eternals.jpg")).getImage().getScaledInstance(225, 238, Image.SCALE_DEFAULT);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setBounds(0, 0, 0, 0);
		panel.add(lblNewLabel_5);
		lblNewLabel_1.setIcon(new ImageIcon(img2));
		lblNewLabel_1.setBounds(330, 77, 202, 223);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		Image img3=new ImageIcon(this.getClass().getResource("/NoTimeToDie.jpg")).getImage().getScaledInstance(225, 238, Image.SCALE_DEFAULT);
		lblNewLabel_2.setIcon(new ImageIcon(img3));
		lblNewLabel_2.setBounds(613, 76, 202, 225);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		Image img4=new ImageIcon(this.getClass().getResource("/Sing2.jpg")).getImage().getScaledInstance(225, 238, Image.SCALE_DEFAULT);
		lblNewLabel_3.setIcon(new ImageIcon(img4));
		lblNewLabel_3.setBounds(921, 77, 202, 224);
		panel.add(lblNewLabel_3);
		panel.setSize(400,400);  
		panel.setLayout(null);  
		panel.setVisible(true);
		
		JTextPane txtpnEternalpm = new JTextPane();
		txtpnEternalpm.setToolTipText("Book Now");
		txtpnEternalpm.setFont(new Font("Sitka Text", Font.BOLD, 16));
		txtpnEternalpm.setForeground(Color.WHITE);
		txtpnEternalpm.setText("              Eternal\r\n9.00pm | 2.30 hr | 10/5/22");
		txtpnEternalpm.setBackground(Color.BLACK);
		txtpnEternalpm.setBounds(313, 326, 229, 55);
		panel.add(txtpnEternalpm);
		
		JTextPane txtpnNoTimeTo = new JTextPane();
		txtpnNoTimeTo.setFont(new Font("Sitka Text", Font.BOLD, 16));
		txtpnNoTimeTo.setForeground(Color.WHITE);
		txtpnNoTimeTo.setText("    No Time TO Die\r\n7.00pm| 3hr | 20/4/22");
		txtpnNoTimeTo.setBackground(Color.BLACK);
		txtpnNoTimeTo.setBounds(613, 326, 211, 55);
		panel.add(txtpnNoTimeTo);
		
		JTextPane txtpnSignpm = new JTextPane();
		txtpnSignpm.setFont(new Font("Sitka Text", Font.BOLD, 16));
		txtpnSignpm.setForeground(Color.WHITE);
		txtpnSignpm.setText("           Sign 2\r\n9.00pm | 2hr | 22/4/22");
		txtpnSignpm.setBackground(Color.BLACK);
		txtpnSignpm.setBounds(941, 326, 221, 55);
		panel.add(txtpnSignpm);
		
		JLabel lblNewLabel_6 = new JLabel("");
		Image img5=new ImageIcon(this.getClass().getResource("/the lost city.jpg")).getImage().getScaledInstance(225, 238, Image.SCALE_DEFAULT);
		lblNewLabel_6.setIcon(new ImageIcon(img5));
		lblNewLabel_6.setBounds(38, 416, 202, 223);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_6_1 = new JLabel("");
		Image img6=new ImageIcon(this.getClass().getResource("/GhostBusters.jpg")).getImage().getScaledInstance(225, 238, Image.SCALE_DEFAULT);
		lblNewLabel_6_1.setIcon(new ImageIcon(img6));
		lblNewLabel_6_1.setBounds(330, 416, 202, 223);
		panel.add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_6_2 = new JLabel("");
		Image img7=new ImageIcon(this.getClass().getResource("/dracula.jpg")).getImage().getScaledInstance(225, 238, Image.SCALE_DEFAULT);
		lblNewLabel_6_2.setIcon(new ImageIcon(img7));
		lblNewLabel_6_2.setBounds(613, 416, 202, 223);
		panel.add(lblNewLabel_6_2);
		
		JLabel lblNewLabel_6_3 = new JLabel("");
		Image img8=new ImageIcon(this.getClass().getResource("/SpiderMan.jpg")).getImage().getScaledInstance(225, 238, Image.SCALE_DEFAULT);
		lblNewLabel_6_3.setIcon(new ImageIcon(img8));
		lblNewLabel_6_3.setBounds(921, 416, 202, 223);
		panel.add(lblNewLabel_6_3);
		
		JTextPane txtpnTheLostCity = new JTextPane();
		txtpnTheLostCity.setFont(new Font("Sitka Text", Font.BOLD, 15));
		txtpnTheLostCity.setForeground(Color.WHITE);
		txtpnTheLostCity.setText("         The Lost City\r\n9.00pm | 2.30 hr | 26/4/22\r\n  ");
		txtpnTheLostCity.setBackground(Color.BLACK);
		txtpnTheLostCity.setBounds(38, 672, 229, 52);
		panel.add(txtpnTheLostCity);
		
		JTextPane txtpnGhostbusterspm = new JTextPane();
		txtpnGhostbusterspm.setFont(new Font("Sitka Text", Font.BOLD, 16));
		txtpnGhostbusterspm.setForeground(Color.WHITE);
		txtpnGhostbusterspm.setText("      GhostBusters\r\n9.00pm | 3hr | 30/4/22");
		txtpnGhostbusterspm.setBackground(Color.BLACK);
		txtpnGhostbusterspm.setBounds(330, 672, 231, 52);
		panel.add(txtpnGhostbusterspm);
		
		JTextPane txtpnDraculapm = new JTextPane();
		txtpnDraculapm.setFont(new Font("Sitka Text", Font.BOLD, 16));
		txtpnDraculapm.setText("           Dracula\r\n7.00pm | 3hr | 1/5/22");
		txtpnDraculapm.setForeground(Color.WHITE);
		txtpnDraculapm.setBackground(Color.BLACK);
		txtpnDraculapm.setBounds(638, 675, 202, 49);
		panel.add(txtpnDraculapm);
		
		JTextPane txtpnSpidermanpm = new JTextPane();
		txtpnSpidermanpm.setFont(new Font("Sitka Text", Font.BOLD, 16));
		txtpnSpidermanpm.setForeground(Color.WHITE);
		txtpnSpidermanpm.setText("           SpiderMan\r\n9.00pm | 2.30 hr | 3/5/22");
		txtpnSpidermanpm.setBackground(Color.BLACK);
		txtpnSpidermanpm.setBounds(908, 672, 242, 52);
		panel.add(txtpnSpidermanpm);
		
		JButton btnNewButton = new JButton("BookTicket");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Transaction tr=new Transaction();
				tr.TransactionWindow(null);
//				dispose();
			}
		});
		
		btnNewButton.setFont(new Font("Tempus Sans ITC", Font.BOLD, 13));
		btnNewButton.setBounds(1014, 19, 121, 23);
		panel.add(btnNewButton);
	}
}
