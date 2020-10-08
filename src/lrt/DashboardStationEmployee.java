package lrt;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Toolkit;

public class DashboardStationEmployee {

	private JFrame frmDashboardstationemployees;
	public String path;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DashboardStationEmployee window = new DashboardStationEmployee();
					window.frmDashboardstationemployees.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DashboardStationEmployee() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDashboardstationemployees = new JFrame();
		frmDashboardstationemployees.setTitle("DashboardStation&Employees - LRTKORAT");
		frmDashboardstationemployees.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Java\\ProjectAdvOOAGroup1\\images\\LRTLOGO2.png"));
		frmDashboardstationemployees.setBounds(100, 100, 1280, 800);
		frmDashboardstationemployees.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDashboardstationemployees.getContentPane().setLayout(null);
		
		JLabel Logo = new JLabel();
		Logo.setBounds(158, 11, 161, 201);
		path = "C:\\\\Java\\\\ProjectAdvOOAGroup1\\\\images\\\\LRTLOGO1.png";
		frmDashboardstationemployees.getContentPane().add(Logo);
		ImageIcon MyImage = new ImageIcon(path);
		Image img = MyImage.getImage();
		Image newImg = img.getScaledInstance(Logo.getWidth(), Logo.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon image = new ImageIcon(newImg);
		Logo.setIcon(image);
		
		JLabel lblNewLabel = new JLabel("KORAT LIGHT-RAIL TRANSPORT (LRTKORAT)");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("SUT", Font.BOLD, 50));
		lblNewLabel.setBounds(341, 36, 785, 80);
		frmDashboardstationemployees.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("STATION_ID:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_1.setBounds(62, 252, 219, 44);
		frmDashboardstationemployees.getContentPane().add(lblNewLabel_1);
		
		JLabel lbStationID = new JLabel("??");
		lbStationID.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lbStationID.setBounds(287, 252, 49, 44);
		frmDashboardstationemployees.getContentPane().add(lbStationID);
		
		JLabel lblOriginstation = new JLabel("ORIGIN_STATION:");
		lblOriginstation.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblOriginstation.setBounds(384, 252, 293, 44);
		frmDashboardstationemployees.getContentPane().add(lblOriginstation);
		
		JLabel lbOriginStation = new JLabel("??");
		lbOriginStation.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lbOriginStation.setBounds(710, 252, 209, 44);
		frmDashboardstationemployees.getContentPane().add(lbOriginStation);
		
		JLabel lblZone = new JLabel("ZONE:");
		lblZone.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblZone.setBounds(947, 252, 108, 44);
		frmDashboardstationemployees.getContentPane().add(lblZone);
		
		JLabel lbZone = new JLabel("??");
		lbZone.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lbZone.setBounds(1067, 252, 49, 44);
		frmDashboardstationemployees.getContentPane().add(lbZone);
		
		JButton btnRegisterMember = new JButton("REGISTER MEMBER");
		btnRegisterMember.setFont(new Font("Tahoma", Font.PLAIN, 56));
		btnRegisterMember.setBounds(325, 278, 606, 105);
		frmDashboardstationemployees.getContentPane().add(btnRegisterMember);
		
		JButton btnAddWaletMember = new JButton("ADD WALET MEMBER");
		btnAddWaletMember.setFont(new Font("Tahoma", Font.PLAIN, 56));
		btnAddWaletMember.setBounds(325, 408, 606, 105);
		frmDashboardstationemployees.getContentPane().add(btnAddWaletMember);
		
		JButton btnLrtKoratTicket = new JButton("LRT KORAT TICKET");
		btnLrtKoratTicket.setFont(new Font("Tahoma", Font.PLAIN, 56));
		btnLrtKoratTicket.setBounds(325, 537, 606, 105);
		frmDashboardstationemployees.getContentPane().add(btnLrtKoratTicket);
		
		JButton btExit = new JButton("EXIT  ");
		btExit.setHorizontalAlignment(SwingConstants.RIGHT);
		btExit.setForeground(Color.BLACK);
		btExit.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btExit.setBackground(SystemColor.activeCaption);
		btExit.setBounds(1123, 685, 131, 65);
		frmDashboardstationemployees.getContentPane().add(btExit);
		
		JLabel lblNewLabel_2 = new JLabel("\u0E23\u0E16\u0E44\u0E1F\u0E1F\u0E49\u0E32\u0E23\u0E32\u0E07\u0E40\u0E1A\u0E32\u0E42\u0E04\u0E23\u0E32\u0E0A");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("SUT", Font.BOLD, 40));
		lblNewLabel_2.setBounds(323, 102, 306, 65);
		frmDashboardstationemployees.getContentPane().add(lblNewLabel_2);
	}
}
