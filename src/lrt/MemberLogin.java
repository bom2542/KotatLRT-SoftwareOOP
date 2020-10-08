package lrt;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.SwingConstants;

public class MemberLogin {

	private JFrame frame;
	private JTextField txtUsername;
	private JPasswordField txtPin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MemberLogin window = new MemberLogin();
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
	public MemberLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 566, 466);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblMemberLogin = new JLabel("MEMBER LOGIN");
		lblMemberLogin.setFont(new Font("CordiaUPC", Font.BOLD, 60));
		lblMemberLogin.setBounds(174, 27, 322, 71);
		frame.getContentPane().add(lblMemberLogin);
		
		txtUsername = new JTextField();
		txtUsername.setFont(new Font("CordiaUPC", Font.BOLD, 40));
		txtUsername.setColumns(10);
		txtUsername.setBounds(241, 138, 237, 43);
		frame.getContentPane().add(txtUsername);
		
		txtPin = new JPasswordField();
		txtPin.setFont(new Font("CordiaUPC", Font.BOLD, 40));
		txtPin.setBounds(241, 197, 131, 42);
		frame.getContentPane().add(txtPin);
		
		JLabel lblPin = new JLabel("PIN");
		lblPin.setFont(new Font("CordiaUPC", Font.BOLD, 40));
		lblPin.setBounds(142, 193, 54, 50);
		frame.getContentPane().add(lblPin);
		
		JLabel label_2 = new JLabel("USERNAME");
		label_2.setFont(new Font("CordiaUPC", Font.BOLD, 40));
		label_2.setBounds(40, 134, 156, 50);
		frame.getContentPane().add(label_2);
		
		JButton btLogin = new JButton("LOGIN");
		btLogin.setFont(new Font("CordiaUPC", Font.BOLD, 40));
		btLogin.setBounds(193, 320, 174, 59);
		frame.getContentPane().add(btLogin);
		
		JButton btExit = new JButton("EXIT  ");
		btExit.setHorizontalAlignment(SwingConstants.RIGHT);
		btExit.setForeground(Color.BLACK);
		btExit.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btExit.setBackground(SystemColor.activeCaption);
		btExit.setBounds(384, 320, 131, 59);
		frame.getContentPane().add(btExit);
	}

}
