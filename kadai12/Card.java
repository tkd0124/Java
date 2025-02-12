package kadai12;

public class Card implements Comparable<Card>{

	int number;
	String mark;

	public Card(int number, String mark) {
		this.number = number;
		this.mark = mark;
	}


	@Override
	public int compareTo(Card card) {

		if(this.number < card.number) {
			return -1;
		} else if(this.number > card.number) {
			return 1;
		} else {
			return this.mark.compareTo(card.mark);
		}
	}
}
