package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Cart;
import model.CartDataModel;

/**
 * Servlet implementation class CartDataCollection
 */
@WebServlet("/CartDataCollection")
public class CartDataCollection extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public CartDataCollection() {
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
		
        int CustomerId=Integer.parseInt(request.getParameter("CustomerId"));
		int ProductId=Integer.parseInt(request.getParameter("ProductId"));
		Cart c=new Cart();
		c.setCustomerId(CustomerId);
		c.setProductId(ProductId);
		
		CartDataModel ct=new CartDataModel();
		ct.InsertCart(c);
		
		System.out.println(c.getCustomerId());
		System.out.println(c.getProductId());
		}
		
	}


