package comm.example;

public class Main {

	public static void main(String[] args) {
		Vihicle vihicle=null;
		vihicle=new Maruti();
		vihicle.run();vihicle.steer();vihicle.stop();
		vihicle=new Toyota();
		vihicle.run();vihicle.steer();vihicle.stop();
		Vihicle nissan=new Vihicle() {
			
			@Override
			public void stop() {
				System.out.println("Nissan stop");
			}
			
			@Override
			public void steer() {
				// TODO Auto-generated method stub
				System.out.println("Nissan Steers");
				
			}
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Nissan Run.");
				
			}
		};
		nissan.run();nissan.steer();nissan.stop();

	}

}
