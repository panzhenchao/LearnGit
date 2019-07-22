package com.dhy.studentsSystem.Data;

import java.util.ArrayList;


import com.dhy.studentsSystem.entity.TeachingItem;

public class TeacheringData {
	public static ArrayList<TeachingItem> teachingData=new ArrayList<TeachingItem>();
	static {
		teachingData.add(new TeachingItem("班级1","1","teacher1"));
		teachingData.add(new TeachingItem("班级2","2","teacher2"));
		teachingData.add(new TeachingItem("班级3","3","teacher3"));
		teachingData.add(new TeachingItem("班级5","4","teacher3"));
		teachingData.add(new TeachingItem("班级4","5","teacher2"));
	}

}
