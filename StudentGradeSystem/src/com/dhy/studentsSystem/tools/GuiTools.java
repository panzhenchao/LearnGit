package com.dhy.studentsSystem.tools;

import java.awt.Component;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class GuiTools {
	static Toolkit kToolkit =Toolkit.getDefaultToolkit();
	public static void center(Component component) {
		int x=(kToolkit.getScreenSize().width-component.getWidth())/2;
		int y=(kToolkit.getScreenSize().height-component.getHeight())/2;
		component.setLocation(x, y);
		
	}public static void setTitleImage(JFrame frame,String titleIconPath) {
		frame.setIconImage(kToolkit.createImage(titleIconPath));
	}

}
