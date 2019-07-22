package com.dhy.studentsSystem.entity;

public class TeachingItem {
	private String className;
	private String courseNumber;
	private String teacherNumber;
	public TeachingItem() {
		
	}public TeachingItem(String className,String courseNumber,String teacherNumber) {
		this.className=className;
		this.courseNumber=courseNumber;
		this.teacherNumber=teacherNumber;
	}public String getClassName() {
		return className;
	}public void setClassName(String className) {
		this.className=className;
	}public String getCourseNumber() {
		return courseNumber;
	}public void setCourseNumber(String courseNumber) {
		this.courseNumber=courseNumber;
	}public String getTeacherNumber() {
		return teacherNumber;
	}public void setTeacherNumber(String teacherNumber) {
		this.teacherNumber=teacherNumber;
	}

}
