package test;
public class MethodOverloading4 {
	public void m1(int a,float b) {
		System.out.println("The sum of a and b is:"+(a+b));
	}
	public void m1(float a,int b) {
		System.out.println("The difference is :"+(a-b));
	}
}
