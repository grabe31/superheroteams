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
 * Servlet implementation class AddTeam
 */
@WebServlet("/addTeam")
public class AddTeam extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddTeam() {
        super();
        // TODO Auto-generated constructor stub
    }

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Team t = new Team();
		TeamHelper helper = new TeamHelper();
		t.setName(request.getParameter("name"));
		t.setAffiliation(request.getParameter("affiliation"));
		helper.persist(t);
		getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
	}

}
