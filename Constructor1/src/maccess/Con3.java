package maccess;
public class Con3 {
	String name;
	String id;
	Con3(String name,String id){
		this.name=name;
		this.id=id;
		
	}
	public void getUser() {
		System.out.println("Name :"+this.name);
		System.out.println("Id :"+this.id);
	}
	public static void main(String[] args) {
		Con3 ob=new Con3("Furquan","A121");
		ob.getUser();


	}

}
