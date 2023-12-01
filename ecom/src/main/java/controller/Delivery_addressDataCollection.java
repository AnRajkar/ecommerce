package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import model.Delivery_address;
import model.Delivery_addressDataModel;

/**
 * Servlet implementation class Delivery_addressDataCollection
 */
@WebServlet("/Delivery_addressDataCollection")
public class Delivery_addressDataCollection extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Delivery_addressDataCollection() {
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
		
		int DeliveryaddressId=Integer.parseInt(request.getParameter("DeliveryaddressId"));
		int CustomerId=Integer.parseInt(request.getParameter("CustomerId"));
		String Line1=request.getParameter("Line1");
		String City=request.getParameter("City");
		String District=request.getParameter("District");
		String State=request.getParameter("State");
		String Pincode=request.getParameter("Pincode");
		String Landmark=request.getParameter("Landmark");
		String Phno=request.getParameter("Phno");
		
		Delivery_address d=new Delivery_address();
		d.setDeliveryaddressId(DeliveryaddressId);
		d.setCustomerId(CustomerId);
		d.setLine1(Line1);
		d.setCity(City);
		d.setDistrict(District);
		d.setState(State);
		d.setPincode(Pincode);
		d.setLandmark(Landmark);
		d.setPhno(Phno);
		
		
		
		Delivery_addressDataModel da=new Delivery_addressDataModel();
		da.InsertDelivery_address(d);
		
		System.out.println(d.getDeliveryaddressId());
		System.out.println(d.getCustomerId());
		System.out.println(d.getLine1());
		System.out.println(d.getCity());
		System.out.println(d.getDistrict());
		System.out.println(d.getState());
		System.out.println(d.getPincode());
		System.out.println(d.getLandmark());
		System.out.println(d.getPhno());
		
	}

}
