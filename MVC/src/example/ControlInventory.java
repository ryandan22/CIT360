package example;

import java.io.IOException;
import java.util.*;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

/**
 * Servlet implementation class ControlInventory
 */
@WebServlet("/ControlInventory")
public class ControlInventory extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private ModelInventory modelInventory;
	
	@Resource(name="jdbc/Inventory")
	private DataSource myPool;
	
	

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		
		try {
		
			modelInventory= new ModelInventory(myPool);
		
		}catch (Exception e) {
			
			throw new ServletException(e);
		}
	}



	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		List<Inventory> inventory; 
		
		try {
			
			inventory=modelInventory.getInventory();
			
			request.setAttribute("INVENTORYLIST", inventory);
			
			RequestDispatcher myDispatcher=request.getRequestDispatcher("InventoryList.jsp");
			
			myDispatcher.forward(request, response);
		
		}catch (Exception e) {
			
			e.printStackTrace();			
			
		}
		
		
	}

}