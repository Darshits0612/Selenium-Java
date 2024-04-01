package oops;

public class Card {
	public void makepayment()
	{
		System.out.println("pyament don by using card");
	}

}
class Debitcard extends Card{
	
	public void makepayment()
	{
		System.out.println("pyament done using debitcard");
	}
}
class creditcard extends Card{
	
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
class Driver1{
	
    public static void main(String[]args) {
	
	Debitcard card1 = new Debitcard();
	Swipingmachin machin = new Swipingmachin();
	machin.swipecard(card1);
	
    }
	
	
	
}