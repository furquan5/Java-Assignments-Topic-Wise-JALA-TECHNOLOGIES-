package test;
public class Static7 {

	public static int a=87500;
	public String name="furquan";
	
	public static void m1() {
		System.out.println("=========Static method  m1()========");
		System.out.println("The value a is :"+a);
	}	
	public void m2() {
		System.out.println("=======NOn-Static method()==========");
		System.out.println("The value a is: "+a);
		System.out.println("The name is :"+ name);
	}
}
