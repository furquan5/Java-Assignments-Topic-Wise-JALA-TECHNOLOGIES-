package maccess;
import java.util.*;
public class Loop12 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter m or f");
		char c=s.next().charAt(0);
	
		
		switch(c){
		case 'm':
			System.out.println("Gender is male");
			break;
		case 'f':
			System.out.println("Gender is female");
			break;
		}
		s.close();

	}

}
