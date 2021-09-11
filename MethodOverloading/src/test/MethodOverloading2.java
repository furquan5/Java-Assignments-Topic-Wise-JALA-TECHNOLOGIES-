
package test;
public class MethodOverloading2 {
	public void m1(int x,float y) {
		System.out.println("The sum od x & y is :"+(x+y));
	}
	public void m1(int x, double y, Long z) {
		System.out.println("The sum of x, y & z are :"+(x+y+z));
	}
}
