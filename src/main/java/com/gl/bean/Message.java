package com.gl.bean;

import com.gl.entry.Entity;

public class Message extends Entity{
	private String msgTitle;
	private String msgContent;
	private String msgUrl;
	private int msgTag;
	private boolean msgShow;
	
	public boolean isMsgShow() {
		return msgShow;
	}
	public void setMsgShow(boolean msgShow) {
		this.msgShow = msgShow;
	}
	public String getMsgTitle() {
		return msgTitle;
	}
	public void setMsgTitle(String msgTitle) {
		this.msgTitle = msgTitle;
	}
	public String getMsgContent() {
		return msgContent;
	}
	public void setMsgContent(String msgContent) {
		this.msgContent = msgContent;
	}
	public String getMsgUrl() {
		return msgUrl;
	}
	public void setMsgUrl(String msgUrl) {
		this.msgUrl = msgUrl;
	}
	public int getMsgTag() {
		return msgTag;
	}
	public void setMsgTag(int msgTag) {
		this.msgTag = msgTag;
	}
	
}
