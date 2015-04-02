package com.gl.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.gl.bean.Message;

public class MessageMapper implements DataMapper<Message> {

	@Override
	public Message mapRecord(ResultSet rs, int num) {
		Message msg = new Message();
		try {
			msg.setMsgContent(rs.getString("msgContent"));
			msg.setMsgTitle(rs.getString("msgTitle"));
			msg.setMsgUrl(rs.getString("msgUrl"));
			msg.setMsgTag(rs.getInt("msgTag"));
			msg.setMsgShow(rs.getBoolean("msgShow"));
			
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		return msg;
	}
}
