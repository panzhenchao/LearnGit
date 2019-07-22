package com.dhy.studentsSystem.view;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import com.dhy.studentsSystem.tools.GuiTools;

public abstract class AbstractStudentChooseCourseDialog extends JDialog{
	private JLabel tableLabel =new JLabel("所选课程");
	private JScrollPane tablePane =new JScrollPane();
	protected JTable table=new JTable();
	private JButton dropCourse=new JButton("退课");
	private JButton cancelCourse=new JButton("取消");
	public AbstractStudentChooseCourseDialog() {
		this(null,true);
	}public AbstractStudentChooseCourseDialog(Frame owner,boolean modal){
		super(owner,modal);
		this.init();
		this.addComponent();
		this.addListener();
	}
	private void  init() {
		this.setTitle("所选课程管理");
		this.setSize(600, 400);
		GuiTools.center(this);
		this.setResizable(false);
	}private void addComponent() {
		this.setLayout(null);
		tableLabel.setBounds(265, 20, 70, 25);
		this.add(tableLabel);
		table.getTableHeader().setReorderingAllowed(false);//列不可移动
		table.getTableHeader().setResizingAllowed(false);
		//table.setEnabled(false);
		tablePane.setBounds(50, 50, 500, 200);
		dropCourse.setBounds(200, 300, 80, 30);
		cancelCourse.setBounds(360, 300, 80, 30);
		tablePane.setViewportView(table);
		this.add(tablePane);
		this.add(dropCourse);
		this.add(cancelCourse);
		
	}
	private void addListener() {
		dropCourse.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dropStudentCourse();
			}
		});
		cancelCourse.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cancelStudentCourse();
			}
		});
	}public abstract void dropStudentCourse();
	public abstract void cancelStudentCourse();

}
