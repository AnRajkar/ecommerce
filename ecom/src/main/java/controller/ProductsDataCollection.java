package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import model.Products;
import model.ProductsDataModel;

/**
 * Servlet implementation class ProductsDataCollection
 */
@WebServlet("/ProductsDataCollection")
public class ProductsDataCollection extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductsDataCollection() {
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
		
		int ProductId=Integer.parseInt(request.getParameter("ProductId"));
		String Productname=request.getParameter("Productname");
		int Productprice=Integer.parseInt(request.getParameter("Productprice"));
		int Productquantity=Integer.parseInt(request.getParameter("Productquantity"));
		String Productdetails=request.getParameter("Productdetails");
		String Productimage=request.getParameter("Productimage");
		int SellerId=Integer.parseInt(request.getParameter("SellerId"));
		
		Products p2=new Products();
		p2.setProductId(ProductId);
		p2.setProductname(Productname);
		p2.setProductprice(Productprice);
		p2.setProductquantity(Productquantity);
		p2.setProductdetails(Productdetails);
		p2.setProductimage(Productimage);
		p2.setSellerId(SellerId);
		
		
		
		ProductsDataModel pr=new ProductsDataModel();
		pr.InsertProducts(p2);
		
		System.out.println(p2.getProductId());
		System.out.println(p2.getProductname());
		System.out.println(p2.getProductprice());
		System.out.println(p2.getProductquantity());
		System.out.println(p2.getProductdetails());
		System.out.println(p2.getProductimage());
		System.out.println(p2.getSellerId());
		
		
	}

}
