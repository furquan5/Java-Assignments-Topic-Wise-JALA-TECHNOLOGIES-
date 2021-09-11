package test;
public class Access1 {
	private int a=400;
	private void m1() {
		System.out.println("========private method m1()========");
		System.out.println("The value of a: "+a);
		
	}
	public void m2() {
		this.m1();
	}
}
