package model;
import java.sql.*;

public class CustomersDataModel {
	static final String jdbc_driver="com.mysql.jdbc.Driver";
	static final String db_url="jdbc:mysql://localhost:3306/ecommerce";
	static final String user="root";
	static final String pass="";
	
		public void InsertCustomers(Customers c1) {
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
			     String sql= "insert into customers values('"+c1.getFirstname()+"','"+c1.getLastname()+
			    "','"+c1.getPhno()+"','"+c1.getEmail()+"','"+c1.getCustomerId()+"','"+c1.getPwd()+"','"+c1.getDob()+"','"+c1.getGender()+"')";
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
