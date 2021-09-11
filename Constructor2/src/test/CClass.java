package test;
public class CClass extends PClass{
	public int sal;
	public String Desg;
	public CClass(String name,String city,String Desg,int sal){
		super(name,city);
		this.Desg=Desg;
		this.sal=sal;
	}
	public void displayPerson() {
		System.out.println("Name is :"+this.name);
		System.out.println("City is :"+this.city);
		System.out.println("Desg is :"+this.Desg);
		System.out.println("Sal is :"+this.sal);
	}

}
