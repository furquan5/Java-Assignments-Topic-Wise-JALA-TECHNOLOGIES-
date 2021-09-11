package test;
public class ConPro {
	protected String item;
	protected int price;
	protected ConPro(String item,int price){
		this.item=item;
		this.price=price;
	}
	public void displaypro() {
		System.out.println("The item is :"+this.item);
		System.out.println("The price is :"+this.price);
	}
	

}
