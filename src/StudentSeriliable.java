import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class StudentSeriliable {
	public static void studentSerializable()
	{
		
		ObjectOutputStream fileStudentWrite = null;
		ObjectInputStream fileStudentRead = null;
		Student student1 = new Student("Ahd", "Ahd@gmail.com");
		Student student2 = new Student("Amaal", "Amaal@gmail.com");
		Student student3 = new Student("Amna", "Amna@hotmail.com");
		try {
			FileOutputStream fileStudentName = new FileOutputStream(
					"C:\\Users\\User009\\Desktop\\School\\studentsDetails.txt");
			fileStudentWrite = new ObjectOutputStream(fileStudentName);
			fileStudentRead = new ObjectInputStream(new FileInputStream(
					"C:\\Users\\User009\\Desktop\\School\\studentsDetails.txt"));

			fileStudentWrite.writeObject(student1);
			fileStudentWrite.writeObject(student2);
			fileStudentWrite.writeObject(student3);
			fileStudentWrite.flush();
			fileStudentWrite.close();

			Student s1 = (Student) fileStudentRead.readObject();
			Student s2 = (Student) fileStudentRead.readObject();
			Student s3 = (Student) fileStudentRead.readObject();

			System.out.println("Student Name: " + s1.getStudentName() + "Student Mail: "
					+ s1.getstudentEmail());
			System.out.println("Student Name: " + s2.getStudentName() + "Student Mail: "
					+ s2.getstudentEmail());
			System.out.println("Student Name: " + s3.getStudentName() + "Student Mail: "
					+ s3.getstudentEmail());

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
