package com.accommodation.frontend;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

import com.accommodation.model.User;
import com.accommodation.service.UserService;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;

public class RegisterWindow {

	private JFrame registerFrame;
	private JTextField usernameField;
	private JTextField passwordField;
	private JTextField nameField;
	private JTextField emailField;

	/**
	 * Launch the application.
	 */
	public void launch() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterWindow window = new RegisterWindow();
					window.registerFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public RegisterWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		registerFrame = new JFrame();
		registerFrame.setTitle("Register");
		registerFrame.setBounds(100, 100, 450, 300);
		registerFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		registerFrame.getContentPane().setLayout(null);

		usernameField = new JTextField();
		usernameField.setBounds(120, 40, 120, 20);
		registerFrame.getContentPane().add(usernameField);
		usernameField.setColumns(10);

		passwordField = new JTextField();
		passwordField.setBounds(120, 80, 120, 20);
		registerFrame.getContentPane().add(passwordField);
		passwordField.setColumns(10);

		nameField = new JTextField();
		nameField.setBounds(120, 120, 120, 20);
		registerFrame.getContentPane().add(nameField);
		nameField.setColumns(10);

		emailField = new JTextField();
		emailField.setBounds(120, 160, 120, 20);
		registerFrame.getContentPane().add(emailField);
		emailField.setColumns(10);

		JLabel usernameLabel = new JLabel("username");
		usernameLabel.setBounds(40, 40, 70, 20);
		registerFrame.getContentPane().add(usernameLabel);

		JLabel passwordLabel = new JLabel("password");
		passwordLabel.setBounds(40, 80, 70, 20);
		registerFrame.getContentPane().add(passwordLabel);

		JLabel nameLabel = new JLabel("name");
		nameLabel.setBounds(40, 120, 70, 20);
		registerFrame.getContentPane().add(nameLabel);

		JLabel emailLabel = new JLabel("email");
		emailLabel.setBounds(40, 160, 70, 20);
		registerFrame.getContentPane().add(emailLabel);

		JButton submitButton = new JButton("Submit");
		submitButton.setBounds(120, 200, 85, 20);
		registerFrame.getContentPane().add(submitButton);

		submitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				UserService userService = new UserService();
				String username=usernameField.getText();
				String password=passwordField.getText();
				String email=emailField.getText();
				String name=nameField.getText();
				User existing = userService.findByUserName(username);
				if (existing!= null && existing.getUserName().equals(username))
					JOptionPane.showMessageDialog(null, "Username already in use.Please choose another username");
				else {
					User nou = new User();
					nou.setEmail(email);
					nou.setName(name);
					nou.setPassword(password);
					nou.setUserName(username);
					userService.save(nou);
					JOptionPane.showMessageDialog(null, "New user created successfully");
					registerFrame.setVisible(false);
					registerFrame.dispose();
				}
			}
		});
	}
}
