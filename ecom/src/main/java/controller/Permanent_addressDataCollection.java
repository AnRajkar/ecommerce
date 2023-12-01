package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import model.Permanent_address;
import model.Permanent_addressDataModel;

/**
 * Servlet implementation class Permanent_addressDataCollection
 */
@WebServlet("/Permanent_addressDataCollection")
public class Permanent_addressDataCollection extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Permanent_addressDataCollection() {
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
		
		int PermanentaddressId=Integer.parseInt(request.getParameter("PermanentaddressId"));
		int CustomerId=Integer.parseInt(request.getParameter("CustomerId"));
		String Line1=request.getParameter("Line1");
		String City=request.getParameter("City");
		String District=request.getParameter("District");
		String State=request.getParameter("State");
		String Pincode=request.getParameter("Pincode");
		String Landmark=request.getParameter("Landmark");
		
		Permanent_address p1=new Permanent_address();
		p1.setPermanentaddressId(PermanentaddressId);
		p1.setCustomerId(CustomerId);
		p1.setLine1(Line1);
		p1.setCity(City);
		p1.setDistrict(District);
		p1.setState(State);
		p1.setPincode(Pincode);
		p1.setLandmark(Landmark);
		
		
		
		
		Permanent_addressDataModel pa=new Permanent_addressDataModel();
		pa.InsertPermanent_address(p1);
		
		System.out.println(p1.getPermanentaddressId());
		System.out.println(p1.getCustomerId());
		System.out.println(p1.getLine1());
		System.out.println(p1.getCity());
		System.out.println(p1.getDistrict());
		System.out.println(p1.getState());
		System.out.println(p1.getPincode());
		System.out.println(p1.getLandmark());
		
	}

}
