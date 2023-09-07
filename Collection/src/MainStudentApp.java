import java.util.ArrayList;


public class MainStudentApp {
	public static void main(String[] args) {
		ArrayList<Student>studentList=new ArrayList<Student>();
		Student s1= new Student(1001,"bhanu",65.00f,79.00f,82.00f,10.0f);
		Student s2= new Student(1002,"Bunu",68.00f,89.00f,36.00f,99.00f);
		float totalfees=0;
		//adding student objects
		studentList.add(s1);
		studentList.add(s2);
		//dispaly student details
		System.out.println("Student list: ");
		for(Student student : studentList) {
			student.computeAverage();
			student.showDetails();
		}
		
	}
}
