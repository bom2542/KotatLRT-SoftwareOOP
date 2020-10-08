package lrt;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.SwingConstants;

public class MemberWallet {

	private JFrame frame;
	private JTextField txtPhone;

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
		frame.setBounds(100, 100, 566, 466);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblMemberWallet = new JLabel("Member Wallet");
		lblMemberWallet.setFont(new Font("CordiaUPC", Font.BOLD, 60));
		lblMemberWallet.setBounds(162, 35, 314, 71);
		frame.getContentPane().add(lblMemberWallet);
		
		txtPhone = new JTextField();
		txtPhone.setFont(new Font("CordiaUPC", Font.BOLD, 40));
		txtPhone.setColumns(10);
		txtPhone.setBounds(239, 127, 237, 43);
		frame.getContentPane().add(txtPhone);
		
		JButton btnCheck = new JButton("Check");
		btnCheck.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnCheck.setBounds(350, 193, 164, 44);
		frame.getContentPane().add(btnCheck);
		
		JLabel label = new JLabel("PHONE NO:");
		label.setFont(new Font("Tahoma", Font.PLAIN, 30));
		label.setBounds(49, 126, 172, 44);
		frame.getContentPane().add(label);
		
		JLabel lblWallet = new JLabel("WALLET:");
		lblWallet.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblWallet.setBounds(71, 261, 131, 44);
		frame.getContentPane().add(lblWallet);
		
		JLabel lbWallet = new JLabel("??");
		lbWallet.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lbWallet.setBounds(214, 261, 131, 44);
		frame.getContentPane().add(lbWallet);
		
		JLabel label_3 = new JLabel("BAHT");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 30));
		label_3.setBounds(365, 261, 99, 44);
		frame.getContentPane().add(label_3);
		
		JButton button = new JButton("EXIT  ");
		button.setHorizontalAlignment(SwingConstants.RIGHT);
		button.setForeground(Color.BLACK);
		button.setFont(new Font("Tahoma", Font.PLAIN, 30));
		button.setBackground(SystemColor.activeCaption);
		button.setBounds(383, 347, 131, 59);
		frame.getContentPane().add(button);
	}

}
