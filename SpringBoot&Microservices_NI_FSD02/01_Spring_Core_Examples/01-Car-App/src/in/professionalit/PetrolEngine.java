package in.professionalit;

public class PetrolEngine implements IEngine {
	
	@Override
	public int start() {
		System.out.println("PetrolEngine started..");
		return 1;
	}

}
