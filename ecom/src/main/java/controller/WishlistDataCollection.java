package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Wishlist;
import model.WishlistDataModel;

/**
 * Servlet implementation class WishlistDataCollection
 */
@WebServlet("/WishlistDataCollection")
public class WishlistDataCollection extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WishlistDataCollection() {
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
		
		int CustomerId=Integer.parseInt(request.getParameter("CustomerId"));
		int ProductId=Integer.parseInt(request.getParameter("ProductId"));
		
		
		Wishlist w=new Wishlist();
		w.setCustomerId(CustomerId);
		w.setProductId(ProductId);
		
		
		WishlistDataModel wl=new WishlistDataModel();
		wl.InsertWishlist(w);
		
		System.out.println(w.getCustomerId());
		System.out.println(w.getProductId());
		
		
		
	}

}
