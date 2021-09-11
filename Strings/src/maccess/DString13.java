package maccess;
public class DString13 {
	public static void main(String[] args) {
		//Converting integer objects to Strings
		int a=15;
		Integer b=new Integer(a);
		
		System.out.println("Before Conversion :"+b.getClass().getName());
		System.out.println("After Conversion :"+b.toString());
	}

}
