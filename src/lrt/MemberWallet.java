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
import javax.swing.SwingConstants;

public class MemberWallet {

	private JFrame frmCheckwalletLrtkorat;
	private JTextField txtPhone;
	private String path;
	private ImageIcon MyImage;
	private Image img;
	private Image newImg;
	private ImageIcon image;
	private JLabel lbWallet;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MemberWallet window = new MemberWallet();
					window.frmCheckwalletLrtkorat.setVisible(true);
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
		WalletCheck wc = new WalletCheck();
		
		
		frmCheckwalletLrtkorat = new JFrame();
		frmCheckwalletLrtkorat.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Java\\ProjectAdvOOAGroup1\\images\\LRTLOGO2.png"));
		frmCheckwalletLrtkorat.setTitle("CheckWallet - LRTKORAT");
		frmCheckwalletLrtkorat.setBounds(100, 100, 566, 466);
		frmCheckwalletLrtkorat.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCheckwalletLrtkorat.getContentPane().setLayout(null);
		frmCheckwalletLrtkorat.setLocationRelativeTo(null);
		
		JLabel lblMemberWallet = new JLabel("Member Wallet");
		lblMemberWallet.setForeground(Color.WHITE);
		lblMemberWallet.setFont(new Font("SUT", Font.BOLD, 60));
		lblMemberWallet.setBounds(179, 30, 314, 71);
		frmCheckwalletLrtkorat.getContentPane().add(lblMemberWallet);
		
		txtPhone = new JTextField();
		txtPhone.setFont(new Font("SUT", Font.PLAIN, 40));
		txtPhone.setColumns(10);
		txtPhone.setBounds(154, 195, 237, 43);
		frmCheckwalletLrtkorat.getContentPane().add(txtPhone);
		
		JButton btnCheck = new JButton("Check");
		btnCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				wc.setMemberPhone(txtPhone.getText());
				wc.SelectCheck();
				
				lbWallet.setText(Double.toString(wc.getMemberWallet()));
			}
		});
		btnCheck.setFont(new Font("SUT", Font.BOLD, 30));
		btnCheck.setBounds(414, 190, 99, 58);
		frmCheckwalletLrtkorat.getContentPane().add(btnCheck);
		
		JLabel lblPhoneNo = new JLabel("\u0E40\u0E1A\u0E2D\u0E23\u0E4C\u0E42\u0E17\u0E23 :");
		lblPhoneNo.setFont(new Font("SUT", Font.BOLD, 40));
		lblPhoneNo.setBounds(17, 194, 153, 44);
		frmCheckwalletLrtkorat.getContentPane().add(lblPhoneNo);
		
		JLabel lblWallet = new JLabel("Wallet :");
		lblWallet.setFont(new Font("SUT", Font.BOLD, 40));
		lblWallet.setBounds(36, 271, 114, 44);
		frmCheckwalletLrtkorat.getContentPane().add(lblWallet);
		
		lbWallet = new JLabel();
		lbWallet.setHorizontalAlignment(SwingConstants.CENTER);
		lbWallet.setFont(new Font("SUT", Font.BOLD, 50));
		lbWallet.setBounds(160, 271, 131, 44);
		frmCheckwalletLrtkorat.getContentPane().add(lbWallet);
		
		JLabel lblBaht = new JLabel("Baht");
		lblBaht.setFont(new Font("SUT", Font.BOLD, 30));
		lblBaht.setBounds(314, 274, 99, 44);
		frmCheckwalletLrtkorat.getContentPane().add(lblBaht);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*@SuppressWarnings("unused")
				DashboardMachine msl = new DashboardMachine();
				DashboardMachine.main(null);*/
				frmCheckwalletLrtkorat.dispose();
			}
		});
		btnBack.setForeground(Color.BLACK);
		btnBack.setFont(new Font("SUT", Font.BOLD, 30));
		btnBack.setBackground(SystemColor.activeCaption);
		btnBack.setBounds(12, 363, 131, 43);
		frmCheckwalletLrtkorat.getContentPane().add(btnBack);
		
		//Logo
		JLabel logo;
		logo = new JLabel();
		logo.setBounds(77, 11, 93, 117);
		frmCheckwalletLrtkorat.getContentPane().add(logo);
		path = "C:\\\\Java\\\\ProjectAdvOOAGroup1\\\\images\\\\LRTLOGO1.png";
		MyImage = new ImageIcon(path);
		img = MyImage.getImage();
		newImg = img.getScaledInstance(logo.getWidth(), logo.getHeight(), Image.SCALE_SMOOTH);
		image = new ImageIcon(newImg);
		logo.setIcon(image);
		
		//Bg-Containt
		JLabel bd_c = new JLabel();
		bd_c.setBackground(SystemColor.activeCaptionBorder);
		bd_c.setBounds(0, 133, 560, 219);
		frmCheckwalletLrtkorat.getContentPane().add(bd_c);
		path = "C:\\\\Java\\\\ProjectAdvOOAGroup1\\\\images\\\\3143170.jpg";
		MyImage = new ImageIcon(path);
		img = MyImage.getImage();
		newImg = img.getScaledInstance(bd_c.getWidth(), bd_c.getHeight(), Image.SCALE_SMOOTH);
		image = new ImageIcon(newImg);
		bd_c.setIcon(image);
		
		//Background
		JLabel img_bg = new JLabel();
		img_bg.setBounds(0, 0, 560, 443);
		frmCheckwalletLrtkorat.getContentPane().add(img_bg);
		path = "C:\\\\Java\\\\ProjectAdvOOAGroup1\\\\images\\\\1299.jpg";
		MyImage = new ImageIcon(path);
		img = MyImage.getImage();
		newImg = img.getScaledInstance(img_bg.getWidth(), img_bg.getHeight(), Image.SCALE_SMOOTH);
		image = new ImageIcon(newImg);
		img_bg.setIcon(image);
	}
	
	

}