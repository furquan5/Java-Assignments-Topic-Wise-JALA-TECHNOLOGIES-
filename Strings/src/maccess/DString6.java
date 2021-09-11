package maccess;
public class DString6 {
	public static void main(String[] args) {
		// Matching a String Against a Regular Expression With matches()
		String s1="My name is Furquan Arshi";
		String s2="Arshi";
		
		//not case sensitive
		boolean s3=s1.regionMatches(true, 19, s2, 0, 5);
		System.out.println(s3);
		
		//case sensitive
		System.out.println(s1.regionMatches(11, s2, 0, 5));
		
		
		 // Testing if regex is present
	      System.out.print("Does String contains regex (.*)Arshi(.*) ? : " );
	      System.out.println(s1.matches("(.*)Arshi(.*)"));
	        
	      // Testing if regex is present
	      System.out.print("Does String contains regex Arshi ? : " );
	      System.out.println(s1.matches("Arshi"));
	}

}
