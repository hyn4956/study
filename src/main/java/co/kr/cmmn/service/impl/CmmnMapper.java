package co.kr.cmmn.service.impl;

import java.util.HashMap;
import java.util.List;

import egovframework.rte.psl.dataaccess.mapper.Mapper;

@Mapper("cmmnMapper")
public interface CmmnMapper {
	public List<HashMap<String, Object>> list();
}
