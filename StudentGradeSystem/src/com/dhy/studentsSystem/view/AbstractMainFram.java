package com.dhy.studentsSystem.view;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.channels.ShutdownChannelGroupException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.dhy.studentsSystem.tools.GuiTools;

public abstract class AbstractMainFram extends JFrame{
	private JLabel titleLable=new JLabel(new ImageIcon("welcome.png"));
	private JButton button =new JButton("进入系统");//点击进入系统
	public AbstractMainFram() {
		this.init();//初始化界面
		this.addComponent();//添加组件
		this.addListener();//添加监听事件
		
	}private void init() {
		this.setTitle("学生成绩管理系统欢迎您");
		this.setSize(600, 400);
		GuiTools.center(this);
		
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}private void addComponent() {
		this.add(this.titleLable, BorderLayout.NORTH);
		JPanel btnJPanel=new JPanel();
		//清除布局，jpanel可以自己布局
		btnJPanel.setLayout(null);
		this.add(btnJPanel);
		button.setBounds(240, 20, 120, 50);
		btnJPanel.add(button);
	}private void addListener() {
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ShowLogIn();
				
			}
		});
		
	}public abstract void ShowLogIn ();

}
