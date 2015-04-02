package com.gl.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.gl.bean.Dictionary;

public class DictionaryMapper implements DataMapper<Dictionary> {

	@Override
	public Dictionary mapRecord(ResultSet rs, int num) {
		Dictionary dict = new Dictionary();
		try {
			dict.setFieldCode(rs.getString("fieldCode"));
			dict.setCode(rs.getInt("code"));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dict;
	}

}
