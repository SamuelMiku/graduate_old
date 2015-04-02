package com.gl.mapper;

import java.sql.ResultSet;

import com.gl.entry.Entity;

public interface DataMapper<T extends Entity> {
	public T mapRecord(ResultSet rs, int num);
}
