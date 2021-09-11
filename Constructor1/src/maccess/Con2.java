package maccess;
public class Con2 {
	int a;
	Con2(int a){
		this.a=a;
	}
	public void getNumber() {
		System.out.println("The number is :"+this.a);
	}
	public static void main(String[] args) {
		Con2 ob=new Con2(1500);
		ob.getNumber();

	}

}
