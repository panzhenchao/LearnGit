package com.dhy.studentsSystem.entity;

public class StudentItem {
	private String studentNumber;
	private String studentPassword;
	private String studentName;
	private String className;
	private String studentDept;
	public StudentItem() {
		
	}public StudentItem( String studentNumber,String studentPassword,String studentName,String className, String studentDept){
		this.studentNumber=studentNumber;
		this.studentPassword=studentPassword;
		this.studentName=studentName;
		this.className=className;
		this.studentDept=studentDept;
	}public String getStudentNumber() {
		return studentNumber;
	}public void setStudentNumber(String studentNumber) {
		this.studentNumber=studentNumber;
	}public String getStudentName() {
		return studentName;
	}public void setStudentName(String studentName) {
		this.studentName=studentName;
	}public String getClassName() {
		return className;
	}public void setCourseNumber(String className) {
		this.className=className;
	}public String getStudentDept() {
		return studentDept;
	}public void  setStudentDept(String studentDept) {
		this.studentDept=studentDept;
	}public String getStudentPassword() {
		return studentPassword;
	}public void setStudentPassword(String studentPassword) {
		this.studentPassword=studentPassword;
	}

}
