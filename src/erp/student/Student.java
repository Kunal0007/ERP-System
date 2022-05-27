package erp.student;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import erp.admin.Admin;

public class Student extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JPanel panel_2;
	private String name;
	private int currentCard = 1;
	CardLayout c1;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Student frame = new Student();
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
	public Student() {
		setTitle("Student");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1047,650);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(0, 139, 139, 220));
		panel_1.setBounds(0, 11, 1031, 101);
		contentPane.add(panel_1);
		
		JLabel lblNewLabel_1 = new JLabel("STUDENT");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Poppins ExtraBold", Font.BOLD, 40));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(372, 11, 338, 79);
		panel_1.add(lblNewLabel_1);
		
		panel = new JPanel();
		panel.setBounds(0, 111, 302, 500);
		panel.setBackground(new Color(23, 35, 51));
		contentPane.add(panel);
		panel.setLayout(null);
		
		panel_2 = new JPanel();
		panel_2.setBackground(new Color(23, 35, 51));
		panel_2.setBounds(0, 0, 302, 110);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("F:\\eclipse\\ERP\\ERP System\\assets\\icons8-administrator-male-skin-type-7-48.png"));
		lblNewLabel.setBounds(36, 34, 53, 43);
		panel_2.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Hii, " + name);
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Poppins Medium", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(99, 34, 164, 43);
		panel_2.add(lblNewLabel_2);
		
		
		JButton btnNewButton = new JButton("Personal Details");
		btnNewButton.setFont(new Font("Poppins Medium", Font.PLAIN, 16));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(23, 35, 51));
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBounds(0, 121, 302, 65);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Enrolled Courses");
		btnNewButton_1.setFont(new Font("Poppins Medium", Font.PLAIN, 16));
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(23, 35, 51));
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setBounds(0, 204, 302, 65);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Fees Paid");
		btnNewButton_2.setFont(new Font("Poppins Medium", Font.PLAIN, 16));
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBackground(new Color(23, 35, 51));
		btnNewButton_2.setBorderPainted(false);
		btnNewButton_2.setBounds(0, 289, 302, 65);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Feedback");
		btnNewButton_3.setFont(new Font("Poppins Medium", Font.PLAIN, 16));
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setBackground(new Color(23, 35, 51));
		btnNewButton_3.setBorderPainted(false);
		btnNewButton_3.setBounds(0, 377, 302, 65);
		panel.add(btnNewButton_3);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(302, 111, 729, 500);
		contentPane.add(panel_3);
		panel_3.setLayout(new CardLayout(0, 0));
		c1 = (CardLayout)(panel_3.getLayout());
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.WHITE);
		panel_3.add(panel_5, "studdetails");
		panel_5.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		panel_3.add(panel_4, "course");
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Courses");
		lblNewLabel_3.setBounds(0, 0, 739, 510);
		lblNewLabel_3.setFont(new Font("Poppins SemiBold", Font.PLAIN, 20));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setVerticalAlignment(SwingConstants.TOP);
		panel_4.add(lblNewLabel_3);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBounds(110, 63, 535, 46);
		panel_4.add(panel_8);
		
		
		
		JLabel lblNewLabel_8 = new JLabel("Name  : ");
		lblNewLabel_8.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblNewLabel_8.setBounds(238, 84, 101, 31);
		panel_5.add(lblNewLabel_8);
		
		JLabel lblNewLabel_8_1 = new JLabel("Email ID  :  ");
		lblNewLabel_8_1.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblNewLabel_8_1.setBounds(214, 121, 114, 30);
		panel_5.add(lblNewLabel_8_1);
		
		JLabel lblNewLabel_8_2 = new JLabel("Roll No.  :  ");
		lblNewLabel_8_2.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblNewLabel_8_2.setBounds(219, 161, 106, 31);
		panel_5.add(lblNewLabel_8_2);
		
		JLabel lblNewLabel_8_3 = new JLabel("Division  :  ");
		lblNewLabel_8_3.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblNewLabel_8_3.setBounds(224, 202, 101, 31);
		panel_5.add(lblNewLabel_8_3);
		
		JLabel lblNewLabel_8_4 = new JLabel("Course. :  ");
		lblNewLabel_8_4.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblNewLabel_8_4.setBounds(227, 243, 101, 31);
		panel_5.add(lblNewLabel_8_4);
		
		JLabel lblNewLabel_8_5 = new JLabel("Phone No. :  ");
		lblNewLabel_8_5.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblNewLabel_8_5.setBounds(204, 284, 135, 31);
		panel_5.add(lblNewLabel_8_5);
		
		JLabel lblNewLabel_4 = new JLabel("DETAILS");
		lblNewLabel_4.setFont(new Font("Dialog", Font.PLAIN, 30));
		lblNewLabel_4.setBounds(266, 26, 148, 48);
		panel_5.add(lblNewLabel_4);
		
		JLabel lblNewLabel_8_6 = new JLabel("Name");
		lblNewLabel_8_6.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblNewLabel_8_6.setBounds(360, 84, 101, 31);
		panel_5.add(lblNewLabel_8_6);
		
		JLabel lblNewLabel_8_1_1 = new JLabel("Email ID ");
		lblNewLabel_8_1_1.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblNewLabel_8_1_1.setBounds(360, 121, 114, 30);
		panel_5.add(lblNewLabel_8_1_1);
		
		JLabel lblNewLabel_8_2_1 = new JLabel("Roll No. ");
		lblNewLabel_8_2_1.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblNewLabel_8_2_1.setBounds(360, 161, 101, 31);
		panel_5.add(lblNewLabel_8_2_1);
		
		JLabel lblNewLabel_8_3_1 = new JLabel("Course  ");
		lblNewLabel_8_3_1.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblNewLabel_8_3_1.setBounds(360, 202, 101, 31);
		panel_5.add(lblNewLabel_8_3_1);
		
		JLabel lblNewLabel_8_4_1 = new JLabel("Phone No. ");
		lblNewLabel_8_4_1.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblNewLabel_8_4_1.setBounds(360, 243, 129, 31);
		panel_5.add(lblNewLabel_8_4_1);
		
		JLabel lblNewLabel_8_5_1 = new JLabel("Division  ");
		lblNewLabel_8_5_1.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblNewLabel_8_5_1.setBounds(360, 284, 101, 31);
		panel_5.add(lblNewLabel_8_5_1);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBounds(0, 400, 729, 100);
		panel_11.setBackground(new Color(0, 139, 139, 220));
		panel_5.add(panel_11);
		panel_11.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("Pimpri Chinchwad College of Engineering , Pune");
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_6.setBounds(130, 10, 495, 80);
		panel_11.add(lblNewLabel_6);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.WHITE);
		panel_3.add(panel_6, "attendance");
		panel_6.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("Attendance");
		lblNewLabel_5.setBounds(0, 0, 729, 500);
		lblNewLabel_5.setFont(new Font("Poppins Medium", Font.PLAIN, 20));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setVerticalAlignment(SwingConstants.TOP);
		panel_6.add(lblNewLabel_5);
		
		textField_11 = new JTextField();
		textField_11.setBounds(94, 307, 128, 33);
		panel_6.add(textField_11);
		textField_11.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(94, 351, 128, 33);
		panel_6.add(textField_12);
		
		JLabel lblNewLabel_9 = new JLabel("New label");
		lblNewLabel_9.setFont(new Font("Poppins Medium", Font.PLAIN, 15));
		lblNewLabel_9.setBounds(10, 307, 74, 33);
		panel_6.add(lblNewLabel_9);
		
		JLabel lblNewLabel_9_1 = new JLabel("New label");
		lblNewLabel_9_1.setFont(new Font("Poppins Medium", Font.PLAIN, 15));
		lblNewLabel_9_1.setBounds(10, 351, 74, 33);
		panel_6.add(lblNewLabel_9_1);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(Color.WHITE);
		panel_3.add(panel_7, "addadmin");
		panel_7.setLayout(null);
		
		JButton btnNewButton_7 = new JButton("Submit");
		btnNewButton_7.setFont(new Font("Poppins Medium", Font.PLAIN, 16));
		btnNewButton_7.setBounds(302, 268, 157, 43);
		panel_7.add(btnNewButton_7);
		
		textField_13 = new JTextField();
		textField_13.setBounds(112, 143, 544, 102);
		panel_7.add(textField_13);
		textField_13.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("Enter Feedback");
		lblNewLabel_10.setFont(new Font("Dialog", Font.PLAIN, 26));
		lblNewLabel_10.setBounds(282, 88, 199, 34);
		panel_7.add(lblNewLabel_10);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBackground(new Color(0, 139, 139, 220));
		panel_9.setBounds(0, 400, 729, 100);
		panel_7.add(panel_9);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c1.show(panel_3, "studdetails");
				System.out.print(currentCard);
			}
		});
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c1.show(panel_3, "course");
				System.out.print(currentCard);
			}
		});
		
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c1.show(panel_3, "attendance");
				System.out.print(currentCard);
			}
		});
		
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c1.show(panel_3, "addadmin");
				System.out.print(currentCard);
			}
		});
		
	}
}

