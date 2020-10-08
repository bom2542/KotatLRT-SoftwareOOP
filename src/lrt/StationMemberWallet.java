package lrt;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class StationMemberWallet {

	private JFrame frame;
	private JTextField txtPhone;
	private JTextField txtAddWallet;
	private JTextField txtPin;

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
		frame.setBounds(100, 100, 1280, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("KORAT LIGHT-RAIL TRANSPORT  TICKET");
		label.setFont(new Font("Tahoma", Font.BOLD, 40));
		label.setBounds(262, 62, 859, 80);
		frame.getContentPane().add(label);
		
		JLabel lblAddWaletmember = new JLabel("ADD WALET MEMBER");
		lblAddWaletmember.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblAddWaletmember.setBounds(524, 155, 310, 44);
		frame.getContentPane().add(lblAddWaletmember);
		
		JLabel lblPhonNo = new JLabel("PHONE NO:");
		lblPhonNo.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblPhonNo.setBounds(170, 283, 172, 44);
		frame.getContentPane().add(lblPhonNo);
		
		JLabel lblName = new JLabel("NAME:");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblName.setBounds(235, 388, 99, 44);
		frame.getContentPane().add(lblName);
		
		JLabel lblOldWalet = new JLabel("OLD WALET:");
		lblOldWalet.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblOldWalet.setBounds(148, 494, 181, 44);
		frame.getContentPane().add(lblOldWalet);
		
		JLabel lblPinDigit = new JLabel("PIN 6 digit:");
		lblPinDigit.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblPinDigit.setBounds(698, 283, 172, 44);
		frame.getContentPane().add(lblPinDigit);
		
		JLabel lblAddWalet = new JLabel("ADD WALLET:");
		lblAddWalet.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblAddWalet.setBounds(660, 494, 198, 44);
		frame.getContentPane().add(lblAddWalet);
		
		JLabel lblNewWallet = new JLabel("NEW WALLET:");
		lblNewWallet.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewWallet.setBounds(660, 573, 198, 44);
		frame.getContentPane().add(lblNewWallet);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnAdd.setBounds(388, 653, 131, 65);
		frame.getContentPane().add(btnAdd);
		
		JButton btCancle = new JButton("CANCLE");
		btCancle.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btCancle.setBounds(761, 653, 172, 65);
		frame.getContentPane().add(btCancle);
		
		JButton btnExit = new JButton("EXIT  ");
		btnExit.setHorizontalAlignment(SwingConstants.RIGHT);
		btnExit.setForeground(Color.BLACK);
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnExit.setBackground(SystemColor.activeCaption);
		btnExit.setBounds(1078, 653, 131, 65);
		frame.getContentPane().add(btnExit);
		
		JLabel lbName = new JLabel("??");
		lbName.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lbName.setBounds(354, 388, 290, 44);
		frame.getContentPane().add(lbName);
		
		JLabel lbOwalet = new JLabel("??");
		lbOwalet.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lbOwalet.setBounds(354, 494, 141, 44);
		frame.getContentPane().add(lbOwalet);
		
		JLabel lbNewWallet = new JLabel("??");
		lbNewWallet.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lbNewWallet.setBounds(870, 573, 131, 44);
		frame.getContentPane().add(lbNewWallet);
		
		txtPhone = new JTextField();
		txtPhone.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtPhone.setColumns(10);
		txtPhone.setBounds(352, 287, 238, 40);
		frame.getContentPane().add(txtPhone);
		
		txtAddWallet = new JTextField();
		txtAddWallet.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtAddWallet.setColumns(10);
		txtAddWallet.setBounds(870, 496, 141, 40);
		frame.getContentPane().add(txtAddWallet);
		
		txtPin = new JTextField();
		txtPin.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtPin.setColumns(10);
		txtPin.setBounds(859, 287, 141, 40);
		frame.getContentPane().add(txtPin);
		
		JLabel lblBath = new JLabel("BAHT");
		lblBath.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblBath.setBounds(503, 494, 99, 44);
		frame.getContentPane().add(lblBath);
		
		JLabel lblBaht = new JLabel("BAHT");
		lblBaht.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblBaht.setBounds(1021, 494, 99, 44);
		frame.getContentPane().add(lblBaht);
		
		JLabel lblBaht_1 = new JLabel("BAHT");
		lblBaht_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblBaht_1.setBounds(1022, 569, 99, 44);
		frame.getContentPane().add(lblBaht_1);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnSearch.setBounds(1035, 283, 164, 44);
		frame.getContentPane().add(btnSearch);
		
		JButton btnUpdete = new JButton("UPDATE");
		btnUpdete.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnUpdete.setBounds(558, 653, 172, 65);
		frame.getContentPane().add(btnUpdete);
	}
}
