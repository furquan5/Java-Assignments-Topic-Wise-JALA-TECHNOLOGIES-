package maccess;
import java.util.*;
public class Loop8 {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=s.nextInt();
		int r,c=0,temp;
		temp=n;
		while(n>0) {
			r=n%10;
			n=n/10;
			c=c+(r*r*r);
		}
		if(temp==c) {
			System.out.println(temp +" "+"is an armstrong number");
		}
		else {
			System.out.println(temp +" "+"is not an armstrong number");
		}
		s.close();
	}

}
