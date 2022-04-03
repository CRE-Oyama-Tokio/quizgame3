package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Slime;

/**
 * Servlet implementation class StatusCall2
 */
@WebServlet("/StatusCall2.java")
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
		Slime slime = (Slime)session.getAttribute("slime");
		int cnt = slime.getCnt();
		if(cnt == slime.getCnt()) {
			cnt +=1;
			slime.setCnt(cnt);
		}




		//session.setAttribute("player", player);  //Playerクラスのインスタンスを格納
		session.setAttribute("slime", slime);  //slimeクラスのインスタンスを格納
		session.setAttribute("playerName",playerName);   //プレイヤーの名前を格納

		try {
            Thread.sleep(3 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		RequestDispatcher rd = request.getRequestDispatcher("BattleScreen.jsp");
		rd.forward(request, response);
	}

}
