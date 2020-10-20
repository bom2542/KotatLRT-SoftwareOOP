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
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.event.ChangeListener;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import javax.swing.event.ChangeEvent;

public class DashboardMachine extends DashboardStationEmployee {

	private JFrame frmDashboardmachineLrtkorat;
	private String path;
	private ImageIcon MyImage;
	private Image img;
	private Image newImg;
	private ImageIcon image;
	private JLabel lbClock;
	public String destination="", status="";
	private double sum=0;
	private int num=1;
	
	TicketPrice c = new TicketPrice();
	ButtonGroup groupstation = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DashboardMachine window = new DashboardMachine();
					window.frmDashboardmachineLrtkorat.setVisible(true);
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
						hour = timedate.get(Calendar.HOUR_OF_DAY);
					
						lbClock.setText(day + "/" + month + "/" + year +" " + hour + ":" + minute + ":" + second);
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
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/lrtkorat", "pharadornl_lrtkorat", "HSt1N9rb4Vpyl");
			st = (Statement) con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		}catch(SQLException e){
			 System.out.println(e);
		}catch(Exception ex) {
			 System.out.println(ex);
		}
		
		@SuppressWarnings("unused")
		CheckMem cm = new CheckMem();
		@SuppressWarnings("unused")
		JFrame f = new JFrame(); 
		@SuppressWarnings("unused")
		TicketPrice tp = new TicketPrice();
		
		frmDashboardmachineLrtkorat = new JFrame();
		frmDashboardmachineLrtkorat.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Java\\ProjectAdvOOAGroup1\\images\\LRTLOGO2.png"));
		frmDashboardmachineLrtkorat.setTitle("DashboardMachine - LRTKORAT");
		frmDashboardmachineLrtkorat.setBounds(100, 100, 1280, 1000);
		frmDashboardmachineLrtkorat.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDashboardmachineLrtkorat.getContentPane().setLayout(null);
		frmDashboardmachineLrtkorat.setLocationRelativeTo(null);
		
		CheckLogin cl = new CheckLogin();
		
		JLabel Logo = new JLabel();
		Logo.setBounds(141, 14, 112, 147);
		path = "C:\\\\Java\\\\ProjectAdvOOAGroup1\\\\images\\\\LRTLOGO1.png";
		frmDashboardmachineLrtkorat.getContentPane().setLayout(null);
		
		JLabel lbOriginStation_1 = new JLabel();
		
		lbOriginStation_1.setText((String) null);
		lbOriginStation_1.setText(stdname);
		lbOriginStation_1.setFont(new Font("SUT", Font.PLAIN, 40));
		lbOriginStation_1.setBounds(457, 655, 470, 44);
		frmDashboardmachineLrtkorat.getContentPane().add(lbOriginStation_1);
		
		JLabel lblOriginstation_1_1 = new JLabel("Destination Station : ");
		lblOriginstation_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblOriginstation_1_1.setFont(new Font("SUT", Font.BOLD, 40));
		lblOriginstation_1_1.setBounds(149, 715, 302, 44);
		frmDashboardmachineLrtkorat.getContentPane().add(lblOriginstation_1_1);
		
		JLabel lblOriginstation_1 = new JLabel("Origin Station : ");
		lblOriginstation_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblOriginstation_1.setFont(new Font("SUT", Font.BOLD, 40));
		lblOriginstation_1.setBounds(219, 655, 232, 44);
		frmDashboardmachineLrtkorat.getContentPane().add(lblOriginstation_1);
		
		JLabel lblConclusion = new JLabel("\u0E2A\u0E23\u0E38\u0E1B\u0E01\u0E32\u0E23\u0E0B\u0E37\u0E49\u0E2D : ");
		lblConclusion.setFont(new Font("SUT", Font.BOLD, 50));
		lblConclusion.setBounds(22, 573, 247, 57);
		frmDashboardmachineLrtkorat.getContentPane().add(lblConclusion);
		
		lbClock = new JLabel("");
		lbClock.setForeground(Color.WHITE);
		lbClock.setHorizontalAlignment(SwingConstants.RIGHT);
		lbClock.setFont(new Font("Digital-7 Mono", Font.BOLD, 30));
		lbClock.setBounds(731, 106, 323, 44);
		frmDashboardmachineLrtkorat.getContentPane().add(lbClock);
		
		JLabel lblDesc = new JLabel("Destination Station : ");
		lblDesc.setFont(new Font("SUT", Font.BOLD, 40));
		lblDesc.setBounds(25, 272, 323, 44);
		frmDashboardmachineLrtkorat.getContentPane().add(lblDesc);
		frmDashboardmachineLrtkorat.getContentPane().add(Logo);
		MyImage = new ImageIcon(path);
		img = MyImage.getImage();
		newImg = img.getScaledInstance(Logo.getWidth(), Logo.getHeight(), Image.SCALE_SMOOTH);
		image = new ImageIcon(newImg);
		Logo.setIcon(image);
		
		JLabel label = new JLabel("\u0E23\u0E16\u0E44\u0E1F\u0E1F\u0E49\u0E32\u0E23\u0E32\u0E07\u0E40\u0E1A\u0E32\u0E42\u0E04\u0E23\u0E32\u0E0A");
		label.setHorizontalAlignment(SwingConstants.LEFT);
		label.setForeground(Color.WHITE);
		label.setFont(new Font("SUT", Font.BOLD, 40));
		label.setBounds(274, 106, 315, 44);
		frmDashboardmachineLrtkorat.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("KORAT LIGHT-RAIL TRANSPORT (LRTKORAT)");
		label_1.setHorizontalAlignment(SwingConstants.LEFT);
		label_1.setForeground(new Color(147, 112, 219));
		label_1.setFont(new Font("SUT", Font.BOLD, 50));
		label_1.setBounds(274, 28, 838, 80);
		frmDashboardmachineLrtkorat.getContentPane().add(label_1);
		
		JLabel lbStationID = new JLabel();
		stdid = cl.getSearch();
		lbStationID.setText(stdid);
		lbStationID.setFont(new Font("SUT", Font.PLAIN, 40));
		lbStationID.setBounds(518, 189, 153, 44);
		frmDashboardmachineLrtkorat.getContentPane().add(lbStationID);
		
		JLabel lblOriginstation = new JLabel("Origin Station : ");
		lblOriginstation.setFont(new Font("SUT", Font.BOLD, 40));
		lblOriginstation.setBounds(297, 189, 232, 44);
		frmDashboardmachineLrtkorat.getContentPane().add(lblOriginstation);
		
		
		JLabel Title2 = new JLabel();
		Title2.setBounds(0, 0, 1264, 168);
		path = "C:\\\\Java\\\\ProjectAdvOOAGroup1\\\\images\\\\3143170.jpg";
		frmDashboardmachineLrtkorat.getContentPane().add(Title2);
		MyImage = new ImageIcon(path);
		img = MyImage.getImage();
		newImg = img.getScaledInstance(Title2.getWidth(), Title2.getHeight(), Image.SCALE_SMOOTH);
		image = new ImageIcon(newImg);
		Title2.setIcon(image);
		
		JLabel destinat = new JLabel();
		destinat.setHorizontalAlignment(SwingConstants.LEFT);
		destinat.setFont(new Font("SUT", Font.PLAIN, 40));
		destinat.setBounds(457, 715, 461, 44);
		frmDashboardmachineLrtkorat.getContentPane().add(destinat);
		
		JLabel opPrice = new JLabel("");
		opPrice.setFont(new Font("SUT", Font.BOLD, 80));
		opPrice.setBounds(457, 867, 207, 44);
		frmDashboardmachineLrtkorat.getContentPane().add(opPrice);
		
		JLabel lbOriginStation = new JLabel();
		stdname = cl.getStationName();
		//System.out.print(stdname);
		lbOriginStation.setText(stdname);
		lbOriginStation.setFont(new Font("SUT", Font.PLAIN, 40));
		lbOriginStation.setBounds(586, 189, 541, 44);
		frmDashboardmachineLrtkorat.getContentPane().add(lbOriginStation);
		
		JSpinner spinner = new JSpinner();
		spinner.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				num = Integer.parseInt(spinner.getValue().toString());
				
				sum = num * c.getprice();
				opPrice.setText(Double.toString(sum));
			}
		});
		spinner.setModel(new SpinnerNumberModel(1, 1, 5, 1));
		spinner.setFont(new Font("SUT", Font.PLAIN, 40));
		spinner.setBounds(449, 775, 80, 43);
		frmDashboardmachineLrtkorat.getContentPane().add(spinner);
		
		JRadioButton rbG7 = new JRadioButton("");
		rbG7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				destination = "G7";
				status = cl.getStationID();
				c.MoneyCheck(status,destination);
				c.setStation();
				destinat.setText(c.getStationNameEN());
				sum = num * c.getprice();
				c.setSumPrice(sum);
				opPrice.setText(Double.toString(sum));
			}
		});
		rbG7.setBackground(Color.WHITE);
		rbG7.setBounds(71, 346, 25, 25);
		frmDashboardmachineLrtkorat.getContentPane().add(rbG7);
		
		JRadioButton rbG8 = new JRadioButton("");
		rbG8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				destination = "G8";
				
				status = cl.getStationID();
				c.MoneyCheck(status,destination);
				c.setStation();
				destinat.setText(c.getStationNameEN());
				
				sum = num * c.getprice();
				c.setSumPrice(sum);
				opPrice.setText(Double.toString(sum));
			}
		});
		rbG8.setBackground(Color.WHITE);
		rbG8.setBounds(141, 346, 25, 25);
		frmDashboardmachineLrtkorat.getContentPane().add(rbG8);
		
		JRadioButton rbG9 = new JRadioButton("");
		rbG9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				destination = "G9";
				
				status = cl.getStationID();
				c.MoneyCheck(status,destination);
				c.setStation();
				destinat.setText(c.getStationNameEN());
				
				
				sum = num * c.getprice();
				c.setSumPrice(sum);
				opPrice.setText(Double.toString(sum));
			}
		});
		rbG9.setBackground(Color.WHITE);
		rbG9.setBounds(205, 346, 25, 25);
		frmDashboardmachineLrtkorat.getContentPane().add(rbG9);
		
		JRadioButton rbG10 = new JRadioButton("");
		rbG10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				destination = "G10";
				status = cl.getStationID();
				c.MoneyCheck(status,destination);
				c.setStation();
				destinat.setText(c.getStationNameEN());
				
				sum = num * c.getprice();
				c.setSumPrice(sum);
				opPrice.setText(Double.toString(sum));
			}
		});
		rbG10.setBackground(Color.WHITE);
		rbG10.setBounds(274, 347, 25, 25);
		frmDashboardmachineLrtkorat.getContentPane().add(rbG10);
		
		JRadioButton rbG11 = new JRadioButton("");
		rbG11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				destination = "G11";
				status = cl.getStationID();
				c.MoneyCheck(status,destination);
				c.setStation();
				destinat.setText(c.getStationNameEN());
				
				sum = num * c.getprice();
				c.setSumPrice(sum);
				opPrice.setText(Double.toString(sum));
			}
		});
		rbG11.setBackground(Color.WHITE);
		rbG11.setBounds(332, 347, 25, 25);
		frmDashboardmachineLrtkorat.getContentPane().add(rbG11);
		
		JRadioButton rbG12 = new JRadioButton("");
		rbG12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				destination = "G12";
				status = cl.getStationID();
				c.MoneyCheck(status,destination);
				c.setStation();
				destinat.setText(c.getStationNameEN());
				
				sum = num * c.getprice();
				c.setSumPrice(sum);
				opPrice.setText(Double.toString(sum));
			}
		});
		rbG12.setBackground(Color.WHITE);
		rbG12.setBounds(394, 347, 25, 25);
		frmDashboardmachineLrtkorat.getContentPane().add(rbG12);
		
		JRadioButton rbG13 = new JRadioButton("");
		rbG13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				destination = "G13";
				status = cl.getStationID();
				c.MoneyCheck(status,destination);
				c.setStation();
				destinat.setText(c.getStationNameEN());
				
				sum = num * c.getprice();
				c.setSumPrice(sum);
				opPrice.setText(Double.toString(sum));
			}
		});
		rbG13.setBackground(Color.WHITE);
		rbG13.setBounds(461, 347, 25, 25);
		frmDashboardmachineLrtkorat.getContentPane().add(rbG13);
		
		JRadioButton rbG14 = new JRadioButton("");
		rbG14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				destination = "G14";
				status = cl.getStationID();
				c.MoneyCheck(status,destination);
				c.setStation();
				destinat.setText(c.getStationNameEN());

				sum = num * c.getprice();
				c.setSumPrice(sum);
				opPrice.setText(Double.toString(sum));
			}
		});
		rbG14.setBackground(Color.WHITE);
		rbG14.setBounds(520, 347, 25, 25);
		frmDashboardmachineLrtkorat.getContentPane().add(rbG14);
		
		JRadioButton rbG15 = new JRadioButton("");
		rbG15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				destination = "G15";
				status = cl.getStationID();
				c.MoneyCheck(status,destination);
				c.setStation();
				destinat.setText(c.getStationNameEN());
				
				sum = num * c.getprice();
				c.setSumPrice(sum);
				opPrice.setText(Double.toString(sum));
			}
		});
		rbG15.setBackground(Color.WHITE);
		rbG15.setBounds(591, 347, 25, 25);
		frmDashboardmachineLrtkorat.getContentPane().add(rbG15);
		
		JRadioButton rbG16 = new JRadioButton("");
		rbG16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				destination = "G16";
				status = cl.getStationID();
				c.MoneyCheck(status,destination);
				c.setStation();
				destinat.setText(c.getStationNameEN());
				
				sum = num * c.getprice();
				c.setSumPrice(sum);
				opPrice.setText(Double.toString(sum));
			}
		});
		rbG16.setBackground(Color.WHITE);
		rbG16.setBounds(696, 388, 25, 25);
		frmDashboardmachineLrtkorat.getContentPane().add(rbG16);
		
		JRadioButton rbG17 = new JRadioButton("");
		rbG17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				destination = "G17";
				status = cl.getStationID();
				c.MoneyCheck(status,destination);
				c.setStation();
				
				destinat.setText(c.getStationNameEN());
				
				sum = num * c.getprice();
				c.setSumPrice(sum);
				opPrice.setText(Double.toString(sum));
			}
		});
		rbG17.setBackground(Color.WHITE);
		rbG17.setBounds(728, 423, 25, 25);
		frmDashboardmachineLrtkorat.getContentPane().add(rbG17);
		
		JRadioButton rbG18 = new JRadioButton("");
		rbG18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				destination = "G18";
				status = cl.getStationID();
				c.MoneyCheck(status,destination);
				c.setStation();
				destinat.setText(c.getStationNameEN());
				
				sum = num * c.getprice();
				c.setSumPrice(sum);
				opPrice.setText(Double.toString(sum));
			}
		});
		rbG18.setBackground(Color.WHITE);
		rbG18.setBounds(728, 361, 25, 25);
		frmDashboardmachineLrtkorat.getContentPane().add(rbG18);
		
		JRadioButton rbG19 = new JRadioButton("");
		rbG19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				destination = "G19";
				status = cl.getStationID();
				c.MoneyCheck(status,destination);
				c.setStation();
				destinat.setText(c.getStationNameEN());
				
				sum = num * c.getprice();
				c.setSumPrice(sum);
				opPrice.setText(Double.toString(sum));
			}
		});
		rbG19.setBackground(Color.WHITE);
		rbG19.setBounds(772, 388, 25, 25);
		frmDashboardmachineLrtkorat.getContentPane().add(rbG19);
		
		JRadioButton rbG20 = new JRadioButton("");
		rbG20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				destination = "G20";
				status = cl.getStationID();
				c.MoneyCheck(status,destination);
				c.setStation();
				destinat.setText(c.getStationNameEN());
				
				sum = num * c.getprice();
				c.setSumPrice(sum);
				opPrice.setText(Double.toString(sum));
			}
		});
		rbG20.setBackground(Color.WHITE);
		rbG20.setBounds(893, 347, 25, 25);
		frmDashboardmachineLrtkorat.getContentPane().add(rbG20);
		
		JRadioButton rbG21 = new JRadioButton("");
		rbG21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				destination = "G21";
				status = cl.getStationID();
				c.MoneyCheck(status,destination);
				c.setStation();
				destinat.setText(c.getStationNameEN());
				
				sum = num * c.getprice();
				c.setSumPrice(sum);
				opPrice.setText(Double.toString(sum));
			}
		});
		rbG21.setBackground(Color.WHITE);
		rbG21.setBounds(973, 347, 25, 25);
		frmDashboardmachineLrtkorat.getContentPane().add(rbG21);
		
		JRadioButton rbG22 = new JRadioButton("");
		rbG22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				destination = "G22";
				status = cl.getStationID();
				c.MoneyCheck(status,destination);
				c.setStation();
				destinat.setText(c.getStationNameEN());
				
				sum = num * c.getprice();
				c.setSumPrice(sum);
				opPrice.setText(Double.toString(sum));
			}
		});
		rbG22.setBackground(Color.WHITE);
		rbG22.setBounds(1048, 347, 25, 25);
		frmDashboardmachineLrtkorat.getContentPane().add(rbG22);
		
		JRadioButton rbG23 = new JRadioButton("");
		rbG23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				destination = "G23";
				status = cl.getStationID();
				c.MoneyCheck(status,destination);
				c.setStation();
				destinat.setText(c.getStationNameEN());
				
				sum = num * c.getprice();
				c.setSumPrice(sum);
				opPrice.setText(Double.toString(sum));
			}
		});
		rbG23.setBackground(Color.WHITE);
		rbG23.setBounds(1123, 347, 25, 25);
		frmDashboardmachineLrtkorat.getContentPane().add(rbG23);
		
		JRadioButton rbG24 = new JRadioButton("");
		rbG24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				destination = "G24";
				status = cl.getStationID();
				c.MoneyCheck(status,destination);
				c.setStation();
				destinat.setText(c.getStationNameEN());
				
				sum = num * c.getprice();
				c.setSumPrice(sum);
				opPrice.setText(Double.toString(sum));
			}
		});
		rbG24.setBackground(Color.WHITE);
		rbG24.setBounds(1199, 347, 25, 25);
		frmDashboardmachineLrtkorat.getContentPane().add(rbG24);
		
		JLabel imgmap = new JLabel();
		imgmap.setBounds(0, 244, 1262, 300);
		path = "C:\\\\Java\\\\ProjectAdvOOAGroup1\\\\images\\\\map.png";
		frmDashboardmachineLrtkorat.getContentPane().add(imgmap);
		MyImage = new ImageIcon(path);
		img = MyImage.getImage();
		newImg = img.getScaledInstance(imgmap.getWidth(), imgmap.getHeight(), Image.SCALE_SMOOTH);
		image = new ImageIcon(newImg);
		imgmap.setIcon(image);
		
		JLabel lblPerson = new JLabel("Person :");
		lblPerson.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPerson.setFont(new Font("SUT", Font.BOLD, 40));
		lblPerson.setBounds(289, 775, 150, 44);
		frmDashboardmachineLrtkorat.getContentPane().add(lblPerson);
		
		JLabel lblPrice = new JLabel("Price :");
		lblPrice.setFont(new Font("SUT", Font.BOLD, 80));
		lblPrice.setBounds(244, 867, 180, 44);
		frmDashboardmachineLrtkorat.getContentPane().add(lblPrice);
		
		//wow
		JButton btnPay = new JButton("Pay");
		btnPay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				@SuppressWarnings("unused")
				MemberLogin msl = new MemberLogin();
				MemberLogin.main(null);
				
				String orig = lbOriginStation_1.getText();
				String desc = destinat.getText();
				//String tpri = Double.parseDouble(sum.getText());
				//String tpri = Double.parseDouble(sum);
				//Double tpri = 10.2;
				/*String tpr = String.valueOf(sum);
				Double tpr = */
				
				try {
					String sql = "INSERT INTO session(Station_Origin, Station_Destination, Price) VALUES ('" + orig + "','"+ desc + "',"+ sum +")";
					st.executeUpdate(sql);
				}catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			}
		});
		
		
		btnPay.setBackground(Color.LIGHT_GRAY);
		btnPay.setFont(new Font("SUT", Font.BOLD, 50));
		btnPay.setBounds(957, 651, 297, 80);
		frmDashboardmachineLrtkorat.getContentPane().add(btnPay);
		
		JButton btnWaletCheck = new JButton("WalletCheck");
		btnWaletCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				@SuppressWarnings("unused")
				MemberWallet msl = new MemberWallet();
				MemberWallet.main(null);
			}
		});
		btnWaletCheck.setBackground(Color.LIGHT_GRAY);
		btnWaletCheck.setFont(new Font("SUT", Font.BOLD, 40));
		btnWaletCheck.setBounds(957, 774, 297, 80);
		frmDashboardmachineLrtkorat.getContentPane().add(btnWaletCheck);
		
		
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
		
		
		
		path = "C:\\\\Java\\\\ProjectAdvOOAGroup1\\\\images\\\\bg3.png";
		MyImage = new ImageIcon(path);
		img = MyImage.getImage();
		image = new ImageIcon(newImg);
		
		JLabel bg4 = new JLabel("");
		bg4.setBounds(-36, 555, 970, 395);
		frmDashboardmachineLrtkorat.getContentPane().add(bg4);
		path = "C:\\\\Java\\\\ProjectAdvOOAGroup1\\\\images\\\\bg3.png";
		frmDashboardmachineLrtkorat.getContentPane().add(bg4);
		MyImage = new ImageIcon(path);
		img = MyImage.getImage();
		newImg = img.getScaledInstance(bg4.getWidth(), bg4.getHeight(), Image.SCALE_SMOOTH);
		image = new ImageIcon(newImg);
		bg4.setIcon(image);
		
		JLabel bg3 = new JLabel("");
		bg3.setBounds(946, 555, 342, 395);
		frmDashboardmachineLrtkorat.getContentPane().add(bg3);
		path = "C:\\\\Java\\\\ProjectAdvOOAGroup1\\\\images\\\\bg3.png";
		frmDashboardmachineLrtkorat.getContentPane().add(bg3);
		MyImage = new ImageIcon(path);
		img = MyImage.getImage();
		newImg = img.getScaledInstance(bg3.getWidth(), bg3.getHeight(), Image.SCALE_SMOOTH);
		image = new ImageIcon(newImg);
		bg3.setIcon(image);
		
		JLabel lbStationID_1 = new JLabel("-");
		lbStationID_1.setHorizontalAlignment(SwingConstants.CENTER);
		lbStationID_1.setFont(new Font("SUT", Font.PLAIN, 40));
		lbStationID_1.setBounds(557, 189, 25, 44);
		frmDashboardmachineLrtkorat.getContentPane().add(lbStationID_1);
		
		JLabel lbStationID_1_1 = new JLabel("-");
		lbStationID_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lbStationID_1_1.setFont(new Font("SUT", Font.PLAIN, 40));
		lbStationID_1_1.setBounds(504, 655, 25, 44);
		frmDashboardmachineLrtkorat.getContentPane().add(lbStationID_1_1);
		

		
		TicketPrice tp2 = new TicketPrice();
		tp2.MoneyCheck(stdid, destination);
		
	}
	
	
	public double getPriceTick() {
		return sum;
	}
		
}