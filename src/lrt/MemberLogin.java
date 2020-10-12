package lrt;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

import java.awt.Image;
import java.awt.SystemColor;
import java.awt.Color;

import javax.swing.UIManager;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.SwingConstants;

public class MemberLogin {

	private JFrame frmMemberloginLrtkorat;
	private JTextField txtUsername;
	private JPasswordField txtPin;
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
					MemberLogin window = new MemberLogin();
					window.frmMemberloginLrtkorat.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MemberLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMemberloginLrtkorat = new JFrame();
		frmMemberloginLrtkorat.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Java\\ProjectAdvOOAGroup1\\images\\LRTLOGO2.png"));
		frmMemberloginLrtkorat.setTitle("MemberLogin - LRTKORAT");
		frmMemberloginLrtkorat.setBounds(100, 100, 566, 466);
		frmMemberloginLrtkorat.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMemberloginLrtkorat.getContentPane().setLayout(null);
		
		
		JLabel lblMemberLogin = new JLabel("MEMBER LOGIN FOR PAY");
		lblMemberLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblMemberLogin.setForeground(UIManager.getColor("Button.disabledShadow"));
		lblMemberLogin.setBackground(UIManager.getColor("Button.disabledShadow"));
		lblMemberLogin.setFont(new Font("SUT", Font.BOLD, 35));
		lblMemberLogin.setBounds(179, 23, 322, 62);
		frmMemberloginLrtkorat.getContentPane().add(lblMemberLogin);
		
		txtUsername = new JTextField();
		txtUsername.setFont(new Font("SUT", Font.BOLD, 40));
		txtUsername.setColumns(10);
		txtUsername.setBounds(237, 149, 237, 43);
		frmMemberloginLrtkorat.getContentPane().add(txtUsername);
		
		txtPin = new JPasswordField();
		txtPin.setFont(new Font("SUT", Font.BOLD, 40));
		txtPin.setBounds(237, 208, 131, 42);
		frmMemberloginLrtkorat.getContentPane().add(txtPin);
		
		JLabel lblPin = new JLabel("PIN");
		lblPin.setFont(new Font("CordiaUPC", Font.BOLD, 40));
		lblPin.setBounds(171, 204, 54, 50);
		frmMemberloginLrtkorat.getContentPane().add(lblPin);
		
		JLabel lblPhone = new JLabel("Phone NO");
		lblPhone.setFont(new Font("CordiaUPC", Font.BOLD, 40));
		lblPhone.setBounds(94, 145, 131, 50);
		frmMemberloginLrtkorat.getContentPane().add(lblPhone);
		
		JButton btLogin = new JButton("Pay");
		btLogin.setBackground(Color.LIGHT_GRAY);
		btLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				JOptionPane.showMessageDialog(null,"Suscess","Wallet",JOptionPane.PLAIN_MESSAGE);
			}
		});
		btLogin.setFont(new Font("CordiaUPC", Font.BOLD, 40));
		btLogin.setBounds(154, 347, 141, 44);
		frmMemberloginLrtkorat.getContentPane().add(btLogin);
		
		JButton btExit = new JButton("Cancle");
		btExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				@SuppressWarnings("unused")
				DashboardMachine dbm = new DashboardMachine();
				DashboardMachine.main(null);
				frmMemberloginLrtkorat.dispose();
			}
		});
		btExit.setForeground(Color.BLACK);
		btExit.setFont(new Font("CordiaUPC", Font.BOLD, 40));
		btExit.setBackground(SystemColor.activeCaption);
		btExit.setBounds(383, 347, 131, 44);
		frmMemberloginLrtkorat.getContentPane().add(btExit);
		
		JLabel logo;
		logo = new JLabel();
		logo.setBounds(97, 11, 72, 93);
		frmMemberloginLrtkorat.getContentPane().add(logo);
		path = "C:\\\\Java\\\\ProjectAdvOOAGroup1\\\\images\\\\LRTLOGO1.png";
		MyImage = new ImageIcon(path);
		img = MyImage.getImage();
		newImg = img.getScaledInstance(logo.getWidth(), logo.getHeight(), Image.SCALE_SMOOTH);
		image = new ImageIcon(newImg);
		logo.setIcon(image);
		
		JLabel lblWallet = new JLabel("Wallet:");
		lblWallet.setFont(new Font("CordiaUPC", Font.BOLD, 40));
		lblWallet.setBounds(328, 338, 86, 50);
		frmMemberloginLrtkorat.getContentPane().add(lblWallet);
		
		JLabel inputWallet = new JLabel("??");
		inputWallet.setFont(new Font("CordiaUPC", Font.BOLD, 40));
		inputWallet.setBounds(422, 338, 106, 50);
		frmMemberloginLrtkorat.getContentPane().add(inputWallet);
		
		JLabel inputName = new JLabel("??");
		inputName.setFont(new Font("CordiaUPC", Font.BOLD, 40));
		inputName.setBounds(123, 341, 164, 50);
		frmMemberloginLrtkorat.getContentPane().add(inputName);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setFont(new Font("CordiaUPC", Font.BOLD, 40));
		lblName.setBounds(41, 338, 86, 50);
		frmMemberloginLrtkorat.getContentPane().add(lblName);
		
		JLabel label = new JLabel();
		label.setBackground(SystemColor.activeCaptionBorder);
		label.setBounds(0, 115, 548, 167);
		frmMemberloginLrtkorat.getContentPane().add(label);
		path = "C:\\\\Java\\\\ProjectAdvOOAGroup1\\\\images\\\\3143170.jpg";
		MyImage = new ImageIcon(path);
		img = MyImage.getImage();
		newImg = img.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
		image = new ImageIcon(newImg);
		label.setIcon(image);
		
		//Background
		JLabel img_bg = new JLabel();
		img_bg.setBounds(0, 0, 548, 419);
		frmMemberloginLrtkorat.getContentPane().add(img_bg);
		path = "C:\\\\Java\\\\ProjectAdvOOAGroup1\\\\images\\\\1299.jpg";
		MyImage = new ImageIcon(path);
		img = MyImage.getImage();
		newImg = img.getScaledInstance(img_bg.getWidth(), img_bg.getHeight(), Image.SCALE_SMOOTH);
		image = new ImageIcon(newImg);
		img_bg.setIcon(image);
		
	}
}