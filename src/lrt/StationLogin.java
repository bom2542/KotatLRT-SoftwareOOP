package lrt;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class StationLogin {

	private JFrame frmStationloginLrtkorat;
	private JTextField TxtStation;
	private JPasswordField TxtPassword;
	Statement st;
	Connection con = null;
	ResultSet rsRead;
	private String std, pass, path;
	int check;


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
		Logo.setBounds(238, 13, 93, 117);
		path = "C:\\\\Java\\\\ProjectAdvOOAGroup1\\\\images\\\\LRTLOGO1.png";
		frmStationloginLrtkorat.getContentPane().add(Logo);
		ImageIcon MyImage = new ImageIcon(path);
		Image img = MyImage.getImage();
		Image newImg = img.getScaledInstance(Logo.getWidth(), Logo.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon image = new ImageIcon(newImg);
		Logo.setIcon(image);
		
		
		TxtPassword = new JPasswordField();
		TxtPassword.setFont(new Font("SUT", Font.PLAIN, 30));
		TxtPassword.setBounds(231, 239, 200, 40);
		frmStationloginLrtkorat.getContentPane().add(TxtPassword);
		
		//clear btn
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TxtStation.setText("");
				TxtPassword.setText("");
			}
		});
		btnClear.setFont(new Font("SUT", Font.BOLD, 30));
		btnClear.setBounds(210, 352, 132, 40);
		frmStationloginLrtkorat.getContentPane().add(btnClear);
		
		//exit btn
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("SUT", Font.BOLD, 30));
		btnExit.setBounds(387, 352, 132, 40);
		frmStationloginLrtkorat.getContentPane().add(btnExit);
		
		TxtStation = new JTextField();
		TxtStation.setFont(new Font("SUT", Font.PLAIN, 30));
		TxtStation.setBounds(232, 178, 110, 40);
		frmStationloginLrtkorat.getContentPane().add(TxtStation);
		TxtStation.setColumns(10);
		
		//login btn
		JButton BtnLogin = new JButton("Login");
		BtnLogin.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				
				CheckLogin cl = new CheckLogin();
				std = TxtStation.getText();
				pass = TxtPassword.getText();
				cl.setStationLogin(std, pass);
				check = cl.getCheckLogin();
				
				if(check == 1) {
					@SuppressWarnings("unused")
					DashboardStationEmployee dse = new DashboardStationEmployee();
					DashboardStationEmployee.main(null);
					frmStationloginLrtkorat.setVisible(false);
					
				}else {
					JFrame f = new JFrame();  
				    JOptionPane.showMessageDialog(f,"Login Failed !!!","StationLogin - LRTKORAT",JOptionPane.ERROR_MESSAGE);     
				}
			}
		});
		BtnLogin.setFont(new Font("SUT", Font.BOLD, 30));
		BtnLogin.setBounds(23, 352, 132, 40);
		frmStationloginLrtkorat.getContentPane().add(BtnLogin);
		
		JLabel lblPassword = new JLabel("PIN : ");
		lblPassword.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("SUT", Font.BOLD, 30));
		lblPassword.setBounds(36, 229, 182, 56);
		frmStationloginLrtkorat.getContentPane().add(lblPassword);
		
		JLabel lblStation = new JLabel("Station ID : ");
		lblStation.setHorizontalAlignment(SwingConstants.RIGHT);
		lblStation.setForeground(Color.WHITE);
		lblStation.setFont(new Font("SUT", Font.BOLD, 30));
		lblStation.setBounds(37, 168, 182, 56);
		frmStationloginLrtkorat.getContentPane().add(lblStation);
		
		
		JLabel Bg = new JLabel();
		Bg.setBounds(0, 0, 550, 427);
		path = "C:\\\\Java\\\\ProjectAdvOOAGroup1\\\\images\\\\1299.jpg";
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Java\\ProjectAdvOOAGroup1\\images\\3143170.jpg"));
		lblNewLabel.setBackground(SystemColor.windowText);
		lblNewLabel.setForeground(SystemColor.textHighlight);
		lblNewLabel.setBounds(-130, 141, 731, 180);
		frmStationloginLrtkorat.getContentPane().add(lblNewLabel);
		frmStationloginLrtkorat.getContentPane().add(Bg);
		ImageIcon MyImage2 = new ImageIcon(path);
		Image img2 = MyImage2.getImage();
		Image newImg2 = img2.getScaledInstance(Bg.getWidth(), Bg.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon image2 = new ImageIcon(newImg2);
		Bg.setIcon(image2);
	}

}
