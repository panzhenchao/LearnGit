package com.dhy.studentsSystem.test;

import javax.swing.JOptionPane;

import com.dhy.studentsSystem.service.AdminService;
import com.dhy.studentsSystem.view.AbstractStudentPasswordSetDialog;

public class AbstractStudentPasswordSetDialgoTest extends AbstractStudentPasswordSetDialog{
	private AdminService adminService =new AdminService();
	public  AbstractStudentPasswordSetDialgoTest() {
		// TODO Auto-generated constructor stub
		super();
	}
	public static void  mian(String []args) {
		new AbstractStudentPasswordSetDialgoTest().setVisible(true);

	}

	@Override
	public void setStudentPassword() {
		// TODO Auto-generated method stub
		String studentNumber=new AbstractLogInDialogTest().getNameKey();
		String studentPassword=new AbstractLogInDialogTest().getPasswordKey();
		if(studentPassword.equals(getOriginalPassword())==false) {
			JOptionPane.showMessageDialog(this, "密码错误");
		}
		
		else {
			boolean setSuccess=adminService.setStudentPassword(studentNumber, getNewPassword(), getNewPassword2());
			if(setSuccess) {
				JOptionPane.showMessageDialog(this, "修改密码成功");
			}else {
				System.out.println(studentNumber);
				System.out.println(getNewPassword());
				System.out.println(getNewPassword2());
				JOptionPane.showMessageDialog(this, "两次密码不一致");
			}
		}
		
	}

	@Override
	public void cancelStudentPassword() {
		// TODO Auto-generated method stub
		
	}

}
