package TestCases;

public class FirstCode {
	
	public void add() {
		int a=10;
		int b=25;
		int c=a+b;
		System.out.println("The addition is:" + c);
		
	}
	public void sub() {
		int d=20;
		int e=67;
		int f=e-d;
		System.out.println("The subtraction is : " + f);
	}
	public void div() {
		int x=20;
		int y=100;
		int z=y/x;
		System.out.println("The division is : "+ z);
	}
	
	public static void main(String[] args) {
		FirstCode obj =new FirstCode();
		obj.add();
		obj.sub();
		obj.div();

	}

}
