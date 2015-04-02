package com.gl.dao;

import com.gl.bean.Dictionary;
import com.gl.db.DruidConnUtil;
import com.gl.db.JDBCTemplate;
import com.gl.mapper.DictionaryMapper;

public class DictionaryDAO {
	private static JDBCTemplate<Dictionary> util = new JDBCTemplate<Dictionary>();
	static {
		util.setDataSource(DruidConnUtil.getDataSource());
	}
	
//	public int create(Dictionary dictionary) {
//		StringBuffer buffer = new StringBuffer("INSERT INTO team_dictionary(id, fieldName, fieldCode, code, label) VALUES(?,?,?,?,?)");
//		Object[] args = {dictionary.getId(), dictionary.getFieldName(), dictionary.getFieldCode(), dictionary.getCode(), dictionary.getLabel()};
//		
//		return util.updateWithParams(buffer.toString(), args);
//	}
	
	public int update(String fieldCode, int value){
		String string = "UPDATE stu_graduate_dictionary SET `code` = ? WHERE fieldCode = ?";
		Object []args = { value, fieldCode};
		return util.updateWithParams(string, args);
	}
	public int reaedByFieldCode(String fieldCode){
		String sql = "SELECT fieldCode, code FROM stu_graduate_dictionary WHERE fieldCode = ?";
		Object []args = { fieldCode};
		return util.queryWithParams(sql, args, new DictionaryMapper()).getCode();
	}
}
