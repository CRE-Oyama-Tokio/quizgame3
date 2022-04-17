package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.DragonKing;
import model.Golem;
import model.KillerPanther;
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
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		HttpSession session = request.getSession();
		int round = (Integer) session.getAttribute("round");
		Player player = (Player) session.getAttribute("player");
		int playerHP = player.getHP();
		int playerAP = player.getAP();
		int enemyHP = 0;
		int enemyAP = 0;
		int ansNum = 0;
		if (round == 1) {
			Slime slime = (Slime) session.getAttribute("enemy");
			enemyHP = slime.getHP();
			enemyAP = slime.getAP();
			ansNum = slime.getAnsNum();
			String choice = (String) request.getParameter("choice"); //答えが合っているか確認
			int chose = Integer.parseInt(choice);
			if (chose == ansNum) {
				enemyHP -= playerAP;
				slime.setHP(enemyHP);
				RequestDispatcher rd = request.getRequestDispatcher("DamageScreen.jsp");
				rd.forward(request, response);
				return;
			} else {
				playerHP -= enemyAP;
				player.setHP(playerHP);
				RequestDispatcher rd = request.getRequestDispatcher("DamageScreen5.jsp");
				rd.forward(request, response);
				return;
			}
		} else if (round == 2) {
			KillerPanther killerPanther = (KillerPanther) session.getAttribute("enemy");
			enemyHP = killerPanther.getHP();
			enemyAP = killerPanther.getAP();
			ansNum = killerPanther.getAnsNum();
			String choice = (String) request.getParameter("choice"); //答えが合っているか確認
			int chose = Integer.parseInt(choice);
			if (chose == ansNum) {
				enemyHP -= playerAP;
				killerPanther.setHP(enemyHP);
				RequestDispatcher rd = request.getRequestDispatcher("DamageScreen2.jsp");
				rd.forward(request, response);
				return;
			} else {
				playerHP -= enemyAP;
				player.setHP(playerHP);
				RequestDispatcher rd = request.getRequestDispatcher("DamageScreen6.jsp");
				rd.forward(request, response);
				return;
			}
		} else if (round == 3) {
			Golem golem = (Golem) session.getAttribute("enemy");
			enemyHP = golem.getHP();
			enemyAP = golem.getAP();
			ansNum = golem.getAnsNum();
			String choice = (String) request.getParameter("choice"); //答えが合っているか確認
			int chose = Integer.parseInt(choice);
			if (chose == ansNum) {
				enemyHP -= playerAP;
				golem.setHP(enemyHP);
				RequestDispatcher rd = request.getRequestDispatcher("DamageScreen3.jsp");
				rd.forward(request, response);
				return;
			} else {
				playerHP -= enemyAP;
				player.setHP(playerHP);
				RequestDispatcher rd = request.getRequestDispatcher("DamageScreen7.jsp");
				rd.forward(request, response);
				return;
			}
		} else if (round == 4) {
			DragonKing dragonKing = (DragonKing) session.getAttribute("enemy");
			enemyHP = dragonKing.getHP();
			enemyAP = dragonKing.getAP();
			ansNum = dragonKing.getAnsNum();
			String choice = (String) request.getParameter("choice"); //答えが合っているか確認
			int chose = Integer.parseInt(choice);
			if (chose == ansNum) {
				enemyHP -= playerAP;
				dragonKing.setHP(enemyHP);
				RequestDispatcher rd = request.getRequestDispatcher("DamageScreen4.jsp");
				rd.forward(request, response);
				return;
			} else {
				playerHP -= enemyAP;
				player.setHP(playerHP);
				RequestDispatcher rd = request.getRequestDispatcher("DamageScreen8.jsp");
				rd.forward(request, response);
				return;
			}
		}

	}
}
