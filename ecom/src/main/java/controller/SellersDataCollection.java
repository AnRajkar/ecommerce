package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import model.Sellers;
import model.SellersDataModel;

/**
 * Servlet implementation class SellersDataCollection
 */
@WebServlet("/SellersDataCollection")
public class SellersDataCollection extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SellersDataCollection() {
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
		
		int SellerId=Integer.parseInt(request.getParameter("SellerId"));
		String Sellername=request.getParameter("SellerId");
		String Enterprisename=request.getParameter("Enterprisename");
		String Email=request.getParameter("Email");
		String Phno=request.getParameter("Phno");
		String Address=request.getParameter("Address");
		
		Sellers s=new Sellers();
		s.setSellerId(SellerId);
		s.setSellername(Sellername);
		s.setEnterprisename(Enterprisename);
		s.setEmail(Email);
		s.setPhno(Phno);
		s.setAddress(Address);
		
		
		SellersDataModel sr=new SellersDataModel();
		sr.InsertSellers(s);
		
		System.out.println(s.getSellerId());
		System.out.println(s.getSellername());
		System.out.println(s.getEnterprisename());
		System.out.println(s.getEmail());
		System.out.println(s.getPhno());
		System.out.println(s.getAddress());
		
		
	}

}
