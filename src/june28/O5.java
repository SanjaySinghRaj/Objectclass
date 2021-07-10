package june28;

public class O5 implements Cloneable{
	int age;
	

	public O5(int age) {
		super();
		this.age = age;
	}


	public static void main(String[] args) throws CloneNotSupportedException
	{
		O5 obj1=new O5(10);
		System.out.println(obj1);
		System.out.println(obj1.age);
		O5 obj2=(O5)obj1.clone(); 
		System.out.println(obj2);
		System.out.println(obj2.age);

	}

}
