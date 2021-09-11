package maccess;
public class DString9 {
	public static void main(String[] args) {
		// Trimming strings with trim()
		
		String s1=new String("Java Programming    ").trim();
		String s2=new String("  Java Programming     ").trim();
		String s3="    Java Programming".trim();
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1==s2);

	}

}
