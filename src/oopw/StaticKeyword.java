package oopw;

import oopw.A.B;
import oopw.A.C;


public class StaticKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj = new A();
		B obj1 = obj.new B(); // as class B is not declared as Static we need to create an object of A and then
								//for B
		obj1.display();
		//But class C is declared as static
		C obj2 = new A.C();
		obj2.display();
	}

}
