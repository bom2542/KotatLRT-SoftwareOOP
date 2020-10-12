package lrt;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JButton;

import java.awt.Image;
import java.awt.SystemColor;
import java.awt.Color;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Toolkit;

public class StationMemberWallet {

	private JFrame frame;
	private JTextField txtPhone;
	private JTextField txtAddWallet;
	private JTextField txtPin;
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
					StationMemberWallet window = new StationMemberWallet();
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
	public StationMemberWallet() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Java\\ProjectAdvOOAGroup1\\images\\LRTLOGO2.png"));
		frame.getContentPane().setBackground(SystemColor.inactiveCaptionBorder);
		frame.setBounds(100, 100, 1282, 800);
		frame.setTitle("Station Member Wallet");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblAddWaletmember = new JLabel("ADD WALET MEMBER");
		lblAddWaletmember.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblAddWaletmember.setBounds(58, 244, 310, 44);
		frame.getContentPane().add(lblAddWaletmember);
		
		JLabel lblPhonNo = new JLabel("Phone NO:");
		lblPhonNo.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblPhonNo.setBounds(58, 329, 164, 44);
		frame.getContentPane().add(lblPhonNo);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblName.setBounds(115, 396, 99, 44);
		frame.getContentPane().add(lblName);
		
		JLabel lblOldWalet = new JLabel("OLD WALET:");
		lblOldWalet.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblOldWalet.setBounds(39, 500, 181, 44);
		frame.getContentPane().add(lblOldWalet);
		
		JLabel lblPinDigit = new JLabel("PIN 6 digit:");
		lblPinDigit.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblPinDigit.setBounds(468, 329, 172, 44);
		frame.getContentPane().add(lblPinDigit);
		
		JLabel lblAddWalet = new JLabel("ADD WALLET:");
		lblAddWalet.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblAddWalet.setBounds(551, 500, 198, 44);
		frame.getContentPane().add(lblAddWalet);
		
		JLabel lblNewWallet = new JLabel("NEW WALLET:");
		lblNewWallet.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewWallet.setBounds(551, 579, 198, 44);
		frame.getContentPane().add(lblNewWallet);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setBackground(new Color(240, 255, 240));
		btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnAdd.setBounds(1067, 333, 172, 44);
		frame.getContentPane().add(btnAdd);
		
		JButton btCancle = new JButton("Cancle");
		btCancle.setBackground(new Color(230, 230, 250));
		btCancle.setForeground(Color.BLACK);
		btCancle.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btCancle.setBounds(1067, 438, 172, 44);
		frame.getContentPane().add(btCancle);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setForeground(Color.BLACK);
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnExit.setBackground(new Color(220, 220, 220));
		btnExit.setBounds(1067, 666, 172, 44);
		frame.getContentPane().add(btnExit);
		
		JLabel lbName = new JLabel("??");
		lbName.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lbName.setBounds(209, 396, 290, 44);
		frame.getContentPane().add(lbName);
		
		JLabel lbOwalet = new JLabel("??");
		lbOwalet.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lbOwalet.setBounds(220, 500, 141, 44);
		frame.getContentPane().add(lbOwalet);
		
		JLabel lbNewWallet = new JLabel("??");
		lbNewWallet.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lbNewWallet.setBounds(761, 579, 131, 44);
		frame.getContentPane().add(lbNewWallet);
		
		txtPhone = new JTextField();
		txtPhone.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtPhone.setColumns(10);
		txtPhone.setBounds(218, 333, 238, 40);
		frame.getContentPane().add(txtPhone);
		
		txtAddWallet = new JTextField();
		txtAddWallet.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtAddWallet.setColumns(10);
		txtAddWallet.setBounds(761, 502, 141, 40);
		frame.getContentPane().add(txtAddWallet);
		
		txtPin = new JTextField();
		txtPin.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtPin.setColumns(10);
		txtPin.setBounds(629, 333, 141, 40);
		frame.getContentPane().add(txtPin);
		
		JLabel lblBath = new JLabel("BAHT");
		lblBath.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblBath.setBounds(373, 500, 99, 44);
		frame.getContentPane().add(lblBath);
		
		JLabel lblBaht = new JLabel("BAHT");
		lblBaht.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblBaht.setBounds(912, 500, 99, 44);
		frame.getContentPane().add(lblBaht);
		
