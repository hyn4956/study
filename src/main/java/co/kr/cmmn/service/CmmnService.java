package co.kr.cmmn.service;

import java.util.HashMap;
import java.util.List;

public interface CmmnService {
	public List<HashMap<String, Object>> list();
	
	public List<HashMap<String, Object>> list1(HashMap<String, Object> param);
}
