package comm.example;

public class Toyota extends Vihicle{

	@Override
	public void steer() {
		// TODO Auto-generated method stub
		System.out.println("Toyota Steers");
		
	}

	@Override
	public void run() {
		System.out.println("Toyota Running");
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Toyota Stoped");
		
	}

	@Override
	public void getDetails() {
		// TODO Auto-generated method stub
		super.getDetails();
	}

}
