package com.gl.log;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.gl.mapper.DataMapper;

public class LogMapper implements DataMapper<Log> {

	@Override
	public Log mapRecord(ResultSet rs, int num) {
		Log log = null;
		
		try {
			log = new Log();
			
			log.setLogId(rs.getInt("logId"));
			log.setClazz(rs.getString("class"));
			log.setCreateDate(rs.getDate("createDate"));
			log.setLevel(rs.getString("level"));
			log.setMessage(rs.getString("message"));
			log.setThread(rs.getString("thread"));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return log;
	}

}
