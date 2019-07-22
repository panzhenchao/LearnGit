package com.dhy.studentsSystem.view;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

import org.omg.PortableServer.POAPackage.AdapterAlreadyExists;

import com.dhy.studentsSystem.tools.GuiTools;

public abstract class AbstractStudentPasswordSetDialog extends JDialog{
	
	private JLabel originalPassword=new JLabel("原密码");
	private JLabel newPassword=new JLabel("新密码");
	private JLabel newPassword2=new JLabel("重复密码");
	private JTextField originalPasswordTextField=new JTextField(30);
	private JTextField newPasswordTextField=new JTextField(30);
	private JTextField newPassword2TextField=new JTextField(30);
	private JButton modifeButton=new JButton("确认");
	private JButton cancelButton=new JButton("取消");
	public AbstractStudentPasswordSetDialog() {
		this(null,true);
	}public AbstractStudentPasswordSetDialog(Frame owner,boolean modal){
		super(owner,modal);
		this.init();
		this.addComponent();
		this.addListener();
	}private void  init() {
		this.setTitle("密码修改");
		this.setSize(500, 400);
		GuiTools.center(this);
		this.setResizable(false);
	}private void addComponent() {
		this.setLayout(null);
		originalPassword.setBounds(50, 100, 100, 25);
		originalPasswordTextField.setBounds(150, 100, 100, 25);
		newPassword.setBounds(50, 150, 100, 25);
		newPasswordTextField.setBounds(150, 150, 100, 25);
		newPassword2.setBounds(50, 200,100, 25);
		newPassword2TextField.setBounds(150, 200, 100, 25);
		modifeButton.setBounds(100, 250, 50, 25);
		cancelButton.setBounds(200, 250, 50, 25);
		this.add(originalPassword);
		this.add(originalPasswordTextField);
		this.add(newPassword);
		this.add(newPasswordTextField);
		this.add(newPassword2);
		this.add(newPassword2TextField);
		this.add(modifeButton);
		this.add(cancelButton);
	}private void addListener() {
		modifeButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				setStudentPassword();
				
			}
		});
		cancelButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cancelStudentPassword();
				
			}
		});
	}
	public abstract void setStudentPassword();
	public abstract void cancelStudentPassword();
	public String   getOriginalPassword() {
		return originalPasswordTextField.getText();
	}public String getNewPassword() {
		return newPasswordTextField.getText();
	}public String getNewPassword2() {
		return newPassword2TextField.getText();
	}
	
	

}
