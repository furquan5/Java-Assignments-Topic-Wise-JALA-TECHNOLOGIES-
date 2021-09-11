package test;
import java.util.*;
public class Add {
	Scanner s=new Scanner(System.in);
	int []arr=new int[] {1,2,3,4,5,6,7};
	public void sum() {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
			
		}
		System.out.println(sum);
		
	}
	
}
