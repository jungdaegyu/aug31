package com.poseidon.web.controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.poseidon.web.jBoard;
import com.poseidon.web.repository.BoardRepository;

@Controller
public class BoardController {
	@Autowired
	private BoardRepository boardRepository;
	
	@GetMapping("/write")
	public String write() {
		return "write";
	}
	

	@PostMapping("/write")
	public String write(jBoard jBoard) {
		System.out.println(jBoard);
		//저장하기 save()
		jBoard.setMname("뽀로로");
		boardRepository.save(jBoard);
		
		return "redirect:/board";
	}
}
