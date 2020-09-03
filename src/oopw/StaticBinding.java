package oopw;

public class StaticBinding {
	public void area(float r) {
		System.out.println("Area of Circle is:" + 3.416*r*r);
	}
	public void area(int l,int b) {
		System.out.println("Area of Rectangle is:"+l*b);
	}
	/*this is method overloading*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticBinding obj = new StaticBinding();
		obj.area(2);  
		obj.area(3,5);
		/*In static binding binding is done at compile time 
		 * i.e Compiler knows what method to be executed for a particular method call*/
	}

}
