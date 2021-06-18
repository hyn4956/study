package co.kr.cmmn.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
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
	
	//게시판 리스트
	@RequestMapping(value="/list.do")
	public ModelAndView list(){
		ModelAndView mv = new ModelAndView();
		mv.addObject("result", cmmnService.list());
		mv.setViewName("main");
		return mv;
	}
}
