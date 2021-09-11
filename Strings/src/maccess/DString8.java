package maccess;
public class DString8 {
	public static void main(String[] args) {
		//equalsIgnoreCase(), startsWith(), endsWith() and compareTo()
		
		String s1="Jala Technology";
		String s2="Jala technology";
		String s3="Java Programming";
		
		boolean s4=s1.equalsIgnoreCase(s2);
		int s5=s1.compareTo(s3);
		boolean s6=s1.startsWith("J");
		boolean s7=s1.endsWith("gy");
		
		
		
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
		System.out.println(s7);
		
	}

}
