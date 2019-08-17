package com.gk.itpm.develop.happysalary.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gk.itpm.develop.happysalary.model.CalcLogic;
import com.gk.itpm.develop.happysalary.model.User;


/**
 * Servlet implementation class HappySalary
 */
@WebServlet("/HappySalary")
public class HappySalary extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public HappySalary() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		RequestDispatcher dispatcher =
				request.getRequestDispatcher("/WEB-INF/jsp/input.jsp");
		dispatcher.forward(request, response);

	}

	/**
	 *
	 * index.jspからポストされた場合以下のメソッドを実行する。
	 *
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		String engineerRank = request.getParameter("engineerRank");
		String _cost = request.getParameter("cost");

		boolean engineerRankIsOk = CalcLogic.validateEngingeerRank(engineerRank);
		boolean costIsOk = CalcLogic.validateCost(_cost);

		//エンジニアランクが不正な場合
		if(!engineerRankIsOk) {
			String errMsgEngineerRank = "エンジニアランクの入力値が不正だよ！";

			request.setAttribute("errMsgEngineerRank", errMsgEngineerRank);
		}

		//単金が不正な場合
		if(!costIsOk) {
			String errMsgCost = "単金が不正だよ！";

			request.setAttribute("errMsgCost", errMsgCost);
		}

		//両方OKならそのまま処理
		if(engineerRankIsOk && costIsOk) {
			int cost = Integer.parseInt(_cost);
			int salary = CalcLogic.calcuSalary(engineerRank, cost);

			User user = new User(engineerRank, cost, salary);

			request.setAttribute("user", user);

		}

		RequestDispatcher dispatcher =
				request.getRequestDispatcher("/WEB-INF/jsp/result.jsp");
		dispatcher.forward(request, response);

	}

}
