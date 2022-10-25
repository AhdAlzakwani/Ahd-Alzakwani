import java.util.ArrayList;


public class Student
{
    private String studentName;
    private String studentEmail;
	ArrayList<Course> courseList = new ArrayList<>();
	
	
	
	
	
	
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


