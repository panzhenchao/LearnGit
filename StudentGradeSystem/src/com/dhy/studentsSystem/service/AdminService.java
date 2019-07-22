package com.dhy.studentsSystem.service;

import java.util.ArrayList;

import com.dhy.studentsSystem.Data.StudentData;
import com.dhy.studentsSystem.dao.AdminDao;
import com.dhy.studentsSystem.entity.CourseItem;
import com.dhy.studentsSystem.entity.StudentItem;
import com.dhy.studentsSystem.entity.TeachingItem;

public class AdminService {
	private AdminDao adminDao=new AdminDao();
	public ArrayList<StudentItem> querayFruitItem(){
		ArrayList<StudentItem> stuentData=adminDao.queryAllStudentData();
		return stuentData;
	}public boolean addStudentItem(String studentNumber,String studentPassword,String studentName,String className,String studentDept) {
		ArrayList<StudentItem> studentData=adminDao.queryAllStudentData();
		for(int i=0;i<studentData.size();i++) {
			StudentItem studentItem =studentData.get(i);
			if(studentNumber.equals(studentItem.getStudentNumber())){
				return false;
			}
		}
		StudentItem thisStudentItem=new StudentItem(studentNumber, studentPassword, studentName, className, studentDept);
		adminDao.addStudentItem(thisStudentItem);
		return true;
	}
	public boolean updateStudentItem(String studentNumber,String studentPassword,String studentName,String className,String studentDept) {
		ArrayList<StudentItem> studentData=adminDao.queryAllStudentData();
		for(int i=0;i<studentData.size();i++) {
			StudentItem studentItem =studentData.get(i);
			if(studentNumber.equals(studentItem.getStudentNumber())){
				adminDao.delStdeuntItem(studentNumber);
				StudentItem thisStudentItem=new StudentItem(studentNumber, studentPassword, studentName, className, studentDept);
				adminDao.addStudentItem(thisStudentItem);
				return true;
			}
		}return false;
	}
	public boolean delStudentItem(String studentNumber) {
		ArrayList<StudentItem> studentData=adminDao.queryAllStudentData();
		for(int i=0;i<studentData.size();i++) {
			StudentItem studentItem=studentData.get(i);
			if(studentNumber.equals(studentItem.getStudentNumber())) {
				adminDao.delStdeuntItem(studentNumber);
				return true;
			}
			
		}return false;
	}public ArrayList<CourseItem> querayCourseItem(){
		ArrayList<CourseItem> courseData=adminDao.queryAllCourseData();
		return courseData;
	}public ArrayList<TeachingItem> querayTeachingItem(){
		ArrayList<TeachingItem> teachingData=adminDao.queryAllTeachingData();
		return teachingData;
	}public boolean setScoleCourseItem(String setCourseNumber,String setStudentNumber,String setScole ) {
		if(Integer.parseInt(setScole)<0||Integer.parseInt(setScole)>100) {
			return false;
		}
		ArrayList<CourseItem> courseData=adminDao.queryAllCourseData();
		for(int i=0;i<courseData.size();i++) {
			CourseItem thisCourseItem=courseData.get(i);
			if(thisCourseItem.getCourseNumber().equals(setCourseNumber)&&thisCourseItem.getStudentNumber().equals(setStudentNumber)) {
				System.out.println("进入服务层");
				adminDao.setCourseScole(setCourseNumber, setStudentNumber, setScole);
				return true;
			}
		}return false;
	}public boolean setStudentPassword(String setStudentnumber,String setStudentPassword,String setStduentPassword2) {
		if(setStudentPassword.equals(setStduentPassword2)==false) {
			System.out.println("2次密码不相等");
			return false;
		}
		ArrayList<StudentItem> studentData=adminDao.queryAllStudentData();
		for(int i=0;i<studentData.size();i++) {
			StudentItem thisStudentItem=studentData.get(i);
			
			
			if(thisStudentItem.getStudentNumber().equals(setStudentnumber)) {
				adminDao.setStudentPassword(setStudentnumber, setStudentPassword);
				System.out.println("修改成功");
				return true;
			}
		}
		System.out.println("出错");
		return false;
		
	}public boolean delStudentcourse(String setStudentNumber,String setCourse) {
		ArrayList<CourseItem> courseData=adminDao.queryAllCourseData();
		for(int i=0;i<courseData.size();i++) {
			CourseItem thisCourseItem=courseData.get(i);
			if(thisCourseItem.getStudentNumber().equals(setStudentNumber)&&thisCourseItem.getCourseNumber().equals(setCourse)) {
				adminDao.delCourseItem(setCourse, setStudentNumber);
				System.out.println("退订课程成功");
				return true;
			}
		}
		System.out.println("退订课程失败");
		return false;
	}

}
