import java.util.ArrayList;
import java.io.Serializable;  


public class School {
	private String schoolName;
	
	
ArrayList<Student> studentList = new ArrayList<>();
	
	
	void setStudentList(ArrayList<Student> studentList)
	{
	this.studentList = studentList;	
	}
	public ArrayList<Student> getStudentList()
	{
		return studentList;
	}
	
	
	
	public void setSchoolName(String schoolName)
    {
    	this.schoolName = schoolName;
    }
    String getSchoolName()
    {
    	return schoolName;
    }
   
 
	
	
	
	

	public School() {
		// TODO Auto-generated constructor stub
	}

}
