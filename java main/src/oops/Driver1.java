package oops;

class Card {
	public void makepayment()
	{
		System.out.println("pyament don by using card");
	}

}
class Debitcard extends Card{
	
	public void makepayment()
	{
		System.out.println("pyament done using debit card");
	}
}
class Creditcard extends Card{
	
	public void makepayment()
	{
	   System.out.println("payment donn using credit card");
	}
	
}
class Swipingmachin{
	
	public void swipecard(Card c)
	{
		c.makepayment();
	}
}
public class Driver1{
	
    public static void main(String[]args) {
	
	Debitcard card1 = new Debitcard();
	Swipingmachin machin = new Swipingmachin();
	machin.swipecard(card1);
	
	Creditcard card2 = new Creditcard();
	machin.swipecard(card2);	
    }	
}