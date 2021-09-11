
//1. Write two methods with the same name but different number of parameters of same type
//and call the methods from main method
package test;
public class MethodOverloading1{
	public void m1(int x,int y) {
		System.out.println("The sum is :"+(x+y));
		
	}
	public void  m1(int x,int y,int z) {
		System.out.println("The sum is :"+(x+y+z));
	}
	
}

