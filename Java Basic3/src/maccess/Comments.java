package maccess;
public class Comments {
	public static void main(String[] args) {
		int i=10; 
		//int z=154;
		System.out.println("The value i:"+i);
		System.out.println("//int z=154 is commented as single line comment");
	
		
	}
	
	public  static void main (int a, int b) {
		System.out.println("This is a multiline Comment : /* This add method will return the sum of a +b*/ ");
			
		int sum=a+b;
		/* This add method will return the sum of a +b*/
		System.out.println("The sum is :"+sum);
			
	}
}