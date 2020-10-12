package lrt;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Color;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class DashboardMachine {

	private JFrame frame;
	private String path;
	private ImageIcon MyImage;
	private Image img;
	private Image newImg;
	private ImageIcon image;
	private JLabel lbClock;
	
	
	ButtonGroup groupstation = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DashboardMachine window = new DashboardMachine();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	int day, month, year, second, minute, hour;
	String date=null,time=null;
	// Create the Clock Time
	public void clock(){
		Thread clock = new Thread()
		{
			public void run()
			{
				try{
					for(;;){
						Calendar timedate = new GregorianCalendar();
						
						day = timedate.get(Calendar.DAY_OF_MONTH);
						month = (timedate.get(Calendar.MONTH)+1);
						year = timedate.get(Calendar.YEAR);
						
						second = timedate.get(Calendar.SECOND);
						minute = timedate.get(Calendar.MINUTE);
						hour = timedate.get(Calendar.HOUR);
					
						lbClock.setText("Date " + day + "/" + month + "/" + year + " Time " + hour + ":" + minute + ":" + second);
						date = day + "/" + month + "/" + year;
						time = hour + ":" + minute + ":" + second;
						sleep(1000);
						
					}
				}catch(InterruptedException e){
					e.printStackTrace();
				}
			}
		};
		clock.start();
	}
	/**
	 * Create the application.
	 */
	public DashboardMachine() {
		initialize();
		clock();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Java\\ProjectAdvOOAGroup1\\images\\LRTLOGO2.png"));
		frame.setTitle("Dashboard Machine");
		frame.setBounds(100, 100, 1280, 1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel Logo = new JLabel();
		Logo.setBounds(71, 13, 159, 201);
		path = "C:\\\\Java\\\\ProjectAdvOOAGroup1\\\\images\\\\LRTLOGO1.png";
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(Logo);
		MyImage = new ImageIcon(path);
		img = MyImage.getImage();
		newImg = img.getScaledInstance(Logo.getWidth(), Logo.getHeight(), Image.SCALE_SMOOTH);
		image = new ImageIcon(newImg);
		Logo.setIcon(image);
		
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
		
		JLabel Title2 = new JLabel();
		Title2.setBounds(0, 0, 1264, 226);
		path = "C:\\\\Java\\\\ProjectAdvOOAGroup1\\\\images\\\\3143170.jpg";
		frame.getContentPane().add(Title2);
		MyImage = new ImageIcon(path);
		img = MyImage.getImage();
		newImg = img.getScaledInstance(Title2.getWidth(), Title2.getHeight(), Image.SCALE_SMOOTH);
		image = new ImageIcon(newImg);
		Title2.setIcon(image);
		
		JRadioButton rbG7 = new JRadioButton("");
		rbG7.setBackground(Color.WHITE);
		rbG7.setBounds(71, 329, 25, 25);
		frame.getContentPane().add(rbG7);
		
		JRadioButton rbG8 = new JRadioButton("");
		rbG8.setBackground(Color.WHITE);
		rbG8.setBounds(141, 329, 25, 25);
		frame.getContentPane().add(rbG8);
		
		JRadioButton rbG9 = new JRadioButton("");
		rbG9.setBackground(Color.WHITE);
		rbG9.setBounds(205, 329, 25, 25);
		frame.getContentPane().add(rbG9);
		
		JRadioButton rbG10 = new JRadioButton("");
		rbG10.setBackground(Color.WHITE);
		rbG10.setBounds(268, 329, 25, 25);
		frame.getContentPane().add(rbG10);
		
		JRadioButton rbG11 = new JRadioButton("");
		rbG11.setBackground(Color.WHITE);
		rbG11.setBounds(326, 329, 25, 25);
		frame.getContentPane().add(rbG11);
		
		JRadioButton rbG12 = new JRadioButton("");
		rbG12.setBackground(Color.WHITE);
		rbG12.setBounds(388, 329, 25, 25);
		frame.getContentPane().add(rbG12);
		
		JRadioButton rbG13 = new JRadioButton("");
		rbG13.setBackground(Color.WHITE);
		rbG13.setBounds(455, 329, 25, 25);
		frame.getContentPane().add(rbG13);
		
		JRadioButton rbG14 = new JRadioButton("");
		rbG14.setBackground(Color.WHITE);
		rbG14.setBounds(514, 329, 25, 25);
		frame.getContentPane().add(rbG14);
		
		JRadioButton rbG15 = new JRadioButton("");
		rbG15.setBackground(Color.WHITE);
		rbG15.setBounds(585, 329, 25, 25);
		frame.getContentPane().add(rbG15);
		
		JRadioButton rbG16 = new JRadioButton("");
		rbG16.setBackground(Color.WHITE);
		rbG16.setBounds(690, 370, 25, 25);
		frame.getContentPane().add(rbG16);
		
		JRadioButton rbG17 = new JRadioButton("");
		rbG17.setBackground(Color.WHITE);
		rbG17.setBounds(722, 405, 25, 25);
		frame.getContentPane().add(rbG17);
		
		JRadioButton rbG18 = new JRadioButton("");
		rbG18.setBackground(Color.WHITE);
		rbG18.setBounds(722, 343, 25, 25);
		frame.getContentPane().add(rbG18);
		
		JRadioButton rbG19 = new JRadioButton("");
		rbG19.setBackground(Color.WHITE);
		rbG19.setBounds(766, 370, 25, 25);
		frame.getContentPane().add(rbG19);
		
		JRadioButton rbG20 = new JRadioButton("");
		rbG20.setBackground(Color.WHITE);
		rbG20.setBounds(887, 329, 25, 25);
		frame.getContentPane().add(rbG20);
		
		JRadioButton rbG21 = new JRadioButton("");
		rbG21.setBackground(Color.WHITE);
		rbG21.setBounds(967, 329, 25, 25);
		frame.getContentPane().add(rbG21);
		
		JRadioButton rbG22 = new JRadioButton("");
		rbG22.setBackground(Color.WHITE);
		rbG22.setBounds(1042, 329, 25, 25);
		frame.getContentPane().add(rbG22);
		
		JRadioButton rbG23 = new JRadioButton("");
		rbG23.setBackground(Color.WHITE);
		rbG23.setBounds(1117, 329, 25, 25);
		frame.getContentPane().add(rbG23);
		
		JRadioButton rbG24 = new JRadioButton("");
		rbG24.setBackground(Color.WHITE);
		rbG24.setBounds(1193, 329, 25, 25);
		frame.getContentPane().add(rbG24);
		
		JLabel imgmap = new JLabel();
		imgmap.setBounds(0, 227, 1262, 300);
		path = "C:\\\\Java\\\\ProjectAdvOOAGroup1\\\\images\\\\map.png";
		frame.getContentPane().add(imgmap);
		MyImage = new ImageIcon(path);
		img = MyImage.getImage();
		newImg = img.getScaledInstance(imgmap.getWidth(), imgmap.getHeight(), Image.SCALE_SMOOTH);
		image = new ImageIcon(newImg);
		imgmap.setIcon(image);
		
		JLabel lblDestination = new JLabel("Destination:");
		lblDestination.setFont(new Font("Dialog", Font.BOLD, 40));
		lblDestination.setBounds(121, 659, 227, 44);
		frame.getContentPane().add(lblDestination);
		
		JLabel lblPerson = new JLabel("Person:");
		lblPerson.setFont(new Font("Dialog", Font.BOLD, 40));
		lblPerson.setBounds(198, 741, 150, 44);
		frame.getContentPane().add(lblPerson);
		
		JLabel lblPrice = new JLabel("Price:");
		lblPrice.setFont(new Font("Dialog", Font.BOLD, 40));
		lblPrice.setBounds(233, 831, 112, 44);
		frame.getContentPane().add(lblPrice);
		
		JButton btnPay = new JButton("Pay");
		btnPay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				@SuppressWarnings("unused")
				MemberLogin msl = new MemberLogin();
				MemberLogin.main(null);
				frame.dispose();
				
			}
		});
		btnPay.setBackground(Color.LIGHT_GRAY);
		btnPay.setFont(new Font("Dialog", Font.BOLD, 40));
		btnPay.setBounds(967, 654, 270, 55);
		frame.getContentPane().add(btnPay);
		
		JButton btnCancle = new JButton(" Cancle");
		btnCancle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCancle.setBackground(Color.LIGHT_GRAY);
		btnCancle.setFont(new Font("Dialog", Font.BOLD, 40));
		btnCancle.setBounds(967, 790, 270, 55);
		frame.getContentPane().add(btnCancle);
		
		JButton btnWaletCheck = new JButton(" Wallet Check");
		btnWaletCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				@SuppressWarnings("unused")
				MemberWallet msl = new MemberWallet();
				MemberWallet.main(null);
				frame.dispose();
			}
		});
		btnWaletCheck.setBackground(Color.LIGHT_GRAY);
		btnWaletCheck.setFont(new Font("Dialog", Font.BOLD, 35));
		btnWaletCheck.setBounds(967, 868, 270, 55);
		frame.getContentPane().add(btnWaletCheck);
		
		JLabel opDestination = new JLabel("??");
		opDestination.setHorizontalAlignment(SwingConstants.LEFT);
		opDestination.setFont(new Font("Dialog", Font.BOLD, 40));
		opDestination.setBounds(359, 659, 298, 44);
		frame.getContentPane().add(opDestination);
		
		JLabel opPrice = new JLabel("??");
		opPrice.setHorizontalAlignment(SwingConstants.LEFT);
		opPrice.setFont(new Font("Dialog", Font.BOLD, 40));
		opPrice.setBounds(359, 831, 298, 44);
		frame.getContentPane().add(opPrice);
		
		
		//Group the radio button.
		groupstation.add(rbG7);
		groupstation.add(rbG8);
		groupstation.add(rbG9);
		groupstation.add(rbG10);
		groupstation.add(rbG11);
		groupstation.add(rbG12);
		groupstation.add(rbG13);
		groupstation.add(rbG14);
		groupstation.add(rbG15);
		groupstation.add(rbG16);
		groupstation.add(rbG17);
		groupstation.add(rbG18);
		groupstation.add(rbG19);
		groupstation.add(rbG20);
		groupstation.add(rbG21);
		groupstation.add(rbG22);
		groupstation.add(rbG23);
		groupstation.add(rbG24);		
		
		JLabel label_2 = new JLabel("??");
		label_2.setFont(new Font("Dialog", Font.PLAIN, 40));
		label_2.setBounds(805, 554, 326, 44);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("Station Name : ");
		label_3.setFont(new Font("Dialog", Font.BOLD, 40));
		label_3.setBounds(497, 554, 295, 44);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("Status :");
		label_4.setFont(new Font("Dialog", Font.BOLD, 40));
		label_4.setBounds(111, 554, 150, 44);
		frame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("??");
		label_5.setFont(new Font("Dialog", Font.PLAIN, 40));
		label_5.setBounds(263, 554, 191, 44);
		frame.getContentPane().add(label_5);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(1, 1, 5, 1));
		spinner.setFont(new Font("Tahoma", Font.PLAIN, 40));
		spinner.setBounds(360, 741, 80, 43);
		frame.getContentPane().add(spinner);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.print(time);
			}
		});
		btnUpdate.setFont(new Font("Dialog", Font.BOLD, 40));
		btnUpdate.setBackground(Color.LIGHT_GRAY);
		btnUpdate.setBounds(967, 722, 270, 55);
		frame.getContentPane().add(btnUpdate);
		
		lbClock = new JLabel("Date");
		lbClock.setHorizontalAlignment(SwingConstants.LEFT);
		lbClock.setFont(new Font("Dialog", Font.BOLD, 20));
		lbClock.setBounds(25, 896, 557, 44);
		frame.getContentPane().add(lbClock);
		
		JLabel bg2 = new JLabel("");
		bg2.setBounds(10, 540, 1240, 79);
		frame.getContentPane().add(bg2);
		path = "C:\\\\Java\\\\ProjectAdvOOAGroup1\\\\images\\\\bg3.png";
		frame.getContentPane().add(bg2);
		MyImage = new ImageIcon(path);
		img = MyImage.getImage();
		newImg = img.getScaledInstance(bg2.getWidth(), bg2.getHeight(), Image.SCALE_SMOOTH);
		image = new ImageIcon(newImg);
		bg2.setIcon(image);
		
		JLabel bg4 = new JLabel("");
		bg4.setBounds(10, 632, 924, 308);
		frame.getContentPane().add(bg4);
		path = "C:\\\\Java\\\\ProjectAdvOOAGroup1\\\\images\\\\bg3.png";
		frame.getContentPane().add(bg4);
		MyImage = new ImageIcon(path);
		img = MyImage.getImage();
		newImg = img.getScaledInstance(bg4.getWidth(), bg4.getHeight(), Image.SCALE_SMOOTH);
		image = new ImageIcon(newImg);
		bg4.setIcon(image);
		
		JLabel bg3 = new JLabel("");
		bg3.setBounds(946, 632, 304, 308);
		frame.getContentPane().add(bg3);
		path = "C:\\\\Java\\\\ProjectAdvOOAGroup1\\\\images\\\\bg3.png";
		frame.getContentPane().add(bg3);
		MyImage = new ImageIcon(path);
		img = MyImage.getImage();
		newImg = img.getScaledInstance(bg3.getWidth(), bg3.getHeight(), Image.SCALE_SMOOTH);
		image = new ImageIcon(newImg);
		bg3.setIcon(image);
	}
}