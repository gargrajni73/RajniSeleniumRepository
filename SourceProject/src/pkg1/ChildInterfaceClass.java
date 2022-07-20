package pkg1;

public class ChildInterfaceClass implements Interface1 {

	public void tc1() {
		System.out.println("I am TC1");
		
	}

	public void tc2() {
		System.out.println("I am TC2");
	}
	
	public static void main(String[] args) 
	{
		ChildInterfaceClass obj=new ChildInterfaceClass();
		Interface1 obj1=new ChildInterfaceClass();
		obj.tc1();
		obj.tc2();
		obj1.tc1();
	}

}
