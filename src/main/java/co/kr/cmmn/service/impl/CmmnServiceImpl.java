package co.kr.cmmn.service.impl;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import co.kr.cmmn.service.CmmnService;

@Service("cmmnService")
public class CmmnServiceImpl implements CmmnService{
	
	@Resource(name="cmmnMapper")
	private CmmnMapper cmmnMapper;

	@Override
	public List<HashMap<String, Object>> list() {
		// TODO Auto-generated method stub
		return cmmnMapper.list();
	}

	@Override
	public List<HashMap<String, Object>> list1(HashMap<String, Object> param) {
		// TODO Auto-generated method stub
		return cmmnMapper.list1(param);
	}
}
