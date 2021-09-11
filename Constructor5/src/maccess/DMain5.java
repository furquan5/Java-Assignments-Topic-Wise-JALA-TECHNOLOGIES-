package maccess;
public class DMain5 {
	public boolean b;
	public String book;
	DMain5(boolean b, String book){
		this.b=b;
		this.book=book;
	}
	public static void main(String args[]) {
		DMain5 ob=new DMain5(false,"the field");
		System.out.println("boolean  :"+ob.b);
		System.out.println("Book :"+ob.book);
		//DMain5 ob1=new DMain5(true,"jd");
	} 
	}


