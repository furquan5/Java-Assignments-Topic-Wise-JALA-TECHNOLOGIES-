package maccess;
public class Con4 {
	String languages;
	int price;
	Con4 (){
		this.languages="Java";
	}
	Con4(String languages){
		this.languages=languages;
	}
	Con4(String languages,int price){
		this.languages=languages;
		this.price=price;
		
	}
	public void getDetails() {
		System.out.println("Languages :"+this.languages);
		System.out.println("Price :"+this.price);
	}

	public static void main(String[] args) {
		//Constructor call with no parameter
		Con4 ob1=new Con4();
		ob1.getDetails();
		 
		//Constructor call with one parameter
		Con4 ob2=new Con4("python");
		ob2.getDetails();
		//Constructor call with two parameter
		Con4 ob3=new Con4("Adv java",1500);
		ob3.getDetails();

	}

}
