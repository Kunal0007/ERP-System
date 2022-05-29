package erp.student;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;


import erp.database.DataBaseConnection;

public class Student extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JPanel panel_2;
	private String name;
	private String rollno;
	private String CourseName;
	private String Feedback;
	private String CourseDetails;
	private int currentCard = 1;
	CardLayout c1;
	private JTextField textField_13;
	private StudentData s;
	Connection con = DataBaseConnection.getConnection();


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					if(DataBaseConnection.checkconnection()) {
						Student frame = new Student(null, null);
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
	
	
	public Student(String n, String r) {
		
		this.name = n;
		this.rollno = r;
		
		StudentData s = new StudentData();
		s.getStudentDetails(r);
		
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
		
		JLabel lblNewLabel_2 = new JLabel("Hii, " + n);
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
		
		JButton btnNewButton_3 = new JButton("Feedback");
		btnNewButton_3.setFont(new Font("Poppins Medium", Font.PLAIN, 16));
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setBackground(new Color(23, 35, 51));
		btnNewButton_3.setBorderPainted(false);
		btnNewButton_3.setBounds(0, 280, 302, 65);
		panel.add(btnNewButton_3);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(302, 111, 729, 500);
		contentPane.add(panel_3);
		panel_3.setLayout(new CardLayout(0, 0));
		c1 = (CardLayout)(panel_3.getLayout());
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.WHITE);
		panel_3.add(panel_5, "PersonalDetails");
		panel_5.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		panel_3.add(panel_4, "EnrolledCourse");
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Courses");
		lblNewLabel_3.setBounds(0, 0, 739, 510);
		lblNewLabel_3.setFont(new Font("Poppins SemiBold", Font.PLAIN, 20));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setVerticalAlignment(SwingConstants.TOP);
		panel_4.add(lblNewLabel_3);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBounds(20, 63, 699, 391);
		panel_4.add(panel_8);
		panel_8.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel(s.getCourse());
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("Poppins Medium", Font.BOLD, 15));
		lblNewLabel_5.setBounds(253, 5, 202, 47);
		panel_8.add(lblNewLabel_5);
		
		
		JLabel lblNewLabel_8 = new JLabel("Name  : ");
		lblNewLabel_8.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblNewLabel_8.setBounds(238, 84, 101, 31);
		panel_5.add(lblNewLabel_8);
		
		JLabel lblNewLabel_8_1 = new JLabel("Course. :  ");
		lblNewLabel_8_1.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblNewLabel_8_1.setBounds(225, 121, 93, 30);
		panel_5.add(lblNewLabel_8_1);
		
		JLabel lblNewLabel_8_2 = new JLabel("Roll No.  :  ");
		lblNewLabel_8_2.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblNewLabel_8_2.setBounds(219, 161, 106, 31);
		panel_5.add(lblNewLabel_8_2);
		
		JLabel lblNewLabel_8_3 = new JLabel("Date of Birth  :  ");
		lblNewLabel_8_3.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblNewLabel_8_3.setBounds(177, 202, 148, 31);
		panel_5.add(lblNewLabel_8_3);
		
		JLabel lblNewLabel_8_4 = new JLabel("Phone No. :  ");
		lblNewLabel_8_4.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblNewLabel_8_4.setBounds(204, 243, 124, 31);
		panel_5.add(lblNewLabel_8_4);
		
		JLabel lblNewLabel_8_5 = new JLabel("Email Id :  ");
		lblNewLabel_8_5.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblNewLabel_8_5.setBounds(225, 284, 101, 31);
		panel_5.add(lblNewLabel_8_5);
		
		JLabel lblNewLabel_4 = new JLabel("DETAILS");
		lblNewLabel_4.setFont(new Font("Dialog", Font.PLAIN, 30));
		lblNewLabel_4.setBounds(266, 26, 148, 48);
		panel_5.add(lblNewLabel_4);
		
		JLabel lblNewLabel_8_6 = new JLabel(s.getName());
		lblNewLabel_8_6.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblNewLabel_8_6.setBounds(360, 84, 129, 31);
		panel_5.add(lblNewLabel_8_6);
		
		JLabel lblNewLabel_8_1_1 = new JLabel(s.getCourse());
		lblNewLabel_8_1_1.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblNewLabel_8_1_1.setBounds(360, 121, 142, 30);
		panel_5.add(lblNewLabel_8_1_1);
		
		JLabel lblNewLabel_8_2_1 = new JLabel(s.getRollNumber());
		lblNewLabel_8_2_1.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblNewLabel_8_2_1.setBounds(360, 161, 142, 31);
		panel_5.add(lblNewLabel_8_2_1);
		
		JLabel lblNewLabel_8_3_1 = new JLabel(s.getDOB());
		lblNewLabel_8_3_1.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblNewLabel_8_3_1.setBounds(360, 202, 129, 31);
		panel_5.add(lblNewLabel_8_3_1);
		
		
		JLabel lblNewLabel_8_4_1 = new JLabel(s.getContact());
		lblNewLabel_8_4_1.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblNewLabel_8_4_1.setBounds(360, 243, 129, 31);
		panel_5.add(lblNewLabel_8_4_1);
		
		JLabel lblNewLabel_8_5_1 = new JLabel(s.getEmail());
		lblNewLabel_8_5_1.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblNewLabel_8_5_1.setBounds(360, 284, 168, 31);
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
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(Color.WHITE);
		panel_3.add(panel_7, "Feedback");
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
				c1.show(panel_3, "PersonalDetails");
				System.out.print(currentCard);
			}
		});
		
		JLabel lblNewLabel_7 = new JLabel(CourseDetails);
		lblNewLabel_7.setFont(new Font("Poppins Light", Font.PLAIN, 13));
		lblNewLabel_7.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_7.setBounds(10, 83, 679, 283);
		panel_8.add(lblNewLabel_7);
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c1.show(panel_3, "EnrolledCourse");
				System.out.print(s.getCourse());
				if(s.getCourse().equals("CS")) {
					System.out.print(s.getCourse());
					CourseDetails = "Computer Science Engineering is a course that deals with design, implementation, and management of information systems of both software & hardware processes. A computer scientist specializes in theory of computation and design of computational systems. \r\n"
									 + System.lineSeparator() + "Computer Science engineering aids with various disciplines such as electrical and electronics engineering, information technology, software engineering, and more. \r\n Computer Science Engineering courses are offered at both undergraduate and postgraduate levels in the form of B.E, B.Tech, or M.Tech degree programmes. \r\n"
									+ System.lineSeparator() + "B.Tech in computer science is popular at UG, whereas M.Tech in computer science is popular at PG levels After completing a degree programme in computer science, candidates can find various entry-level jobs in the IT industry or related fields, given they fulfill the required skill set such as knowledge of subjects like "
									+ System.lineSeparator() + "	programming, database management, data structures and more. ";					
				}
				else if (s.getCourse().equals("MECH")) {
					System.out.print(s.getCourse());
					CourseDetails = "Mechanical engineering is the study, design, development, construction, and testing of mechanical and thermal sensors and devices, including tools, engines, and machines."
							+ "Mechanical engineering careers center on creating technologies to meet a wide range of human needs.\r\n"
							+ "Mechanical engineering subjects include automobile engineering, manufacturing engineering, power plant engineering, "
							+ "thermal engineering, and mechatronics engineering, which is a combination of electrical, computer, and mechanical engineering";					
				}
				else {
					CourseDetails = "Information technology (IT) is the use of any computers, storage, networking and other physical devices, infrastructure and processes to create, process, store, "
							+ "secure and exchange all forms of electronic data. Typically, IT is used in the context of business operations, as opposed to technology used for personal or entertainment purposes. "
							+ "The commercial use of IT encompasses both computer technology and telecommunications.";
			
				}
				lblNewLabel_7.setText("<html>"+CourseDetails+"</html>");
				
			}
		});
		
		
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c1.show(panel_3, "Feedback");
				System.out.print(currentCard);
			}
		});
		
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(addFeedback()) {
					JOptionPane.showMessageDialog(null, "Feedback Submitted!!");
					textField_13.setText(null);
				}
				else {
					JOptionPane.showMessageDialog(null, "Internal Error");
				}
			}
		});
		
	}
	
	protected boolean addFeedback() {
		// TODO Auto-generated method stub
		
		StudentData s = new StudentData();
		s.getStudentDetails(rollno);
		
		Feedback f = new Feedback();
		
		CourseName = s.getCourse();
		Feedback = textField_13.getText();
		
		
		f.setCourseName(CourseName);
		f.setFeedback(Feedback);
		
		return f.insertFeedback();
		
		
	}

}

