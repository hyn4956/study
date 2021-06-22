package co.kr.cmmn.service;

import java.util.HashMap;
import java.util.List;

public interface CmmnService {
	public List<HashMap<String, Object>> list();
	
	public List<HashMap<String, Object>> list1();
	
	public Integer add(HashMap<String, Object> param);
	
	public Integer update(HashMap<String, Object> param);
	
	public Integer delete(HashMap<String, Object> param);
}
