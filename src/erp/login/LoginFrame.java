package erp.login;

import java.awt.Color;


import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;

import erp.admin.Admin;
import erp.student.Student;

import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Canvas;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class LoginFrame extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField txtErpPortal;
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
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginFrame frame = new LoginFrame();
					frame.setVisible(true);
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
		
		txtErpPortal = new JTextField();
		txtErpPortal.setHorizontalAlignment(SwingConstants.CENTER);
		txtErpPortal.setForeground(new Color(255, 255, 255));
		txtErpPortal.setFont(new Font("Poppins ExtraBold", Font.BOLD, 40));
		txtErpPortal.setText("ERP PORTAL");
		txtErpPortal.setBounds(317, 11, 401, 79);
		txtErpPortal.setBackground(new Color(0, 139, 139, 220));
		panel_1.add(txtErpPortal);
		txtErpPortal.setColumns(10);
		
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
		btnNewButton.addActionListener(this);
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
		btnNewButton_1.addActionListener(this);
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
		
		

		
	}

	@SuppressWarnings("deprecation")
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String adminid = textField.getText();        //get user entered username from the textField  
        String adminpass = passwordField.getText();        //get user entered pasword from the passwordField 
        
        String studentid = textField_1.getText();        //get user entered username from the textField_1  
        String studentpass = passwordField_1.getText();        //get user entered pasword from the passwordField_1 
          
        //check whether the credentials are authentic or not  
        if (adminid.equals("t") && adminpass.equals("t")) {  //if authentic, navigate user to a new page  
              
            //create instance of the NewPage  
            Admin admin = new Admin();  
            admin.setname(adminid);  
            //make page visible to the user  
            admin.setVisible(true);  
              
            //create a welcome label and set it to the new page  
            JLabel wel_label = new JLabel("Welcome: "+adminid);  
            admin.getContentPane().add(wel_label);  
        }
        else if (studentid.equals("i") && studentpass.equals("i")) {  //if authentic, navigate user to a new page  
            
            //create instance of the NewPage  
            Student student = new Student();  
              
            //make page visible to the user  
            student.setVisible(true);  
              
            //create a welcome label and set it to the new page  
            JLabel wel_label = new JLabel("Welcome: "+studentid);  
            student.getContentPane().add(wel_label);  
        }  
        else{  
            //show error message  
            System.out.println("Please enter valid username and password");  
        }  
	}
	
	
}
