package test;

public class CClass extends BClass{
	public void m1(int x) {
		System.out.println("==========CClass m1()=========");
		System.out.println("The value of X is :"+x);
	}
	public void m2(int y) {
		System.out.println("===========CClass m2()=========");
		System.out.println("The value of y is : "+y);
	}
	public CClass(int z) {
		//System.out.println("===========CClass m3()=========");
		//System.out.println("The value of X-Y is: "+(x-y));
		super(z);
	}

}
