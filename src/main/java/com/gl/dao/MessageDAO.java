package com.gl.dao;

import java.util.ArrayList;
import java.util.List;



import com.gl.bean.Message;
import com.gl.db.DruidConnUtil;
import com.gl.db.JDBCTemplate;
import com.gl.mapper.MessageMapper;

public class MessageDAO {
	private static JDBCTemplate<Message> util = new JDBCTemplate<Message>();
	static {
		util.setDataSource(DruidConnUtil.getDataSource());
	}
	
	public int updateAll(Message msg1, Message msg2, Message msg3){
		String sql = "UPDATE stu_graduate_message SET msgTitle = ?, msgContent = ?, msgUrl = ?, msgShow=? WHERE msgTag = ?";
		Object []args1 = { msg1.getMsgTitle(), msg1.getMsgContent(), msg1.getMsgUrl(), msg1.isMsgShow(), 1 };
		Object []args2 = { msg2.getMsgTitle(), msg2.getMsgContent(), msg2.getMsgUrl(), msg2.isMsgShow(), 2 };
		Object []args3 = { msg3.getMsgTitle(), msg3.getMsgContent(), msg3.getMsgUrl(), msg3.isMsgShow(), 3 };
		List<Object[]> argsList = new ArrayList<Object[]>();
		argsList.add(args1);
		argsList.add(args2);
		argsList.add(args3);
		util.insertParams(sql, argsList);
		return 3;	//喵了个咪上面那个玩意没返回值
	}
	
	public List<Message> readAll(){
		String sql = "SELECT msgContent, msgTitle, msgUrl, msgTag, msgShow FROM stu_graduate_message";
		return util.query(sql, new MessageMapper(), 0);
		
	}
	

}
	
	