package lrt;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class TicketPrice{
	
	private String origin="",zone1="",zone2="",o1="",de="",dn="",de2="";
	private double price=0,state=15;
	public static double sum = 0.0;
	Connection con = null;
	Statement st;
	ResultSet rsRead;
	CheckLogin cl = new CheckLogin();
	String destination;
	
	public void MoneyCheck(String o,String d){
		origin = o;
		destination = d;
		
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
	
	public void setStation() {
		try{
			
			connectdb();
			rsRead = st.executeQuery("SELECT * FROM Station ORDER BY Station_NO ASC");
			
			while(rsRead.next()) {
				 o1 = rsRead.getString("Station_ID");
				 if(rsRead != null) {
					 if(o1.equals(origin)) {
						 
						 zone1 = rsRead.getString("Station_Zone");
					 }
				 }
			 }
			
			rsRead = st.executeQuery("SELECT * FROM Station ORDER BY Station_NO ASC");
			
			while(rsRead.next()) {
				de = rsRead.getString("Station_ID");
				 if(rsRead != null) {
					 if(de.equals(destination)) {
						 dn = rsRead.getString("Station_NameEN");
						 zone2 = rsRead.getString("Station_Zone");
						 de2 = rsRead.getString("Station_ID");
					 }
				 }
			 }


			
		}catch(SQLException e){
			 System.out.println(e);
		}catch(Exception ex) {
			 System.out.println(ex);
		}
	}
	
	public double getprice(){
		
			
			if(zone1.equals("A")){
				if(zone2.equals("A")){
					price = state;
				}else if(zone2.equals("B")){
					price = state + 5;
				}else{
					price = state + 10;
				}
			}else if(zone1.equals("B")){
				if(zone2.equals("A")){
					price = state + 5;
				}else if(zone2.equals("C")){
					price = state + 5;
				}else{
					price = state;
				}
			}else{
				if(zone2.equals("A")){
					price = state + 10;
				}else if(zone2.equals("B")){
					price = state + 5;
				}else{
					price = state;
				}
			}
		
		return price;
	}
	
	public String getStationNameEN() {
		return dn;
	}
	
	@SuppressWarnings("static-access")
	public void setSumPrice(double sum) {
		this.sum = sum;
		//System.out.println("Price: " + sum);
	}
	
	public double getSumPrice() {
		//System.out.println("\nOK : " + sum);
		return sum;
	}

	public String getDesination() {
		return destination;
	}
}