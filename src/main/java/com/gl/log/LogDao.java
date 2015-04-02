package com.gl.log;

import com.gl.db.DruidConnUtil;
import com.gl.db.JDBCTemplate;
import com.gl.page.Page;

public class LogDao {
	private static JDBCTemplate<Log> jdbc = new JDBCTemplate<Log>();
	static {
		jdbc.setDataSource(DruidConnUtil.getDataSource());
	}
	
	public static void read4Page(Page<Log> page) {
		String sql = "SELECT logId, createDate, thread, `level`, class, message FROM stu_graduate_log4j";
		
		jdbc.query4Page(sql, new LogMapper(), page, 0);
	}
}
