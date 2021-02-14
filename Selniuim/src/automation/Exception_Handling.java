package automation;

public class Exception_Handling {
	
	public void method() {
		
		int data=100/0;
		System.out.println("The value of data:"+data);
		System.out.println("Program ended");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Exception_Handling obj = new Exception_Handling();
		obj.method();

	}

}
