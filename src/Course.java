import java.util.ArrayList;

public class Course {
	String courseName;

	
	
	 ArrayList<Marks> markList = new ArrayList<>();
		
		void setmarkList(ArrayList<Marks> markList)
		{
		this.markList = markList;	
		}
		public ArrayList<Marks> getmarkList()
		{
			return markList;
		}
		
		
		
		
		public void setcourseName(String courseName)
		{
			this.courseName=courseName;
		}
		public String getcourseName()
		{
			return courseName;
		}
		
		
		
}