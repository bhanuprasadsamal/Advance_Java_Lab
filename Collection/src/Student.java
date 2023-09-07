
public class Student {
	int id;
	String name;
	float fees;
	float osmark,comarks,javamarks,averagemarks;
	public Student(int id,String name,float fees,float osmark,float comarks,float javamarks) {
	this.id=id;
	this.name=name;
	this.fees=fees;
	this.osmark=osmark;
	this.comarks=comarks;
	this.javamarks=javamarks;
	
	}
	public void computeAverage()
	{
		averagemarks=(osmark+comarks+javamarks)/3;
	}
	public void showDetails() {
		System.out.println("Student Name: "+name);
		System.out.println("Os subject marks: "+osmark);
		System.out.println("Co marks: "+comarks);
		System.out.println("java subject marks: "+javamarks);
		
	}
	
}
