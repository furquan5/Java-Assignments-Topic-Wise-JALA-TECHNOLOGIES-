package maccess;
import test.*;
public class MInheritance1 {
	public static void main(String[] args) {
		AClass ob=new AClass(123);
		ob.m1(45, 5);
		ob.m2(7, 3, 10);
		//ob.m3(78, 2);
		
		BClass ob2=new BClass(123);
		ob2.m1(7, 8);
		ob2.m2(7, 80, 3, 10);
		//ob.m1(45, 80);
		
		CClass ob3=new CClass(123);
		ob3.m1(785);
		ob3.m2(786);
		//ob3.m3(2, 1);

	}

}
