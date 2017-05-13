package comm.example;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*PlayingCard card=new PlayingCard(Suit.SPADES, 2);
		card.getSuitName();
		System.out.println(card.getRank());
*/
		ColorFactory factory=new ColorFactory(COLOR.R);
		System.out.println("Color Code: "+factory.getColor().
				getColorCode()+" Color Rank: "+factory.getColor().getRank());
		
		
	}

}
