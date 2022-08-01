package com.vaccine.service;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import java.awt.Cursor;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.CompoundBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.LineBorder;
import java.awt.Canvas;
import javax.swing.ImageIcon;

public class HomePage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage frame = new HomePage();
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
	public HomePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 150, 1200, 600);
		contentPane = new JPanel();
		contentPane.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		contentPane.setBackground(new Color(0, 255, 255));
		contentPane.setBorder(new MatteBorder(6, 6, 6, 6, (Color) new Color(153, 50, 204)));
		setContentPane(contentPane);
		setUndecorated(true);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(4, 4, 4, 5, (Color) new Color(65, 105, 225)));
		panel.setBackground(new Color(173, 216, 230));
		panel.setBounds(56, 63, 634, 488);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome to Online Vaccination Centre");
		lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 28));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(50, 305, 528, 142);
		panel.add(lblNewLabel);
		
		JButton login = new JButton("Login");
		login.setBorderPainted(false);
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginPage lg=new LoginPage();
				lg.setVisible(true);
				setVisible(false);
			}
		});
		login.setFont(new Font("Tahoma", Font.BOLD, 23));
		login.setBackground(new Color(0, 255, 127));
		login.setBounds(857, 191, 175, 57);
		contentPane.add(login);
		
		JButton signUp = new JButton("Sign Up");
		signUp.setBorderPainted(false);
		signUp.setBorder(new LineBorder(new Color(220, 20, 60), 5, true));
		signUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegistrationPage rg=new RegistrationPage();
				rg.setVisible(true);
				setVisible(false);
			}
		});
		signUp.setFont(new Font("Tahoma", Font.BOLD, 23));
		signUp.setBackground(new Color(255, 160, 122));
		signUp.setBounds(857, 343, 175, 57);
		contentPane.add(signUp);
		
		
		JLabel lblNewLabel_1 = new JLabel("Don't have an account?,   Sign up.");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(837, 306, 353, 27);
		contentPane.add(lblNewLabel_1);
	}
}
