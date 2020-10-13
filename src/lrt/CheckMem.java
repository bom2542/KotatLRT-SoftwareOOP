package lrt;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class CheckMem {
	
	Statement st;
	Connection con = null;
	ResultSet rsRead;
	private String user="";
	private String pass="";
	private String tname="";
	private String twal="";
	private static String tel="",tel2="", tpass="";
	private  double wal;
	private int check = 0;
	public String tname2;
	
	public void setCheckMem(String user, String pass) {
		this.user = user;
		this.pass = pass;
		
		CheckMemberLogin();
		/*System.out.println(user);
		System.out.println(pass);*/
	}
	
	public void connectdb() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/lrtkorat", "pharadornl_lrtkorat", "HSt1N9rb4Vpyl");
			st = (Statement) con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		}catch(SQLException e){
			 System.out.println(e);
		}catch(Exception ex) {
			 System.out.println(ex);
		}
	}
	
	public void CheckMemberLogin() {
		
		connectdb();
		
		try {
			
			rsRead = st.executeQuery("SELECT * FROM member");
			rsRead.isBeforeFirst();
			
			while(rsRead.next()) {
				if(rsRead != null) {
					tel = rsRead.getString("Member_Tel");
					if(tel.equals(user)) {
						tpass = rsRead.getString("Member_PIN");
							if(tpass.equals(pass)) {
								check = 1;
								tel2 = rsRead.getString("Member_Tel");
								tname = rsRead.getString("Member_Name");
								wal = rsRead.getDouble("Member_Wallet");
								twal = rsRead.getString("Member_Wallet");
								//System.out.print("row64 Name DB : " + user);
								//System.out.print("\n row65 Name DB : " + tname);
								
							}
						}
				}
			}
			
			//System.out.print("\n row71 getName  : " + wal);
			
			
			PriceUpdate pu = new PriceUpdate();
			pu.setName(tel2);
			//System.out.print("\n row73 getName : " + tel2);
			
			con.close();
			st.close();
		}catch(SQLException e){
			 System.out.println(e);
		}catch(Exception ex) {
			 System.out.println(ex);
		}
		
		/*PriceUpdate pu = new PriceUpdate();
		pu.setName(tname);*/
	}
	
	public int getCheckMem() {
		return check;
	}
	
	public String getName() {
		//System.out.print("getName : " + tname);
		return tname;
	}
	
	public String getWallet() {
		return twal;
	}
	
	public double getWall() {
		return wal;
	}
}
