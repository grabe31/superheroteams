package controller.Hero;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.helpers.HeroHelper;
import model.Hero;

/**
 * Servlet implementation class DeleteHero
 */
@WebServlet("/deleteHero")
public class DeleteHero extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DeleteHero() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HeroHelper helper = new HeroHelper();
		String name = request.getParameter("name");
		Hero deleteable = helper.searchHeroByName(name);
		helper.delete(deleteable);
		getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
	}

}
