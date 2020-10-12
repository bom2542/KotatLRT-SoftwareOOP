package lrt;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class CheckLogin {
	public static String std;
	String pass;
	Statement st;
	Connection con = null;
	ResultSet rsRead;
	public String std2, pass2, bom;
	int check;
	public static String a, b, c;
	
	
	@SuppressWarnings("static-access")
	public void setStationLogin(String std, String pass) {
		this.std = std;
		this.pass = pass;
		chkLogin();
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
	
	private void chkLogin() {
		try{
			
			connectdb();
			
			 rsRead = st.executeQuery("SELECT * FROM Station ORDER BY Station_NO ASC");
			 
			 while(rsRead.next()) {
				 std2 = rsRead.getString("Station_ID");
				 if(rsRead != null) {
					 if(std2.equals(std)) {
						 pass2 = rsRead.getString("Station_PIN");
						 if(pass2.equals(pass)) {
							 check = 1;
							 a = rsRead.getString("Station_ID");
							 b = rsRead.getString("Station_NameEN");
							 c = rsRead.getString("Station_Zone");
						 }
					 }
				 }
			 }
			 con.close();
			 st.close();
		}catch(SQLException e){
			 System.out.println(e);
		}catch(Exception ex) {
			 System.out.println(ex);
		}
	}
	
	public int getCheckLogin() {
		return check;
	}
	
	public String getSearch() {
		return std;
	}
	
	public String getStationID() {
		return a;
	}
	
	public String getStationName() {
		return b;
	}
	
	public String getStationZone() {
		return c;
	}
}
