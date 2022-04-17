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
 * Servlet implementation class StatusCall2
 */
@WebServlet("/StatusCall2")
public class StatusCall2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public StatusCall2() {
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
		int enemyHP = 0;

		if (playerHP <= 0) {
			RequestDispatcher rd = request.getRequestDispatcher("LoseScreen.jsp");
			rd.forward(request, response);
			return;
		}
		if (round == 1) {
			Slime enemy = (Slime) session.getAttribute("enemy");
			enemyHP = enemy.getHP();
			int cnt = enemy.getCnt();
			if (cnt == enemy.getCnt()) {
				cnt += 1;
				enemy.setCnt(cnt);
			}
			if (enemyHP > 0) {
				RequestDispatcher rd = request.getRequestDispatcher("BattleScreen.jsp");
				rd.forward(request, response);
				return;
			}
		} else if (round == 2) {
			KillerPanther enemy = (KillerPanther) session.getAttribute("enemy");
			enemyHP = enemy.getHP();
			int cnt = enemy.getCnt();
			if (cnt == enemy.getCnt()) {
				cnt += 1;
				enemy.setCnt(cnt);
			}
			if (enemyHP > 0) {
				RequestDispatcher rd = request.getRequestDispatcher("BattleScreen2.jsp");
				rd.forward(request, response);
				return;
			}
		} else if (round == 3) {
			Golem enemy = (Golem) session.getAttribute("enemy");
			enemyHP = enemy.getHP();
			int cnt = enemy.getCnt();
			if (cnt == enemy.getCnt()) {
				cnt += 1;
				enemy.setCnt(cnt);
			}
			if (enemyHP > 0) {
				RequestDispatcher rd = request.getRequestDispatcher("BattleScreen3.jsp");
				rd.forward(request, response);
				return;
			}
		} else if (round == 4) {
			DragonKing enemy = (DragonKing) session.getAttribute("enemy");
			enemyHP = enemy.getHP();
			int cnt = enemy.getCnt();
			if (cnt == enemy.getCnt()) {
				cnt += 1;
				enemy.setCnt(cnt);
			}
			if (enemyHP > 0) {
				RequestDispatcher rd = request.getRequestDispatcher("BattleScreen4.jsp");
				rd.forward(request, response);
				return;
			}
		}
		if (enemyHP <= 0) {
			if (round == 4) {
				RequestDispatcher rd = request.getRequestDispatcher("WinScreen.jsp");
				rd.forward(request, response);
				return;
			}
			round += 1;
			session.setAttribute("round", round);
			RequestDispatcher rd = request.getRequestDispatcher("LevelUp.java");
			rd.forward(request, response);
			return;
		}
	}
}
