import java.util.ArrayList;


public class Student
{
     String studentName;
     String studentEmail;
	ArrayList<Course> courseList = new ArrayList<>();
	
	void setcourseList(ArrayList<Course> courseList)
	{
	this.courseList = courseList;	
	}
	public ArrayList<Course> getcourseList()
	{
		return courseList;
	}
	
	
	
	
	Course CourseOfStudent = new Course();
	
	
        public void setStudentName(String studentName)
        {
        	this.studentName = studentName;
        }
        String getStudentName()
        {
        	return studentName;
        }
        
        public void setstudentEmail(String studentEmail)
        {
        	this.studentEmail = studentEmail;
        }
        String getstudentEmail()
        {
        	return studentEmail;
        }
       
        public Student() 
        {
        
        }


        
      
}


