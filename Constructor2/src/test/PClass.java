package test;
public class PClass {
	public String name;
	public String city;
	PClass(){} //Default Constructor
	PClass(String name ,String city){  //Argumented Constructor
		this.name=name;
		this.city=city;
	}
	public void getDetail() {
		System.out.println("The name is :"+this.name);
		System.out.println("The city is :"+this.city);
	}

}
