package TestCases;

public class MethodCall {
	public static void add() {
		int a=10;
		int b=25;
		int c=a+b;
		System.out.println("The addition is:" + c);
		
	}
	public static void sub() {
		int d=20;
		int e=67;
		int f=e-d;
		System.out.println("The subtraction is : " + f);
	}
	public  static void div() {
		int x=20;
		int y=100;
		int z=y/x;
		System.out.println("The division is : "+ z);
	}
	
	
	

	public static void main(String[] args) {
		MethodCall.add();  //no need to create object for static methods
		MethodCall.sub();
		MethodCall.div();
	

	}

}
