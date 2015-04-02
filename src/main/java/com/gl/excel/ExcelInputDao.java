package com.gl.excel;

import java.util.ArrayList;
import java.util.List;

import com.gl.bean.Dictionary;
import com.gl.bean.StuGraduateInfo;
import com.gl.db.DruidConnUtil;
import com.gl.db.JDBCTemplate;

public class ExcelInputDao {
	private static JDBCTemplate<Dictionary> util = new JDBCTemplate<Dictionary>();
	static {
		util.setDataSource(DruidConnUtil.getDataSource());
	}
	
	public static void createByList(List<StuGraduateInfo> list) {
		String sql = "INSERT INTO stu_graduate_info (id, stuName, stuEnName, stuNumber, stuGender, stuBrithday, stuEnrollment, stuGraduation, stuAcademy, stuSpecialty, stuSpecialtyMajor, stuClass, stuPicture, stuGraduationCardNum, stuMajorDegreeCertNum, stuMajorDegree, stuDoubleMajorDegree, stuDoubleMajorDegreeNum, stuMinorDegree, stuMinorDegreeNum, stuIdentificationNum, stuPostgraduateNum, stuCompletionNum, stuLeaveType) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		List<Object[]> objects = new ArrayList<Object[]>();
		
		for (StuGraduateInfo stu : list) {
			Object[] object = {stu.getId(), stu.getStuName(), stu.getStuEnName(), stu.getStuNumber(), stu.getStuGender(), stu.getStuBrithday(), stu.getStuEnrollment(), stu.getStuGraduation(), stu.getStuAcademy(), stu.getStuSpecialty(), stu.getStuSpecialtyMajor(), stu.getStuClass(), stu.getStuPicture(), stu.getStuGraduationCardNum(), stu.getStuMajorDegreeCertNum(), stu.getStuMajorDegree(), stu.getStuDoubleMajorDegree(), stu.getStuDoubleMajorDegreeNum(), stu.getStuMinorDegree(), stu.getStuMinorDegreeNum(), 
					stu.getStuIdentificationNum(), stu.getStuPostgraduateNum(), stu.getStuCompletionNum(), stu.getStuLeaveType()};
			System.out.println(object.length);
			objects.add(object);
		}
		
		util.insertParams(sql, objects);
	}
}
