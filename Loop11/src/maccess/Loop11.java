package maccess;
import java.util.*;
public class Loop11 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number ");
		int n=s.nextInt();	
		switch(n%2) {
		case 0: //Even
			 
			System.out.println(n+" "+"is an even number");
			break;
			
		case 1: //odd
			
			System.out.println(n+" "+"is an odd number");
			break;
		}
		s.close();

	}

}
