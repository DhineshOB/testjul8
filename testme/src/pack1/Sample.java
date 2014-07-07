package pack1;

public class Sample {

	public void method1()
	{
		
		System.out.println("Method 1");
	
	}
	
	public void method2()
	{
		
		System.out.println("Method 2");
	
	}
	
	public void method3()
	{
		
		System.out.println("Method 3");
	
	}
	
	public static void main(String args[])
	{
		int a=10;
		Sample sam = new Sample();
		if(a==10)
		sam.method1();
		else if(a==20)
		sam.method2();
		else
		sam.method3();
		System.out.println("End of Exe");
	}
	
}
