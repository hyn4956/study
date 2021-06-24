package co.kr.cmmn.service.impl;

import java.util.HashMap;
import java.util.List;

import egovframework.rte.psl.dataaccess.mapper.Mapper;

@Mapper("cmmnMapper")
public interface CmmnMapper {
	public List<HashMap<String, Object>> list();
	
	public List<HashMap<String, Object>> list1();
	
	public HashMap<String, Object> listInfo(int id);
	
	public int add(HashMap<String, Object> param);
	
	public int update(HashMap<String, Object> param);
	
	public int delete(HashMap<String, Object> param);
}
