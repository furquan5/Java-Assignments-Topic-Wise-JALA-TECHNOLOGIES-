package test;
public class Static5 {
	public static int add() {
		int a=10;
		int b=20;
		int c=a+b;
		return c;
		
	}
	public void dis() {
		System.out.println("========Non-Static method=========");
		int z=add();  //Calling static method inside Instance method
		System.out.println("The sum of a +b is :"+z);
	}

}
