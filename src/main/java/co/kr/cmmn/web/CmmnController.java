package co.kr.cmmn.web;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
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
	
	//게시판 리스트
	@RequestMapping(value="/list.do")
	public ModelAndView list(){
		ModelAndView mv = new ModelAndView();
		List<HashMap<String, Object>> list = cmmnService.list();
		mv.addObject("result", list);
		mv.setViewName("main");
		return mv;
	}
	
	//게시판 리스트 jsonView를 통한 ajax통신
	@RequestMapping(value="/listAjax.do", method=RequestMethod.POST)
	public ModelAndView list1(@RequestParam HashMap<String, Object> param){
		ModelAndView jsonView = new ModelAndView("jsonView");
		param.put("id", 1);
		List<HashMap<String, Object>> list = cmmnService.list1(param);
		jsonView.addObject("resultList", list);
		return jsonView;
	}
	
	@RequestMapping(value="/add.do", method=RequestMethod.POST)
	public ModelAndView add(@RequestParam HashMap<String, Object> param){
		ModelAndView jsonView = new ModelAndView("jsonView");
		int result = cmmnService.add(param);
		jsonView.addObject("result", result);
		return jsonView;
	}
	
	@RequestMapping(value="/update.do", method=RequestMethod.POST)
	public ModelAndView update(@RequestParam HashMap<String, Object> param){
		ModelAndView jsonView = new ModelAndView("jsonView");
		int result = cmmnService.update(param);
		jsonView.addObject("result", result);
		return jsonView;
	}
	
	@RequestMapping(value="/delete.do", method=RequestMethod.POST)
	public ModelAndView delete(@RequestParam HashMap<String, Object> param){
		ModelAndView jsonView = new ModelAndView("jsonView");
		int result = cmmnService.delete(param);
		jsonView.addObject("result", result);
		return	jsonView;
	}
}
