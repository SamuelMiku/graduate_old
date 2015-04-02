package com.gl.excel;

import org.apache.poi.hssf.usermodel.HSSFRow;

import com.gl.entry.Entity;

public interface ExcelMapper<T extends Entity> {
	String[] mapExcel(HSSFRow row);
	T mapStringArray(HSSFRow row);
}
