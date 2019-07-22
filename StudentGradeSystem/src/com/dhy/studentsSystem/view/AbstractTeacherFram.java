package com.dhy.studentsSystem.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import com.dhy.studentsSystem.tools.GuiTools;

public abstract class AbstractTeacherFram extends JFrame{
	private JMenuBar jMenuBar=new JMenuBar();
	private JMenu userManage =new JMenu("用户管理");
	private JMenu scoleManage =new JMenu("成绩管理");
	private JMenu courseManage =new JMenu("课程管理");
	private JMenu studentManage =new JMenu("学生管理");
	private JMenuItem studentMenuItem =new JMenuItem("学生管理");
	private JMenuItem passwordMenuItem =new JMenuItem("修改密码");
	private JMenuItem exitMenuItem =new JMenuItem("退出系统");
	private JMenuItem inputMenuItem=new JMenuItem("成绩录入");
	private JMenuItem queryScoleMenuItem=new JMenuItem("成绩查询");
	private JMenuItem studentCourseListMenuItem=new JMenuItem("学生名单管理");
	private JMenuItem addStudentMenuItem=new JMenuItem("添加学生");
	private JMenuItem updataStudentMenuItem=new JMenuItem("学生修改");
	private JMenuItem queryStudnetMenuItem=new JMenuItem("学生查询");
	public AbstractTeacherFram() {
		this.init();
		this.addComponent();
		this.addListener();
		
	}public void init() {
		this.setTitle("教师管理权限");
		this.setSize(600, 400);
		GuiTools.center(this);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}public void addComponent() {
		this.setJMenuBar(jMenuBar);
		userManage.add(studentMenuItem);
		userManage.add(passwordMenuItem);
		userManage.add(exitMenuItem);
		scoleManage.add(inputMenuItem);
		scoleManage.add(queryScoleMenuItem);
		
		courseManage.add(studentCourseListMenuItem);
		studentManage.add(addStudentMenuItem);
		studentManage.add(updataStudentMenuItem);
		studentManage.add(queryStudnetMenuItem);
		jMenuBar.add(userManage);
		jMenuBar.add(scoleManage);
		jMenuBar.add(courseManage);
		jMenuBar.add(studentManage);
		
	}public void addListener() {
		inputMenuItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				inputStudentScloe();
				
			}
		});
	}public abstract void inputStudentScloe();

}
