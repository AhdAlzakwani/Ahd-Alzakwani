import java.util.ArrayList;

public class Marks {
    int courseMark;
 
	public void setCourseMark(int courseMark)
	{
		if(courseMark>0 && courseMark<100) {
			this.courseMark = courseMark;
		}
		else
		{
			System.out.println("Please Enter Between 0 and 100 only");
		}
	}
	
	int getCourseMark()
	{
		return courseMark;
	}

	public Marks() {
		// TODO Auto-generated constructor stub
	}
	
}
