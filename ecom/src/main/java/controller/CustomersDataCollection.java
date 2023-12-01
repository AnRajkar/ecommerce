package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Customers;
import model.CustomersDataModel;

/**
 * Servlet implementation class CustomersDataCollection
 */
@WebServlet("/CustomersDataCollection")
public class CustomersDataCollection extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomersDataCollection() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		String Firstname=request.getParameter("Firstname");
		String Lastname=request.getParameter("Lastname");
		String Phno=request.getParameter("Phno");
		String Email=request.getParameter("Email");
		int CustomerId=Integer.parseInt(request.getParameter("CustomerId"));
		String Pwd=request.getParameter("Pwd");
		String Dob=request.getParameter("Dob");
		String Gender=request.getParameter("Gender");
		
		Customers c1=new Customers();
		c1.setFirstname(Firstname);
		c1.setLastname(Lastname);
		c1.setPhno(Phno);
		c1.setEmail(Email);
		c1.setCustomerId(CustomerId);
		c1.setPwd(Pwd);
		c1.setDob(Dob);
		c1.setGender(Gender);
		
		
		
		CustomersDataModel cu=new CustomersDataModel();
		cu.InsertCustomers(c1);
		
		System.out.println(c1.getFirstname());
		System.out.println(c1.getLastname());
		System.out.println(c1.getPhno());
		System.out.println(c1.getEmail());
		System.out.println(c1.getCustomerId());
		System.out.println(c1.getPwd());
		System.out.println(c1.getDob());
		System.out.println(c1.getGender());
		
	}

}
