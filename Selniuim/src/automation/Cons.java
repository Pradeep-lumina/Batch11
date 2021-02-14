package automation;

class add{
	
	add() {
		
		System.out.println("Constructor");
	}
	
	add(int a){
		int b,c;
		b=5;
		c=a+b;
		System.out.println("The value of c :"+c);
	}
}

public class Cons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		add obj = new add();
		add obj1 = new add(3);
		
	}

}
