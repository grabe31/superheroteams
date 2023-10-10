package controller.Hero;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.helpers.HeroHelper;
import model.Hero;

/**
 * Servlet implementation class ShowHeroes
 */
@WebServlet("/showHeroes")
public class ShowHeroes extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ShowHeroes() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		HeroHelper helper = new HeroHelper();

		List<Hero> heroList = helper.showAllHeroes();

		request.setAttribute("allHeroes", heroList);

		String path = "/show.jsp";

		getServletContext().getRequestDispatcher(path).forward(request, response);
	}

}
