package lrt;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import java.awt.Toolkit;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class Ticket extends DestinationSession{

	private JFrame frmTicketLrtkorat;
	private String path;
	private ImageIcon MyImage;
	private Image img;
	private Image newImg;
	private ImageIcon image;
	Connection con = null;
	Statement st;
	ResultSet rsRead;
	
	@SuppressWarnings("unused")
	private String desc, orig;
	
	
	@SuppressWarnings("unused")
	private String tkId,tkdate,tkMem,tkSo,tkSd;
	private double tkP;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ticket window = new Ticket();
					window.frmTicketLrtkorat.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ticket() {
		initialize();
	}
	
	protected void getOrig(String orig) {
		this.orig = orig;
	}
	
	protected void getDesc(String desc) {
		this.desc = desc;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/lrtkorat", "pharadornl_lrtkorat", "HSt1N9rb4Vpyl");
			st = (Statement) con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			
			rsRead = st.executeQuery("SELECT * FROM ticket");
			
			while(rsRead.next()) {
				if(rsRead != null) {
			
				tkId = rsRead.getString("Ticket_ID");	
				tkdate = rsRead.getString("Ticket_Date");
				tkMem = rsRead.getString("Member_Tel");
				tkSo = rsRead.getString("Station_Origin_ID");
				tkSd = rsRead.getString("Station_Destination_ID");
				tkP = rsRead.getDouble("Ticket_Price");
				
				}
			}
			con.close();
			st.close();
		}catch(SQLException e){
			 System.out.println(e);
		}catch(Exception ex) {
			 System.out.println(ex);
		}
		
		
		frmTicketLrtkorat = new JFrame();
		frmTicketLrtkorat.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Java\\ProjectAdvOOAGroup1\\images\\LRTLOGO2.png"));
		frmTicketLrtkorat.setBounds(100, 100, 740, 550);
		frmTicketLrtkorat.setTitle("Ticket - LRTKORAT");
		frmTicketLrtkorat.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTicketLrtkorat.getContentPane().setLayout(null);
		frmTicketLrtkorat.setLocationRelativeTo(null);
		
		
		JButton btnNewButton = new JButton("\u0E40\u0E2A\u0E23\u0E47\u0E08\u0E2A\u0E34\u0E49\u0E19");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmTicketLrtkorat.setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("SUT", Font.BOLD, 30));
		btnNewButton.setBounds(579, 462, 122, 42);
		frmTicketLrtkorat.getContentPane().add(btnNewButton);
		
		//desige
		
		JLabel label = new JLabel("\u0E23\u0E16\u0E44\u0E1F\u0E1F\u0E49\u0E32\u0E23\u0E32\u0E07\u0E40\u0E1A\u0E32\u0E42\u0E04\u0E23\u0E32\u0E0A");
		label.setHorizontalAlignment(SwingConstants.LEFT);
		label.setForeground(Color.WHITE);
		label.setFont(new Font("SUT", Font.BOLD, 20));
		label.setBounds(180, 64, 315, 44);
		frmTicketLrtkorat.getContentPane().add(label);
		
		
		JLabel label_1 = new JLabel("KORAT LIGHT-RAIL TRANSPORT (LRTKORAT)");
		label_1.setHorizontalAlignment(SwingConstants.LEFT);
		label_1.setForeground(new Color(147, 112, 219));
		label_1.setFont(new Font("SUT", Font.BOLD, 30));
		label_1.setBounds(180, 11, 838, 80);
		frmTicketLrtkorat.getContentPane().add(label_1);
		
		
		JLabel lblPhoneMember = new JLabel("Ticket ID :");
		lblPhoneMember.setFont(new Font("SUT", Font.BOLD, 30));
		lblPhoneMember.setBounds(334, 151, 122, 42);
		frmTicketLrtkorat.getContentPane().add(lblPhoneMember);
		
		JLabel lblDestinationStation = new JLabel("Destination Station : ");
		lblDestinationStation.setFont(new Font("SUT", Font.BOLD, 40));
		lblDestinationStation.setBounds(42, 302, 315, 42);
		frmTicketLrtkorat.getContentPane().add(lblDestinationStation);
		
		JLabel OutName = new JLabel("");
		OutName.setFont(new Font("SUT", Font.PLAIN, 40));
		OutName.setBounds(349, 302, 365, 42);
		frmTicketLrtkorat.getContentPane().add(OutName);
		
		JLabel Pmember = new JLabel("");
		Pmember.setFont(new Font("SUT", Font.PLAIN, 30));
		Pmember.setBounds(466, 151, 68, 42);
		frmTicketLrtkorat.getContentPane().add(Pmember);
		
		JLabel lblOriginStation = new JLabel("Origin Station : ");
		lblOriginStation.setFont(new Font("SUT", Font.BOLD, 40));
		lblOriginStation.setBounds(116, 239, 224, 52);
		frmTicketLrtkorat.getContentPane().add(lblOriginStation);
		
		JLabel outputOs = new JLabel("");
		outputOs.setFont(new Font("SUT", Font.PLAIN, 40));
		outputOs.setBounds(339, 239, 323, 52);
		frmTicketLrtkorat.getContentPane().add(outputOs);
		
		JLabel outTD = new JLabel("");
		outTD.setFont(new Font("SUT", Font.PLAIN, 30));
		outTD.setBounds(550, 151, 164, 42);
		frmTicketLrtkorat.getContentPane().add(outTD);
		
		JLabel outTP = new JLabel("");
		outTP.setFont(new Font("SUT", Font.PLAIN, 80));
		outTP.setBounds(352, 362, 300, 69);
		frmTicketLrtkorat.getContentPane().add(outTP);
		
		JLabel lblTic258tPrice = new JLabel("Price : ");
		lblTic258tPrice.setFont(new Font("SUT", Font.BOLD, 80));
		lblTic258tPrice.setBounds(159, 362, 201, 69);
		frmTicketLrtkorat.getContentPane().add(lblTic258tPrice);
		
		@SuppressWarnings("unused")
		JLabel oputP = new JLabel("Price : ");
		lblTic258tPrice.setFont(new Font("SUT", Font.BOLD, 80));
		lblTic258tPrice.setBounds(159, 362, 201, 69);
		frmTicketLrtkorat.getContentPane().add(lblTic258tPrice);
		
		JLabel lblPhoneMember_1 = new JLabel("/");
		lblPhoneMember_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblPhoneMember_1.setFont(new Font("SUT", Font.BOLD, 30));
		lblPhoneMember_1.setBounds(520, 151, 37, 42);
		frmTicketLrtkorat.getContentPane().add(lblPhoneMember_1);
		
		JLabel Logo = new JLabel();
		Logo.setBounds(78, 11, 90, 119);
		path = "C:\\\\Java\\\\ProjectAdvOOAGroup1\\\\images\\\\LRTLOGO1.png";
		frmTicketLrtkorat.getContentPane().add(Logo);
		MyImage = new ImageIcon(path);
		img = MyImage.getImage();
		newImg = img.getScaledInstance(Logo.getWidth(), Logo.getHeight(), Image.SCALE_SMOOTH);
		image = new ImageIcon(newImg);
		Logo.setIcon(image);
		
		JLabel Title2 = new JLabel();
		Title2.setBounds(0, 0, 1264, 140);
		path = "C:\\\\Java\\\\ProjectAdvOOAGroup1\\\\images\\\\3143170.jpg";
		frmTicketLrtkorat.getContentPane().add(Title2);
		MyImage = new ImageIcon(path);
		img = MyImage.getImage();
		newImg = img.getScaledInstance(Title2.getWidth(), Title2.getHeight(), Image.SCALE_SMOOTH);
		image = new ImageIcon(newImg);
		Title2.setIcon(image);
		
		
		
		JLabel bg4 = new JLabel("");
		bg4.setBounds(-38, 204, 1264, 549);
		frmTicketLrtkorat.getContentPane().add(bg4);
		path = "C:\\\\Java\\\\ProjectAdvOOAGroup1\\\\images\\\\bg3.png";
		frmTicketLrtkorat.getContentPane().add(bg4);
		MyImage = new ImageIcon(path);
		img = MyImage.getImage();
		newImg = img.getScaledInstance(bg4.getWidth(), bg4.getHeight(), Image.SCALE_SMOOTH);
		image = new ImageIcon(newImg);
		bg4.setIcon(image);
		path = "C:\\\\Java\\\\ProjectAdvOOAGroup1\\\\images\\\\bg3.png";
		MyImage = new ImageIcon(path);
		img = MyImage.getImage();
		image = new ImageIcon(newImg);
		
		Pmember.setText(tkId);
		outputOs.setText(tkSo);
		outTD.setText(tkdate);
		//dd
		OutName.setText(tkSd);
		outTP.setText(Double.toString(tkP));
		
		
	}
}
