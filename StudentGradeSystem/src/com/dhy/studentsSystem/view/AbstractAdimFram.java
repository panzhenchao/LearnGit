package com.dhy.studentsSystem.view;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import com.dhy.studentsSystem.tools.GuiTools;

public class AbstractAdimFram extends JFrame{
	private JMenuBar jMenuBar=new JMenuBar();
	private JMenu userManage =new JMenu("用户管理");
	private JMenu scoleManage =new JMenu("成绩管理");
	private JMenu courseManage =new JMenu("课程管理");
	private JMenu studentManage =new JMenu("学生管理");
	private JMenuItem teacherMenuItem =new JMenuItem("教师管理");
	private JMenuItem passwordMenuItem =new JMenuItem("修改密码");
	private JMenuItem exitMenuItem =new JMenuItem("退出系统");
	private JMenuItem inputMenuItem=new JMenuItem("成绩录入");
	private JMenuItem queryScoleMenuItem=new JMenuItem("成绩查询");
	private JMenuItem courseCatalogMenuItem=new JMenuItem("开课目录管理");
	private JMenuItem studentListMenuItem=new JMenuItem("课程名单管理");
	private JMenuItem addStudentMenuItem=new JMenuItem("添加学生");
	private JMenuItem updataStudentMenuItem=new JMenuItem("学生修改");
	private JMenuItem queryStudnetMenuItem=new JMenuItem("学生查询");
	private JLabel textLabel =new JLabel("学生成绩管理系统");
	public AbstractAdimFram() {
		this.init();
		this.addComponent();
		this.addListener();
		
	}public void init() {
		this.setTitle("管理员权限");
		this.setSize(600, 400);
		GuiTools.center(this);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}public void addComponent() {
		this.setJMenuBar(jMenuBar);
		userManage.add(teacherMenuItem);
		userManage.add(passwordMenuItem);
		userManage.add(exitMenuItem);
		scoleManage.add(inputMenuItem);
		scoleManage.add(queryScoleMenuItem);
		courseManage.add(courseCatalogMenuItem);
		courseManage.add(studentListMenuItem);
		studentManage.add(addStudentMenuItem);
		studentManage.add(updataStudentMenuItem);
		studentManage.add(queryStudnetMenuItem);
		jMenuBar.add(userManage);
		jMenuBar.add(scoleManage);
		jMenuBar.add(courseManage);
		jMenuBar.add(studentManage);
		this.add(textLabel);
	}public void addListener() {
		
	}
	

}
