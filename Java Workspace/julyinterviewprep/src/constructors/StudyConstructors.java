package constructors;
class Student{
	int rollNo;
	String name;
	Student(){
		//Once parameterized constructor is created, default also needs to be created manually.
	}
	Student(int rollNo)
	{
		this.rollNo = rollNo;
	}
	Student(String name)
	{
		this.name = name;
	}
	Student(int rollNo,String name)//Parameterized Constructor
	{
		this.rollNo = rollNo;
		this.name = name;
	}
}
public class StudyConstructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Student s = new Student();//default constructor
//		s.rollNo = 1;
//		s.name = "Carryminati";
		
		Student s2 = new Student(2,"Beer Biceps");
		System.out.println(s2.name);
		Student s3 = new Student(3);
		System.out.println(s3.rollNo);
		System.out.println(s3.name);
	}

}
