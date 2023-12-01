package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import model.Orders;
import model.OrdersDataModel;

/**
 * Servlet implementation class OrdersDataCollection
 */
@WebServlet("/OrdersDataCollection")
public class OrdersDataCollection extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OrdersDataCollection() {
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
		
		int OrderId=Integer.parseInt(request.getParameter("OrderId"));
		int CustomerId=Integer.parseInt(request.getParameter("CustomerId"));
		int ProductId=Integer.parseInt(request.getParameter("ProductId"));
		int Quantity=Integer.parseInt(request.getParameter("Quantity"));
		String Orderdate=request.getParameter("Orderdate");
		String Deliverydate=request.getParameter("Deliverydate");
		int DeliveryaddressId=Integer.parseInt(request.getParameter("DeliveryaddressId"));
		String Review=request.getParameter("Review");
		
		Orders o=new Orders();
		o.setOrderId(OrderId);
		o.setCustomerId(CustomerId);
		o.setProductId(ProductId);
		o.setQuantity(Quantity);
		o.setOrderdate(Orderdate);
		o.setDeliverydate(Deliverydate);
		o.setDeliveryaddressId(DeliveryaddressId);
		o.setReview(Review);
		
		
		
		OrdersDataModel or=new OrdersDataModel();
		or.InsertOrders(o);
		
		System.out.println(o.getOrderId());
		System.out.println(o.getCustomerId());
		System.out.println(o.getProductId());
		System.out.println(o.getQuantity());
		System.out.println(o.getOrderdate());
		System.out.println(o.getDeliverydate());
		System.out.println(o.getDeliveryaddressId());
		System.out.println(o.getReview());
		
	}

}
