package maccess;
import java.util.*;
public class Exception2 {
	public static void main(String[] args) {
		try {
			Scanner s=new Scanner(System.in);
			System.out.println("Enter a number..");
			int a=s.nextInt();
			int z=44;
			
			int k=z/a;
			System.out.println(k);

			
		}catch(ArithmeticException ae) {
			System.out.println("Enter non-zero number only");
			System.out.println("Classname: "+ae.getClass());
			System.out.println("Details :"+ae.getMessage());
		}

	}

}
