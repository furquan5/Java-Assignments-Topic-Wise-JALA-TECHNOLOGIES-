package test;
import java.util.*;
public class Average {
	Scanner s=new Scanner(System.in);
	int arr []=new int[] {1,2,2,3,4};
	
	int sum=0;
	float avg;
	public void average() {
		for (int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
			avg=sum/arr.length;
			
		}
		System.out.println("The average of the array is"+" "+avg);
	
	}

}
