package test;
public class Static2 {
	public int a=5000;
	public String custName="Furquan";
	public static void m1() {
		System.out.println("=======Static m1()======");
		Static2 ob=new Static2();
		System.out.println("The value a: "+ob.a);
		System.out.println("The custName is: "+ob.custName);
	}
	
}
