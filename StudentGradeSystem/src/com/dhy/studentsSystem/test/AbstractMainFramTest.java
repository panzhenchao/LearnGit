package com.dhy.studentsSystem.test;

import com.dhy.studentsSystem.view.AbstractMainFram;

public class AbstractMainFramTest extends AbstractMainFram{
	public static void main(String []args) {
		new AbstractMainFramTest().setVisible(true);
	}

	@Override
	public void ShowLogIn() {
		System.out.println("欢迎进入系统");
		new AbstractLogInDialogTest().setVisible(true);
		
	}

}
