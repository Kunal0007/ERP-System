package erp.admin;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;

@SuppressWarnings("serial")
public class Admin extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JPanel panel_2;
	private String name;
	private int currentCard = 1;
	CardLayout c1;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin frame = new Admin();
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
	
	public String setname(String adminid) {
		// TODO Auto-generated method stub
		name = adminid;
		return name;
	}
	
	public Admin() {
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
		
		JLabel lblNewLabel_2 = new JLabel("Hii, " + name);
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
		
		JButton btnNewButton_2 = new JButton("Mark Attendance");
		btnNewButton_2.setFont(new Font("Poppins Medium", Font.PLAIN, 16));
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBackground(new Color(23, 35, 51));
		btnNewButton_2.setBorderPainted(false);
		btnNewButton_2.setBounds(0, 289, 302, 65);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Add Admin");
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
		
		JPanel panel_8 = new JPanel();
		panel_8.setBounds(10, 42, 709, 268);
		panel_4.add(panel_8);
		
		textField = new JTextField();
		textField.setBounds(103, 331, 142, 27);
		panel_4.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(103, 369, 142, 27);
		panel_4.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(103, 405, 142, 27);
		panel_4.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(536, 334, 142, 27);
		panel_4.add(textField_3);
		
		JLabel lblNewLabel_7 = new JLabel("CNo.");
		lblNewLabel_7.setFont(new Font("Poppins Medium", Font.PLAIN, 15));
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setBounds(10, 331, 83, 27);
		panel_4.add(lblNewLabel_7);
		
		JLabel lblNewLabel_7_1 = new JLabel("CName");
		lblNewLabel_7_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7_1.setFont(new Font("Poppins Medium", Font.PLAIN, 15));
		lblNewLabel_7_1.setBounds(10, 369, 83, 27);
		panel_4.add(lblNewLabel_7_1);
		
		JLabel lblNewLabel_7_1_1 = new JLabel("CNo.");
		lblNewLabel_7_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7_1_1.setFont(new Font("Poppins Medium", Font.PLAIN, 15));
		lblNewLabel_7_1_1.setBounds(444, 337, 83, 27);
		panel_4.add(lblNewLabel_7_1_1);
		
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
		
		JPanel panel_9 = new JPanel();
		panel_9.setBounds(10, 52, 709, 235);
		panel_5.add(panel_9);
		
		JButton btnNewButton_5 = new JButton("New button");
		btnNewButton_5.setFont(new Font("Poppins Medium", Font.PLAIN, 16));
		btnNewButton_5.setBounds(83, 441, 141, 48);
		panel_5.add(btnNewButton_5);
		
		JButton btnNewButton_5_1 = new JButton("New button");
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
		
		JLabel lblNewLabel_8 = new JLabel("New label");
		lblNewLabel_8.setFont(new Font("Poppins Medium", Font.PLAIN, 15));
		lblNewLabel_8.setBounds(10, 298, 75, 31);
		panel_5.add(lblNewLabel_8);
		
		JLabel lblNewLabel_8_1 = new JLabel("New label");
		lblNewLabel_8_1.setFont(new Font("Poppins Medium", Font.PLAIN, 15));
		lblNewLabel_8_1.setBounds(10, 339, 75, 31);
		panel_5.add(lblNewLabel_8_1);
		
		JLabel lblNewLabel_8_2 = new JLabel("New label");
		lblNewLabel_8_2.setFont(new Font("Poppins Medium", Font.PLAIN, 15));
		lblNewLabel_8_2.setBounds(10, 384, 75, 31);
		panel_5.add(lblNewLabel_8_2);
		
		JLabel lblNewLabel_8_3 = new JLabel("New label");
		lblNewLabel_8_3.setFont(new Font("Poppins Medium", Font.PLAIN, 15));
		lblNewLabel_8_3.setBounds(254, 298, 75, 31);
		panel_5.add(lblNewLabel_8_3);
		
		JLabel lblNewLabel_8_4 = new JLabel("New label");
		lblNewLabel_8_4.setFont(new Font("Poppins Medium", Font.PLAIN, 15));
		lblNewLabel_8_4.setBounds(254, 339, 75, 31);
		panel_5.add(lblNewLabel_8_4);
		
		JLabel lblNewLabel_8_5 = new JLabel("New label");
		lblNewLabel_8_5.setFont(new Font("Poppins Medium", Font.PLAIN, 15));
		lblNewLabel_8_5.setBounds(254, 383, 75, 31);
		panel_5.add(lblNewLabel_8_5);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(550, 389, 129, 30);
		panel_5.add(textField_10);
		
		JButton btnNewButton_5_1_1 = new JButton("New button");
		btnNewButton_5_1_1.setFont(new Font("Poppins Medium", Font.PLAIN, 16));
		btnNewButton_5_1_1.setBounds(327, 441, 141, 48);
		panel_5.add(btnNewButton_5_1_1);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.WHITE);
		panel_3.add(panel_6, "attendance");
		panel_6.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("Mark Attendance");
		lblNewLabel_5.setBounds(0, 0, 729, 500);
		lblNewLabel_5.setFont(new Font("Poppins Medium", Font.PLAIN, 20));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setVerticalAlignment(SwingConstants.TOP);
		panel_6.add(lblNewLabel_5);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBounds(10, 43, 709, 253);
		panel_6.add(panel_10);
		
		JButton btnNewButton_6 = new JButton("New button");
		btnNewButton_6.setFont(new Font("Poppins Medium", Font.PLAIN, 16));
		btnNewButton_6.setBounds(64, 425, 158, 49);
		panel_6.add(btnNewButton_6);
		
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
		
		JLabel lblNewLabel_6 = new JLabel("Add Admin");
		lblNewLabel_6.setBounds(0, 0, 729, 500);
		lblNewLabel_6.setFont(new Font("Poppins SemiBold", Font.PLAIN, 20));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setVerticalAlignment(SwingConstants.TOP);
		panel_7.add(lblNewLabel_6);
		
		JButton btnNewButton_7 = new JButton("New button");
		btnNewButton_7.setFont(new Font("Poppins Medium", Font.PLAIN, 16));
		btnNewButton_7.setBounds(302, 268, 157, 43);
		panel_7.add(btnNewButton_7);
		
		textField_13 = new JTextField();
		textField_13.setBounds(363, 73, 150, 34);
		panel_7.add(textField_13);
		textField_13.setColumns(10);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(363, 118, 150, 34);
		panel_7.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(363, 168, 150, 34);
		panel_7.add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(363, 223, 150, 34);
		panel_7.add(textField_16);
		
		JLabel lblNewLabel_10 = new JLabel("New label");
		lblNewLabel_10.setFont(new Font("Poppins Medium", Font.PLAIN, 15));
		lblNewLabel_10.setBounds(210, 73, 135, 34);
		panel_7.add(lblNewLabel_10);
		
		JLabel lblNewLabel_10_1 = new JLabel("New label");
		lblNewLabel_10_1.setFont(new Font("Poppins Medium", Font.PLAIN, 15));
		lblNewLabel_10_1.setBounds(210, 118, 135, 34);
		panel_7.add(lblNewLabel_10_1);
		
		JLabel lblNewLabel_10_2 = new JLabel("New label");
		lblNewLabel_10_2.setFont(new Font("Poppins Medium", Font.PLAIN, 15));
		lblNewLabel_10_2.setBounds(210, 168, 135, 34);
		panel_7.add(lblNewLabel_10_2);
		
		JLabel lblNewLabel_10_3 = new JLabel("New label");
		lblNewLabel_10_3.setFont(new Font("Poppins Medium", Font.PLAIN, 15));
		lblNewLabel_10_3.setBounds(210, 223, 135, 34);
		panel_7.add(lblNewLabel_10_3);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c1.show(panel_3, "course");
				System.out.print(currentCard);
			}
		});
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c1.show(panel_3, "studdetails");
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
