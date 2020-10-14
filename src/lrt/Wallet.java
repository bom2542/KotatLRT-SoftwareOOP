package lrt;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Wallet extends DashboardStationEmployee{

	private JFrame frmAddwalletLrtkorat;
	
	public String path;
	public ImageIcon MyImage;
	public Image img;
	public Image newImg;
	public ImageIcon image;

	
	String date,txt="";
	private JTextField textPhone;
	private JTextField textWallet;
	private JTextField textAddWallet;
	private String phone = "";
	private double wallet=0,sum=0,addwallet=0;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Wallet window = new Wallet();
					window.frmAddwalletLrtkorat.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Wallet() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		//Database
		
		
		WalletCheck Mwallet = new WalletCheck();
		
		frmAddwalletLrtkorat = new JFrame();
		frmAddwalletLrtkorat.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Java\\ProjectAdvOOAGroup1\\images\\LRTLOGO2.png"));
		frmAddwalletLrtkorat.setTitle("AddWallet - LRTKORAT");
		frmAddwalletLrtkorat.setBounds(100, 100, 566, 466);
		frmAddwalletLrtkorat.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAddwalletLrtkorat.getContentPane().setLayout(null);
		frmAddwalletLrtkorat.setLocationRelativeTo(null);
		
		JLabel lblNewLabel_1_2 = new JLabel("\u0E08\u0E33\u0E19\u0E27\u0E19\u0E40\u0E15\u0E34\u0E21 :");
		lblNewLabel_1_2.setFont(new Font("SUT", Font.BOLD, 40));
		lblNewLabel_1_2.setBounds(19, 279, 168, 41);
		frmAddwalletLrtkorat.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("\u0E40\u0E15\u0E34\u0E21\u0E40\u0E07\u0E34\u0E19\u0E25\u0E39\u0E01\u0E04\u0E49\u0E32");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setFont(new Font("SUT", Font.BOLD, 40));
		lblNewLabel_2_1.setBounds(184, 42, 306, 62);
		frmAddwalletLrtkorat.getContentPane().add(lblNewLabel_2_1);
		
		textPhone = new JTextField();
		textPhone.setFont(new Font("SUT", Font.PLAIN, 30));
		textPhone.setBounds(197, 159, 257, 51);
		frmAddwalletLrtkorat.getContentPane().add(textPhone);
		textPhone.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("\u0E40\u0E1A\u0E2D\u0E23\u0E4C\u0E42\u0E17\u0E23 :");
		lblNewLabel.setBounds(50, 168, 128, 42);
		lblNewLabel.setFont(new Font("SUT", Font.BOLD, 40));
		frmAddwalletLrtkorat.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u0E22\u0E2D\u0E14\u0E40\u0E01\u0E48\u0E32  :");
		lblNewLabel_1.setBounds(50, 223, 128, 41);
		lblNewLabel_1.setFont(new Font("SUT", Font.BOLD, 40));
		frmAddwalletLrtkorat.getContentPane().add(lblNewLabel_1);
		
		textWallet = new JTextField();
		textWallet.setFont(new Font("SUT", Font.PLAIN, 30));
		textWallet.setBounds(197, 222, 173, 42);
		frmAddwalletLrtkorat.getContentPane().add(textWallet);
		textWallet.setColumns(10);
		textWallet.setEnabled(false);
		
		textAddWallet = new JTextField();
		textAddWallet.setFont(new Font("SUT", Font.PLAIN, 30));
		textAddWallet.setColumns(10);
		textAddWallet.setBounds(197, 282, 173, 51);
		frmAddwalletLrtkorat.getContentPane().add(textAddWallet);
		
		JButton S = new JButton();
		S.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				phone = textPhone.getText();
				Mwallet.setMemberPhone(phone);
				Mwallet.SelectCheck();
				
				wallet = Mwallet.getMemberWallet();
				textWallet.setText(Double.toString(wallet));
				
			}
		});
		S.setIcon(new ImageIcon("C:\\Java\\ProjectAdvOOAGroup1\\images\\search.png"));
		S.setBounds(464, 159, 72, 51);
		frmAddwalletLrtkorat.getContentPane().add(S);
		
		JButton btnNewButton = new JButton("\u0E40\u0E15\u0E34\u0E21\u0E40\u0E07\u0E34\u0E19");
		btnNewButton.setFont(new Font("SUT", Font.BOLD, 30));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				addwallet = Double.parseDouble(textAddWallet.getText());
				
				sum = wallet + addwallet;
				Mwallet.updateWallet(sum);

				JFrame f = new JFrame(); 
				JOptionPane.showMessageDialog(f,"Successfully of Add money member"); 
			}
		});
		btnNewButton.setBounds(201, 360, 152, 53);
		frmAddwalletLrtkorat.getContentPane().add(btnNewButton);
		
		JButton btnCancle = new JButton("\u0E22\u0E01\u0E40\u0E25\u0E34\u0E01");
		btnCancle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmAddwalletLrtkorat.setVisible(false);
				DashboardStationEmployee.main(null);
			}
		});
		btnCancle.setFont(new Font("SUT", Font.PLAIN, 30));
		btnCancle.setBounds(416, 366, 120, 41);
		frmAddwalletLrtkorat.getContentPane().add(btnCancle);
		
		//BG
		
		JLabel logo;
		logo = new JLabel();
		logo.setBounds(96, 28, 72, 93);
		frmAddwalletLrtkorat.getContentPane().add(logo);
		path = "C:\\\\Java\\\\ProjectAdvOOAGroup1\\\\images\\\\LRTLOGO1.png";
		MyImage = new ImageIcon(path);
		img = MyImage.getImage();
		newImg = img.getScaledInstance(logo.getWidth(), logo.getHeight(), Image.SCALE_SMOOTH);
		image = new ImageIcon(newImg);
		logo.setIcon(image);
		
		JLabel label = new JLabel();
		label.setBackground(SystemColor.activeCaptionBorder);
		label.setBounds(0, 132, 548, 223);
		frmAddwalletLrtkorat.getContentPane().add(label);
		path = "C:\\\\Java\\\\ProjectAdvOOAGroup1\\\\images\\\\3143170.jpg";
		MyImage = new ImageIcon(path);
		img = MyImage.getImage();
		newImg = img.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
		image = new ImageIcon(newImg);
		label.setIcon(image);
		
		//Background
		JLabel img_bg = new JLabel();
		img_bg.setBounds(0, 0, 548, 419);
		frmAddwalletLrtkorat.getContentPane().add(img_bg);
		path = "C:\\\\Java\\\\ProjectAdvOOAGroup1\\\\images\\\\1299.jpg";
		MyImage = new ImageIcon(path);
		img = MyImage.getImage();
		newImg = img.getScaledInstance(img_bg.getWidth(), img_bg.getHeight(), Image.SCALE_SMOOTH);
		image = new ImageIcon(newImg);
		img_bg.setIcon(image);
		
		JLabel lblNewLabel_1_1 = new JLabel("\u0E22\u0E2D\u0E14\u0E40\u0E07\u0E34\u0E19\u0E40\u0E01\u0E48\u0E32  :");
		lblNewLabel_1_1.setFont(new Font("SUT", Font.BOLD, 40));
		lblNewLabel_1_1.setBounds(344, 220, 164, 41);
		frmAddwalletLrtkorat.getContentPane().add(lblNewLabel_1_1);
		
	}
}
