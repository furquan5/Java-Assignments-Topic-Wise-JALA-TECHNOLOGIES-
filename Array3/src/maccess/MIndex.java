package maccess;
import test.*;
public class MIndex {
	public static void main(String[] args) {
		int [] array= {4,5,6,7,8,9,10};
		Index i=new Index();
		System.out.println("The index value of 7 is:"+i.findIndex(array, 7));
		System.out.println("The index value of 10 is:"+i.findIndex(array, 10));
	}

}
