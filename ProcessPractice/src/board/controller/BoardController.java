package board.controller;

import board.service.BoardService;

//	클래스 상호간 의존성이 있음(Controller, Service, Repository)

public class BoardController {
	
	private BoardService boardService;
	
	public BoardController() {
		boardService = new BoardService();
	}
	
	

}
