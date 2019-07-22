package com.dhy.studentsSystem.Data;

import java.util.ArrayList;

import com.dhy.studentsSystem.entity.StudentItem;

public class StudentData {
	public static ArrayList<StudentItem> studentData=new ArrayList<StudentItem>();
	static {
		studentData.add(new StudentItem("student1", "123", "学生1号", "18计科", "信息学院"));
	}

}
