package in.ashok;
//in.ashok.ElectricalEngine

public class ElectricalEngine implements IEngine{
	public ElectricalEngine() {
		System.out.println("ElectricalEngine() :: Contructor");
	}
	
	
	public boolean start() {
		System.out.println("electrical engine is started...");
		return true;
	}

}
