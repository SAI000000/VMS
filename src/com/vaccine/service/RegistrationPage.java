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
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JButton;
import com.toedter.calendar.JYearChooser;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDayChooser;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;

public class RegistrationPage extends JFrame {

	private JPanel contentPane;
	private JTextField firstname;
	private JTextField middlename;
	private JTextField lastname;
	private JTextField phone;
	private JTextField email;
	private JTextField txtAssjdfkjlasflkjasdlkflks;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistrationPage frame = new RegistrationPage();
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
	public RegistrationPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(160, 0, 1200, 800);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(224, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 1180, 109);
		panel.setBackground(new Color(218, 112, 214));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Registration Page");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(330, 10, 473, 89);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("First Name:");
		lblNewLabel_1.setBounds(172, 190, 141, 45);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Middle Name:");
		lblNewLabel_1_1.setBounds(172, 252, 141, 45);
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Last Name:");
		lblNewLabel_1_2.setBounds(172, 312, 141, 45);
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Phone No:");
		lblNewLabel_1_3.setBounds(172, 372, 141, 45);
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Email Id:");
		lblNewLabel_1_4.setBounds(172, 437, 141, 45);
		lblNewLabel_1_4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_4_1 = new JLabel("Date of Birth:");
		lblNewLabel_1_4_1.setBounds(172, 504, 141, 45);
		lblNewLabel_1_4_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_4_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblNewLabel_1_4_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Male");
		rdbtnNewRadioButton.setBounds(797, 251, 99, 45);
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdbtnNewRadioButton.setHorizontalAlignment(SwingConstants.LEFT);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setBounds(942, 251, 117, 45);
		rdbtnFemale.setHorizontalAlignment(SwingConstants.LEFT);
		rdbtnFemale.setFont(new Font("Tahoma", Font.BOLD, 20));
		contentPane.add(rdbtnFemale);
		
		JLabel lblNewLabel_1_4_1_1 = new JLabel("Gender:");
		lblNewLabel_1_4_1_1.setBounds(630, 252, 141, 45);
		lblNewLabel_1_4_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_4_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblNewLabel_1_4_1_1);
		
		firstname = new JTextField();	 
		firstname.setBounds(323, 193, 219, 45);
		firstname.setFont(new Font("Tahoma", Font.PLAIN, 17));
		contentPane.add(firstname);
		firstname.setColumns(10);
		
		middlename = new JTextField();
		middlename.setBounds(323, 252, 219, 45);
		middlename.setColumns(10);
		contentPane.add(middlename);
		
		lastname = new JTextField();
		lastname.setBounds(323, 312, 219, 45);
		lastname.setColumns(10);
		contentPane.add(lastname);
		
		phone = new JTextField();
		phone.setBounds(323, 372, 219, 45);
		phone.setColumns(10);
		contentPane.add(phone);
		
		email = new JTextField();
		email.setBounds(323, 437, 219, 45);
		email.setColumns(10);
		contentPane.add(email);
		
		txtAssjdfkjlasflkjasdlkflks = new JTextField();
		txtAssjdfkjlasflkjasdlkflks.setBounds(797, 330, 336, 135);
		txtAssjdfkjlasflkjasdlkflks.setForeground(new Color(0, 0, 0));
		txtAssjdfkjlasflkjasdlkflks.setHorizontalAlignment(SwingConstants.LEFT);
		txtAssjdfkjlasflkjasdlkflks.setColumns(10);
		contentPane.add(txtAssjdfkjlasflkjasdlkflks);
		
		JLabel lblNewLabel_1_4_1_2 = new JLabel("Address:");
		lblNewLabel_1_4_1_2.setBounds(630, 326, 141, 45);
		lblNewLabel_1_4_1_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_4_1_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblNewLabel_1_4_1_2);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(834, 582, 175, 57);
		btnSubmit.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnSubmit.setBorderPainted(false);
		btnSubmit.setBackground(new Color(0, 255, 127));
		contentPane.add(btnSubmit);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBounds(834, 696, 175, 57);
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnReset.setBorderPainted(false);
		btnReset.setBackground(new Color(255, 69, 0));
		contentPane.add(btnReset);
		
		JCalendar calendar = new JCalendar();
		calendar.setBounds(336, 510, 219, 186);
		contentPane.add(calendar);
		setUndecorated(true);
	}
}
