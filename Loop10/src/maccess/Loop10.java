package maccess;
import java.util.*;
public class Loop10 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=s.nextInt();
		int r,sum=0,temp;
		temp=n;
		while(n>0) {
			r=n%10;
			sum=sum*10+r;
			n=n/10;
		}
		if(temp==sum) {
			System.out.println(temp +" "+"is a palindrome");
		}
		else {
			System.out.println(temp +" "+"is not a palindrome number");
		}

	}

}
