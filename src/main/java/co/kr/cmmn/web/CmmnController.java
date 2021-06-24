package co.kr.cmmn.web;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import co.kr.cmmn.service.CmmnService;

@Controller
public class CmmnController {
	
	@Resource(name="cmmnService")
	private CmmnService cmmnService;

	@RequestMapping(value="/main.do")
	public String main(){
		return "main";
	}
	
	@RequestMapping(value="/listPage.do")
	public String listPage(){
		return "list1";
	}

	@RequestMapping(value="/addPage.do")
	public String addPage(){
		return "add";
	}
	
	@RequestMapping(value="/list.do")
	public ModelAndView list(){
		ModelAndView mv = new ModelAndView();
		List<HashMap<String, Object>> list = cmmnService.list();
		mv.addObject("result", list);
		mv.setViewName("main");
		return mv;
	}
	
	//게시판 목록 조회
	@RequestMapping(value="/listAjax.do", method=RequestMethod.POST)
	public ModelAndView list1(){
		ModelAndView jsonView = new ModelAndView("jsonView");
		List<HashMap<String, Object>> result = cmmnService.list1();
		jsonView.addObject("resultList", result);
		return jsonView;
	}
	
	@RequestMapping(value="/listInfoPage.do")
	public String listInfo(@RequestParam int id, Model model){
		HashMap<String, Object> result = cmmnService.listInfo(id);
		model.addAttribute("result", result);
		return "/listInfo";
	}
	
	//게시글 추가
	@RequestMapping(value="/add.do", method=RequestMethod.POST)
	public ModelAndView add(@RequestParam HashMap<String, Object> param){
		ModelAndView jsonView = new ModelAndView("jsonView");
		int result = cmmnService.add(param);
		jsonView.addObject("result", result);
		return jsonView;
	}
	
	//게시판 글 수정
	@RequestMapping(value="/update.do", method=RequestMethod.POST)
	public ModelAndView update(@RequestParam HashMap<String, Object> param){
		ModelAndView jsonView = new ModelAndView("jsonView");
		int result = cmmnService.update(param);
		jsonView.addObject("result", result);
		return jsonView;
	}
	
	//게시판 글 삭제
	@RequestMapping(value="/delete.do", method=RequestMethod.POST)
	public ModelAndView delete(@RequestParam HashMap<String, Object> param){
		ModelAndView jsonView = new ModelAndView("jsonView");
		int result = cmmnService.delete(param);
		jsonView.addObject("result", result);
		return	jsonView;
	}
}
