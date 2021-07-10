package june28;

public class O6 {
	
	public void finalize() {
		System.out.println("Remove");
	}

	public static void main(String[] args) {
		new O6();
		O6 obj1=new O6();
		obj1=null;
		O6 obj2=new O6();
		O6 obj3=new O6();
		obj2=obj3;
		System.gc();

	}

}
