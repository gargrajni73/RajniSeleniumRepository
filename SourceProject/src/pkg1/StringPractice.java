package pkg1;

public class StringPractice {

	public static void main(String[] args) {

		String s1="Rajni";  //String class object creation using = operator
		String s2="Rajni";
		String s3=new String("Rajni"); //String class object creation using new keyword
		if(s1==s2)
		{
			System.out.println("String address are same s1 and s2");
		}
		if(s2==s3)
		{
			System.out.println("String address are same s2 and s3");
		}
		if(s1.equals(s2))
		{
			System.out.println("String content are same s1 and s2");
		}
		if(s2.equals(s3))
		{
			System.out.println("String content are same s2 and s3");
		}
		
		
	}

}
