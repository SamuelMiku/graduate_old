package com.gl.bean;

import com.gl.entry.Entity;

public class Dictionary extends Entity {
	private String id;
	private String fieldName;
	private String fieldCode;
	private int code;
	private String label;
	
	public Dictionary() {
		
	}
	
	public Dictionary(String id, String fieldName, String fieldCode, int code, String label) {
		this.id = id;
		this.fieldName = fieldName;
		this.fieldCode = fieldCode;
		this.code = code;
		this.label = label;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFieldName() {
		return fieldName;
	}
	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}
	public String getFieldCode() {
		return fieldCode;
	}
	public void setFieldCode(String fieldCode) {
		this.fieldCode = fieldCode;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
}
