import java.util.ArrayList;

public class School {
	private String schoolName;
	
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
                               + " of the School Object class");
 
            super.finalize();
        }
    }

	ArrayList<Student> studentList = new ArrayList<>();

	void setStudentList(ArrayList<Student> studentList) {
		this.studentList = studentList;
	}

	public ArrayList<Student> getStudentList() {
		return studentList;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	String getSchoolName() {
		return schoolName;
	}

	public School() {
		// TODO Auto-generated constructor stub
	}

}
