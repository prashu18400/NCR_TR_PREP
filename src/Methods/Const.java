package Methods;

public class Const {
	protected String name;
	Const(String name){
		this.name = name;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Const s = new Const("Prashu");
		Const s1 = new Const("pranavi");
		System.out.println(s1.name);
		s.name = "deepthi";
		System.out.println(s.name);
	}

}
