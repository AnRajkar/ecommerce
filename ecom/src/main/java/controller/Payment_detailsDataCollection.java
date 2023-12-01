package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import model.Payment_details;
import model.Payment_detailsDataModel;

/**
 * Servlet implementation class Payment_detailsDataCollection
 */
@WebServlet("/Payment_detailsDataCollection")
public class Payment_detailsDataCollection extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Payment_detailsDataCollection() {
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
		
		int PaymentdetailsId=Integer.parseInt(request.getParameter("PaymentdetailsId"));
		int CustomerId=Integer.parseInt(request.getParameter("CustomerId"));
		String Cardnumber=request.getParameter("Cardnumber");
		String Cardtype=request.getParameter("Cardtype");
		String Expirydate=request.getParameter("Expirydate");
		String Cardholdername=request.getParameter("Cardholdername");
		String UpiId=request.getParameter("UpiId");
		
		
		Payment_details p=new Payment_details();
		p.setPaymentdetailsId(PaymentdetailsId);
		p.setCustomerId(CustomerId);
		p.setCardnumber(Cardnumber);
		p.setCardtype(Cardtype);
		p.setExpirydate(Expirydate);
		p.setCardholdername(Cardholdername);
		p.setUpiId(UpiId);
		
		
		
		Payment_detailsDataModel pd=new Payment_detailsDataModel();
		pd.InsertPayment_details(p);
		
		System.out.println(p.getPaymentdetailsId());
		System.out.println(p.getCustomerId());
		System.out.println(p.getCardnumber());
		System.out.println(p.getCardtype());
		System.out.println(p.getExpirydate());
		System.out.println(p.getCardholdername());
		System.out.println(p.getUpiId());
		
		
	}

}
