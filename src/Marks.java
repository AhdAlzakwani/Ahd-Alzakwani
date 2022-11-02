import java.util.ArrayList;

public class Marks implements MarkInterface{
	private int courseMark;
	
	
	
	
	public void marksDegree(int courseMark)
	{
		
		if(courseMark >= 90)
		{
			System.out.println("A+");
		}
		else if(courseMark >80 && courseMark <= 89)
		{
			System.out.println("B+");
		}
		else if(courseMark >60 && courseMark <= 79)
		{
			System.out.println("C+");
		}
		
	}

	
	
	
	public void setCourseMark(int courseMark) {
		if (courseMark > 0 && courseMark < 100) {
			this.courseMark = courseMark;
		} else {
			System.out.println("Please Enter Between 0 and 100 only");
		}
	}

	
	
	
	int getCourseMark() {
		return courseMark;
	}

	
	
	
	public Marks() {
		// TODO Auto-generated constructor stub
	}

}
