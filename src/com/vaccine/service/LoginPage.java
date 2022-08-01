package com.vaccine.service;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;

public class LoginPage extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage frame = new LoginPage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoginPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(350, 40, 800, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(176, 196, 222));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 206, 209));
		panel.setBounds(10, 10, 780, 131);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login Page");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 45));
		lblNewLabel.setBounds(85, 5, 591, 116);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(326, 237, 280, 51);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(326, 340, 280, 51);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel_1_4_1_1 = new JLabel("Username:");
		lblNewLabel_1_4_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_4_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_4_1_1.setBounds(160, 237, 141, 45);
		contentPane.add(lblNewLabel_1_4_1_1);
		
		JLabel lblNewLabel_1_4_1_1_1 = new JLabel("Password:");
		lblNewLabel_1_4_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_4_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_4_1_1_1.setBounds(160, 340, 141, 45);
		contentPane.add(lblNewLabel_1_4_1_1_1);
		
		JButton btnSubmit = new JButton("Submit");
		
		btnSubmit.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnSubmit.setBorderPainted(false);
		btnSubmit.setBackground(new Color(0, 255, 127));
		btnSubmit.setBounds(188, 487, 175, 57);
		contentPane.add(btnSubmit);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnCancel.setBorderPainted(false);
		btnCancel.setBackground(new Color(255, 69, 0));
		btnCancel.setBounds(431, 487, 175, 57);
		contentPane.add(btnCancel);
		setUndecorated(true);
	}

}
