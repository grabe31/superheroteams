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
 * Servlet implementation class AddHero
 */
@WebServlet("/addHero")
public class AddHero extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddHero() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		Hero h = new Hero();
		HeroHelper helper = new HeroHelper();
		h.setCommonName(request.getParameter("commonName"));
		h.setHeroName(request.getParameter("heroName"));
		h.setPower(request.getParameter("power"));
		h.getTeam().setName(request.getParameter("teamName"));
		helper.persist(h);
		getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
	}

}
