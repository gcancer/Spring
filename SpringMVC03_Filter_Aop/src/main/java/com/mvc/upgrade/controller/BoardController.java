package com.mvc.upgrade.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mvc.upgrade.model.biz.BoardBiz;
import com.mvc.upgrade.model.dto.BoardDto;

@Controller
public class BoardController {

	
	@Autowired
	private BoardBiz boardBiz;
	
	
	@RequestMapping(value = "/list.do")
	public String selectList(Model model) {
		model.addAttribute("list", boardBiz.selectList());
		return "mvclist";
	}
	
	@RequestMapping(value ="/detail.do")
	public String selectOne(Model model, int myno) { // int앞에 @RequestParam("myno") 생략
		System.out.println("[selectOne.do]");
		
		model.addAttribute("dto", boardBiz.selectOne(myno));
		return "mvcdetail";
	}
	
	@RequestMapping(value = "/insert.do")
	public String insertForm() {
		System.out.println("[insert.do]");
		
		return "mvcinsert";
	}
	
	@RequestMapping(value = "/insertres.do")
	public String insert(Model model, BoardDto dto) { // BoardDto dto -> command 객체
		
		System.out.println("[insertres.do]");
		
		int res = boardBiz.insert(dto);
		if(res > 0) {
			model.addAttribute("list", boardBiz.selectList());
			return "mvclist";
		}else {
			return "redirect:insert.do?myno="+dto.getMyno();
		}
		
	}
	
	@RequestMapping("/delete.do")
	public String delete(Model model, int myno) {
		System.out.println("[delete.do]");
		
		int res = boardBiz.delete(myno);
		if(res > 0) {
			model.addAttribute("list", boardBiz.selectList());
			return "redirect:list.do";
		}else {
			return "redirect:detail.do?myno="+myno;
		}
	}
	
	@RequestMapping("/update.do")
	public String updateForm(Model model, int myno) {
		System.out.println("[update.do]");
		
		BoardDto dto = boardBiz.selectOne(myno);
		model.addAttribute("dto", dto);	
		
		return "mvcupdate";
	}
	
	@RequestMapping(value = "/updateres.do", method = RequestMethod.POST)
	public String updateRes(Model model, BoardDto dto) {
		System.out.println("[updateres.do]");
		
		int res = boardBiz.update(dto);
		if(res > 0) {
			return "redirect:detail.do?myno=" + dto.getMyno();
		}
		return "redirect:update.do?myno="+dto.getMyno();
	}
}
