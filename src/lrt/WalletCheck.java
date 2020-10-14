package lrt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class WalletCheck {

	Statement st;
	Connection con = null;
	ResultSet rsRead;
	private String sql="";
	private static String phone = "",std2="";
	@SuppressWarnings("unused")
	private static String wallet2;
	@SuppressWarnings("unused")
	private double wallet1,sum=0;
	
	@SuppressWarnings("static-access")
	public void setMemberPhone(String phone){
		this.phone = phone;
		//System.out.println(phone);
		SelectCheck();
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
	
	public void SelectCheck(){
		
		connectdb();
		
		try {
			
			rsRead = st.executeQuery("SELECT * FROM Member");
			/*rsRead.first();
			
			wallet1 = rsRead.getDouble("Member_Wallet");
			System.out.printf("test 29: %s", wallet1);*/
			
			while(rsRead.next()) {
					std2 = rsRead.getString("Member_Tel");
					// System.out.println("test 41: " + wallet1);
			  		  if(std2.equals(phone)) {
						 wallet1 = rsRead.getDouble("Member_Wallet");
						 //System.out.println("test 41: " + wallet1);
					 }
			 }
			 	
		}catch(SQLException e){
			 System.out.println(e);
		}catch(Exception ex) {
			 System.out.println(ex);
		}
	}
	
	
	public String getMemberPhone(){
		return phone;
	}
	
	public double getMemberWallet(){
		return wallet1;
	}
	
	public void updateWallet(double sum){
		this.sum = sum;
		//System.out.println("test 76: " + sum);
		//System.out.println("test 77: " + phone);
		try {
			sql = "UPDATE Member SET Member_Wallet = " + sum + " WHERE Member_Tel = '" + phone + "'";
			st.executeUpdate(sql);
			
			con.close();
			st.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Update error 84: " + e);
		}
		
	}
	
}
