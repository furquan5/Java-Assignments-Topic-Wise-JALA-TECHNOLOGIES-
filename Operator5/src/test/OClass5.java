package test;

public class OClass5 {
	public void m1(int x, int y) {
		if(x>0 && y<10) {
			System.out.println("The value of x & y:"+x +" "+y);
		}
	}
	public void m2(int x, int y) {
		if(x>10 || y==15) {
			System.out.println("The value of x & y:"+x +" "+y);
		}
	}
	public void m3(int x, int y) {
		
			System.out.println("!(a<b)"+!(x<y));
			
		
	}

}
