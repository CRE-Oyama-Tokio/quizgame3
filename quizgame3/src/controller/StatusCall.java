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
 * Servlet implementation class StatusCall
 */
@WebServlet("/StatusCall")
public class StatusCall extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public StatusCall() {
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

		String playerName = (String) session.getAttribute("playerName");
		session.setAttribute("playerName", playerName); //プレイヤーの名前を格納
		if (round == 1) {
			Player player = new Player(); //playerをインスタンス化
			session.setAttribute("player", player); //Playerクラスのインスタンスを格納
		}

		if (round == 1) {
			Slime slime = new Slime(); //スライムをインスタンス化
			session.setAttribute("enemy", slime); //slimeクラスのインスタンスを格納
			RequestDispatcher rd = request.getRequestDispatcher("BattleScreen.jsp");
			rd.forward(request, response);
			return;
		} else if (round == 2) {
			KillerPanther killerPanther = new KillerPanther(); //KillerPantherをインスタンス化
			session.setAttribute("enemy", killerPanther); //KillerPantherクラスのインスタンスを格納
			RequestDispatcher rd = request.getRequestDispatcher("BattleScreen2.jsp");
			rd.forward(request, response);
			return;
		} else if (round == 3) {
			Golem golem = new Golem(); //Golemをインスタンス化
			session.setAttribute("enemy", golem); //Golemクラスのインスタンスを格納
			RequestDispatcher rd = request.getRequestDispatcher("BattleScreen3.jsp");
			rd.forward(request, response);
			return;
		} else if (round == 4) {
			DragonKing dragonKing = new DragonKing(); //DragonKingをインスタンス化
			session.setAttribute("enemy", dragonKing); //DragonKingクラスのインスタンスを格納
			RequestDispatcher rd = request.getRequestDispatcher("BattleScreen4.jsp");
			rd.forward(request, response);
			return;
		}

	}

}
