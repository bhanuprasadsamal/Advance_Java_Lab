class Student {
	int rollNo;
	String name;
	float marks;
	static String universityname ="GIET UNIVERSITY";
	Student(int rollNo, String name, float marks){
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}
	public void showValues() {
		System.out.println("Roll No : " + rollNo);
		System.out.println("Student Name : " + name);
		System.out.println("Marks : " + marks);
	}
}