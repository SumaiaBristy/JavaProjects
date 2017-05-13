package comm.example;

public enum COLOR {
	
	R("RED",1),
	G("GREEN",2),
	B("BLUE",3);
	private  final String colorCode;
	private final int rank;
	private COLOR(String colorCode,int rank)
	{
		this.colorCode=colorCode;
		this.rank=rank;
	}
	public String getColorCode() {
		return colorCode;
	}
	public int getRank() {
		return rank;
	}
	
	
}


