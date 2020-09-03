package Methods;

public class PvPr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Here we are going to see the difference between Pass by value and Pass by reference
		int a = 32;
		int b = 12;
		swap(a,b);//as soon as the method is called 
		System.out.println("a = "+a +",b = " + b);
		Dog c = new Dog();
		Dog d = new Dog();
		c.legs = 4;
		d.legs = 3;
		swap(c,d);
		System.out.println(c.legs + "     " + d.legs);
	}

	private static void swap(int a, int b) { 
		/*here two objects int a and int b are created and the values are stored in them and these are swapped
		 * in the function but the original variables are unchanged
			*/							
		// TODO Auto-generated method stub
		int temp = a;
		a = b;
		b = temp;
		System.out.print("Inside function ");
		System.out.println(a + " " + b);
	}
	private static void swap(Dog c,Dog d) {
		//Here when it comes to non-primitive data types i.e classes a reference to that class is created and 
		//passed and those reference as swapped in this method but the reference of original c and d class 
		//remain same
		Dog temp;
		temp = c;
		c = d;
		d = temp;
	}

}
