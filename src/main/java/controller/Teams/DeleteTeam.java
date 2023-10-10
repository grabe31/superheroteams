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
 * Servlet implementation class DeleteTeam
 */
@WebServlet("/deleteTeam")
public class DeleteTeam extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteTeam() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		TeamHelper helper = new TeamHelper();
		String name = request.getParameter("name");
		Team deleteable = helper.searchTeamByName(name);
		helper.delete(deleteable);
		getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);	}

}
