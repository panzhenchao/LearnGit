package com.dhy.studentsSystem.test;

import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import com.dhy.studentsSystem.entity.CourseItem;
import com.dhy.studentsSystem.service.AdminService;
import com.dhy.studentsSystem.view.AbstractStudentChooseCourseDialog;

public class AbstractStudentChooseCourseDialogTest extends AbstractStudentChooseCourseDialog{
	private AdminService adminService =new AdminService();
	TableModel data;
	public AbstractStudentChooseCourseDialogTest() {
		// TODO Auto-generated constructor stub
		super();
		queryStudentCourse();
	}
	public void queryStudentCourse() {
		String [] thead =new String[]{"课程号","课程名称","授课老师"};
		ArrayList<CourseItem> datalist=adminService.querayCourseItem();
		String [][] studentPrivateScole=list2Array(datalist);
		data =new DefaultTableModel(studentPrivateScole,thead) {
			public boolean isCellEditable(int row,int columne) {
				return false;
				
			}
		};
		table.setModel(data);
	}public String [][]list2Array(ArrayList<CourseItem> list){
		int j=0;
		String [][]studentPrivateScole =new String [list.size()][3];
		
		for(int i=0;i<list.size();i++) {
			CourseItem thisCourseItem =list.get(i);
			String studentName=new AbstractLogInDialogTest().getNameKeyTest();
			System.out.println(3);
			System.out.println(thisCourseItem.getStudentNumber());
			System.out.println(studentName);
			if(thisCourseItem.getStudentNumber().equals(studentName)) {
				studentPrivateScole[j][0]=thisCourseItem.getCourseNumber();
				studentPrivateScole[j][1]=thisCourseItem.getCourseName();
				studentPrivateScole[j][2]=thisCourseItem.getTeacherName();
				System.out.println(j);
				
				j++;
			}
			
		}
		return studentPrivateScole;
	}

	@Override
	public void dropStudentCourse() {
		// TODO Auto-generated method stub
		String studentNumber=new AbstractLogInDialogTest().getNameKeyTest();
		int row=table.getSelectedRow();
		if(row==-1) {
			JOptionPane.showMessageDialog(this, "请先选择要退订的课程");
		}
		else {
			String courseNumber=(String) table.getValueAt(row, 0);
			Boolean delSucces=adminService.delStudentcourse(studentNumber, courseNumber);
			if(delSucces) {
				JOptionPane.showMessageDialog(this, "退订成功");
				queryStudentCourse();
			}else {
				JOptionPane.showMessageDialog(this, "退订失败");
			}
		}
		
	}

	@Override
	public void cancelStudentCourse() {
		// TODO Auto-generated method stub
		queryStudentCourse();
	}

}
