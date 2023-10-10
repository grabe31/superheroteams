package controller.Teams;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.helpers.TeamHelper;
import model.Team;

/**
 * Servlet implementation class ShowTeam
 */
@WebServlet("/showTeam")
public class ShowTeam extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ShowTeam() {
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
		TeamHelper helper = new TeamHelper();

		List<Team> teamList = helper.showAllTeams();

		request.setAttribute("allTeams", teamList);

		String path = "/showTeams.jsp";

		getServletContext().getRequestDispatcher(path).forward(request, response);
	}

}
