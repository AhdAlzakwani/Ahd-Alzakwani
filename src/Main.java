import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class Main {
	static int factorial(int n){    
		  if (n == 0)    
		    return 1;    
		  else    
		    return(n * factorial(n-1));    
		 }    

	public static void main(String[] args) {
//		Declaration Classes and List 
        Set<String> emailSet = new HashSet<>();
		Stack<String> history = new Stack<String>();
		HashMap<Integer, String> menueOptions = new HashMap<Integer, String>();
		HashMap<Integer, String> subMenueOptions = new HashMap<Integer, String>();
		ArrayList<String> emailList = new ArrayList<>();
		ArrayList<School> schoolList = new ArrayList<>();
		ArrayList<Student> studentList = new ArrayList<>();		
		HashMap<String,Double> studentFees = new HashMap<String,Double>();
    	HashMap<String,HashMap<String,Double>> studentFeesWithCurrency = new HashMap<String,HashMap<String,Double>>();
	
	    
		Scanner sa = new Scanner(System.in);
		Scanner san = new Scanner(System.in);
		Main ourSchool = new Main();
		//Student studentDetailss = new Student();
		Course studentCoursee =new Course();
        Marks courseMarkss = new Marks();
        int currency =0;
        double amount = 0;
        double amountcal = 0;
        String nameCurrency = "";
		boolean isCurrencyExit = true;
		boolean isExit = true;
		boolean hasExit = true;
		boolean teacherExit = true;
		boolean schoolExit = true;
		boolean optionExit = true;
		boolean isSubExit = true;
		System.out.println("*****************************");
		System.out.println("*   WELCOME TO OUR SYSTEM   *");
		System.out.println("*****************************");
		System.out.println("*       HELOW TEACHER       *");
		System.out.println("*****************************");
		
		
		while(teacherExit) {
		System.out.println("Enter Teacher Name :");
		String inputTeacherName = sa.next();
		System.out.println("Welcom Ms :\t"+inputTeacherName);
		System.out.println("Enter Teacher Password :");
		int inputTeacherPassword = sa.nextInt();
		String teacherName = "Ahd";		
		boolean teacherCheck =inputTeacherName.equals(teacherName);
		
			if(teacherCheck ==true)
			{	
		    if(inputTeacherPassword == 1234)
		    {
		    do
		    {
			System.out.println("*****************************");
			System.out.println("Welcom Ms :\t"+inputTeacherName);
			System.out.println("*****************************");
			System.out.println("");

			menueOptions.put(1, "INPUT STUDENT DETAILS \n");
			menueOptions.put(2, "STUDENT REPORT \n");
			menueOptions.put(3, "HISTORY PROGRAM \n");
			menueOptions.put(4, "PRINT DUBLICATE EMAIL \n");
			menueOptions.put(5, "PRINT STUDENT AMOUNT \n");
			menueOptions.put(6, "PRINT CODING PROBLEM \n");
			menueOptions.put(7, "EXIT FROM PROGRAM \n");
			System.out.println(menueOptions);
		    System.out.println("PLEASE SELECT ONLY ONE OPTION");
			System.out.println("*****************************");
			int option =sa.nextInt();
			
			switch(option)
			{
			case 1:
				System.out.println("*****************************");
				System.out.println("*      STUDENT DETAILS      *");
				System.out.println("*****************************");
				while(schoolExit)
				{ 		

					School schoolDetails = new School();
					System.out.println("Enter School Name");
					String inputStudentSchool = sa.next();
					history.push(inputStudentSchool);
					schoolDetails.setSchoolName(inputStudentSchool);
					hasExit = Boolean.TRUE;
					
					
				while(isExit)
				{
					Student studentDetails = new Student();
					System.out.println("Enter Student Name");
					String inputStudentName = sa.next();
					history.push(inputStudentName);
					studentDetails.setStudentName(inputStudentName);
					
					System.out.println("Enter Student Email");
					String inputStudentEmail = sa.next();
					history.push(inputStudentEmail);
					studentDetails.setstudentEmail(inputStudentEmail);
					emailList.add(inputStudentEmail);
					
					
					while(isCurrencyExit) {
					System.out.println("Choose currency (1- BRL , 2- USD , 3- EUR)");
				    currency = sa.nextInt();
				    System.out.println("Enter Student Amount");
				    amount = sa.nextInt();
				    if(currency == 1)
				    {
				    	 nameCurrency = "BRL";
				    	 amountcal = amount * 13.69;
				    }
				    else if(currency == 2)
				    {
				    	 nameCurrency = "USD";
				    	 amountcal = amount * 2.60;
				    }
				    else if (currency == 3)
				    {
				    	nameCurrency = "EUR";
				    	 amountcal = amount * 2.65;
				    }
				    else
				    {
				    	System.out.println("Please choose currency from the list(1- BRL , 2- USD , 3- EUR)");
				    }
				    System.out.println("Student Amount" + amountcal);
				    
				    studentFees.put(nameCurrency, amountcal);
				    studentFeesWithCurrency.put(studentDetails.getStudentName(), studentFees);
			    	System.out.println("DO You want to Add Other Currency ? press 1");
			    	int isExitCurrency = sa.nextInt();
			    	if(isExitCurrency == 0)
			    	{
			    		isCurrencyExit = false;
			    	}

					}
				    
				    
				    
					hasExit = Boolean.TRUE;
					while(hasExit)
					{
						Course studentCourse = new Course();
				        Marks courseMarks = new Marks();
						System.out.println("Enter Course Name \n");
						String inputCourseName = sa.next();
						history.push(inputCourseName);
						studentCourse.setcourseName(inputCourseName);
						System.out.println("Enter Mark for Course :");
						int inputCourseMark = sa.nextInt();
						String iinputCourseMark = String.valueOf(inputCourseMark);
						history.push(iinputCourseMark);
						courseMarks.setCourseMark(inputCourseMark);
						studentCourse.markList.add(courseMarks);
						studentDetails.courseList.add(studentCourse);
						
						
						System.out.println("Do You want To Add course press 1 if not press 0");
						int exitoutput = sa.nextInt();

						if(exitoutput==0)
						
							hasExit = false;
				    }
					schoolList.add(schoolDetails);
					schoolDetails.studentList.add(studentDetails);
					
					
					System.out.println("Do You want To Add Student press 1 ");
					int exitStudentOutput = sa.nextInt();
					if(exitStudentOutput == 1)
					{
						isExit = true;
						isCurrencyExit = true;
					}
					else
					{
						isExit = false;
						isCurrencyExit = false;
					}
				}
				System.out.println("Do You want To Add School press 1 ");
				int exitSchoolOutput = sa.nextInt();
				if(exitSchoolOutput == 1)
				{
					schoolExit = true;
					isExit = true;
					hasExit = true;
					isCurrencyExit = true;

				}
				else
				{
					schoolExit = false;
					isExit = false;
					hasExit = false;
				}
				
			}
				
				break;
			case 2:
				
				System.out.println("*****************************");
				System.out.println("*      STUDENT REPORT      *");
				System.out.println("*****************************");
				 for(School h: schoolList) {
					 System.out.println("\tSchool Name: "+ h.getSchoolName());
					 for(Student s: h.studentList) {
						 System.out.println("\tStudent Name: \t"+ s.getStudentName()+"\tStudent Email: \t"+s.getstudentEmail());
						 for(Course c: s.courseList) {
							 for(Marks m: c.getmarkList()) {
							 System.out.println("\nCourse Name: "+ c.getcourseName() + " \tCourse Marks" + m.getCourseMark());
						 }
						 }
					 
					 }
				 }
				break;
			case 3:
				System.out.println("*****************************");
				System.out.println("*      DUBLICATE EMAIL      *");
				System.out.println("*****************************");
				
				
                   while(history.empty() == false)
				    {
					 System.out.println(history.pop());
					}
			
				break;
			case 4:
				System.out.println("*****************************");
				System.out.println("*       STUDENT AMOUNT      *");
				System.out.println("*****************************");
					for(String email: emailList)
					{
						if(emailSet.add(email) == false)
						{
						 System.out.println("Student EMail Duplicate :"+email);
						}

					}
				break;
				    
				
				case 5:
					System.out.println("*****************************");
					System.out.println("*       STUDENT AMOUNT      *");
					System.out.println("*****************************");
					
					for(String nameOfStudent: studentFeesWithCurrency.keySet()) {
						Map<String, Double> lowerMap = studentFeesWithCurrency.get(nameOfStudent);
						 System.out.println("Name of Student: "+ nameOfStudent);
						for(String currenyKey: lowerMap.keySet() ) {
							 System.out.println("Currency: "+ currenyKey +
									 "Amount: " + lowerMap.get(currenyKey));
						}	
					}
					
					
					
					break;
				case 6:
					do {

					System.out.println("*****************************");
					System.out.println("*   WELCOME TO SUB PROBLEM   *");
					System.out.println("*****************************");
					subMenueOptions.put(1, " FECTORIAL \n");
					subMenueOptions.put(2, " Fibonac \n");
					subMenueOptions.put(3, " Back \n");
					System.out.println(subMenueOptions);
				    System.out.println("PLEASE SELECT ONLY ONE OPTION");
					System.out.println("*****************************");
					int subOption=sa.nextInt();
					
					switch(subOption)
					{
					case 1:
						
						 int i,fact=1; 
						 System.out.println("Please Enter Number :");
						 System.out.println("*********************");
						 int FactorialNum = sa.nextInt();
						  
						  fact = factorial(FactorialNum);
						  System.out.println("Factorial of "+FactorialNum+" is: "+fact);    

						break;
					case 2:
					  
					    int inputusers1 = 0;
					    int inputusers2 = 1;
					    System.out.println("Please Enter Count number :");
					    int count = sa.nextInt();
					    
						int inputusers3;  
						 System.out.print(inputusers1+" "+inputusers2);//printing 0 and 1  
						  
						 for(int m=2;m<count;++m)  
						 {  
							
						 inputusers3 =inputusers1+inputusers2;  
						 if (inputusers3 <= 100)
						 {
						  System.out.print(" "+inputusers3+" ");  
						  inputusers1=inputusers2;  
						  inputusers2=inputusers3;
						 }
						  
						 }
						break;
					
					case 3:
						isSubExit = false;
						break;
					}
					}while(isSubExit);
					
					break;
			case 7:
				System.out.println("*****************************");
				System.out.println("*      THANK YOU      *");
				System.out.println("*****************************");
				optionExit = false;
				teacherExit = false;
				break;
			

			}
			
		}while(optionExit);
		
		}
		  
			
			
			}
			else {
			System.out.println("Wronge UserName Or Password ");
			}
		}
		teacherExit = false;
		}
		

}
