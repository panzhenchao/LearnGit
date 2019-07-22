package com.dhy.studentsSystem.tools;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Panel;
import java.util.Random;

public class CaptchaTools extends Panel{
	private Random random =new Random();
	private static StringBuilder captcha=new StringBuilder();
	public  void paint(Graphics graphics) {
		captcha.delete(0, captcha.length());
		int width =160;
		int height=40;
		graphics.setColor(Color.LIGHT_GRAY);
		graphics.fillRect(0,0, width, height);
		graphics.setColor(Color.BLACK);
		graphics.drawRect(0, 0, width-1, height-1);
		
		for(int i=0;i<100;i++) {
			int x=random.nextInt(width)-2;
			int y=random.nextInt(height)-2;
			graphics.drawOval(x, y, 3, 3);
		}
		graphics.setFont(new Font("黑体", Font.BOLD, 30));
		graphics.setColor(Color.BLUE);
		char [] chars= ("0123456789qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM").toCharArray();
		
		String aString=new String();
		for(int i=0;i<4;i++) {
			int pos=random.nextInt(chars.length);
			char c=chars[pos];
			aString=c+" ";
			captcha.append(c);
			graphics.setColor(getRandomColor());
			graphics.drawString(aString, 20+30*i, 30);
		}
		//graphics.setColor(getRandomColor());
		//graphics.drawString(stringBuilder.toString(), 20, 30);
	}
	public Color getRandomColor() {
		int R=random.nextInt(255),G=random.nextInt(255),B=random.nextInt(255);
		return new Color(R, G, B);
	}public String getCaptchaKey() {
		return captcha.toString();
	}public void clearCaptchaKey(String capthaKey) {
		captcha.delete(0, captcha.length());
	}

}
