package com.dhy.studentsSystem.test;

import java.util.ArrayList;

import javax.swing.DefaultBoundedRangeModel;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import org.w3c.dom.stylesheets.LinkStyle;

import com.dhy.studentsSystem.Data.CourseData;
import com.dhy.studentsSystem.Data.StudentData;
import com.dhy.studentsSystem.entity.CourseItem;
import com.dhy.studentsSystem.entity.StudentItem;
import com.dhy.studentsSystem.service.AdminService;
import com.dhy.studentsSystem.view.AbstractStudentQureyScoleDialog;

public class AbstractStudentQureyScoleDialogTest extends AbstractStudentQureyScoleDialog{
	private AdminService adminService =new AdminService();
	
	public AbstractStudentQureyScoleDialogTest() {
		super();
		queryStudentItem();
	}
	public void queryStudentItem() {
		String [] thead =new String[]{"课程号","课程名称","学号","姓名","分数","授课老师"};
		ArrayList<CourseItem> datalist=adminService.querayCourseItem();
		String [][] studentPrivateScole=list2Array(datalist);
		TableModel data =new DefaultTableModel(studentPrivateScole,thead);
		table.setModel(data);
	}
	public static void main(String []args) {
		new AbstractStudentQureyScoleDialogTest().setVisible(true);
	}public String [][]list2Array(ArrayList<CourseItem> list){
		int j=0;
		String [][]studentPrivateScole =new String [list.size()][6];
		
		for(int i=0;i<list.size();i++) {
			CourseItem thisCourseItem =list.get(i);
			String studentName=new AbstractLogInDialogTest().getNameKeyTest();
			System.out.println(3);
			System.out.println(thisCourseItem.getStudentNumber());
			System.out.println(studentName);
			if(thisCourseItem.getStudentNumber().equals(studentName)) {
				studentPrivateScole[j][0]=thisCourseItem.getCourseNumber();
				studentPrivateScole[j][1]=thisCourseItem.getCourseName();
				studentPrivateScole[j][2]=thisCourseItem.getStudentNumber();
				studentPrivateScole[j][3]=thisCourseItem.getStudentName();
				studentPrivateScole[j][4]=thisCourseItem.getStudentScore();
				studentPrivateScole[j][5]=thisCourseItem.getTeacherName();
				System.out.println(j);
				
				j++;
			}
			
		}
		return studentPrivateScole;
	}

}
