import java.io.Serializable;
import java.util.ArrayList;

public class Student implements StudentInterface, Serializable {
	private String studentName;
	private String studentEmail;
	private int studentAge;
	ArrayList<Course> courseList = new ArrayList<>();
	protected void finalize() throws Throwable
    {
        try {
 
            System.out.println("inside demo's finalize()");
        }
        catch (Throwable e) {
 
            throw e;
        }
        finally {
 
            System.out.println("Calling finalize method"
                               + " of the Object class");
 
            // Calling finalize() of Object class
            super.finalize();
        }
    }

	@Override
	public void Age(int studentAge) {
		if (studentAge > 3 && studentAge < 20) {
			System.out.println("Student Allegeable to join");
		} else {
			System.out.println("Student unallegeable to join");
		}
	}

	void setcourseList(ArrayList<Course> courseList) {
		this.courseList = courseList;
	}

	public ArrayList<Course> getcourseList() {
		return courseList;
	}

	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}

	int getStudentAge() {
		return studentAge;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	String getStudentName() {
		return studentName;
	}

	public void setstudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

	String getstudentEmail() {
		return studentEmail;
	}

	public Student() {

	}

	public Student(String studentName, String studentEmail) {
		this.studentEmail = studentEmail;
		this.studentName = studentName;

	}

	@Override
	public String fullName(String fName, String LName) {
		String fullStudentName = fName + " " + LName;

		// TODO Auto-generated method stub
		return fullStudentName;
	}

}
