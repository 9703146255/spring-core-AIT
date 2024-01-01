package in01.thiru.nullpointereexception;

public class PetrolEngine implements IEngine{

	@Override
	public int start() {
		System.out.println("started PetrolEngine");
		return 1;
	}

}
