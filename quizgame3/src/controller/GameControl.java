package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class GameControl
 */
@WebServlet("/GameControl")
public class GameControl extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public GameControl() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		HttpSession session = request.getSession();
		int playerHP = (Integer)session.getAttribute("playerHP");
		int playerAP = (Integer)session.getAttribute("playerAP");
		int enemyHP = (Integer)session.getAttribute("enemyHP");
		int enemyAP = (Integer)session.getAttribute("enemyAP");
		int ansNum = (Integer)session.getAttribute("ansNum");
		//int choice = (Integer)request.getParameter("1");
		if (choice == ansNum) {
			enemyHP -= playerAP;
			session.setAttribute("enemyHP", enemyHP);
		} else {
			playerHP -= enemyAP;
			session.setAttribute("playerHP", playerHP);
		}

		RequestDispatcher rd = request.getRequestDispatcher("BattleScreen2.jsp");
		rd.forward(request, response);
	}

}
