package oopw;

public class Encapsualtion {	
	private int Age;
	private String name;
	public String getName() {
		return name;
	}

	public void setAge(int Age) {
		if(Age>20) {
			System.out.println("You are too old to be a Student");
		}
		else {
			this.Age = Age;
		}
	}
	public int getAge() {
		return Age;
	}
	public void setName(String name) {
		this.name = name;
	}
}
