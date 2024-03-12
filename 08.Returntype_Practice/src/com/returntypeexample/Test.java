package com.returntypeexample;

public class Test {
	
	public void m1() {
		System.out.println("It's return nothing");
	}
	
	public int m2() {
		System.out.println("m2 method calling...");
//		N.B. give the O/P only message and value of return type 
//		String name="Akshya";
//		int rollNo=101;
		return 20;
	}
	
	public byte m3() {
		System.out.println("m3 method calling...");
		return 127;
	}
	
	public short m4() {
		System.out.println("m4 method calling...");
		return -32768;
	}
	
	public long m5() {
		System.out.println("m5 method calling...");
		return 12;
	}
	
	
	public float m6() {
		System.out.println("m6 method calling...");
		return 12.55f;
	}
	
	public double m7() {
		System.out.println("m7 method calling...");
		return 101.53f;
	}
	
	public boolean m8() {
		System.out.println("m8 method calling...");
		return true;
	}
	
	public char m9() {
		System.out.println("m9 method calling...");
		return 'k';
	}
	public static void main(String[] args) {
		Test test=new Test();
//		int i=test.m1();   //compile time error because return type of method is void & void returns nothing
		test.m1();
		
		int num=test.m2();
		System.out.println(num);
		
		byte bt=test.m3();
		System.out.println(bt);
		
		short st=test.m4();
		System.out.println(st);
		
		long l=test.m5();
		System.out.println(l);
		
		float f=test.m6();
		System.out.println(f);
		
		double d=test.m7();
		System.out.println(d);
		
		boolean b=test.m8();
		System.out.println(b);
		
		char c=test.m9();
		System.out.println(c);
		
		
		
		
		
		
		
		
		
		
	}

}
