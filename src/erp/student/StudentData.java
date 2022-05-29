package erp.student;

import java.sql.*;


import erp.database.DataBaseConnection;

public class StudentData {
	
	
	private String Rollnumber;
	private String Name;
	private String Course;
	private String DOB;
	private String Contact;
	private String userid;
	private String EmailId;
	private String password;
	
	public void setRollNumber(String rollnumber)
	{
		this.Rollnumber = rollnumber;
	}
	public void setName(String name)
	{
		this.Name = name;
	}
	public void setCourse(String course)
	{
		this.Course = course;
	}
	public void setDOB(String dob)
	{
		this.DOB = dob;
	}
	public void setContact(String contact)
	{
		this.Contact = contact;
	}
	public void setEmail(String email) {
		this.EmailId = email;
	}
//	public void setUserId()
//	{
//		this.userid = Name + DOB;
//	}
	public String getName()
	{
		return Name;
	}
	public String getCourse()
	{
		return Course;
	}
	public String getRollNumber()
	{
		return Rollnumber;
	}
	public String getDOB()
	{
		return DOB;
		
	}
	public String getContact()
	{
		return Contact;
	}
	public String getEmail() {
		return EmailId;
	}
	public String getUserId()
	{
		return userid;
	}
	public String generateUserId() 
	{
		// TODO Auto-generated method stub
		userid = getName() + Rollnumber;
		return userid;
	}
	public String generatePassword() 
	{
		// TODO Auto-generated method stub
		password = getName() + Rollnumber;
		return password;
	}
	
	
	Connection con = DataBaseConnection.getConnection();

	public void getStudentDetails(String rollnumber)
	{
		
		String query="Select * from student where Roll_No = '" + rollnumber + "'";
		try
		{
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(query);
			rs.next();
			
			setName(rs.getString(2));
			setCourse(rs.getString(3));
			setRollNumber(rs.getString(4));
			setDOB(rs.getString(5));
			setContact(rs.getString(6));
			setEmail(rs.getString(7));
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	public boolean insertStudentDetails()
	{
		
		String query="insert into Student (Name, Course, Roll_No, DateOfBirth, Contact, EmailID, Student_Id, Password) values (?, ?, ?, ?, ?, ?, ?, ?)";
		try
		{
			PreparedStatement pStatement1 = con.prepareStatement(query);
			pStatement1.setString(1, getName());
			pStatement1.setString(2, getCourse());
			pStatement1.setString(3, getRollNumber());
			pStatement1.setString(4, getDOB());
			pStatement1.setString(5, getContact());
			pStatement1.setString(6, getEmail());
			pStatement1.setString(7, generateUserId());
			pStatement1.setString(8, generatePassword());
			
			pStatement1.execute();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	public boolean updateStudentDetails(String rollno)
	{
		
		String query="update Student set Name = ?, Course = ?, Roll_No = ?, DateOfBirth = ?, Contact = ?, EmailID = ?, Student_Id = ?, Password = ?  where Roll_No = '" + rollno + "'";
		try
		{
			PreparedStatement pStatement1 = con.prepareStatement(query);
			pStatement1.setString(1, getName());
			pStatement1.setString(2, getCourse());
			pStatement1.setString(3, getRollNumber());
			pStatement1.setString(4, getDOB());
			pStatement1.setString(5, getContact());
			pStatement1.setString(6, getEmail());
			pStatement1.setString(7, generateUserId());
			pStatement1.setString(8, generatePassword());
			
			pStatement1.execute();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	public boolean deleteStudentDetails(String rollno)
	{
		String query1="delete from Student where Roll_No = '" + rollno + "'";
		try
		{
			PreparedStatement pStatement1 = con.prepareStatement(query1);
			pStatement1.execute();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
}
