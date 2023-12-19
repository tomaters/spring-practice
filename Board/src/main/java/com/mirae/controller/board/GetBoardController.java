package com.mirae.controller.board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mirae.board.BoardVO;
import com.mirae.board.implement.BoardDAO;
import com.mirae.controller.Controller;

public class GetBoardController implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("Search function");

		// 1. get article number
		String sequence = request.getParameter("sequence");

		// 2. manage DB
		BoardVO vo = new BoardVO();
		vo.setSequence(Integer.parseInt(sequence));

		BoardDAO boardDAO = new BoardDAO();
		BoardVO board = boardDAO.getBoard(vo);

		// 3. get response view
		HttpSession session = request.getSession();
		session.setAttribute("board", board);
		return "getBoard";
	}

}