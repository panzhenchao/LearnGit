package com.dhy.studentsSystem.entity;

public class TeacherItem {
	private String teacherNumber;
	private String teacherPassword;
	private String teacherName;
	
	public TeacherItem() {
		
	}public TeacherItem(String teacherNumber,String teacherPassword,String teacherName){
		this.teacherNumber=teacherNumber;
		this.teacherPassword=teacherPassword;
		this.teacherName=teacherName;
		
	}public String getTeacherNumber() {
		return teacherNumber;
	}public void setTeacherNumber(String teacherNumber) {
		this.teacherNumber=teacherNumber;
	}public String getTeacherPassword() {
		return teacherPassword;
	}public void setTeacherPassword(String teacherPassword) {
		this.teacherPassword=teacherPassword;
	}public String getTeacherName() {
		return teacherName;
	}public void setTeacherName(String teacherName) {
		this.teacherName=teacherName;
	}

}
