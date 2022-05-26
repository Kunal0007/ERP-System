package erp.student;

import java.awt.BorderLayout;
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
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Student extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JPanel panel_2;
	private String name;


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
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(302, 111, 729, 500);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnNewButton = new JButton("Courses");
//		btnNewButton.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				panel_3.add(panel_4, "Courses");
//			}
//		});
		btnNewButton.setFont(new Font("Poppins Medium", Font.PLAIN, 16));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(23, 35, 51));
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBounds(0, 121, 302, 65);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Students Details");
//		btnNewButton_1.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				panel_3.add(panel_4_1, "Students Details");
//			}
//		});
		btnNewButton_1.setFont(new Font("Poppins Medium", Font.PLAIN, 16));
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(23, 35, 51));
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setBounds(0, 204, 302, 65);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Mark Attendance");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setFont(new Font("Poppins Medium", Font.PLAIN, 16));
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBackground(new Color(23, 35, 51));
		btnNewButton_2.setBorderPainted(false);
		btnNewButton_2.setBounds(0, 289, 302, 65);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_3.setFont(new Font("Poppins Medium", Font.PLAIN, 16));
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setBackground(new Color(23, 35, 51));
		btnNewButton_3.setBorderPainted(false);
		btnNewButton_3.setBounds(0, 377, 302, 65);
		panel.add(btnNewButton_3);
		
		
		
	}
}

