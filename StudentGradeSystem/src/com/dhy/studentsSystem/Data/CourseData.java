package com.dhy.studentsSystem.Data;

import java.util.ArrayList;

import com.dhy.studentsSystem.entity.CourseItem;

public class CourseData {
	public static ArrayList<CourseItem> courseData=new ArrayList<CourseItem>();
	
	
	static {
		//CourseItem courseTest=new CourseItem("1", "java", "student1", "学生1号", "90", "teacher1", "老师1号");
		//courseData.add(courseTest);
		courseData.add(new CourseItem("1", "java", "student1", "学生1号", "90", "teacher1","老师1号"));
		
		courseData.add(new CourseItem("2", "javaScript", "student3", "学生1号", "90", "teacher2","老师2号"));
		courseData.add(new CourseItem("3", "c", "student2", "学生2号", "90", "teacher3","老师3号"));
		courseData.add(new CourseItem("4", "c++", "student3", "学生3号", "90", "teacher3","老师3号"));
		courseData.add(new CourseItem("5", "python", "student2", "学生2号", "70", "teacher2","老师2号"));
		courseData.add(new CourseItem("1", "java", "student2", "学生2号", "70", "teacher1","老师1号"));
	}
	

}
