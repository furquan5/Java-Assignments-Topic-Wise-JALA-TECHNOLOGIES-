package maccess;
public class DString11 {
	public static void main(String[] args) {
		// Splitting strings with split()
		
		String s1="Java@Programming@language";
		
		String [] arr=s1.split("@",10 );
		for(String z:arr)
		System.out.println(z);

	}

}
