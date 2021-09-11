package maccess;
import java.util.*;
public class Loop9 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=s.nextInt();
		int flag=0;
		if(n==0||n==1) {
			System.out.println(n+"is not a prime number");
		}
		else {
			for(int i=2;i<n/2;i++) {
				if(n%i==0) {
					System.out.println(n+"is not prime number");
					flag=1;
					break;
				}
			}
			if(flag==0) {
				System.out.println(n+" "+"is a prime number");
			}
			
		}
		s.close();

	}

}
