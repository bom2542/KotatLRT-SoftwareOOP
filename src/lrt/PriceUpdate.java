package lrt;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class PriceUpdate {
	
	public double price;
	public double wallet;
	public double sumprice;
	public int check;
	Statement st;
	Connection con = null;
	ResultSet rsRead;
	@SuppressWarnings("unused")
	private static String tel;
	String sql="";

	public void setPrice(double price, double wallet) {
		
		this.price = price;
		this.wallet = wallet;
		
		checkSumprice();
	}
	
	@SuppressWarnings("static-access")
	public void setName(String tel) {
		this.tel = tel;
	}
	
	public void checkSumprice() {
		if(wallet >= price) {
			sumprice = wallet - price;
			check = 1;
		}else if(wallet < price) {
			check = 0;
		}
		
		updateprice();
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
	
	public void updateprice() {
		try{
			
			connectdb();
			
			@SuppressWarnings("unused")
			MemberLogin ml = new MemberLogin();
			
			
			sql = "UPDATE Member SET Member_Wallet = " + sumprice + " WHERE Member_Tel = '" + tel +"'";
			st.executeUpdate(sql);
			
			//System.out.println("\nRecord Update Successfully");
			//System.out.println(sumprice);
			//System.out.println(tel);
			
			 con.close();
			 st.close();
		}catch(SQLException e){
			 System.out.println(e);
		}catch(Exception ex) {
			 System.out.println(ex);
		}
	}
	
	public int getError() {
		
		return check;
	}
	
	public double moneyupdate() {
		return sumprice;
	}
	
	public String getTel() {
		return tel;
	}

}
