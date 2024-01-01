package in01.thiru.inheritence;

public class Car extends Engine {
	
	public void drive()
	{
		int status = super.start();
		if(status>=1)
		{
			System.out.println("car driving starting......");
		}
		else
		{
		System.out.println("problem in the engine please check once");	
		}
		
	}
	
	

}
