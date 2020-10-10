package lrt;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.SwingConstants;

public class StationMemberRegister {

	private JFrame frame;
	private JTextField txtName;
	private JTextField txtTell;
	private JPasswordField txtPin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StationMemberRegister window = new StationMemberRegister();
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
	public StationMemberRegister() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1280, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("KORAT LIGHT-RAIL TRANSPORT  TICKET");
		label.setFont(new Font("Tahoma", Font.BOLD, 40));
		label.setBounds(244, 63, 859, 80);
		frame.getContentPane().add(label);
		
		JLabel lblMemberRegister = new JLabel("MEMBER REGISTER");
		lblMemberRegister.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblMemberRegister.setBounds(501, 154, 286, 44);
		frame.getContentPane().add(lblMemberRegister);
		
		JLabel lblName = new JLabel("NAME:");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblName.setBounds(320, 260, 108, 44);
		frame.getContentPane().add(lblName);
		
		JLabel lblSex = new JLabel("SEX:");
		lblSex.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblSex.setBounds(348, 317, 67, 44);
		frame.getContentPane().add(lblSex);
		
		JLabel lblBrihtday = new JLabel("BIRTHDAY:");
		lblBrihtday.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblBrihtday.setBounds(259, 374, 159, 44);
		frame.getContentPane().add(lblBrihtday);
		
		JLabel lblTellNo = new JLabel("TELL NO:");
		lblTellNo.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblTellNo.setBounds(285, 430, 135, 44);
		frame.getContentPane().add(lblTellNo);
		
		JLabel lblPinDigit = new JLabel("PIN 6 digit:");
		lblPinDigit.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblPinDigit.setBounds(259, 487, 169, 44);
		frame.getContentPane().add(lblPinDigit);
		
		JRadioButton Gender1 = new JRadioButton("  MALE");
		Gender1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		Gender1.setBounds(469, 327, 127, 25);
		frame.getContentPane().add(Gender1);
		
		JRadioButton Gender2 = new JRadioButton("  FAMALE");
		Gender2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		Gender2.setBounds(621, 327, 166, 25);
		frame.getContentPane().add(Gender2);
		
		txtName = new JTextField();
		txtName.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtName.setBounds(452, 260, 335, 40);
		frame.getContentPane().add(txtName);
		txtName.setColumns(10);
		
		txtTell = new JTextField();
		txtTell.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtTell.setColumns(10);
		txtTell.setBounds(452, 430, 238, 40);
		frame.getContentPane().add(txtTell);
		
		txtPin = new JPasswordField();
		txtPin.setBounds(452, 496, 118, 40);
		frame.getContentPane().add(txtPin);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(452, 374, 220, 40);
		frame.getContentPane().add(dateChooser);
		
		JButton btnRegister = new JButton("REGISTER");
		btnRegister.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnRegister.setBounds(273, 634, 238, 65);
		frame.getContentPane().add(btnRegister);
		
		JButton btnCancle = new JButton("CANCLE");
		btnCancle.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnCancle.setBounds(598, 634, 225, 65);
		frame.getContentPane().add(btnCancle);
		
		JButton button = new JButton("EXIT  ");
		button.setHorizontalAlignment(SwingConstants.RIGHT);
		button.setForeground(Color.BLACK);
		button.setFont(new Font("Tahoma", Font.PLAIN, 30));
		button.setBackground(SystemColor.activeCaption);
		button.setBounds(1078, 634, 131, 65);
		frame.getContentPane().add(button);
		
		
	}
}
