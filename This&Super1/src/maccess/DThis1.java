package maccess;
public class DThis1 {

	String name,city,addr;
	int mobno;
	public DThis1(String name,String city,String addr,int mobno){
		name=this.name;
		city=this.city;
		addr=addr;
		mobno=this.mobno;
	}
	void dispplay()
	{
		System.out.println("Name :"+name+"\t"+"City :"+city+"\t"+"addr :"+addr +"MObile number:"+mobno);
	}
public class Test2{
	public static void main(String args[]) {
		DThis1 dt=new DThis1("Furquan","Kishanganj","Badar Bagh",963698);
		
	}
}
}
