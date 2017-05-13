package comm.example;

public class PlayingCard {

	private Suit suit;
	private int rank;

	public PlayingCard() {
		super();
	}

	public PlayingCard(Suit suit, int rank) {
		super();
		this.suit = suit;
		this.rank = rank;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public void getSuitName() {
		switch (suit) {
		case SPADES:
			System.out.println("Card Is Spades");
			break;
		case HEARTS:
			System.out.println("Card is Hearts");
			break;
		case CLUBS:
			System.out.println("Card Is Clubs.");
			break;
		default:
			System.out.println("Invalid.");
		}
	}

}
