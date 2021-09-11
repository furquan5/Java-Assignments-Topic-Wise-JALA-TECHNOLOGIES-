package test;
public class Display {
	public int a; // Instance variable 
	public void dis() {
		int a=13; //local variable 
		System.out.println("The value a:"+a);
		System.out.println("The value a:"+a);
	}

}

//There is no concept of global variable in java because we cannot declare variable outside the class
//There is no concept of static local variable in java(compilation error)
