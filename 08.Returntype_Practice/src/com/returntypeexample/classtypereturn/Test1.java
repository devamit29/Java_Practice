package com.returntypeexample.classtypereturn;

public class Test1 {
	
	public Employee addEmpDetails() {
		Employee e= new Employee();
		e.id=101;
		e.name="Vishal";
		e.address="Pimpri";
		
		return e;
		
	}
	
	public static void main(String[] args) {
		Test1 test=new Test1();
		Employee emp=test.addEmpDetails();
		System.out.println(emp.id+" "+emp.name+" "+emp.address);
	}

}
