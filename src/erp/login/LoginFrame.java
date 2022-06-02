package erp.login;

import java.sql.*;

import java.awt.Color;


import java.awt.EventQueue;
import java.io.IOException;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;


import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import erp.admin.Admin;
import erp.database.DataBaseConnection;
import erp.student.Student;

import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class LoginFrame extends JFrame  {

	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblNewLabel;
	private JButton btnNewButton;
	private JLabel lblNewLabel_1;
	private JTextField textField;
	private JPanel panel_2;
	private JLabel lblStudent;
	private JButton btnNewButton_1;
	private JLabel lblNewLabel_5;
	private JTextField textField_1;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_4;
	static LoginFrame frame;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					if(DataBaseConnection.checkconnection()) {
						frame = new LoginFrame();
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
	 * @throws IOException 
	 */
	public LoginFrame() throws IOException {
		
		setTitle("ERP Sysytem");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1047,650);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(Color.LIGHT_GRAY, 2));
		contentPane.setBackground(new Color(255, 255, 255));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 139, 139, 220));
		panel_1.setBounds(0, 23, 1031, 101);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_7 = new JLabel("ERP SYSTEM");
		lblNewLabel_7.setForeground(Color.WHITE);
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setFont(new Font("Poppins ExtraBold", Font.PLAIN, 40));
		lblNewLabel_7.setBounds(329, 11, 374, 79);
		panel_1.add(lblNewLabel_7);
		
		panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0, 80));
		panel.setBorder(new LineBorder(new Color(192, 192, 192)));
		panel.setBounds(73, 185, 330, 381);
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblNewLabel = new JLabel("ADMIN");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Poppins SemiBold", Font.PLAIN, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 310, 52);
		panel.add(lblNewLabel);
		
		
		
		btnNewButton = new JButton("LOGIN");
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBackground(new Color(34, 167, 240));
		btnNewButton.setBorderPainted(false);
		btnNewButton.setFont(new Font("Poppins SemiBold", Font.PLAIN, 20));
		btnNewButton.setBounds(10, 305, 310, 52);
		panel.add(btnNewButton);
		
		lblNewLabel_1 = new JLabel("UserID");
		lblNewLabel_1.setFont(new Font("Poppins Medium", Font.BOLD, 16));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(22, 158, 71, 33);
		panel.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setToolTipText("");
		textField.setFont(new Font("Poppins", Font.PLAIN, 12));
		textField.setBounds(93, 159, 206, 33);
		panel.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 11));
		passwordField.setBounds(93, 230, 206, 33);
		panel.add(passwordField);
		
		lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("F:\\eclipse\\ERP\\ERP System\\assets\\adminlogin.png"));
		lblNewLabel_3.setBounds(127, 65, 83, 83);
		panel.add(lblNewLabel_3);
		
		lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Poppins Medium", Font.BOLD, 16));
		lblNewLabel_2.setBounds(8, 229, 95, 33);
		panel.add(lblNewLabel_2);
		
		panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 0, 0, 80));
		panel_2.setBorder(new LineBorder(new Color(192, 192, 192)));
		panel_2.setLayout(null);
		panel_2.setBounds(640, 185, 330, 381);
		contentPane.add(panel_2);
		
		lblStudent = new JLabel("STUDENT");
		lblStudent.setForeground(Color.WHITE);
		lblStudent.setHorizontalAlignment(SwingConstants.CENTER);
		lblStudent.setFont(new Font("Poppins SemiBold", Font.PLAIN, 25));
		lblStudent.setBorder(new LineBorder(new Color(192, 192, 192), 0));
		lblStudent.setBounds(10, 11, 310, 52);
		panel_2.add(lblStudent);
		
		btnNewButton_1 = new JButton("LOGIN");
		btnNewButton_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setBackground(new Color(34, 167, 240));
		btnNewButton_1.setFont(new Font("Poppins SemiBold", Font.PLAIN, 20));
		btnNewButton_1.setBounds(10, 305, 310, 52);
		panel_2.add(btnNewButton_1);
		
		lblNewLabel_5 = new JLabel("Password");
		lblNewLabel_5.setFont(new Font("Poppins Medium", Font.BOLD, 16));
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setBounds(8, 229, 95, 33);
		panel_2.add(lblNewLabel_5);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Poppins", Font.PLAIN, 12));
		textField_1.setColumns(10);
		textField_1.setBounds(93, 159, 206, 33);
		panel_2.add(textField_1);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		passwordField_1.setBounds(93, 230, 206, 33);
		panel_2.add(passwordField_1);
		
		lblNewLabel_4 = new JLabel("UserID");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Poppins Medium", Font.BOLD, 16));
		lblNewLabel_4.setBounds(22, 158, 71, 33);
		panel_2.add(lblNewLabel_4);
		
		JLabel lblNewLabel_3_1 = new JLabel("New label");
		lblNewLabel_3_1.setIcon(new ImageIcon("F:\\eclipse\\ERP\\ERP System\\assets\\studentlogin.png"));
		lblNewLabel_3_1.setBounds(123, 65, 83, 83);
		panel_2.add(lblNewLabel_3_1);
		
		lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setIcon(new ImageIcon("F:\\eclipse\\ERP\\ERP System\\assets\\backgroundimage2.jpg"));
		lblNewLabel_6.setBounds(0, -2, 1031, 613);
		contentPane.add(lblNewLabel_6);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {  
//	            
					ResultSet rs = checkCredentials("Admin");
				
					try {
						if(rs.next()) {
							//create instance of the NewPage  
						    Admin admin = new Admin(rs.getString(1));   
						    //make page visible to the user  
						    admin.setVisible(true);  
						    frame.dispose();
						      
						    //create a welcome label and set it to the new page  
				            JLabel wel_label = new JLabel("Welcome: "+rs.getString(1));  
				            admin.getContentPane().add(wel_label); 
						}
						else
						{
						    JOptionPane.showMessageDialog(null, "Incorrect user-id or password..Try Again with correct detail");
						    clearfields();
						}
					} catch (HeadlessException | SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
		             
			}
		});
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {  
//	            
					ResultSet rs = checkCredentials("Student");
				
					try {
						if(rs.next()) {
							//create instance of the NewPage  
						    Student student = new Student(rs.getString(1), rs.getString(2));   
						    //make page visible to the user  
						    student.setVisible(true);  
						    frame.dispose();
						    
						    //create a welcome label and set it to the new page  
				            JLabel wel_label = new JLabel("Welcome: "+rs.getString(1));  
				            student.getContentPane().add(wel_label); 
						}
						else
						{
						    JOptionPane.showMessageDialog(null, "Incorrect user-id or password..Try Again with correct detail");
						    clearfields();
						}
					} catch (HeadlessException | SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
		             
			}
		});
		

		
	}

	public ResultSet checkCredentials(String User) {
		// TODO Auto-generated method stub
		Connection con = DataBaseConnection.getConnection();
		if(User == "Admin") {
			String adminid = textField.getText();        //get user entered username from the textField  
	        char[] Str = passwordField.getPassword();        //get user entered pasword from the passwordField 
	        String adminpass = new String(Str);
	        
	        try {
				PreparedStatement ps = con.prepareStatement("select Name from Admin where User_Id=? and Password=?");
				ps.setString(1, adminid);
				ps.setString(2, adminpass);
				
				ResultSet rs = ps.executeQuery();
				
				return rs;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if (User == "Student") {
			String studentid = textField_1.getText();        //get user entered username from the textField  
	        char[] Str = passwordField_1.getPassword();        //get user entered pasword from the passwordField 
	        String studentpass = new String(Str);
	        
	        try {
				PreparedStatement ps = con.prepareStatement("select Name, Roll_No from Student where Student_Id=? and Password=?");
				ps.setString(1, studentid);
				ps.setString(2, studentpass);
				
				ResultSet rs = ps.executeQuery();
				
				return rs;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return null;
	}
	
	public void clearfields() {
		textField.setText(null);
		passwordField.setText(null);
		textField_1.setText(null);
		passwordField_1.setText(null);
	}
}
