package com.gl.dao;

import com.gl.bean.StuGraduateInfo;
import com.gl.db.DruidConnUtil;
import com.gl.db.JDBCTemplate;
import com.gl.mapper.StuGraduateInfoMapper;

public class StuGraduateInfoDAO {
	private static JDBCTemplate<StuGraduateInfo> jdbc = new JDBCTemplate<StuGraduateInfo>();
	static {
		jdbc.setDataSource(DruidConnUtil.getDataSource());
	}
	
	//use stuName stuIdentificationNum stuGraduationCardNum
	public static String readId2Less(StuGraduateInfo stu) {
		StringBuffer buffer = new StringBuffer("SELECT id FROM stu_graduate_info WHERE stuName = ? AND stuIdentificationNum = ?  ");
		Object []objs = {stu.getStuName(), stu.getStuIdentificationNum()};
		StuGraduateInfo entity =  jdbc.queryWithParams(buffer.toString(), objs, new StuGraduateInfoMapper());
		if(entity != null){
			return entity.getId();
		}
		else {
			return null;
		}
	}
	public static String readId2More(StuGraduateInfo stu, String nono, String note) {
		StringBuffer buffer = new StringBuffer("SELECT id FROM stu_graduate_info WHERE stuName = ? AND stuSpecialty = ? AND (stuMajorDegreeCertNum = ? OR stuDoubleMajorDegreeNum =? OR stuMinorDegreeNum = ?)");
		Object []objs = {stu.getStuName(), stu.getStuSpecialty(), nono, nono, nono};
		StuGraduateInfo entity =  jdbc.queryWithParams(buffer.toString(), objs, new StuGraduateInfoMapper());
		if(entity != null){
			return entity.getId();
		}
		else {
			return null;
		}
	}
	public static StuGraduateInfo readByid(String id) {
		StringBuffer buffer = new StringBuffer("SELECT id, stuName, stuEnName, stuNumber, stuGender, stuBrithday, stuEnrollment, stuGraduation, stuAcademy, stuSpecialty, stuSpecialtyMajor, stuClass, stuPicture, stuGraduationCardNum, stuMajorDegreeCertNum, stuMajorDegree, stuDoubleMajorDegree, stuDoubleMajorDegreeNum, stuMinorDegree, stuMinorDegreeNum, stuIdentificationNum, stuPostgraduateNum, stuCompletionNum, stuLeaveType FROM stu_graduate_info WHERE id=?");
		Object[] objs = {id};
		return  jdbc.queryWithParams(buffer.toString(), objs, new StuGraduateInfoMapper());
	}
}
