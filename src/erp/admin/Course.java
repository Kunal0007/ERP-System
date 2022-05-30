package erp.admin;

import java.sql.*;


import erp.database.DataBaseConnection;

public class Course {
	private String CourseCode;
	private String CourseName;
	private String SemesterYear;
	
	public void setCourseCode(String courseCode)
	{
		this.CourseCode = courseCode;
	}
	public void setCourseName(String courseName)
	{
		this.CourseName = courseName;
	}
	public void setSemesterYear(String semesterYear)
	{
		this.SemesterYear = semesterYear;
	}
	
	public String getCourseCode()
	{
		return CourseCode;
	}
	public String getCourseName()
	{
		return CourseName;
	}
	public String getSemesterYear()
	{
		return SemesterYear;
	}
	
	Connection con = DataBaseConnection.getConnection();
	
	public boolean insertCourseDetails()
	{
		
		String query="insert into Courses (CourseCode, CourseName, SemesterorYear) values (?, ?, ?)";
		try
		{
			PreparedStatement pStatement1 = con.prepareStatement(query);
			pStatement1.setString(1, getCourseCode());
			pStatement1.setString(2, getCourseName());
			pStatement1.setString(3, getSemesterYear());
			
			pStatement1.execute();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	public boolean deleteCourseDetails(String courseCode)
	{
		String query1="delete from Courses where CourseCode = '" + courseCode + "'";
		try
		{
			PreparedStatement pStatement1 = con.prepareStatement(query1);
			int rowDeleted = pStatement1.executeUpdate();
			if(rowDeleted > 0) {
				return true;
			}
			return false;
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}
	
}
