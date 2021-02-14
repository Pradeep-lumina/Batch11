package automation;

class method{
	void method1()
	{
		System.out.println("Selenium");
	}
}

class method2 extends method{
	
	void method1() {
		System.out.println("Automation");
	}
}


public class Method_Overriding extends method{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Method_Overriding obj = new Method_Overriding();
		obj.method1();
	
	}

}
