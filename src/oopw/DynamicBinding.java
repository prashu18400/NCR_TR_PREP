package oopw;
class Shape{
	void name() {
		System.out.println("In shape method");
	}
}
class Rectangle extends Shape{
	void name() {
		System.out.println("In rectangle method");
	}
}
class Circle extends Shape{
	void name() {
		System.out.println("In Circle method");
	}
}
public class DynamicBinding {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Where as in Dynamic binding the binding is done at runtime*/
		Shape s; //reference to class Shape
		s = new Shape();
		s.name();
		s = new Rectangle();
		s.name();
		s = new Circle();
		s.name();
		/*when we store different objects in a reference variable to Shape class,at compile time all point to
		 * same method i.e name() method in shape but an runtime respective methods are executed
		 */
		/*---> Method overloading follows Static Binding
		 * --->Method overriding follows Dynamic Binding*/

	}

}
