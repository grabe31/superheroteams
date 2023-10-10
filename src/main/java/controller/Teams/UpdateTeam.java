package controller.Teams;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.helpers.TeamHelper;
import model.Team;

/**
 * Servlet implementation class UpdateTeam
 */
@WebServlet("/updateTeam")
public class UpdateTeam extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateTeam() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		TeamHelper helper = new TeamHelper();
				
				String oldName = request.getParameter("oldName");
				String name = request.getParameter("newName");
				String affiliation = request.getParameter("affiliation");
		
				Team teamToUpdate = helper.searchTeamByName(oldName);
				teamToUpdate.setName(name);
				teamToUpdate.setAffiliation(affiliation);
				helper.update(teamToUpdate);
				
				getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
				
	}
}