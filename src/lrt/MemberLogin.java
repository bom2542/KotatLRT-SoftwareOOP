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

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.SwingConstants;

public class MemberLogin extends DashboardStationEmployee{

	private JFrame frmMemberloginLrtkorat;
	private JTextField txtUsername;
	private JPasswordField txtPin;
	private String path;
	private JLabel getWallet;
	private ImageIcon MyImage;
	private Image img;
	private Image newImg;
	private ImageIcon image;
	private static String user, pass;
	private int check;
	public double wprice, walle, sumprice;
	public String date2;
	
	Statement st;
	Connection con = null;
	ResultSet rsRead;
	
	private String sql="";
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
	@SuppressWarnings("deprecation")
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
		
		CheckMem cm = new CheckMem();
		JFrame f = new JFrame(); 
		TicketPrice tp = new TicketPrice();
		@SuppressWarnings("unused")
		DashboardMachine dm = new DashboardMachine();
		
		frmMemberloginLrtkorat = new JFrame();
		frmMemberloginLrtkorat.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Java\\ProjectAdvOOAGroup1\\images\\LRTLOGO2.png"));
		frmMemberloginLrtkorat.setTitle("MemberLogin - LRTKORAT");
		frmMemberloginLrtkorat.setBounds(100, 100, 566, 466);
		frmMemberloginLrtkorat.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMemberloginLrtkorat.getContentPane().setLayout(null);
		frmMemberloginLrtkorat.setLocationRelativeTo(null);
		
		getWallet = new JLabel();
		getWallet.setForeground(Color.WHITE);
		getWallet.setFont(new Font("SUT", Font.PLAIN, 24));
		getWallet.setBounds(427, 252, 121, 50);
		frmMemberloginLrtkorat.getContentPane().add(getWallet);
		
		JLabel lblWallet = new JLabel("Wallet : ");
		lblWallet.setForeground(Color.WHITE);
		lblWallet.setFont(new Font("SUT", Font.BOLD, 24));
		lblWallet.setBounds(355, 252, 72, 50);
		frmMemberloginLrtkorat.getContentPane().add(lblWallet);
		
		JLabel getName = new JLabel();
		getName.setForeground(Color.WHITE);
		getName.setFont(new Font("SUT", Font.PLAIN, 24));
		getName.setBounds(96, 252, 284, 50);
		frmMemberloginLrtkorat.getContentPane().add(getName);
		
		JLabel lblName = new JLabel("Name : ");
		lblName.setForeground(Color.WHITE);
		lblName.setFont(new Font("SUT", Font.BOLD, 24));
		lblName.setBounds(22, 252, 64, 50);
		frmMemberloginLrtkorat.getContentPane().add(lblName);
		
		
		JLabel lblMemberLogin = new JLabel("MEMBER LOGIN FOR PAY");
		lblMemberLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblMemberLogin.setForeground(UIManager.getColor("Button.disabledShadow"));
		lblMemberLogin.setBackground(UIManager.getColor("Button.disabledShadow"));
		lblMemberLogin.setFont(new Font("SUT", Font.BOLD, 35));
		lblMemberLogin.setBounds(178, 40, 322, 62);
		frmMemberloginLrtkorat.getContentPane().add(lblMemberLogin);
		
		txtUsername = new JTextField();
		txtUsername.setFont(new Font("SUT", Font.BOLD, 40));
		txtUsername.setColumns(10);
		txtUsername.setBounds(237, 153, 237, 43);
		frmMemberloginLrtkorat.getContentPane().add(txtUsername);
		
		txtPin = new JPasswordField();
		txtPin.setFont(new Font("SUT", Font.BOLD, 40));
		txtPin.setBounds(237, 212, 131, 42);
		frmMemberloginLrtkorat.getContentPane().add(txtPin);
		
		JLabel lblPin = new JLabel("PIN :");
		lblPin.setFont(new Font("SUT", Font.BOLD, 40));
		lblPin.setBounds(161, 208, 64, 50);
		frmMemberloginLrtkorat.getContentPane().add(lblPin);
		
		JLabel lblPhone = new JLabel("Phone No :");
		lblPhone.setFont(new Font("SUT", Font.BOLD, 40));
		lblPhone.setBounds(73, 149, 152, 50);
		frmMemberloginLrtkorat.getContentPane().add(lblPhone);
		
		JButton btLogin = new JButton("Pay");
		btLogin.setBackground(Color.LIGHT_GRAY);
		btLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				wprice = tp.getSumPrice();
				walle = cm.getWall();
				
				PriceUpdate pu = new PriceUpdate();
				pu.setPrice(wprice, walle);
				
				
				getWallet.setText(Double.toString(pu.moneyupdate()));
				
				int checking = pu.getError();
				if(checking == 0) {
					JOptionPane.showMessageDialog(null,"Money not enough. You have " + Double.toString(pu.moneyupdate()) ,"Wallet Conclusion",JOptionPane.PLAIN_MESSAGE);
					frmMemberloginLrtkorat.setVisible(false);
					DashboardStationEmployee.main(null);
					
				}else if(checking == 1) {
					JOptionPane.showMessageDialog(null,"Remening Wallet of you : " + Double.toString(pu.moneyupdate()),"Wallet Conclusion",JOptionPane.PLAIN_MESSAGE);
					frmMemberloginLrtkorat.setVisible(false);
					@SuppressWarnings("unused")
					Ticket tk = new Ticket();
					Ticket.main(null);
					frmMemberloginLrtkorat.setVisible(false);
				}
				
				DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
				Date date = new Date();
				
				String date2 = dateFormat.format(date);
				String tels2 = pu.getTel();
				String so ="";//= dm.getStationID();
				String sd1 ="" ;//= tp.getDesination();
				double tpx =0.0;//= tp.getSumPrice();
				
				/*try {
					sql = "SELECT * FROM session";
					rsRead = st.executeQuery(sql);
					while(rsRead.next()) {
						if(rsRead != null) {
							so = rsRead.getString("Station_Origin");
							sd1 = rsRead.getString("Station_Destination");
							tpx = rsRead.getDouble("Price");
							}
						}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}catch(Exception ex) {
					 System.out.println(ex);
				}*/
				
				try {
					
					sql = "SELECT * FROM session ORDER BY Station_No ASC";
					rsRead = st.executeQuery(sql);
					while(rsRead.next()) {
						if(rsRead != null) {
							so = rsRead.getString("Station_Origin");
							sd1 = rsRead.getString("Station_Destination");
							tpx = rsRead.getDouble("Price");
							}
						}
					
					sql = "INSERT INTO ticket(Ticket_Date, Member_Tel, Station_Origin_ID, Station_Destination_ID, Ticket_Price) VALUES ('" + date2 + "','"+ tels2 + "','"+ so +"','"+ sd1 +"',"+ tpx +")";
					st.executeUpdate(sql);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btLogin.setFont(new Font("SUT", Font.BOLD, 40));
		btLogin.setBounds(167, 316, 213, 62);
		frmMemberloginLrtkorat.getContentPane().add(btLogin);
		
		JButton btExit = new JButton("Cancle");
		btExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmMemberloginLrtkorat.dispose();
			}
		});
		btExit.setForeground(Color.BLACK);
		btExit.setFont(new Font("SUT", Font.BOLD, 30));
		btExit.setBackground(SystemColor.activeCaption);
		btExit.setBounds(427, 377, 113, 39);
		frmMemberloginLrtkorat.getContentPane().add(btExit);
		
		JButton btnLogin = new JButton("Login");
		btLogin.hide();
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//PriceUpdate pu = new PriceUpdate();
				
				user = txtUsername.getText();
				pass = txtPin.getText();
				
				cm.setCheckMem(user, pass);
				
				check = cm.getCheckMem(); 
				if(check == 1) {
					btnLogin.hide();
					String name = cm.getName();
					String wallet = cm.getWallet();
					getName.setText(name);
					getWallet.setText(wallet);
					txtUsername.setEnabled(false);
					txtPin.setEnabled(false);
					
					JOptionPane.showMessageDialog(f,"Welcome ! " + name + "\nYour Wallet : " + wallet + " THB","MemberLogin - LRTKORAT",JOptionPane.INFORMATION_MESSAGE); 
					btLogin.show();
				}else {
				    JOptionPane.showMessageDialog(f,"Login Failed !!!","MemberLogin - LRTKORAT",JOptionPane.ERROR_MESSAGE);   
				}
			}
		});
		btnLogin.setFont(new Font("SUT", Font.BOLD, 40));
		btnLogin.setBackground(Color.LIGHT_GRAY);
		btnLogin.setBounds(165, 316, 213, 62);
		frmMemberloginLrtkorat.getContentPane().add(btnLogin);
		
		JLabel logo;
		logo = new JLabel();
		logo.setBounds(96, 28, 72, 93);
		frmMemberloginLrtkorat.getContentPane().add(logo);
		path = "C:\\\\Java\\\\ProjectAdvOOAGroup1\\\\images\\\\LRTLOGO1.png";
		MyImage = new ImageIcon(path);
		img = MyImage.getImage();
		newImg = img.getScaledInstance(logo.getWidth(), logo.getHeight(), Image.SCALE_SMOOTH);
		image = new ImageIcon(newImg);
		logo.setIcon(image);
		
		JLabel label = new JLabel();
		label.setBackground(SystemColor.activeCaptionBorder);
		label.setBounds(0, 132, 560, 170);
		frmMemberloginLrtkorat.getContentPane().add(label);
		path = "C:\\\\Java\\\\ProjectAdvOOAGroup1\\\\images\\\\3143170.jpg";
		MyImage = new ImageIcon(path);
		img = MyImage.getImage();
		newImg = img.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
		image = new ImageIcon(newImg);
		label.setIcon(image);
		
		//Background
		JLabel img_bg = new JLabel();
		img_bg.setBounds(0, 0, 560, 427);
		frmMemberloginLrtkorat.getContentPane().add(img_bg);
		path = "C:\\\\Java\\\\ProjectAdvOOAGroup1\\\\images\\\\1299.jpg";
		MyImage = new ImageIcon(path);
		img = MyImage.getImage();
		newImg = img.getScaledInstance(img_bg.getWidth(), img_bg.getHeight(), Image.SCALE_SMOOTH);
		image = new ImageIcon(newImg);
		img_bg.setIcon(image);
		
	}
	
	public String getDate() {
		return date2;
	}
}