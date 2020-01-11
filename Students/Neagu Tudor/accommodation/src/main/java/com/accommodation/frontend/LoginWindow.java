package com.accommodation.frontend;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.accommodation.model.User;
import com.accommodation.service.UserService;

public class LoginWindow {

	private JFrame loginFrame;
	private JTextField usernameField;
	private JPasswordField passwordField;
	private JButton registerButton;
	private JLabel registerLabel;

	/**
	 * Launch the application.
	 */
	public void launch() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginWindow window = new LoginWindow();
					window.loginFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		loginFrame = new JFrame();
		loginFrame.setForeground(SystemColor.activeCaption);
		loginFrame.getContentPane().setForeground(Color.LIGHT_GRAY);
		loginFrame.setTitle("Log in");
		loginFrame.setBounds(600, 200, 300, 200);
		loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		loginFrame.getContentPane().setLayout(null);
		
		usernameField = new JTextField();
		usernameField.setBounds(30, 50, 100, 20);
		loginFrame.getContentPane().add(usernameField);
		usernameField.setColumns(10);
		
		JLabel usernameLabel = new JLabel("username");
		usernameLabel.setBounds(30, 30, 70, 13);
		loginFrame.getContentPane().add(usernameLabel);
		
		JLabel passwordLabel = new JLabel("password");
		passwordLabel.setBounds(30, 80, 70, 13);
		loginFrame.getContentPane().add(passwordLabel);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(30, 100, 100, 20);
		loginFrame.getContentPane().add(passwordField);
		
		JButton loginButton = new JButton("Log in");
		loginButton.setBounds(180, 110, 70, 30);
		loginFrame.getContentPane().add(loginButton);
		
		registerButton = new JButton("Register");
		registerButton.setBounds(180, 10, 85, 21);
		loginFrame.getContentPane().add(registerButton);
		
		registerLabel = new JLabel("New account");
		registerLabel.setBounds(186, 35, 85, 15);
		loginFrame.getContentPane().add(registerLabel);
		
		
        loginButton.addActionListener(new ActionListener() {
            @SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
            	UserService userService= new UserService();
        
                User nou= new User();
                nou=userService.findByCredentials(usernameField.getText(), passwordField.getText());
                if (nou!=null)
                {
                	JOptionPane.showMessageDialog(null,"Logged in");
                }
                else {
                	JOptionPane.showMessageDialog(null,"Incorrect info...");

                }
            }
        }) ;
       
        registerButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
            	RegisterWindow register= new RegisterWindow();
            	register.launch();
            }
        }) ;
        
        
        
        
        
		
	}
}
