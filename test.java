
public class test implements A,B {
	
	
	
	public void m2() {
		System.out.println("this is m2 method");
		
	}

	
	public void m1() {
	System.out.println("this is m1 method");
	}

	
	public void add() {
		System.out.println("this is add method");
	}

	
	

	public static void main(String[] args) {
		test t=new test();
		//variables can be called by specific interfaces
		System.out.println(A.h);
		System.out.println(B.h);
		//methods can be implemented by respective class
		t.m1();
		t.m2();
		t.add();
	}

	
}
