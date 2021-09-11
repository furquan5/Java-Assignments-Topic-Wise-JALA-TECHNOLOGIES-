package test;

public class BClass extends AClass{
	public void m1(int x,int y,int a) {
		System.out.println("=========BClass m1()=======");
		System.out.println("The value of X+Y+A is :"+(x+y+a) );
	}
	public void m2(int x,int y,int z,int b) {
		System.out.println("=======BClass m2()===========");
		System.out.println("The value of X+Y+Z+B is : "+(x+y+z+b));
	}
	public BClass(int z) {
		//System.out.println("=========BClass m3()========");
		//System.out.println("The value of X-Y is: "+(x-y));
		super(z);
	}

}
