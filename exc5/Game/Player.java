public class Player {
    String name;
    Cards[] cards = new Cards[5];

    public boolean findCard(CardRanks cardRanks, CardTypes cardTypes) throws CardNotFoundException  {
        for (int i=0 ; i < this.cards.length ; i++)
            if (cardRanks == cards[i].cardRank  && cardTypes == cards[i].cardType)
                return true;
        throw new CardNotFoundException("this card has not exist in this player set of cards.");
    }

 
}
   
class CardNotFoundException extends java.lang.Exception {
    CardNotFoundException(String s) {
        super(s);
    }
}