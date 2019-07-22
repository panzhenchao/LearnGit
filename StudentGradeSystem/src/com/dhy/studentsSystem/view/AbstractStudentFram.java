package com.dhy.studentsSystem.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import com.dhy.studentsSystem.tools.GuiTools;

public abstract class AbstractStudentFram extends JFrame{
	private JMenuBar jMenuBar=new JMenuBar();
	private JMenu userManage =new JMenu("用户管理");
	private JMenu scoleManage =new JMenu("成绩管理");
	private JMenu courseManage =new JMenu("课程管理");
	private JMenuItem passwordMenuItem =new JMenuItem("修改密码");
	private JMenuItem exitMenuItem =new JMenuItem("退出系统");
	private JMenuItem queryScoleMenuItem=new JMenuItem("成绩查询");
	private JMenuItem studentChooseCourseItem=new JMenuItem("所选课程管理");
	
	public AbstractStudentFram() {
		this.init();
		this.addComponent();
		this.addListener();
		
	}public void init() {
		this.setTitle("学生管理权限");
		this.setSize(600, 400);
		GuiTools.center(this);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}public void addComponent() {
		this.setJMenuBar(jMenuBar);
		
		userManage.add(passwordMenuItem);
		userManage.add(exitMenuItem);
		
		scoleManage.add(queryScoleMenuItem);
		
		courseManage.add(studentChooseCourseItem);
		
		jMenuBar.add(userManage);
		jMenuBar.add(scoleManage);
		jMenuBar.add(courseManage);
		
		
	}public void addListener() {
		queryScoleMenuItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				queryStudentScole();
				
			}
		});
		passwordMenuItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				setStudentPassword();
				
			}
		});
		studentChooseCourseItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				studentChooseCourse();
				
			}
		});
	}public abstract void queryStudentScole();
	public abstract void setStudentPassword();
	public abstract void studentChooseCourse();

}
