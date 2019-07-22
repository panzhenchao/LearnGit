package com.dhy.studentsSystem.test;

import java.io.StringBufferInputStream;
import java.util.function.IntToDoubleFunction;

import javax.swing.JDialog;
import javax.swing.JLabel;

import com.dhy.studentsSystem.tools.CaptchaTools;
import com.dhy.studentsSystem.tools.GuiTools;
import com.dhy.studentsSystem.view.AbstractLogInDialog;

public class AbstractLogInDialogTest extends AbstractLogInDialog{
	public AbstractLogInDialogTest() {
		super();
		
	}
	String [][] AdimLogin=new String[][] {
		{"adim1","123"},
		{"adim2","123"},
		{"adim3","123"},
	};
	String [][]TeacherLogin=new String[][] {
		{"teacher1","123"},
		{"teacher2","123"},
		{"teacher3","123"},
	};
	String [][]StudentLogin =new String[][] {
		{"student1","123"},
		{"student2","123"},
		{"student3","123"},
	};
	
		
	
	public static void main(String []args) {
		new AbstractLogInDialogTest().setVisible(true);
	}
	@Override
	public void LoginAuthentication() {
		System.out.println("输入"+getCaptcha());
		System.out.println("验证码"+new CaptchaTools().getCaptchaKey());
		String captchaKey=new CaptchaTools().getCaptchaKey();
		if(getCaptcha().equals(new CaptchaTools().getCaptchaKey())) {
			int w=0;
			if(getUserChoose().equals("教务管理员")) {
				for(int i=0;i<AdimLogin.length;i++) {
					if(getNameKey().equals(AdimLogin[i][0])) {
						if(getPasswordKey().equals(AdimLogin[i][1])) {
							w=1;
							System.out.println("进入管理员系统");
							new AbstractAdimFramTest().setVisible(true);
						}
					}
				}
			}
			else if(getUserChoose().equals("教师")) {
				
				for(int i=0;i<TeacherLogin.length;i++) {
					if(getNameKey().equals(TeacherLogin[i][0])) {
						if(getPasswordKey().equals(TeacherLogin[i][1])) {
							w=1;
							System.out.println("进入教师系统");
							new AbstractTeacherFramTest().setVisible(true);
						}
					}
				}
			}else {
				for(int i=0;i<StudentLogin.length;i++) {
					
					if(getNameKey().equals(StudentLogin[i][0])) {
						if(getPasswordKey().equals(StudentLogin[i][1])) {
							w=1;
							System.out.println("进入学生系统");
							System.out.println(getNameKeyTest());
							new AbstractStudentFramTest().setVisible(true);
						}
					}
				}
			}
			if(w==0) {
				
				loginError("账号或者密码错误");
			}
		}else {
			loginError("验证码错误");
			
		}
		
		
	}public void loginError(String errorString) {
		JDialog jDialog =new JDialog();
		jDialog.setSize(200, 200);
		GuiTools.center(jDialog);
		jDialog.setModal(true);
		JLabel lb=new JLabel(errorString);
		lb.setBounds(100, 80, 80, 30);
		jDialog.add(lb);
		jDialog.setVisible(true);
		
	}public void userChoose() {
		
	}
	
	
	

}
