package oopw;

public class Inheritance {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher t = new Teacher();
//		t.name = "Ms.Deepthi"; //though name is declared as protected it is accessible within class and
//							// and its subclasses as well.
//		t.eat();/*Now when we define a method eat in teacher class i.e subclass it is known as Override
//		i.e same name with same arguments , so when we call eat method the method in teacher class is executed*/
//		t.teach();
		Person p = t; // up casting or implicit casting
		Teacher t1 = (Teacher)p;//down-casting mentioning that p is a type of Teacher
		
	}
}
