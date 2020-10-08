package lrt;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EmployeeLogin {

	private JFrame frmStationloginLrtkorat;
	//private JTextField TxtStation;
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
					EmployeeLogin window = new EmployeeLogin();
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
	public EmployeeLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmStationloginLrtkorat = new JFrame();
		frmStationloginLrtkorat.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Java\\ProjectAdvOOAGroup1\\images\\LRTLOGO2.png"));
		frmStationloginLrtkorat.setTitle("EmployeeLogin - LRTKORAT");
		frmStationloginLrtkorat.setBounds(100, 100, 566, 466);
		frmStationloginLrtkorat.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmStationloginLrtkorat.getContentPane().setLayout(null);
		
		JLabel Logo = new JLabel();
		Logo.setBounds(239, 5, 110, 141);
		path = "C:\\\\Java\\\\ProjectAdvOOAGroup1\\\\images\\\\LRTLOGO1.png";
		frmStationloginLrtkorat.getContentPane().add(Logo);
		ImageIcon MyImage = new ImageIcon(path);
		Image img = MyImage.getImage();
		Image newImg = img.getScaledInstance(Logo.getWidth(), Logo.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon image = new ImageIcon(newImg);
		Logo.setIcon(image);
		
		
		TxtPassword = new JPasswordField();
		TxtPassword.setFont(new Font("SUT", Font.BOLD, 30));
		TxtPassword.setBounds(240, 242, 200, 40);
		frmStationloginLrtkorat.getContentPane().add(TxtPassword);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TxtUsername.setText("");
				TxtPassword.setText("");
			}
		});
		btnClear.setFont(new Font("SUT", Font.BOLD, 30));
		btnClear.setBounds(211, 354, 132, 40);
		frmStationloginLrtkorat.getContentPane().add(btnClear);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("SUT", Font.BOLD, 30));
		btnExit.setBounds(388, 354, 132, 40);
		frmStationloginLrtkorat.getContentPane().add(btnExit);
		
		JLabel lblUsername = new JLabel("Username : ");
		lblUsername.setHorizontalAlignment(SwingConstants.RIGHT);
		lblUsername.setForeground(Color.WHITE);
		lblUsername.setFont(new Font("SUT", Font.BOLD, 32));
		lblUsername.setBounds(45, 172, 182, 56);
		frmStationloginLrtkorat.getContentPane().add(lblUsername);
		
		JButton BtnLogin = new JButton("Login");
		BtnLogin.setFont(new Font("SUT", Font.BOLD, 30));
		BtnLogin.setBounds(24, 354, 132, 40);
		frmStationloginLrtkorat.getContentPane().add(BtnLogin);
		
		JLabel lblPassword = new JLabel("Password : ");
		lblPassword.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("SUT", Font.BOLD, 32));
		lblPassword.setBounds(45, 232, 182, 56);
		frmStationloginLrtkorat.getContentPane().add(lblPassword);
		
		TxtUsername = new JTextField();
		TxtUsername.setFont(new Font("SUT", Font.PLAIN, 24));
		TxtUsername.setColumns(10);
		TxtUsername.setBounds(240, 182, 200, 40);
		frmStationloginLrtkorat.getContentPane().add(TxtUsername);
		
		JLabel Bg = new JLabel();
		Bg.setBounds(0, 0, 550, 427);
		path = "C:\\\\Java\\\\ProjectAdvOOAGroup1\\\\images\\\\1299.jpg";
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Java\\ProjectAdvOOAGroup1\\images\\Today-at-Apple-at-Home-wallpapers-Matt-Birchler-idownloadblog-5-desktop.jpeg"));
		lblNewLabel.setBackground(SystemColor.windowText);
		lblNewLabel.setForeground(SystemColor.textHighlight);
		lblNewLabel.setBounds(-125, 147, 731, 167);
		frmStationloginLrtkorat.getContentPane().add(lblNewLabel);
		frmStationloginLrtkorat.getContentPane().add(Bg);
		ImageIcon MyImage2 = new ImageIcon(path);
		Image img2 = MyImage2.getImage();
		Image newImg2 = img2.getScaledInstance(Bg.getWidth(), Bg.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon image2 = new ImageIcon(newImg2);
		Bg.setIcon(image2);
	}

}
