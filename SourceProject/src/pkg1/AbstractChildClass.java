package pkg1;

public class AbstractChildClass extends AbstractClass {

	public void testcase1() 
		{
		
		System.out.println("I am testcase1");
		}

	public static void main(String[] args) 
	{
		AbstractClass obj1=new AbstractChildClass();	//child class only
		AbstractChildClass obj2=new AbstractChildClass();	//Parent then child class
															//Child then Parent class not possible
		obj1.testcase1();
		obj2.testcase2();
	}
	
	}
