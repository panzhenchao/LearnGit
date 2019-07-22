package com.dhy.studentsSystem.test;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import org.omg.CORBA.PUBLIC_MEMBER;

import com.dhy.studentsSystem.entity.CourseItem;
import com.dhy.studentsSystem.entity.TeachingItem;
import com.dhy.studentsSystem.service.AdminService;
import com.dhy.studentsSystem.view.AbstractInputStudentScole;

public class AbstractInputstudentScoleTest extends AbstractInputStudentScole{
	private JComboBox combox=new JComboBox();
	private AdminService adminService =new AdminService();
	private TextField field=new TextField("请选者课程",20);
	
	int thisCourseItemNumber;
	private String[][] newScole=new String[10][1];
	String teacherNumber=new AbstractLogInDialogTest().getNameKeyTest();
	String test1;
	TableModel data;
	public AbstractInputstudentScoleTest() {
		super();
		inputStudentItem();
		
		comboBoxItem(adminService.querayTeachingItem());
		
	}
	public void inputStudentItem() {
		String [] thead =new String[]{"课程号","课程名称","学号","姓名","分数"};
		ArrayList<CourseItem> datalist=adminService.querayCourseItem();
		String [][] studentPrivateScole=list2Array(datalist);
		 data =new DefaultTableModel(studentPrivateScole,thead) {
			public boolean isCellEditable(int row,int columne) {
				
				if(columne==4) {
					return true;
				}else {
					return false;
				}
			}
			
		};
		for(int i=0;i<table.getRowCount();i++) {
			newScole[i][0]=(String)data.getValueAt(i, 4);
		}
		test1=(String)data.getValueAt(1, 4);
		table.setModel(data);
	}
	
	
	public static void main(String []args) {
		new AbstractInputstudentScoleTest().setVisible(true);
	}public String [][]list2Array(ArrayList<CourseItem> list){
		int j=0;
		String [][]studentScole =new String [list.size()][5];
		
		for(int i=0;i<list.size();i++) {
			CourseItem thisCourseItem =list.get(i);
			
			System.out.println(3);
			System.out.println(thisCourseItem.getCourseNumber());
			if(thisCourseItem.getCourseNumber().equals(field.getText())) {
				studentScole[j][0]=thisCourseItem.getCourseNumber();
				studentScole[j][1]=thisCourseItem.getCourseName();
				studentScole[j][2]=thisCourseItem.getStudentNumber();
				studentScole[j][3]=thisCourseItem.getStudentName();
				studentScole[j][4]=thisCourseItem.getStudentScore();
				System.out.println(j);
				
				j++;
				thisCourseItemNumber=j;
				System.out.println(thisCourseItemNumber+"----");
			}
			
		}
		return studentScole;
	}private void comboBoxItem(ArrayList<TeachingItem> teachingList) {
		int j=0;
		String []teachingComboBox=new String[5];
		combox.addItem("请选择课程");
		for(int i=0;i<teachingList.size();i++) {
			TeachingItem thisTeachingItem=teachingList.get(i);
			
			System.out.println(teacherNumber);
			if(thisTeachingItem.getTeacherNumber().equals(teacherNumber)) {
				teachingComboBox[j]=thisTeachingItem.getCourseNumber();
				j++;
				combox.addItem(thisTeachingItem.getCourseNumber());
				
			}
		}
		System.out.println("jinruhezi");
		
		combox.setBounds(50, 300, 150, 50);
		this.add(combox);
		combox.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String courseComBoxName=(String) combox.getSelectedItem();
				field.setText("");
				field.setText(courseComBoxName);
				inputStudentItem();	
			}
		});
	}
	@Override
	public void saveStudentScole() {
		// TODO Auto-generated method stub
		System.out.println(data.getValueAt(0, 4));
		for(int i=0;i<thisCourseItemNumber;i++) {
			String CourseNumber =(String)data.getValueAt(i,0);
			String StudentNumber =(String)data.getValueAt(i, 2);
			String Scole=(String)data.getValueAt(i, 4);
			System.out.println(Scole);
			boolean setSuccess=adminService.setScoleCourseItem(CourseNumber, StudentNumber, Scole);
			if(!setSuccess) {
				JOptionPane.showMessageDialog(this, "成绩异常");
			}
		}
		
		
	}
	@Override
	public void cancelStudentScole() {
		// TODO Auto-generated method stub
		System.out.println(data.getValueAt(0, 4));
		inputStudentItem();
		
	}
	
	

	
	

}
