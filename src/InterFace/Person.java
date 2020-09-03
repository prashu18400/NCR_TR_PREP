package InterFace;

public class Person implements Study,Youtuber{

	@Override
	public void youtuber() {
		// TODO Auto-generated method stub
		System.out.println("This is a Good Video");
		
	}

	@Override
	public void study() {
		// TODO Auto-generated method stub
		System.out.println("Related to JEE Mains Exam");
	}
	public static void main(String[] args) {
		Person p = new Person();
		p.youtuber();
		p.study();
	}
}
