package test;
public class Static1 {
	public static int EId=10300; //static variable
	public static String Ename="Furquan";//static variable
	public String EDesg="System Engineer";//Non-Static variable and Instance variable 
	public int sal=87500;//Non-Static variable and Instance variable 
	
	public static void m1() {
		System.out.println("======Static method m1()=========");
		System.out.println("The Employee Id is: "+ EId);
		System.out.println("The Employee Name is: "+Ename);
		//System.out.println("The Employee Designation is: "+EDesg);
		//System.out.println("The Employee salary is :"+sal);
	}
	public static void m2() {
		System.out.println("========Static method m2()=========");
		System.out.println("The Employe Id is :"+EId);
	}
	public void m3() {
		System.out.println("==========Non-Static method m3()=========");
		System.out.println("The Employee Id is: "+ EId);
		System.out.println("The Employee Name is: "+Ename);
		System.out.println("The Employee Designation is: "+EDesg);
		System.out.println("The Employee salary is :"+sal);
	
	}
	public void m4() {
		System.out.println("=========Non-Static method m4()==========");
		System.out.println("The Employee Id is: "+ EId);
		System.out.println("The Employee Name is: "+Ename);
		System.out.println("The Employee Designation is: "+EDesg);
		System.out.println("The Employee salary is :"+sal);
	}
	
	
}
