package com.dhy.studentsSystem.view;

import java.awt.Frame;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import com.dhy.studentsSystem.test.AbstractLogInDialogTest;
import com.dhy.studentsSystem.tools.GuiTools;

public abstract class AbstractStudentQureyScoleDialog extends JDialog{
	private JLabel tableLabel =new JLabel("个人成绩");
	private JScrollPane tablePane =new JScrollPane();
	protected JTable table=new JTable();
	
	public AbstractStudentQureyScoleDialog() {
		this(null,true);
	}public AbstractStudentQureyScoleDialog(Frame owner,boolean modal){
		super(owner,modal);
		this.init();
		this.addComponent();
		this.addListener();
	}private void  init() {
		this.setTitle("个人成绩查询");
		this.setSize(600, 400);
		GuiTools.center(this);
		this.setResizable(false);
	}private void addComponent() {
		this.setLayout(null);
		tableLabel.setBounds(265, 20, 70, 25);
		this.add(tableLabel);
		table.getTableHeader().setReorderingAllowed(false);//列不可移动
		table.getTableHeader().setResizingAllowed(false);
		table.setEnabled(false);
		tablePane.setBounds(50, 50, 500, 200);
		tablePane.setViewportView(table);
		this.add(tablePane);
		
	}private void addListener() {
		
	}public abstract void queryStudentItem();
		

}
