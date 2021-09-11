package test;
public class AClass {
	
	public void m1(int x,int y) {
		System.out.println("=======AClass m1()======");
		System.out.println("The value of X+Y is :"+(x+y) );
	}
	public void m2(int x,int y,int z) {
		System.out.println("========AClass m2()===========");
		System.out.println("The value of X+Y+Z is : "+(x+y+z));
	}
	public  AClass(int z) {
		System.out.println("=======AClass m3()=========");
		System.out.println("The value of is: "+z);
	}

}
