package com.dhy.studentsSystem.view;

import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.nio.channels.ScatteringByteChannel;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.dhy.studentsSystem.tools.CaptchaTools;
import com.dhy.studentsSystem.tools.GuiTools;

public abstract class AbstractLogInDialog extends JDialog{
	private JLabel nameLabel=new JLabel("用户ID: ");
	private static TextField nameTextField=new TextField(30);
	private JLabel passwordLabel =new JLabel("密码: ");
	private static TextField passwordTextField =new TextField(30);
	private JLabel usersCategory =new JLabel("用户类别：");
	private final String []user= {"教务管理员","教师","学生"};
	private JLabel captchaLabel=new JLabel("验证码: ");
	private TextField captchaTextField=new TextField(30);
	private JComboBox comboBox=new JComboBox(user);
	private JButton button=new JButton("登录");
	private String [][]namePassword ;
	private TextField field=new TextField("教务管理员",20);
	private static String NameKeyTest=nameTextField.getText();
	Panel captcha=new CaptchaTools();
	public AbstractLogInDialog() {
		this(null,false);
	}public AbstractLogInDialog(Frame owner,boolean modal){
		super(owner,modal);
		this.init();
		this.addComponent();
		this.addListener();
		
	}private void init() {
		this.setTitle("登录");
		this.setSize(600, 400);
		GuiTools.center(this);
		this.setResizable(false);
	}private void addComponent() {
		this.setLayout(null);
		nameLabel.setBounds(50, 100, 100, 25);
		nameTextField.setBounds(150, 100, 200, 25);
		passwordLabel.setBounds(50, 150, 100, 25);
		passwordTextField.setBounds(150, 150, 200, 25);
		usersCategory.setBounds(50, 200, 100, 25);
		comboBox.setBounds(150, 200, 200,50);
		field.setBounds(400, 250, 100, 50);
		captchaLabel.setBounds(50, 250, 100, 25);
		captchaTextField.setBounds(150, 250, 200, 25);
		button.setBounds(100, 350, 100, 25);
		captcha.setBounds(400, 250, 160, 40);
		this.add(captcha);
		this.add(nameLabel);
		this.add(nameTextField);
		this.add(passwordLabel);
		this.add(passwordTextField);
		this.add(usersCategory);
		this.add(comboBox);
		this.add(captchaLabel);
		this.add(captchaTextField);
		this.add(button);
		//this.add(field);
	}private void addListener() {
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				LoginAuthentication();
				
			}
		});
		comboBox.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String userComBoxName=(String) comboBox.getSelectedItem();
				field.setText("");
				field.setText(userComBoxName);
				//System.out.println(userComBoxName);
			}
		});
		captcha.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				super.mouseClicked(e);
				
				captcha.repaint();
			}
		});
	
	
	}
	public abstract void LoginAuthentication();// 验证登录
	
	public String getNameKey() {
		return nameTextField.getText();
	}
	
	public String getPasswordKey() {
		return passwordTextField.getText();
	}
	public String getUserChoose() {
		return field.getText();
	}
	public String getNameKeyTest() {
		NameKeyTest=nameTextField.getText();
		return NameKeyTest;
	}
	public String getCaptcha() {
		return captchaTextField.getText();
	}
	
	public abstract void loginError(String errorString);
	public abstract void userChoose();

}
