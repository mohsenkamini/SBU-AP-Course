public class Game {
    static Player[] players = new Player[7];

    static Cards currentCard= new Cards();

    public static void removeCard(String name, String cardRank, String cardType ) {
        for (int i=0 ; i < players.length ; i++)
            if (players[i].name.equals(name))
                for (int j=0 ; j < players[i].cards.length ; j++)
                    if (players[i].findCard(convertToRank(cardRank),convertToType(cardType)))


    }

    public static void play(String name, String cardRank, String cardType, boolean extraMove) {

    }

    public static void play(String name, String cardRank, String cardType, boolean extraMove, int extraMoveNum,
                            String newCardRank, String newCardType) {
        
        if (convertToType(cardType.equals) != currentCard.cardType)
           throw new NotSameTypeException("your card type is different with the main type.");
                            

    }

    public static void playCard(String name, Cards card, boolean extraMove) {
        // TODO
    }

    public static void playCard(String name, Cards card, boolean extraMove, int extraMoveNum, String newCardRank,
                                String newCardType) {
        // TODO
    }

    public static void extraMove(Cards card, int extraMove, String newCardRank, String newCardType) {
        switch(extraMove) {
            case 2:
                break;
            case 8:
                break;
            case 5:
                break;
        }
    }

}
    
class NotSameTypeException extends java.lang.Exception {
    NotSameTypeException(String s) {
        super(s);
    }
}
  
class NotSameTypeException extends java.lang.Exception {
    NotSameTypeException(String s) {
        super(s);
    }
}