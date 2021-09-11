package maccess;
import java.util.*;
public class Exception4 {
	public static void main(String[] args) {
		try {
			Scanner s=new Scanner(System.in);
			System.out.println("Enter a number ");
			int a=s.nextInt();
			System.out.println("Enter another number");
			int  b=s.nextInt();  //Exception for non-integer value
			
			float div=a/b; //Exception when b=0
			System.out.println(div);
			
		}catch(ArithmeticException ae) {
			System.out.println("Enter only non-zero values..");
			System.out.println("Classname :"+ae.getClass());
			System.out.println("Details :"+ae.getMessage());
		}
		catch(InputMismatchException ime) {
			System.out.println("Enter only specified number");
			System.out.println("Classname :"+ime.getClass());
			System.out.println("Details :"+ime.getMessage());
		}

	}

}
