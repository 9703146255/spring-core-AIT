package in01.thiru.inheritence;

//if we changed the data type in dep class it will effect the target class(car)
public class Engine {
	
	public int start()  //int ==> string,float...
	{
		System.out.println("engine started.........");
		
		return 1;
	}

}
