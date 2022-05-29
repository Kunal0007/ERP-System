package erp.student;


import java.sql.*;


import erp.database.DataBaseConnection;


public class Feedback {
	private String CourseName;
	private String Feedback;
	
	public void setCourseName(String courseName)
	{
		this.CourseName = courseName;
	}
	public void setFeedback(String feedback)
	{
		this.Feedback = feedback;
	}
	
	public String getCourseName()
	{
		return CourseName;
	}
	public String getFeedback()
	{
		return Feedback;
	}
	
	Connection con = DataBaseConnection.getConnection();
	
	public boolean insertFeedback()
	{
		
		String query="insert into Feedback (CourseName, Comment) values (?, ?)";
		try
		{
			PreparedStatement pStatement1 = con.prepareStatement(query);
			pStatement1.setString(1, getCourseName());
			pStatement1.setString(2, getFeedback());
			
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
