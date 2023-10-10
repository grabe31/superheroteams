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
 * Servlet implementation class UpdateHero
 */
@WebServlet("/updateHero")
public class UpdateHero extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UpdateHero() {
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
		HeroHelper helper = new HeroHelper();

		String oldName = request.getParameter("oldName");
		String commonName = request.getParameter("commonName");
		String heroName = request.getParameter("heroName");
		String power = request.getParameter("power");

		Hero heroToUpdate = helper.searchHeroByName(oldName);
		heroToUpdate.setCommonName(commonName);
		heroToUpdate.setHeroName(heroName);
		heroToUpdate.setPower(power);
		helper.update(heroToUpdate);

		getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
	}

}
