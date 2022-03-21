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
		int playerHP = player.getHP();  //プレイヤーのHPを取得
		int playerAP = player.getAP();  //プレイヤーの攻撃力を取得

		int cnt = 1;
		Slime slime = new Slime();  //スライムをインスタンス化
		String enemyName = slime.getEnemyName();  //スライムの名前を取得
		int enemyHP = slime.getHP();  //スライムのHPを取得
		int enemyAP = slime.getAP();  //スライムの攻撃力を取得
		String question = slime.quiz(cnt);//クイズを取得
		String[] ans = slime.getAns1();  //クイズの答えを取得

		session.setAttribute("playerName",playerName);
		session.setAttribute("playerHP",playerHP);  //プレイヤーのHPを格納
		session.setAttribute("playerAP", playerAP);  //プレイヤーの攻撃力を格納
		session.setAttribute("enemyName", enemyName);  //敵の名前を格納
		session.setAttribute("enemyHP", enemyHP );  //敵のHPを格納
		session.setAttribute("enemyAP", enemyAP);  //敵の攻撃力を格納
		session.setAttribute("question", question);  //問題を格納
		session.setAttribute("ans", ans);	//答えを格納

		RequestDispatcher rd = request.getRequestDispatcher("BattleScreen.jsp");
		rd.forward(request, response);
	}

}
