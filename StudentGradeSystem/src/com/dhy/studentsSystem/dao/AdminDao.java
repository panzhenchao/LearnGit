package com.dhy.studentsSystem.dao;

import java.util.ArrayList;

import com.dhy.studentsSystem.Data.CourseData;
import com.dhy.studentsSystem.Data.StudentData;
import com.dhy.studentsSystem.Data.TeacheringData;
import com.dhy.studentsSystem.entity.CourseItem;
import com.dhy.studentsSystem.entity.StudentItem;
import com.dhy.studentsSystem.entity.TeachingItem;

public class AdminDao {
	public ArrayList<StudentItem> queryAllStudentData(){
		return StudentData.studentData;
	}
	public void addStudentItem(StudentItem studentItem) {
		StudentData.studentData.add(studentItem);
	}
	public void delStdeuntItem(String delStudentNumber) {
		for(int i=0;i<StudentData.studentData.size();i++) {
			StudentItem thisStudentItem =StudentData.studentData.get(i);
			if(thisStudentItem.getStudentNumber().equals(delStudentNumber)) {
				StudentData.studentData.remove(i);
			}
			
		}
	}public ArrayList<CourseItem> queryAllCourseData(){
		return CourseData.courseData;
	}public void addCourseItem(CourseItem courseItem) {
		CourseData.courseData.add(courseItem);
	}public void delCourseItem(String delCourse,String delStudentNumber) {
		for(int i=0;i<CourseData.courseData.size();i++) {
			CourseItem thisCourseItem =CourseData.courseData.get(i);
			if(thisCourseItem.getCourseNumber().equals(delCourse)&&thisCourseItem.getStudentNumber().equals(delStudentNumber)) {
				CourseData.courseData.remove(i);
			}
		}
	}public ArrayList<TeachingItem> queryAllTeachingData(){
		return TeacheringData.teachingData;
	}public void setCourseScole(String setCourse,String setStudentNumber,String setScole) {
		for(int i=0;i<CourseData.courseData.size();i++) {
			CourseItem thisCourseItem=CourseData.courseData.get(i);
			if(thisCourseItem.getCourseNumber().equals(setCourse)&&thisCourseItem.getStudentNumber().equals(setStudentNumber)) {
				//System.out.println("进行第一个同学的写入");
				//CourseItem newCourseItem=new CourseItem(thisCourseItem.getCourseNumber(), thisCourseItem.getCourseName(), thisCourseItem.getStudentNumber(), thisCourseItem.getStudentName(), setCourse, thisCourseItem.getTeacherNumber(), thisCourseItem.getTeacherName());
				//CourseData.courseData.set(i, newCourseItem);
				//System.out.println("要修改的成绩是"+setScole);
				
				//CourseData.courseData.get(0).setCourseNumber("20");
				CourseData.courseData.get(i).setStudentScore(setScole);
				//thisCourseItem.setStudentScore(setScole);
			}
		}
	}public void setStudentPassword(String setStudentNumber,String setStudentPassword) {
		for(int i=0;i<StudentData.studentData.size();i++) {
			StudentItem thisStudentItem=StudentData.studentData.get(i);
			if(thisStudentItem.getStudentNumber().equals(setStudentNumber)) {
				StudentData.studentData.get(i).setStudentPassword(setStudentPassword);
			}
		}
	}

}
