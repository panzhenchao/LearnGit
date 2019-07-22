package com.dhy.studentsSystem.view;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import com.dhy.studentsSystem.entity.TeachingItem;
import com.dhy.studentsSystem.test.AbstractLogInDialogTest;
import com.dhy.studentsSystem.tools.GuiTools;

public abstract class AbstractInputStudentScole extends JDialog{
	private JLabel tableLabel =new JLabel("个人成绩");
	private JScrollPane tablePane =new JScrollPane();
	protected JTable table=new JTable();
	private JButton saveButton=new JButton("保存");
	private JButton cancelButton=new JButton("取消");
	
	public AbstractInputStudentScole() {
		// TODO Auto-generated constructor stub
	
		this(null,true);
	}public AbstractInputStudentScole(Frame owner,boolean modal){
		super(owner,modal);
		this.init();
		this.addComponent();
		this.addListener();
	}private void  init() {
		this.setTitle("学生成绩入录");
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
		tablePane.setViewportView(table);
		saveButton.setBounds(200, 300, 80, 30);
		cancelButton.setBounds(360, 300, 80, 30);
		this.add(tablePane);
		this.add(saveButton);
		this.add(cancelButton);
	}private void addListener() {
		saveButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				saveStudentScole();
				
			}
		});
		cancelButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cancelStudentScole();
				
			}
		});
	}public abstract void inputStudentItem();
	public abstract void saveStudentScole();
	public abstract void cancelStudentScole();
	

}
