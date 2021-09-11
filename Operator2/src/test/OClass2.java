package test;
public class OClass2 {
	//public int a;
	public void incre(int a) {
		System.out.println("The value of a:"+(a++));
		System.out.println("The value of a:"+(++a));
		
	}
	public void decree(int b) {
		System.out.println("The value b:"+b--);
		System.out.println("The value b:"+--b);
		
	}

}
