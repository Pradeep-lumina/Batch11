package automation;

public class Excep {
	
	public void method() {
	try {
		int data = 100/0;
		System.out.println("The value of data:"+data);
		
	}
	catch(Exception e) {
		
		System.out.println(e.getMessage());
	}
	finally {
	System.out.println("Program ended");
	
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Excep obj = new Excep();
		obj.method();

	}

}
