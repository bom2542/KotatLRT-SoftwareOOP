package lrt;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import java.awt.Toolkit;

public class StationMemberRegister {

	private JFrame frmMemberregisterLrtkorat;
	private JTextField txtName;
	private JTextField txtTell;
	private JPasswordField txtPin;
	public String path;
	public ImageIcon MyImage;
	public Image img;
	public Image newImg;
	public ImageIcon image;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StationMemberRegister window = new StationMemberRegister();
					window.frmMemberregisterLrtkorat.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public StationMemberRegister() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMemberregisterLrtkorat = new JFrame();
		frmMemberregisterLrtkorat.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Java\\ProjectAdvOOAGroup1\\images\\LRTLOGO2.png"));
		frmMemberregisterLrtkorat.setTitle("MemberRegister - LRTKORAT");
		frmMemberregisterLrtkorat.setBounds(100, 100, 1280, 800);
		frmMemberregisterLrtkorat.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMemberregisterLrtkorat.getContentPane().setLayout(null);
		
		JLabel Logo = new JLabel();
		Logo.setBounds(156, 0, 159, 201);
		path = "C:\\\\Java\\\\ProjectAdvOOAGroup1\\\\images\\\\LRTLOGO1.png";
		
		JLabel lblNewLabel_2 = new JLabel("\u0E23\u0E16\u0E44\u0E1F\u0E1F\u0E49\u0E32\u0E23\u0E32\u0E07\u0E40\u0E1A\u0E32\u0E42\u0E04\u0E23\u0E32\u0E0A");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("SUT", Font.BOLD, 40));
		lblNewLabel_2.setBounds(314, 102, 306, 65);
		frmMemberregisterLrtkorat.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("KORAT LIGHT-RAIL TRANSPORT (LRTKORAT)");
		lblNewLabel.setForeground(new Color(147, 112, 219));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("SUT", Font.BOLD, 50));
		lblNewLabel.setBounds(341, 36, 785, 80);
		frmMemberregisterLrtkorat.getContentPane().add(lblNewLabel);
		frmMemberregisterLrtkorat.getContentPane().add(Logo);
		MyImage = new ImageIcon(path);
		img = MyImage.getImage();
		newImg = img.getScaledInstance(Logo.getWidth(), Logo.getHeight(), Image.SCALE_SMOOTH);
		image = new ImageIcon(newImg);
		Logo.setIcon(image);
		
		JLabel Title2 = new JLabel();
		Title2.setBounds(0, 0, 1264, 212);
		path = "C:\\\\Java\\\\ProjectAdvOOAGroup1\\\\images\\\\3143170.jpg";
		frmMemberregisterLrtkorat.getContentPane().add(Title2);
		MyImage = new ImageIcon(path);
		img = MyImage.getImage();
		newImg = img.getScaledInstance(Title2.getWidth(), Title2.getHeight(), Image.SCALE_SMOOTH);
		image = new ImageIcon(newImg);
		Title2.setIcon(image);
		
		JLabel lblName = new JLabel("NAME:");
		lblName.setFont(new Font("SUT", Font.BOLD, 30));
		lblName.setBounds(32, 320, 108, 44);
		frmMemberregisterLrtkorat.getContentPane().add(lblName);
		
		JLabel lblSex = new JLabel("SEX:");
		lblSex.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblSex.setBounds(351, 398, 67, 44);
		frmMemberregisterLrtkorat.getContentPane().add(lblSex);
		
		JLabel lblBrihtday = new JLabel("BIRTHDAY:");
		lblBrihtday.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblBrihtday.setBounds(262, 455, 159, 44);
		frmMemberregisterLrtkorat.getContentPane().add(lblBrihtday);
		
		JLabel lblTellNo = new JLabel("TELL NO:");
		lblTellNo.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblTellNo.setBounds(288, 511, 135, 44);
		frmMemberregisterLrtkorat.getContentPane().add(lblTellNo);
		
		JLabel lblPinDigit = new JLabel("PIN 6 digit:");
		lblPinDigit.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblPinDigit.setBounds(262, 568, 169, 44);
		frmMemberregisterLrtkorat.getContentPane().add(lblPinDigit);
		
		JRadioButton Gender1 = new JRadioButton("  MALE");
		Gender1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		Gender1.setBounds(472, 408, 127, 25);
		frmMemberregisterLrtkorat.getContentPane().add(Gender1);
		
		JRadioButton Gender2 = new JRadioButton("  FAMALE");
		Gender2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		Gender2.setBounds(624, 408, 166, 25);
		frmMemberregisterLrtkorat.getContentPane().add(Gender2);
		
		txtName = new JTextField();
		txtName.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtName.setBounds(126, 324, 335, 40);
		frmMemberregisterLrtkorat.getContentPane().add(txtName);
		txtName.setColumns(10);
		
		txtTell = new JTextField();
		txtTell.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtTell.setColumns(10);
		txtTell.setBounds(455, 511, 238, 40);
		frmMemberregisterLrtkorat.getContentPane().add(txtTell);
		
		txtPin = new JPasswordField();
		txtPin.setBounds(455, 577, 118, 40);
		frmMemberregisterLrtkorat.getContentPane().add(txtPin);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(455, 455, 220, 40);
		frmMemberregisterLrtkorat.getContentPane().add(dateChooser);
		
		JButton btnRegister = new JButton("REGISTER");
		btnRegister.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnRegister.setBounds(113, 668, 238, 65);
		frmMemberregisterLrtkorat.getContentPane().add(btnRegister);
		
		JButton btnCancle = new JButton("Clear");
		btnCancle.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnCancle.setBounds(525, 668, 147, 65);
		frmMemberregisterLrtkorat.getContentPane().add(btnCancle);
		
		JButton button = new JButton("EXIT  ");
		button.setHorizontalAlignment(SwingConstants.RIGHT);
		button.setForeground(Color.BLACK);
		button.setFont(new Font("Tahoma", Font.PLAIN, 30));
		button.setBackground(SystemColor.activeCaption);
		button.setBounds(1078, 634, 131, 65);
		frmMemberregisterLrtkorat.getContentPane().add(button);
		
		JLabel lblNewLabel_2_1 = new JLabel("\u0E25\u0E07\u0E17\u0E30\u0E40\u0E1A\u0E35\u0E22\u0E19\u0E2A\u0E21\u0E32\u0E0A\u0E34\u0E01\u0E43\u0E2B\u0E21\u0E48");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setForeground(Color.black);
		lblNewLabel_2_1.setFont(new Font("SUT", Font.BOLD, 50));
		lblNewLabel_2_1.setBounds(396, 228, 554, 65);
		frmMemberregisterLrtkorat.getContentPane().add(lblNewLabel_2_1);
		
		
	}
}
