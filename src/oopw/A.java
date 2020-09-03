package oopw;

public class A {
	static {
		System.out.println("In block 1");
	}
	class B{
		public void display() {
			System.out.println("In B");
		}
	}
	static class C{
		public void display() {
			System.out.println("In C");
		}
	}
}
