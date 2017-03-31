package controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BoardDAO;
import model.Board;

public class BoardUpdateAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Board b = new Board();
		
		b.setNum(Integer.parseInt(request.getParameter("num")));
		b.setName(request.getParameter("name"));
		b.setPass(request.getParameter("pass"));
		b.setEmail(request.getParameter("email"));
		b.setTitle(request.getParameter("title"));
		b.setContent(request.getParameter("content"));
		
		BoardDAO dao = BoardDAO.getInstance();
		dao.updateBoard(b);
		
		new BoardListAction().execute(request, response);
	}

}