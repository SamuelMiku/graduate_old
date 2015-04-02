package com.gl.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.gl.bean.StuGraduateInfo;

public class StuGraduateInfoMapper implements DataMapper<StuGraduateInfo> {

	public StuGraduateInfo mapRecord(ResultSet rs, int num) {
		StuGraduateInfo stu = new StuGraduateInfo();
		try {
			stu.setId(rs.getString("id"));
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			stu.setStuAcademy(rs.getString("stuAcademy"));
			stu.setStuBrithday(rs.getDate("stuBrithday"));
			stu.setStuClass(rs.getString("stuClass"));
			if (null == rs.getString("stuCompletionNum"))
				stu.setStuCompletionNum("");
			else 
				stu.setStuCompletionNum(rs.getString("stuCompletionNum"));
			stu.setStuDoubleMajorDegree(rs.getString("stuDoubleMajorDegree"));
			stu.setStuDoubleMajorDegreeNum(rs.getString("stuDoubleMajorDegreeNum"));
			if (null == rs.getString("stuEnName"))
				stu.setStuEnName("");
			else 
				stu.setStuEnName(rs.getString("stuEnName"));
			stu.setStuEnrollment(rs.getDate("stuEnrollment"));
			stu.setStuGender(rs.getString("stuGender"));
			stu.setStuGraduation(rs.getDate("stuGraduation"));
			stu.setStuGraduationCardNum(rs.getString("stuGraduationCardNum"));
			stu.setStuIdentificationNum(rs.getString("stuIdentificationNum"));
			if (null == rs.getString("stuLeaveType"))
				stu.setStuLeaveType("");
			else 
				stu.setStuLeaveType(rs.getString("stuLeaveType"));
			stu.setStuMajorDegree(rs.getString("stuMajorDegree"));
			stu.setStuMajorDegreeCertNum(rs.getString("stuMajorDegreeCertNum"));
			stu.setStuMinorDegree(rs.getString("stuMinorDegree"));
			stu.setStuMinorDegreeNum(rs.getString("stuMinorDegreeNum"));
			stu.setStuName(rs.getString("stuName"));
			stu.setStuNumber(rs.getString("stuNumber"));
			if (null == rs.getString("stuPicture"))
				stu.setStuPicture("");
			else 
				stu.setStuPicture(rs.getString("stuPicture"));
			if (null == rs.getString("stuPostgraduateNum"))
				stu.setStuPostgraduateNum("");
			else 
				stu.setStuPostgraduateNum(rs.getString("stuPostgraduateNum"));
			stu.setStuSpecialty(rs.getString("stuSpecialty"));
			if (null == rs.getString("stuSpecialtyMajor"))
				stu.setStuSpecialtyMajor("");
			else 
				stu.setStuSpecialtyMajor(rs.getString("stuSpecialtyMajor"));
		} catch (SQLException e) {
		}
		
		return stu;
	}

}
