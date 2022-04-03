package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Player;
import model.Slime;

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
		Player player = (Player)session.getAttribute("player");
		Slime slime = (Slime)session.getAttribute("slime");
		int playerHP = player.getHP();
		int playerAP = player.getAP();
		int enemyHP = slime.getHP();
		int enemyAP = slime.getAP();
		String ansNum = slime.getAnsNum();

		String choice = (String)request.getParameter("choice");  //答えが合っているか間違っているか確認
		if (choice == ansNum) {
			enemyHP -= playerAP;
			slime.setHP(enemyHP);
		} else {
			playerHP -= enemyAP;
			player.setHP(playerHP);
		}

		RequestDispatcher rd = request.getRequestDispatcher("BattleScreen2.jsp");
		rd.forward(request, response);
	}

}
