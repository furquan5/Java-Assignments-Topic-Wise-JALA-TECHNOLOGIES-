package maccess;
import java.util.*;
public class Loop5 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number 1");
		int a=s.nextInt();
		System.out.println("Enter number 2");
		int b=s.nextInt();
		System.out.println("Enter number 3");
		int c=s.nextInt();
		
		if(a>b && a>c) {
			System.out.println("a is the largest number");
		}
		else if(a>b && c>a) {
			System.out.println("c is the largest number");
		}
		else {
			System.out.println("b is the largest number");
		}
	}

}
