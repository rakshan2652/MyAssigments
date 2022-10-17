package Week3.Day1homework;

public class Student extends Department{

public void studentname() {
	System.out.println("studentname");
		
	}
public void studentDept() {
	System.out.println("studentDept");
		
	}
public void studentid() {
	System.out.println("studentid");
}


public static void main(String[] args) {
	Student D2 = new Student();
	D2.collegecode(); D2.collegename();D2.collegerank();
	D2.Departmentname();
	D2.studentDept();D2.studentid();D2.studentname();
}
}