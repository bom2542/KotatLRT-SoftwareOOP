package lrt;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.Image;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MemberWallet {

	private JFrame frame;
	private JTextField txtPhone;
	private String path;
	private ImageIcon MyImage;
	private Image img;
	private Image newImg;
	private ImageIcon image;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MemberWallet window = new MemberWallet();
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
	public MemberWallet() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Java\\ProjectAdvOOAGroup1\\images\\LRTLOGO2.png"));
		frame.setTitle("Member Wallet Check");
		frame.setBounds(100, 100, 566, 466);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblMemberWallet = new JLabel("Member Wallet");
		lblMemberWallet.setForeground(Color.WHITE);
		lblMemberWallet.setFont(new Font("CordiaUPC", Font.BOLD, 60));
		lblMemberWallet.setBounds(162, 24, 314, 71);
		frame.getContentPane().add(lblMemberWallet);
		
		txtPhone = new JTextField();
		txtPhone.setFont(new Font("CordiaUPC", Font.BOLD, 40));
		txtPhone.setColumns(10);
		txtPhone.setBounds(198, 166, 237, 43);
		frame.getContentPane().add(txtPhone);
		
		JButton btnCheck = new JButton("Check");
		btnCheck.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnCheck.setBounds(345, 222, 131, 44);
		frame.getContentPane().add(btnCheck);
		
		JLabel lblPhoneNo = new JLabel("Phone NO:");
		lblPhoneNo.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblPhoneNo.setBounds(49, 165, 153, 44);
		frame.getContentPane().add(lblPhoneNo);
		
		JLabel lblWallet = new JLabel("Wallet:");
		lblWallet.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblWallet.setBounds(71, 279, 99, 44);
		frame.getContentPane().add(lblWallet);
		
		JLabel lbWallet = new JLabel("??");
		lbWallet.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lbWallet.setBounds(171, 279, 131, 44);
		frame.getContentPane().add(lbWallet);
		
		JLabel lblBaht = new JLabel("Baht");
		lblBaht.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblBaht.setBounds(314, 279, 99, 44);
		frame.getContentPane().add(lblBaht);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				@SuppressWarnings("unused")
				DashboardMachine msl = new DashboardMachine();
				DashboardMachine.main(null);
				frame.dispose();
			}
		});
		btnBack.setForeground(Color.BLACK);
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnBack.setBackground(SystemColor.activeCaption);
		btnBack.setBounds(12, 363, 131, 43);
		frame.getContentPane().add(btnBack);
		
		//Logo
		JLabel logo;
		logo = new JLabel();
		logo.setBounds(28, 4, 93, 117);
		frame.getContentPane().add(logo);
		path = "C:\\\\Java\\\\ProjectAdvOOAGroup1\\\\images\\\\LRTLOGO1.png";
		MyImage = new ImageIcon(path);
		img = MyImage.getImage();
		newImg = img.getScaledInstance(logo.getWidth(), logo.getHeight(), Image.SCALE_SMOOTH);
		image = new ImageIcon(newImg);
		logo.setIcon(image);
		
		//Bg-Containt
		JLabel bd_c = new JLabel();
		bd_c.setBackground(SystemColor.activeCaptionBorder);
		bd_c.setBounds(0, 133, 548, 201);
		frame.getContentPane().add(bd_c);
		path = "C:\\\\Java\\\\ProjectAdvOOAGroup1\\\\images\\\\3143170.jpg";
		MyImage = new ImageIcon(path);
		img = MyImage.getImage();
		newImg = img.getScaledInstance(bd_c.getWidth(), bd_c.getHeight(), Image.SCALE_SMOOTH);
		image = new ImageIcon(newImg);
		bd_c.setIcon(image);
		
		//Background
		JLabel img_bg = new JLabel();
		img_bg.setBounds(0, 0, 548, 419);
		frame.getContentPane().add(img_bg);
		path = "C:\\\\Java\\\\ProjectAdvOOAGroup1\\\\images\\\\1299.jpg";
		MyImage = new ImageIcon(path);
		img = MyImage.getImage();
		newImg = img.getScaledInstance(img_bg.getWidth(), img_bg.getHeight(), Image.SCALE_SMOOTH);
		image = new ImageIcon(newImg);
		img_bg.setIcon(image);
	}

}