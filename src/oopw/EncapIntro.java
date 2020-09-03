package oopw;

public class EncapIntro {
	public static void main(String[] args) {
		Encapsualtion obj = new Encapsualtion();
		//obj.name //here we can't set that attributes as they are declared as private 
		obj.setAge(12);
		System.out.println(obj.getName());
	}
}
