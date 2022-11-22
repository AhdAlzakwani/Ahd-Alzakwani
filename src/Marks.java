public class Marks implements MarkInterface{
	private int courseMark;
	
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
                               + " of the Marks Object class");
 
            super.finalize();
        }
    }
	
	
	
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
