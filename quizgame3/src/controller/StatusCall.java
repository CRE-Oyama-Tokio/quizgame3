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

		String playerName = (String)session.getAttribute("playerName");

		Player player = new Player();  //playerをインスタンス化
		Slime slime = new Slime();  //スライムをインスタンス化

		session.setAttribute("player", player);  //Playerクラスのインスタンスを格納
		session.setAttribute("slime", slime);  //slimeクラスのインスタンスを格納
		session.setAttribute("playerName",playerName);   //プレイヤーの名前を格納

		RequestDispatcher rd = request.getRequestDispatcher("BattleScreen.jsp");
		rd.forward(request, response);
	}

}
