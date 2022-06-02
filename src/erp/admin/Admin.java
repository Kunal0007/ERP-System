package erp.admin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import erp.database.DataBaseConnection;
import erp.login.LoginFrame;
import erp.student.StudentData;

import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;
import javax.swing.JTable;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

@SuppressWarnings("serial")
public class Admin extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JPanel panel_2;
	private int currentCard = 1;
	CardLayout c1;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_13;
	
	
	private String Rollnumber;
	private String Name;
	private String Course;
	private String DOB;
	private String Contact;
	private String EmailId;
	
	private String CourseCode;
	private String CourseName;
	private String SemesterYear;
	
	private StudentData s;
	private JTable table;
	private JTable table2;
	private JTable table3;
	String[] columnNames = {"Name", "Course", "Roll_No", "DateOfBirth", "Contact", "EmailID"};
	DefaultTableModel model = new DefaultTableModel(columnNames, 0);
	String[] columnNames2 = {"Course Code", "Course Name", "Semester/Year"};
	DefaultTableModel model2 = new DefaultTableModel(columnNames2, 0);
	String[] columnNames3 = {"Course Name", "Feedback"};
	DefaultTableModel model3 = new DefaultTableModel(columnNames3, 0);
	Connection con = DataBaseConnection.getConnection();
	private JTextField textField_2;
	static Admin frame;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					if(DataBaseConnection.checkconnection()) {
						frame = new Admin(null);
						frame.setVisible(true);
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Start the Database Server first","Error",JOptionPane.ERROR_MESSAGE);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
	
	public Admin(String n) {
		
		showAllCourses();
		
		setTitle("Admin");
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
		
		JLabel lblNewLabel_1 = new JLabel("ADMIN");
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
		
		JLabel lblNewLabel_2 = new JLabel("Hii, " + n);
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Poppins Medium", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(99, 34, 164, 43);
		panel_2.add(lblNewLabel_2);
		
		
		JButton btnNewButton = new JButton("Courses");
		btnNewButton.setFont(new Font("Poppins Medium", Font.PLAIN, 16));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(23, 35, 51));
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBounds(0, 121, 302, 65);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Students Details");
		btnNewButton_1.setFont(new Font("Poppins Medium", Font.PLAIN, 16));
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(23, 35, 51));
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setBounds(0, 204, 302, 65);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Feedback");
		btnNewButton_2.setFont(new Font("Poppins Medium", Font.PLAIN, 16));
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBackground(new Color(23, 35, 51));
		btnNewButton_2.setBorderPainted(false);
		btnNewButton_2.setBounds(0, 289, 302, 65);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Search Student");
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
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		panel_3.add(panel_4, "course");
		panel_4.setLayout(null);
		
		table2 = new JTable();
		table2.setBounds(10, 29, 709, 258);
		table2.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		table2.setFillsViewportHeight(true);
		JScrollPane scroll2 = new JScrollPane(table2);
		scroll2.setSize(690, 250);
		scroll2.setLocation(20, 40);
		scroll2.setHorizontalScrollBarPolicy(
		JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scroll2.setVerticalScrollBarPolicy(
		JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED); 
		scroll2.setViewportView(table2);
		table2.setModel(model2);
		panel_4.add(scroll2);
		
		JLabel lblNewLabel_3 = new JLabel("Courses");
		lblNewLabel_3.setBounds(0, 0, 729, 500);
		lblNewLabel_3.setFont(new Font("Poppins SemiBold", Font.PLAIN, 20));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setVerticalAlignment(SwingConstants.TOP);
		panel_4.add(lblNewLabel_3);
		
		JButton btnNewButton_4 = new JButton("ADD");
		btnNewButton_4.setFont(new Font("Poppins Medium", Font.PLAIN, 16));
		btnNewButton_4.setBounds(75, 443, 170, 46);
		panel_4.add(btnNewButton_4);
		
		JButton btnNewButton_4_1 = new JButton("DELETE");
		btnNewButton_4_1.setFont(new Font("Poppins Medium", Font.PLAIN, 16));
		btnNewButton_4_1.setBounds(508, 443, 170, 46);
		panel_4.add(btnNewButton_4_1);
		
		textField = new JTextField();
		textField.setBounds(135, 331, 142, 27);
		panel_4.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(135, 369, 142, 27);
		panel_4.add(textField_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(536, 334, 142, 27);
		panel_4.add(textField_3);
		
		JLabel lblNewLabel_7 = new JLabel("Course Code :");
		lblNewLabel_7.setFont(new Font("Poppins Medium", Font.PLAIN, 15));
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_7.setBounds(15, 331, 119, 27);
		panel_4.add(lblNewLabel_7);
		
		JLabel lblNewLabel_7_1 = new JLabel("Course Name :");
		lblNewLabel_7_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_7_1.setFont(new Font("Poppins Medium", Font.PLAIN, 15));
		lblNewLabel_7_1.setBounds(10, 369, 119, 27);
		panel_4.add(lblNewLabel_7_1);
		
		JLabel lblNewLabel_7_1_1 = new JLabel("Semester/Year :");
		lblNewLabel_7_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_7_1_1.setFont(new Font("Poppins Medium", Font.PLAIN, 15));
		lblNewLabel_7_1_1.setBounds(0, 407, 142, 27);
		panel_4.add(lblNewLabel_7_1_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(135, 405, 142, 27);
		panel_4.add(textField_2);
		
		JLabel lblNewLabel_7_2 = new JLabel("Course Code :");
		lblNewLabel_7_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_7_2.setFont(new Font("Poppins Medium", Font.PLAIN, 15));
		lblNewLabel_7_2.setBounds(407, 337, 119, 27);
		panel_4.add(lblNewLabel_7_2);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.WHITE);
		panel_3.add(panel_5, "studdetails");
		panel_5.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Students Details");
		lblNewLabel_4.setBounds(0, 0, 729, 500);
		lblNewLabel_4.setFont(new Font("Poppins Medium", Font.PLAIN, 20));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setVerticalAlignment(SwingConstants.TOP);
		panel_5.add(lblNewLabel_4);
		
//		JPanel panel_9 = new JPanel();
//		panel_9.setBounds(10, 29, 709, 258);
//		panel_5.add(panel_9);
//		panel_9.setLayout(null);
//		
		JButton btnNewButton_5 = new JButton("Add");
		btnNewButton_5.setFont(new Font("Poppins Medium", Font.PLAIN, 16));
		btnNewButton_5.setBounds(83, 441, 141, 48);
		panel_5.add(btnNewButton_5);
		
		JButton btnNewButton_5_1 = new JButton("Delete");
		btnNewButton_5_1.setFont(new Font("Poppins Medium", Font.PLAIN, 16));
		btnNewButton_5_1.setBounds(548, 441, 141, 48);
		panel_5.add(btnNewButton_5_1);
		
		textField_4 = new JTextField();
		textField_4.setBounds(95, 299, 129, 30);
		panel_5.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(95, 339, 129, 30);
		panel_5.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(95, 384, 129, 30);
		panel_5.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(339, 298, 129, 30);
		panel_5.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(339, 339, 129, 30);
		panel_5.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(339, 384, 129, 30);
		panel_5.add(textField_9);
		
		JLabel lblNewLabel_8 = new JLabel(" Name  : ");
		lblNewLabel_8.setFont(new Font("Poppins Medium", Font.PLAIN, 15));
		lblNewLabel_8.setBounds(20, 298, 66, 31);
		panel_5.add(lblNewLabel_8);
		
		JLabel lblNewLabel_8_1 = new JLabel("Roll No.  : ");
		lblNewLabel_8_1.setFont(new Font("Poppins Medium", Font.PLAIN, 15));
		lblNewLabel_8_1.setBounds(14, 339, 75, 31);
		panel_5.add(lblNewLabel_8_1);
		
		JLabel lblNewLabel_8_2 = new JLabel("Phone No. : ");
		lblNewLabel_8_2.setFont(new Font("Poppins Medium", Font.PLAIN, 15));
		lblNewLabel_8_2.setBounds(0, 384, 97, 31);
		panel_5.add(lblNewLabel_8_2);
		
		JLabel lblNewLabel_8_3 = new JLabel("Email ID  :");
		lblNewLabel_8_3.setFont(new Font("Poppins Medium", Font.PLAIN, 15));
		lblNewLabel_8_3.setBounds(254, 298, 75, 31);
		panel_5.add(lblNewLabel_8_3);
		
		JLabel lblNewLabel_8_4 = new JLabel("DOB  :");
		lblNewLabel_8_4.setFont(new Font("Poppins Medium", Font.PLAIN, 15));
		lblNewLabel_8_4.setBounds(284, 341, 50, 31);
		panel_5.add(lblNewLabel_8_4);
		
		JLabel lblNewLabel_8_5 = new JLabel("Course  :");
		lblNewLabel_8_5.setFont(new Font("Poppins Medium", Font.PLAIN, 15));
		lblNewLabel_8_5.setBounds(261, 383, 75, 31);
		panel_5.add(lblNewLabel_8_5);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(595, 384, 110, 30);
		panel_5.add(textField_10);
		
		JButton btnNewButton_5_1_1 = new JButton("Update");
		btnNewButton_5_1_1.setFont(new Font("Poppins Medium", Font.PLAIN, 16));
		btnNewButton_5_1_1.setBounds(327, 441, 141, 48);
		panel_5.add(btnNewButton_5_1_1);
		
		JLabel lblNewLabel_8_1_1 = new JLabel("Roll No.  : ");
		lblNewLabel_8_1_1.setFont(new Font("Poppins Medium", Font.PLAIN, 15));
		lblNewLabel_8_1_1.setBounds(524, 383, 75, 31);
		panel_5.add(lblNewLabel_8_1_1);
		
		
		table = new JTable();
		table.setBounds(10, 29, 709, 258);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		table.setFillsViewportHeight(true);
		JScrollPane scroll = new JScrollPane(table);
		scroll.setSize(690, 250);
		scroll.setLocation(20, 40);
		scroll.setHorizontalScrollBarPolicy(
		JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scroll.setVerticalScrollBarPolicy(
		JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED); 
		scroll.setViewportView(table);
		table.setModel(model);
		panel_5.add(scroll);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.WHITE);
		panel_3.add(panel_6, "feedback");
		panel_6.setLayout(null);
		
		table3 = new JTable();
		table3.setBounds(10, 29, 709, 258);
		table3.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		table3.setFillsViewportHeight(true);
		JScrollPane scroll3 = new JScrollPane(table3);
		scroll3.setSize(690, 250);
		scroll3.setLocation(20, 40);
		scroll3.setHorizontalScrollBarPolicy(
		JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scroll3.setVerticalScrollBarPolicy(
		JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED); 
		scroll3.setViewportView(table3);
		table3.setModel(model3);
		panel_6.add(scroll3);
		
		JLabel lblNewLabel_5 = new JLabel("Feedback");
		lblNewLabel_5.setBounds(0, 0, 729, 500);
		lblNewLabel_5.setFont(new Font("Poppins Medium", Font.PLAIN, 20));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setVerticalAlignment(SwingConstants.TOP);
		panel_6.add(lblNewLabel_5);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(Color.WHITE);
		panel_3.add(panel_7, "addadmin");
		panel_7.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("Search Student");
		lblNewLabel_6.setBounds(0, 0, 729, 500);
		lblNewLabel_6.setFont(new Font("Poppins SemiBold", Font.PLAIN, 20));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setVerticalAlignment(SwingConstants.TOP);
		panel_7.add(lblNewLabel_6);
		
		JButton btnNewButton_7 = new JButton("Search");
		btnNewButton_7.setFont(new Font("Poppins Medium", Font.PLAIN, 16));
		btnNewButton_7.setBounds(283, 130, 157, 43);
		panel_7.add(btnNewButton_7);
		
		textField_13 = new JTextField();
		textField_13.setBounds(363, 73, 150, 34);
		panel_7.add(textField_13);
		textField_13.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("Roll No.");
		lblNewLabel_10.setFont(new Font("Poppins Medium", Font.PLAIN, 15));
		lblNewLabel_10.setBounds(210, 73, 135, 34);
		panel_7.add(lblNewLabel_10);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBounds(10, 180, 709, 309);
		panel_7.add(panel_8);
		panel_8.setLayout(null);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c1.show(panel_3, "course");
				model2.setRowCount(0);
				showAllCourses();
				panel_4.invalidate();
				panel_4.validate();
				panel_4.repaint();
			}
		});
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c1.show(panel_3, "studdetails");
				model.setRowCount(0);
				showAllStudent();
				panel_5.invalidate();
				panel_5.validate();
				panel_5.repaint();
				System.out.print(currentCard);
			}
		});
		
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c1.show(panel_3, "feedback");
				model3.setRowCount(0);
				showFeedback();
				panel_6.invalidate();
				panel_6.validate();
				panel_6.repaint();
				System.out.print(currentCard);
			}
		});
		
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c1.show(panel_3, "addadmin");
				System.out.print(currentCard);
			}
		});
		
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(addStudent()) {
					JOptionPane.showMessageDialog(null, "Student Added!!");
					model.setRowCount(0);
					showAllStudent();
					cleartextField();
					panel_5.invalidate();
					panel_5.validate();
					panel_5.repaint();
				}
				else {
					JOptionPane.showMessageDialog(null, "Internal Error");
				}
			}
		});
		
		btnNewButton_5_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(updateStudent()) {
					JOptionPane.showMessageDialog(null, "Student Updated!!");
					model.setRowCount(0);
					showAllStudent();
					cleartextField();
					panel_5.invalidate();
					panel_5.validate();
					panel_5.repaint();
				}
				else {
					JOptionPane.showMessageDialog(null, "Internal Error");
				}
			}
		});
		
		btnNewButton_5_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(deleteStudent()) {
					JOptionPane.showMessageDialog(null, "Student Deleted!!");
					model.setRowCount(0);
					showAllStudent();
					cleartextField();
					panel_5.invalidate();
					panel_5.validate();
					panel_5.repaint();
				}
				else {
					JOptionPane.showMessageDialog(null, "Student Not Found");
					cleartextField();
					panel_8.invalidate();
					panel_8.validate();
					panel_8.repaint();
				}
			}
		});
		
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(addCourse()) {
					JOptionPane.showMessageDialog(null, "Course Added!!");
					model2.setRowCount(0);
					showAllCourses();
					cleartextField();
					panel_4.invalidate();
					panel_4.validate();
					panel_4.repaint();
				}
				else {
					JOptionPane.showMessageDialog(null, "Internal Error");
				}
			}
		});
		
		btnNewButton_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(deleteCourse()) {
					JOptionPane.showMessageDialog(null, "Course Deleted!!");
					model2.setRowCount(0);
					showAllCourses();
					cleartextField();
					panel_4.invalidate();
					panel_4.validate();
					panel_4.repaint();
				}
				else {
					JOptionPane.showMessageDialog(null, "Course Not Found");
					cleartextField();
					panel_8.invalidate();
					panel_8.validate();
					panel_8.repaint();
				}
			}
		});
		
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				panel_8.removeAll();
				
				StudentData s = new StudentData();
				if(s.getStudentDetails(textField_13.getText())) {
					
				
					JLabel lblNewLabel_8 = new JLabel("Name  : ");
					lblNewLabel_8.setFont(new Font("Dialog", Font.PLAIN, 20));
					lblNewLabel_8.setBounds(238, 54, 101, 31);
					panel_8.add(lblNewLabel_8);
					
					JLabel lblNewLabel_8_1 = new JLabel("Course. :  ");
					lblNewLabel_8_1.setFont(new Font("Dialog", Font.PLAIN, 20));
					lblNewLabel_8_1.setBounds(225, 91, 93, 30);
					panel_8.add(lblNewLabel_8_1);
					
					JLabel lblNewLabel_8_2 = new JLabel("Roll No.  :  ");
					lblNewLabel_8_2.setFont(new Font("Dialog", Font.PLAIN, 20));
					lblNewLabel_8_2.setBounds(219, 131, 106, 31);
					panel_8.add(lblNewLabel_8_2);
					
					JLabel lblNewLabel_8_3 = new JLabel("Date of Birth  :  ");
					lblNewLabel_8_3.setFont(new Font("Dialog", Font.PLAIN, 20));
					lblNewLabel_8_3.setBounds(177, 172, 148, 31);
					panel_8.add(lblNewLabel_8_3);
					
					JLabel lblNewLabel_8_4 = new JLabel("Phone No. :  ");
					lblNewLabel_8_4.setFont(new Font("Dialog", Font.PLAIN, 20));
					lblNewLabel_8_4.setBounds(204, 213, 124, 31);
					panel_8.add(lblNewLabel_8_4);
					
					JLabel lblNewLabel_8_5 = new JLabel("Email Id :  ");
					lblNewLabel_8_5.setFont(new Font("Dialog", Font.PLAIN, 20));
					lblNewLabel_8_5.setBounds(225, 254, 101, 31);
					panel_8.add(lblNewLabel_8_5);
					
					
					JLabel lblNewLabel_8_6 = new JLabel(s.getName());
					lblNewLabel_8_6.setFont(new Font("Dialog", Font.PLAIN, 20));
					lblNewLabel_8_6.setBounds(360, 54, 129, 31);
					panel_8.add(lblNewLabel_8_6);
					
					JLabel lblNewLabel_8_1_1 = new JLabel(s.getCourse());
					lblNewLabel_8_1_1.setFont(new Font("Dialog", Font.PLAIN, 20));
					lblNewLabel_8_1_1.setBounds(360, 91, 142, 30);
					panel_8.add(lblNewLabel_8_1_1);
					
					JLabel lblNewLabel_8_2_1 = new JLabel(s.getRollNumber());
					lblNewLabel_8_2_1.setFont(new Font("Dialog", Font.PLAIN, 20));
					lblNewLabel_8_2_1.setBounds(360, 131, 142, 31);
					panel_8.add(lblNewLabel_8_2_1);
					
					JLabel lblNewLabel_8_3_1 = new JLabel(s.getDOB());
					lblNewLabel_8_3_1.setFont(new Font("Dialog", Font.PLAIN, 20));
					lblNewLabel_8_3_1.setBounds(360, 172, 129, 31);
					panel_8.add(lblNewLabel_8_3_1);
					
					
					JLabel lblNewLabel_8_4_1 = new JLabel(s.getContact());
					lblNewLabel_8_4_1.setFont(new Font("Dialog", Font.PLAIN, 20));
					lblNewLabel_8_4_1.setBounds(360, 213, 129, 31);
					panel_8.add(lblNewLabel_8_4_1);
					
					JLabel lblNewLabel_8_5_1 = new JLabel(s.getEmail());
					lblNewLabel_8_5_1.setFont(new Font("Dialog", Font.PLAIN, 20));
					lblNewLabel_8_5_1.setBounds(360, 254, 168, 31);
					panel_8.add(lblNewLabel_8_5_1);
					
					cleartextField();
					panel_8.invalidate();
					panel_8.validate();
					panel_8.repaint();
				}
				else {
					JOptionPane.showMessageDialog(null, "Student Not Found");
					cleartextField();
					panel_8.invalidate();
					panel_8.validate();
					panel_8.repaint();
				}
			}
		});
		
	}

	protected boolean addStudent() {
		// TODO Auto-generated method stub
		StudentData s = new StudentData();
		
		Name = textField_4.getText();
		Rollnumber = textField_5.getText();
		Contact = textField_6.getText();
		EmailId = textField_7.getText();
		DOB = textField_8.getText();
		Course = textField_9.getText();
		
		s.setName(Name);
		s.setContact(Contact);
		s.setCourse(Course);
		s.setDOB(DOB);
		s.setEmail(EmailId);
		s.setRollNumber(Rollnumber);
		
		return s.insertStudentDetails();
		
	}
	
	protected boolean updateStudent() {
		// TODO Auto-generated method stub
		StudentData s = new StudentData();
		
		Name = textField_4.getText();
		Rollnumber = textField_5.getText();
		Contact = textField_6.getText();
		EmailId = textField_7.getText();
		DOB = textField_8.getText();
		Course = textField_9.getText();
		
		s.setName(Name);
		s.setContact(Contact);
		s.setCourse(Course);
		s.setDOB(DOB);
		s.setEmail(EmailId);
		s.setRollNumber(Rollnumber);
		
		return s.updateStudentDetails(Rollnumber);
		
	}
	
	protected boolean deleteStudent() {
		// TODO Auto-generated method stub
		StudentData s = new StudentData();
		
		String Rollnumber = textField_10.getText();
		
		
		return s.deleteStudentDetails(Rollnumber);
		
	}
	
	
	public void showAllStudent() {
		
		String query="Select Name, Course, Roll_No, DateOfBirth, Contact, EmailID from student";
		try
		{
			Statement st = con.createStatement();
			ResultSet rs=st.executeQuery(query);
			
			while(rs.next()) {
			    String Name = rs.getString("Name");
			    String Course = rs.getString("Course");
			    String Roll_No = rs.getString("Roll_No");
			    String DateOfBirth = rs.getString("DateOfBirth");
			    String Contact = rs.getString("Contact");
			    String EmailID = rs.getString("EmailID");
			    
			    String[] data = {Name, Course, Roll_No, DateOfBirth, Contact, EmailID } ;
			    
			    model.addRow(data);
			    System.out.println(model.getRowCount());
			    System.out.println(model.getColumnCount());
			}
			
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	public void showAllCourses() {
			
			String query="Select CourseCode, CourseName, SemesterorYear from Courses";
			try
			{
				Statement st = con.createStatement();
				ResultSet rs=st.executeQuery(query);
				
				while(rs.next()) {
				    String CourseCode = rs.getString("CourseCode");
				    String CourseName = rs.getString("CourseName");
				    String SemesterYear = rs.getString("SemesterorYear");
				    
				    
				    String[] data1 = {CourseCode, CourseName, SemesterYear} ;
				    
				    model2.addRow(data1);
				    System.out.println(model2.getRowCount());
				    System.out.println(model2.getColumnCount());
				}
				
			}
			
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
		}

	protected boolean addCourse() {
		// TODO Auto-generated method stub
		Course c = new Course();
		
		CourseCode = textField.getText();
		CourseName = textField_1.getText();
		SemesterYear = textField_2.getText();
		
		
		c.setCourseCode(CourseCode);
		c.setCourseName(CourseName);
		c.setSemesterYear(SemesterYear);
		
		return c.insertCourseDetails();
		
		
	}
	
	protected boolean deleteCourse() {
		// TODO Auto-generated method stub
		Course c = new Course();
		
		String CourseCode = textField_3.getText();
		
		
		return c.deleteCourseDetails(CourseCode);
		
	}
	
	public void showFeedback() {
		
		String query="Select CourseName, Comment from Feedback";
		try
		{
			Statement st = con.createStatement();
			ResultSet rs=st.executeQuery(query);
			
			while(rs.next()) {
			    String CourseName = rs.getString("CourseName");
			    String Feedback = rs.getString("Comment");
			    
			    
			    String[] data1 = {CourseName, Feedback} ;
			    
			    model3.addRow(data1);
			    System.out.println(model3.getRowCount());
			    System.out.println(model3.getColumnCount());
			}
			
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	public void cleartextField() {
		
		textField.setText(null);
		textField_1.setText(null);
		textField_2.setText(null);
		textField_2.setText(null);
		textField_3.setText(null);
		textField_4.setText(null);
		textField_5.setText(null);
		textField_6.setText(null);
		textField_7.setText(null);
		textField_8.setText(null);
		textField_9.setText(null);
		textField_10.setText(null);
		textField_13.setText(null);
	}
}
