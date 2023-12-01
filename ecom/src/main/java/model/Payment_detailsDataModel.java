package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Payment_detailsDataModel {

	static final String jdbc_driver="com.mysql.jdbc.Driver";
	static final String db_url="jdbc:mysql://localhost:3306/ecom";
	static final String user="root";
	static final String pass="";
	
		public void InsertPayment_details(Payment_details p) {
			Connection conn= null;
			Statement stmt= null;
			//Statement st = null;
			
			try{
				Class.forName("com.mysql.jdbc.Driver");
				conn= DriverManager.getConnection(db_url, user, pass);
				stmt= conn.createStatement();
	            /*  st= conn.createStatement(); 
	            String sql1= "select max(slno) from patient";
	            ResultSet rs= st.executeQuery(sql1);

	            while(rs.next()){
	            	
	            
			    sl= rs.getInt("max(slno)");
			    sl++;
			    
	            }
	            */
			     String sql= "insert into payment_details values('"+p.getPaymentdetailsId()+"','"+p.getCustomerId()+"','"+p.getCardnumber()+
			    "','"+p.getCardtype()+"','"+p.getExpirydate()+"','"+p.getCardholdername()+"','"+p.getUpiId()+"')";
				stmt.executeUpdate(sql);
				//rs.close();
				//st.close();
				stmt.close();
				conn.close();
				
				}
			catch(SQLException se){
				se.printStackTrace();
			}
			catch(Exception e){
				e.printStackTrace();
			}
			finally{

				}
		}
	}

