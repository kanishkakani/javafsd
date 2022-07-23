package javafsd;

public class Student {
	int stdId;
	String stdName;
	String Department;
	float Fees;

// default constructor
	public Student() {
		stdId = 1;
		stdName = "Max";
		Department = "Computer";
		Fees = 35000;
	}

// parametrized constructor
	public Student(int stdId, String stdName, String department, float fees) {
		this.stdId = stdId;
		this.stdName = stdName;
		this.Department = department;
		this.Fees = fees;
	}

	public void display() {
		System.out.println("Id: " + stdId);
		System.out.println("Name: " + stdName);
		System.out.println("Department: " + Department);
		System.out.println("Fees: " + Fees);
		System.out.println();
	}

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student(2, "William", "Electrical", 45000);
// calling default constructor
		s1.display();
// parametrized constructor
		s2.display();
	}

}
