package june28;

public abstract class O1 {
	String name;
	int age;

	public O1(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String toString(){
		return this.name+"  "+this.age;
		
	}

	public static void main(String[] args) {
		
		O1 t1=new O1("hello",20) {};
			System.out.println(t1);	
			System.out.println(t1.toString());
			System.out.println(t1.name);
			System.out.println(t1.age);
		
		
		

	}

}
