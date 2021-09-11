package test;
public class Static4 {
	public static int sal=87500;
	public String name="Furquan";
	
	public void m1() {
		System.out.println("========Non-Static method m2()========");
		System.out.println("The sal is: "+sal);
		System.out.println("The name is :"+name);
	}
	public static void m2() {
		Static4 ob=new Static4();
		ob.m1();
	}

}
