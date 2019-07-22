package com.dhy.studentsSystem.test;

import com.dhy.studentsSystem.view.AbstractTeacherFram;

public class AbstractTeacherFramTest extends AbstractTeacherFram{
	public static void main(String []args) {
		new AbstractTeacherFramTest().setVisible(true);
		System.out.println("教师界面");
	}

	@Override
	public void inputStudentScloe() {
		new AbstractInputstudentScoleTest().setVisible(true);
		
	}

}
