import java.util.ArrayList;

public class Course {
	private String courseName;
	
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
                               + " of the Cource Object class");
 
            super.finalize();
        }
    }

	ArrayList<Marks> markList = new ArrayList<>();

	void setmarkList(ArrayList<Marks> markList) {
		this.markList = markList;
	}

	public ArrayList<Marks> getmarkList() {
		return markList;
	}

	public void setcourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getcourseName() {
		return courseName;
	}

}