		JLabel lblBaht_1 = new JLabel("BAHT");
		lblBaht_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblBaht_1.setBounds(913, 575, 99, 44);
		frame.getContentPane().add(lblBaht_1);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setBackground(new Color(135, 206, 235));
		btnSearch.setIcon(new ImageIcon("C:\\Java\\ProjectAdvOOAGroup1\\images\\search.png"));
		btnSearch.setHorizontalAlignment(SwingConstants.RIGHT);
		btnSearch.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnSearch.setBounds(806, 329, 172, 48);
		frame.getContentPane().add(btnSearch);
		
		
		JButton btnUpdete = new JButton("Update");
		btnUpdete.setBackground(new Color(222, 184, 135));
		btnUpdete.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnUpdete.setBounds(1067, 386, 172, 44);
		frame.getContentPane().add(btnUpdete);
		
		JLabel label = new JLabel("\u0E23\u0E16\u0E44\u0E1F\u0E1F\u0E49\u0E32\u0E23\u0E32\u0E07\u0E40\u0E1A\u0E32\u0E42\u0E04\u0E23\u0E32\u0E0A");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Dialog", Font.BOLD, 40));
		label.setBounds(273, 112, 468, 65);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("KORAT LIGHT-RAIL TRANSPORT (LRTKORAT)");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(new Color(147, 112, 219));
		label_1.setFont(new Font("Dialog", Font.BOLD, 50));
		label_1.setBounds(269, 41, 883, 80);
		frame.getContentPane().add(label_1);
		
		JLabel Logo = new JLabel();
		Logo.setBounds(71, 13, 159, 201);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(Logo);
		path = "C:\\\\Java\\\\ProjectAdvOOAGroup1\\\\images\\\\LRTLOGO1.png";
		MyImage = new ImageIcon(path);
		img = MyImage.getImage();
		newImg = img.getScaledInstance(Logo.getWidth(), Logo.getHeight(), Image.SCALE_SMOOTH);
		image = new ImageIcon(newImg);
		Logo.setIcon(image);
		
		JLabel Title2 = new JLabel();
		Title2.setBounds(0, 0, 1264, 226);
		path = "C:\\\\Java\\\\ProjectAdvOOAGroup1\\\\images\\\\3143170.jpg";
		frame.getContentPane().add(Title2);
		MyImage = new ImageIcon(path);
		img = MyImage.getImage();
		newImg = img.getScaledInstance(Title2.getWidth(), Title2.getHeight(), Image.SCALE_SMOOTH);
		image = new ImageIcon(newImg);
		Title2.setIcon(image);
		
		JLabel bg4 = new JLabel();
		bg4.setBounds(1052, 301, 198, 426);
		frame.getContentPane().add(bg4);
		path = "C:\\\\Java\\\\ProjectAdvOOAGroup1\\\\images\\\\bg4.png";
		MyImage = new ImageIcon(path);
		img = MyImage.getImage();
		newImg = img.getScaledInstance(bg4.getWidth(), bg4.getHeight(), Image.SCALE_SMOOTH);
		image = new ImageIcon(newImg);
		bg4.setIcon(image);
		
		JLabel bg3 = new JLabel();
		bg3.setBounds(12, 301, 1028, 169);
		frame.getContentPane().add(bg3);
		path = "C:\\\\Java\\\\ProjectAdvOOAGroup1\\\\images\\\\bg3.png";
		MyImage = new ImageIcon(path);
		img = MyImage.getImage();
		newImg = img.getScaledInstance(bg3.getWidth(), bg3.getHeight(), Image.SCALE_SMOOTH);
		image = new ImageIcon(newImg);
		bg3.setIcon(image);
		
		JLabel bg5 = new JLabel("");
		bg5.setBounds(12, 483, 1028, 169);
		frame.getContentPane().add(bg5);
		path = "C:\\\\Java\\\\ProjectAdvOOAGroup1\\\\images\\\\bg3.png";
		MyImage = new ImageIcon(path);
		img = MyImage.getImage();
		newImg = img.getScaledInstance(bg5.getWidth(), bg5.getHeight(), Image.SCALE_SMOOTH);
		image = new ImageIcon(newImg);
		bg5.setIcon(image);
		
		
	}
}