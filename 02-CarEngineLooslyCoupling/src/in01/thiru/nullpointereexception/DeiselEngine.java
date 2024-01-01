package in01.thiru.nullpointereexception;

public class DeiselEngine implements IEngine{

	@Override
	public int start() {
		
		System.out.println("Diesel engine started.....");
		return 1;
	}

}
