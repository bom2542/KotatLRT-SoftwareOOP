package lrt;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.JButton;

public class Wallet {

	private JFrame frame;
	
	public String path;
	public ImageIcon MyImage;
	public Image img;
	public Image newImg;
	public ImageIcon image;

	Statement st;
	Connection con = null;
	ResultSet rsRead;
	String sql="",date,txt="";
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Wallet window = new Wallet();
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
	public Wallet() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/lrtkorat", "pharadornl_lrtkorat", "HSt1N9rb4Vpyl");
			st = (Statement) con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		}catch(SQLException e){
			 System.out.println(e);
		}catch(Exception ex) {
			 System.out.println(ex);
		}
		
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Java\\ProjectAdvOOAGroup1\\images\\LRTLOGO2.png"));
		frame.setTitle("Wallet - LRTKORAT");
		frame.setBounds(100, 100, 566, 466);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("\u0E01\u0E33\u0E25\u0E31\u0E07\u0E1B\u0E23\u0E31\u0E1A\u0E1B\u0E23\u0E38\u0E07");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("SUT", Font.BOLD, 40));
		lblNewLabel_2.setBounds(178, 24, 306, 65);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Wallet");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setFont(new Font("SUT", Font.BOLD, 40));
		lblNewLabel_2_1.setBounds(178, 73, 306, 65);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		textField = new JTextField();
		textField.setBounds(239, 169, 164, 41);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Phone Member");
		lblNewLabel.setBounds(24, 169, 205, 42);
		lblNewLabel.setFont(new Font("SUT", Font.BOLD, 40));
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Wallet");
		lblNewLabel_1.setBounds(140, 222, 98, 41);
		lblNewLabel_1.setFont(new Font("SUT", Font.BOLD, 40));
		frame.getContentPane().add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(239, 221, 164, 41);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(239, 274, 164, 41);
		frame.getContentPane().add(textField_2);
		
		JLabel logo;
		logo = new JLabel();
		logo.setBounds(96, 28, 72, 93);
		frame.getContentPane().add(logo);
		path = "C:\\\\Java\\\\ProjectAdvOOAGroup1\\\\images\\\\LRTLOGO1.png";
		MyImage = new ImageIcon(path);
		img = MyImage.getImage();
		newImg = img.getScaledInstance(logo.getWidth(), logo.getHeight(), Image.SCALE_SMOOTH);
		image = new ImageIcon(newImg);
		logo.setIcon(image);
		
		JLabel label = new JLabel();
		label.setBackground(SystemColor.activeCaptionBorder);
		label.setBounds(0, 132, 548, 221);
		frame.getContentPane().add(label);
		path = "C:\\\\Java\\\\ProjectAdvOOAGroup1\\\\images\\\\3143170.jpg";
		MyImage = new ImageIcon(path);
		img = MyImage.getImage();
		newImg = img.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
		image = new ImageIcon(newImg);
		label.setIcon(image);
		
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
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(258, 305, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		

		
		
	}
}
