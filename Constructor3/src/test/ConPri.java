package test;
public class ConPri {
	private int a;
	private String name;
	private ConPri(int a,String name) {
		this.a=a;
		this.name=name;
	}
	public void privateDispay() {
		System.out.println("The value a is :"+this.a);
		System.out.println("The name is :"+this.name);
	}
	public static void main(String args[]) {
		ConPri ob=new ConPri(10000,"Furquan");
		ob.privateDispay();
	}

}
