package model;
import java.sql.*;

public class CartDataModel {
	static final String jdbc_driver="com.mysql.jdbc.Driver";
	static final String db_url="jdbc:mysql://localhost:3306/ecom";
	static final String user="root";
	static final String pass="";
	
		public void InsertCart(Cart c){
			
			Connection conn= null;
			Statement stmt= null;
			
			try{
				Class.forName("com.mysql.jdbc.Driver");
				conn= DriverManager.getConnection(db_url, user, pass);
				stmt= conn.createStatement();
			    String sql= "insert into cart values('"+c.getCustomerId()+"','"+c.getProductId()+"')";
				stmt.executeUpdate(sql);
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
