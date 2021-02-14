package automation;

public class Sample {
	
	public void add(int a) {
		
		int b,c;
		b=5;
		c=a+b;
		System.out.println("The value of c: "+c);
	}
	
	public void add(int a, int b) {
		int c;
		c=a+b;
		System.out.println("The value of c: "+c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sample obj = new Sample();
		obj.add(3);
		obj.add(2, 3);
		System.out.println("Addition program");
	}

}
