package controller.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BoardDAO;
import model.Board;

public class BoardCheckPassAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = null;

		String num = request.getParameter("num");
		String pass = request.getParameter("pass");

		BoardDAO dao = BoardDAO.getInstance();
		Board b = dao.selectOneBoardByNum(num);

		if (b.getPass().equals(pass)) {
			url = "checkSuccess.jsp";
		} else {
			url = "boardCheckPass.jsp";
			request.setAttribute("message", "비밀번호가 틀렸습니다.");
		}

		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}