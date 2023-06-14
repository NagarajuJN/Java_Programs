package myJavaCodes;
 
class Parent{
	public void property()
	{
		System.out.println("Cost|| Land");	
	}
	public void marry()
	{
		System.out.println("Subbi");	
	}
}
	
class Child extends Parent{
	public void marry()
	{
		System.out.println("Sunny");
	}
}

public class OverRidding {

	public static void main(String[] args) {

		Parent p  = new Parent();
		p.marry();

		Child c  = new Child();
		c.marry();
		

		Parent p1  = new Child();
		p1.marry();
	}

}
