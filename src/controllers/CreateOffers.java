package controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CreateOffers
 */
@WebServlet("/CreateOffers")
public class CreateOffers extends HttpServlet
{
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public CreateOffers() {
        // TODO Auto-generated constructor stub
    }
    
    public void init() throws ServletException
    {
    	super.init();
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
<<<<<<< HEAD
		System.out.println(request.getParameter("choix"));
=======
		//System.out.println(request.getParameter("choix"));
>>>>>>> 1f4f09236d6346d5d618e74e22de5590e479656d
	}
}
