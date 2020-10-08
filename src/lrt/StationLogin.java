package lrt;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StationLogin {

	private JFrame frmStationloginLrtkorat;
	private JTextField TxtStation;
	public static String path;
	private JTextField TxtUsername;
	private JPasswordField TxtPassword;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StationLogin window = new StationLogin();
					window.frmStationloginLrtkorat.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public StationLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmStationloginLrtkorat = new JFrame();
		frmStationloginLrtkorat.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Java\\ProjectAdvOOAGroup1\\images\\LRTLOGO2.png"));
		frmStationloginLrtkorat.setTitle("StationLogin - LRTKORAT");
		frmStationloginLrtkorat.getContentPane().setBackground(SystemColor.menu);
		frmStationloginLrtkorat.getContentPane().setForeground(SystemColor.inactiveCaptionBorder);
		frmStationloginLrtkorat.setBounds(100, 100, 566, 466);
		frmStationloginLrtkorat.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmStationloginLrtkorat.getContentPane().setLayout(null);
		

		JLabel Logo = new JLabel();
		Logo.setBounds(239, 5, 93, 117);
		path = "C:\\\\Java\\\\ProjectAdvOOAGroup1\\\\images\\\\LRTLOGO1.png";
		frmStationloginLrtkorat.getContentPane().add(Logo);
		ImageIcon MyImage = new ImageIcon(path);
		Image img = MyImage.getImage();
		Image newImg = img.getScaledInstance(Logo.getWidth(), Logo.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon image = new ImageIcon(newImg);
		Logo.setIcon(image);
		
		
		TxtPassword = new JPasswordField();
		TxtPassword.setFont(new Font("SUT", Font.BOLD, 30));
		TxtPassword.setBounds(238, 275, 200, 40);
		frmStationloginLrtkorat.getContentPane().add(TxtPassword);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TxtStation.setText("");
				TxtUsername.setText("");
				TxtPassword.setText("");
			}
		});
		btnClear.setFont(new Font("SUT", Font.BOLD, 30));
		btnClear.setBounds(211, 363, 132, 40);
		frmStationloginLrtkorat.getContentPane().add(btnClear);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("SUT", Font.BOLD, 30));
		btnExit.setBounds(388, 363, 132, 40);
		frmStationloginLrtkorat.getContentPane().add(btnExit);
		
		JLabel lblUsername = new JLabel("Username : ");
		lblUsername.setHorizontalAlignment(SwingConstants.RIGHT);
		lblUsername.setForeground(Color.WHITE);
		lblUsername.setFont(new Font("SUT", Font.BOLD, 32));
		lblUsername.setBounds(43, 205, 182, 56);
		frmStationloginLrtkorat.getContentPane().add(lblUsername);
		
		TxtStation = new JTextField();
		TxtStation.setFont(new Font("SUT", Font.PLAIN, 24));
		TxtStation.setBounds(238, 155, 110, 40);
		frmStationloginLrtkorat.getContentPane().add(TxtStation);
		TxtStation.setColumns(10);
		
		JButton BtnLogin = new JButton("Login");
		BtnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		BtnLogin.setFont(new Font("SUT", Font.BOLD, 30));
		BtnLogin.setBounds(24, 363, 132, 40);
		frmStationloginLrtkorat.getContentPane().add(BtnLogin);
		
		JLabel lblPassword = new JLabel("Password : ");
		lblPassword.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("SUT", Font.BOLD, 32));
		lblPassword.setBounds(43, 265, 182, 56);
		frmStationloginLrtkorat.getContentPane().add(lblPassword);
		
		JLabel lblStation = new JLabel("Station ID : ");
		lblStation.setHorizontalAlignment(SwingConstants.RIGHT);
		lblStation.setForeground(Color.WHITE);
		lblStation.setFont(new Font("SUT", Font.BOLD, 32));
		lblStation.setBounds(43, 145, 182, 56);
		frmStationloginLrtkorat.getContentPane().add(lblStation);
		
		TxtUsername = new JTextField();
		TxtUsername.setFont(new Font("SUT", Font.PLAIN, 24));
		TxtUsername.setColumns(10);
		TxtUsername.setBounds(238, 215, 200, 40);
		frmStationloginLrtkorat.getContentPane().add(TxtUsername);
		
		/*JLabel Bg = new JLabel("New label");
		Bg.setIcon(new ImageIcon("C:\\Java\\ProjectAdvOOAGroup1\\images\\1299.jpg"));
		Bg.setBounds(35, 27, 443, 315);
		frmStationloginLrtkorat.getContentPane().add(Bg);
		Image newImg = img.getScaledInstance(Bg.getWidth(), Bg.getHeight(), Image.SCALE_SMOOTH);*/
		
		JLabel Bg = new JLabel();
		Bg.setBounds(0, 0, 550, 427);
		path = "C:\\\\Java\\\\ProjectAdvOOAGroup1\\\\images\\\\1299.jpg";
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Java\\ProjectAdvOOAGroup1\\images\\3143170.jpg"));
		lblNewLabel.setBackground(SystemColor.windowText);
		lblNewLabel.setForeground(SystemColor.textHighlight);
		lblNewLabel.setBounds(-130, 128, 731, 211);
		frmStationloginLrtkorat.getContentPane().add(lblNewLabel);
		frmStationloginLrtkorat.getContentPane().add(Bg);
		ImageIcon MyImage2 = new ImageIcon(path);
		Image img2 = MyImage2.getImage();
		Image newImg2 = img2.getScaledInstance(Bg.getWidth(), Bg.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon image2 = new ImageIcon(newImg2);
		Bg.setIcon(image2);
	}
}
