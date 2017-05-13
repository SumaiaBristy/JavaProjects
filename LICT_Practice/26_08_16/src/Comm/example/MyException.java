//custome xception handling creating my own exception class extending Exception class
package Comm.example;

public class MyException extends Exception{

	private String message;
	
	public MyException() {
		super();
		
	}

	public MyException(String message) {
		super();
		this.message = message;
	}



	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		return "Exception occured: "+message;
		//return super.toString();
	}
	
	
	
	
}
