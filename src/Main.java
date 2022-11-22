import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

import com.google.gson.Gson;

public class Main {
	static Stack<String> history = new Stack<String>();
	
	 ArrayList<String> fileList = new ArrayList<>();
	 ArrayList<Student> studentList = new ArrayList<>();
	

	public static void subMenue()
	{
		Scanner sa = new Scanner(System.in);
		HashMap<Integer, String> subMenueOptions = new HashMap<Integer, String>();
		System.out.println("*****************************");
		System.out.println("*   WELCOME TO SUB PROBLEM   *");
		System.out.println("*****************************");
		subMenueOptions.put(1, " FECTORIAL \n");
		subMenueOptions.put(2, " Fibonac \n");
		subMenueOptions.put(3, " Student Serilization \n");
		subMenueOptions.put(4, " Back \n");
		System.out.println(subMenueOptions);
		System.out.println("PLEASE SELECT ONLY ONE OPTION");
		System.out.println("*****************************");
	}
	

	
    
	
	
	
	public static void main(String[] args)
			throws Throwable {
		
		URL url =  new URL("https://randomuser.me/api/");
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();	
		conn.setRequestMethod("GET");
		conn.connect();
		StringBuilder informationString = new StringBuilder();
		int responseCode = conn.getResponseCode();
		if(responseCode != 200)
		{
			throw new RuntimeException("HttpresponseCode");
			
		}else {
			Scanner scanner = new Scanner(url.openStream());
			while(scanner.hasNext()) {
				informationString.append(scanner.nextLine());
			}
			scanner.close();
			System.out.println(informationString);
		}
		
		
		Gson gson = new Gson();
		RandomUserAPI result= gson.fromJson(informationString.toString(), RandomUserAPI.class);
		System.out.println(result.getResults().get(0).getCell());

		
		
		
	
		
		
		/*
								 * // Declaration Classes and List
								 * 
								 * 
								 * 
								 * 
								 * 
								 * 
								 * Scanner sa = new Scanner(System.in); // Scanner san = new Scanner(System.in);
								 * // Course studentCoursee = new Course(); // Marks courseMarkss = new Marks();
								 * // String currency = null; // int currencyInput = 0; // double amount = 0; //
								 * double amountcal = 0; // String nameCurrency = ""; boolean isCurrencyExit =
								 * true; boolean isExit = true; boolean hasExit = true; boolean teacherExit =
								 * true; boolean schoolExit = true; boolean optionExit = true; boolean isSubExit
								 * = true; ArrayList<String> emailList = new ArrayList<>();
								 * 
								 * boolean chooseInputMnue = true;
								 * System.out.println("*****************************");
								 * System.out.println("*   WELCOME TO OUR SYSTEM   *");
								 * System.out.println("*****************************");
								 * System.out.println("*       HELOW TEACHER       *");
								 * System.out.println("*****************************"); String inputTeacherName
								 * = null; String inputTeacherPassword = null; String teacherpass = "1234";
								 * String teacherName = "Ahd"; String inputStudentSchool = null; Stack<String>
								 * history = new Stack<String>(); HashMap<Integer, String> menueOptions = new
								 * HashMap<Integer, String>(); ArrayList<School> schoolList = new ArrayList<>();
								 * ObjectOutputStream fileWrite = null; ObjectInputStream fileRead = null;
								 * Student studentDetails = new Student();
								 * 
								 * try { FileOutputStream fileName = new
								 * FileOutputStream("C:\\Users\\User009\\Desktop\\School\\history.txt");
								 * fileWrite = new ObjectOutputStream(fileName); fileRead = new
								 * ObjectInputStream(new
								 * FileInputStream("C:\\Users\\User009\\Desktop\\School\\history.txt"));
								 * 
								 * } catch (FileNotFoundException e1) { // TODO Auto-generated catch block
								 * e1.printStackTrace(); } catch (IOException e1) { // TODO Auto-generated catch
								 * block e1.printStackTrace(); }
								 * 
								 * while (teacherExit) { // Teachers Details Inputs
								 * 
								 * try { System.out.println("Enter Teacher Name :"); inputTeacherName =
								 * sa.next(); if (inputTeacherName.matches("^[A-Za-z]*$")) // meaning {
								 * System.out.println("Falid String Format"); } else {
								 * System.out.println("Not Falid String Format \n"); teacherExit = true; } }
								 * catch (InputMismatchException e) {
								 * System.out.println("Not Falid String Format \n");
								 * System.out.println("Enter Teacher Name :"); inputTeacherName = sa.next();
								 * 
								 * // teacherExit = true; }
								 * 
								 * try { System.out.println("Enter Teacher Password :"); inputTeacherPassword =
								 * sa.next(); Integer.parseInt(inputTeacherPassword);
								 * System.out.println("Falid Number Format"); } catch (NumberFormatException e)
								 * { System.out.println("Not Falid Number Format \n"); teacherExit = true; }
								 * 
								 * history.push(inputTeacherName); history.push(inputTeacherPassword);
								 * 
								 * // boolean teacherCheck = inputTeacherName.equals(teacherName);
								 * 
								 * if (inputTeacherName.matches(teacherName)) { if
								 * (inputTeacherPassword.equals(teacherpass)) { do {
								 * 
								 * System.out.println("*****************************");
								 * System.out.println("Welcom Ms :\t" + inputTeacherName);
								 * System.out.println("*****************************"); System.out.println("");
								 * menueOptions.put(1, "INPUT STUDENT DETAILS \n"); menueOptions.put(2,
								 * "STUDENT REPORT \n"); menueOptions.put(3, "HISTORY PROGRAM \n");
								 * menueOptions.put(4, "PRINT DUBLICATE EMAIL \n"); menueOptions.put(5,
								 * "PRINT STUDENT AMOUNT \n"); menueOptions.put(6, "PRINT CODING PROBLEM \n");
								 * menueOptions.put(7, "EXIT FROM PROGRAM \n");
								 * System.out.println(menueOptions); String option = null; do { try {
								 * System.out.println("PLEASE SELECT ONLY ONE OPTION");
								 * System.out.println("*****************************"); option = sa.next();
								 * Integer.parseInt(option);
								 * 
								 * chooseInputMnue = false; } catch (NumberFormatException e) {
								 * System.out.println("           Wroooong          ");
								 * System.out.println("please select numbers Only \n"); } } while
								 * (chooseInputMnue); switch (option) { case "1":
								 * System.out.println("*****************************");
								 * System.out.println("*      STUDENT DETAILS      *");
								 * System.out.println("*****************************"); // Inserting Schools
								 * Details
								 * 
								 * while (schoolExit) {
								 * 
								 * //Stack<String> history = new Stack<String>(); School schoolDetails = new
								 * School(); System.out.println("Enter School Name"); String inputSchoolName =
								 * sa.next(); schoolDetails.setSchoolName(inputSchoolName);
								 * history.push(inputSchoolName); try { if
								 * (!inputSchoolName.matches("^[A-Za-z]*$")) { throw new
								 * Exception("\"\\\"*InFalid Format*\\\"\""); }
								 * 
								 * } catch (Exception e) { System.out.println(e.getMessage()); }
								 * 
								 * schoolDetails.finalize();
								 * 
								 * 
								 * 
								 * hasExit = Boolean.TRUE;
								 * 
								 * 
								 * int inputStudentAge= 0;
								 * 
								 * while (isExit) {
								 * 
								 * Student studentDetails1 = new Student();
								 * 
								 * System.out.println("Enter Student Age ?"); inputStudentAge = sa.nextInt();
								 * studentDetails1.setStudentAge(inputStudentAge);
								 * studentDetails1.Age(inputStudentAge); if (inputStudentAge > 3 &&
								 * inputStudentAge < 20) {
								 * 
								 * System.out.println("Enter Student First Name"); String inputStudentName =
								 * sa.next(); history.push(inputStudentName);
								 * studentDetails.setStudentName(inputStudentName);
								 * System.out.println("Enter Student Last Name"); String inputStudentLastName =
								 * sa.next(); history.push(inputStudentLastName); System.out.println(
								 * studentDetails.fullName(inputStudentName, inputStudentLastName));
								 * 
								 * try { if (!inputStudentName.matches("^[A-Za-z]*$")) { throw new
								 * Exception("\"\\\"*InValid Format*\\\"\""); }
								 * 
								 * } catch (Exception e) { System.out.println(e.getMessage()); }
								 * 
								 * 
								 * System.out.println("Enter Student Email"); String inputStudentEmail =
								 * sa.next(); history.push(inputStudentEmail);
								 * studentDetails.setstudentEmail(inputStudentEmail);
								 * emailList.add(inputStudentEmail);
								 * 
								 * try { if (!inputStudentEmail.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
								 * 
								 * throw new Exception("\"\\\"*Invalid  Email Format*\\\"\""); } } catch
								 * (Exception e) { System.out.println(e.getMessage()); }
								 * 
								 * while (isCurrencyExit) {
								 * 
								 * 
								 * 
								 * String nameCurrency =""; double amountcal = 0; HashMap<String, Double>
								 * studentFees = new HashMap<String, Double>(); HashMap<String, HashMap<String,
								 * Double>> studentFeesWithCurrency = new HashMap<String, HashMap<String,
								 * Double>>(); try {
								 * System.out.println("Choose currency (1- BRL , 2- USD , 3- EUR)"); String
								 * currency = sa.next(); int currencyInput = Integer.parseInt(currency);
								 * 
								 * System.out.println("Enter Student Amount"); int amount = sa.nextInt(); // If
								 * Conditions if (currencyInput == 1) { nameCurrency = "BRL"; amountcal = amount
								 * * 13.69; } else if (currencyInput == 2) { nameCurrency = "USD"; amountcal =
								 * amount * 2.60; } else if (currencyInput == 3) { nameCurrency = "EUR";
								 * amountcal = amount * 2.65; } } catch (Exception e) {
								 * System.out.println(e.getMessage()); } System.out.println("Student Amount" +
								 * amountcal);
								 * 
								 * studentFees.put(nameCurrency, amountcal);
								 * studentFeesWithCurrency.put(studentDetails.getStudentName(), studentFees);
								 * 
								 * System.out.println("DO You want to Add Other Currency ? press 1"); int
								 * isExitCurrency = sa.nextInt(); if (isExitCurrency == 0) { isCurrencyExit =
								 * false; }
								 * 
								 * }
								 * 
								 * hasExit = Boolean.TRUE; while (hasExit) {
								 * 
								 * 
								 * 
								 * Course studentCourse = new Course();
								 * System.out.println("Enter Course Name \n"); String inputCourseName =
								 * sa.next(); history.push(inputCourseName);
								 * studentCourse.setcourseName(inputCourseName);
								 * 
								 * 
								 * try { if (!inputCourseName.matches("^[A-Za-z]*$")) { throw new
								 * Exception("\"\\\"*Invalid Course Format*\\\"\""); }
								 * 
								 * } catch (Exception e) { System.out.println(e.getMessage()); }
								 * 
								 * try { Marks courseMarks = new Marks();
								 * System.out.println("Enter Mark for Course :"); int inputCourseMark =
								 * sa.nextInt(); String iinputCourseMark = String.valueOf(inputCourseMark);
								 * history.push(iinputCourseMark); courseMarks.setCourseMark(inputCourseMark);
								 * studentCourse.markList.add(courseMarks);
								 * studentDetails.courseList.add(studentCourse);
								 * courseMarks.marksDegree(inputCourseMark);
								 * 
								 * } catch (Exception e) { System.out.println(e.getMessage()); }
								 * 
								 * 
								 * System.out.println("Do You want To Add course press 1 if not press 0"); int
								 * exitoutput = sa.nextInt();
								 * 
								 * if (exitoutput == 0)
								 * 
								 * hasExit = false;
								 * 
								 * } schoolList.add(schoolDetails);
								 * schoolDetails.studentList.add(studentDetails1);
								 * 
								 * try {
								 * 
								 * System.out.println("Stack POP: " + history); fileWrite.writeObject(history);
								 * 
								 * } catch (IOException e) { // TODO Auto-generated catch block
								 * e.printStackTrace(); }
								 * 
								 * System.out.println("Do You want To Add Student press 1 "); int
								 * exitStudentOutput = sa.nextInt(); if (exitStudentOutput == 1) { isExit =
								 * true; isCurrencyExit = true; } else { isExit = false; isCurrencyExit = false;
								 * } }
								 * 
								 * else { System.out.println("Do Yo want to Add Student press 1"); int
								 * userAddStudents = sa.nextInt(); if (userAddStudents == 1) { isExit = true;
								 * hasExit = true; isCurrencyExit = true; } if (userAddStudents == 0) {
								 * System.out.println("*****************************");
								 * System.out.println("*      THANK YOU      *");
								 * System.out.println("*****************************"); optionExit = false;
								 * teacherExit = false; isExit = false; hasExit = false; isCurrencyExit = false;
								 * }
								 * 
								 * } studentDetails1.finalize(); }
								 * 
								 * System.out.println("Do You want To Add School press 1 "); int
								 * exitSchoolOutput = sa.nextInt(); if (exitSchoolOutput == 1) { schoolExit =
								 * true; isExit = true; hasExit = true; isCurrencyExit = true;
								 * 
								 * } else { schoolExit = false; isExit = false; hasExit = false; optionExit =
								 * true;
								 * 
								 * }
								 * 
								 * try { fileWrite.writeObject(history); } catch (IOException e) {
								 * System.out.println(e.getMessage()); } }
								 * 
								 * break; case "2":
								 * 
								 * System.out.println("*****************************");
								 * System.out.println("*      STUDENT REPORT      *");
								 * System.out.println("*****************************"); for (School h :
								 * schoolList) { System.out.println("School Name: " + h.getSchoolName()); for
								 * (Student s : h.studentList) { System.out.println("Student Name: \t" +
								 * s.getStudentName() + "\t Student Age: \t" + s.getStudentAge() +
								 * "\tStudent Email: \t" + s.getstudentEmail()); for (Course c : s.courseList) {
								 * for (Marks m : c.getmarkList()) { System.out.println("Course Name: " +
								 * c.getcourseName() + " \tCourse Marks" + m.getCourseMark()); } }
								 * 
								 * } }
								 * 
								 * break; case "3": System.out.println("*****************************");
								 * System.out.println("*          HISTORY          *");
								 * System.out.println("*****************************");
								 * 
								 * try { Stack<String> st = (Stack<String>) fileRead.readObject();
								 * System.out.println(st); } catch (Exception e) {
								 * System.out.println(e.getMessage()); }
								 * 
								 * break; case "4": for(String s:emailList) { if(emailList.add(s)==false) {
								 * System.out.println(s);
								 * 
								 * } } break;
								 * 
								 * case "5":
								 * 
								 * HashMap<String, HashMap<String, Double>> studentFeesWithCurrency = new
								 * HashMap<String, HashMap<String, Double>>();
								 * System.out.println("*****************************");
								 * System.out.println("*       STUDENT AMOUNT      *");
								 * System.out.println("*****************************");
								 * 
								 * for (String nameOfStudent : studentFeesWithCurrency.keySet()) { Map<String,
								 * Double> lowerMap = studentFeesWithCurrency.get(nameOfStudent);
								 * System.out.println("Name of Student: " + nameOfStudent); for (String
								 * currenyKey : lowerMap.keySet()) { System.out .println("Currency: " +
								 * currenyKey + "Amount: " + lowerMap.get(currenyKey)); } }
								 * 
								 * break; case "6": do {
								 * 
								 * subMenue(); int subOption = sa.nextInt(); switch (subOption) { case 1:
								 * Factorial fCalculate = new Factorial(); int i, fact = 1;
								 * System.out.println("Please Enter Number :");
								 * System.out.println("*********************"); int FactorialNum = sa.nextInt();
								 * fact = fCalculate.factorial(FactorialNum); System.out.println("Factorial of "
								 * + FactorialNum + " is: " + fact);
								 * 
								 * 
								 * 
								 * 
								 * break; case 2:
								 * 
								 * Fibonacci fibo = new Fibonacci();
								 * System.out.println("Please Enter Count number :"); int count = sa.nextInt();
								 * fibo.FibonacciCalculate(count); break;
								 * 
								 * 
								 * 
								 * case 3: StudentSeriliable studentSer = new StudentSeriliable();
								 * studentSer.studentSerializable(); break;
								 * 
								 * 
								 * 
								 * 
								 * case 4: isSubExit = false; break; } } while (isSubExit);
								 * 
								 * break; case "7": System.out.println("*****************************");
								 * System.out.println("*         THANK YOU         *");
								 * System.out.println("*****************************"); optionExit = false;
								 * teacherExit = false; break;
								 * 
								 * }
								 * 
								 * } while (optionExit);
								 * 
								 * }
								 * 
								 * else { System.out.println("Wronge Password");
								 * 
								 * }
								 * 
								 * } else { System.out.println("Wronge UserName  "); }
								 * 
								 * } teacherExit = false;
								 */

	}
}
