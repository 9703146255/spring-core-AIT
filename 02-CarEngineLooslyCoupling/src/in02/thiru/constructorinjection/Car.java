package in02.thiru.constructorinjection;
/*

 ==> when we inject one class object into another class  by using constructor is called constructor injection
 ==> we can initialize in two ways[1) constructor 2]setter method
 
 
 */
public class Car {
	
	private Engine eng;
	
	//Initializing here otherwise we will get null pointer exception
	//using constructor[for Initialization]
	public Car(Engine eng) 
	{
		
		this.eng=eng;
	}
	
	void drive()
	{
		int status = eng.start();
		if(status>=1)
		{
			System.out.println("car is started...");
		}
		else
		{
			System.out.println("car getting some problem");
		}
	}
	
}
