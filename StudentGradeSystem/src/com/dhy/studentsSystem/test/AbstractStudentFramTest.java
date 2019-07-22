package com.dhy.studentsSystem.test;

import com.dhy.studentsSystem.view.AbstractStudentFram;

public class AbstractStudentFramTest extends AbstractStudentFram{
	public static void main(String []args) {
		new AbstractStudentFramTest().setVisible(true);
		System.out.println("学生权限管理");
	}public void queryStudentScole() {
		new AbstractStudentQureyScoleDialogTest().setVisible(true);
		
	}
	@Override
	public void setStudentPassword() {
		// TODO Auto-generated method stu
		new AbstractStudentPasswordSetDialgoTest().setVisible(true);
		
	}
	@Override
	public void studentChooseCourse() {
		new AbstractStudentChooseCourseDialogTest().setVisible(true);
		
	}

}
