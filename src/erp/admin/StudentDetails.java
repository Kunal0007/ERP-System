package erp.admin;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JFrame;

import java.awt.Font;

public class StudentDetails extends JPanel {
	
	private JPanel contentPane;

	/**
	 * Create the panel.
	 */
	public StudentDetails() {
//		contentPane = new JPanel();
//		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
//		setContentPane(contentPane);
//		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("KUNAL");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		add(lblNewLabel);
		
	}
}
