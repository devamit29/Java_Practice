package com.returntypeexample.classtypereturn;

public class StudentTest {
	
	public Student addStudentDetails() {
		Student std=new Student();
		std.id=11;
		std.name="Omkar";
		std.rollNo=501;
		return std;
		
	}
	
	public static void main(String[] args) {
		StudentTest stest=new StudentTest();
		Student st=stest.addStudentDetails();
		System.out.println(st.id+" "+st.name+" "+st.rollNo);
	}

}
