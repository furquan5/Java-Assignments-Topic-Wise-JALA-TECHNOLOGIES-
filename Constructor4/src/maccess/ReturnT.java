package maccess;
public class ReturnT {
	int price;
	String course;
	ReturnT(int price){
		this.price=price;
	}
	ReturnT (String course){
		this.course=course;
	}
	
public static void main(String args[]) {
	ReturnT ob=new ReturnT(1000);
	System.out.println("The price is :"+ob.price);
	ReturnT ob1=new ReturnT("Java");
	System.out.println("The course is :"+ob1.course);
	
}

}
