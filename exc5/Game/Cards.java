public class Cards {
    CardRanks cardRank;
    CardTypes cardType;

    public Cards(){

    }

    public Cards(CardRanks cardRank, CardTypes cardType){
        this.cardRank = cardRank;
        this.cardType = cardType;
    }

    public static CardTypes convertToType(String cardType)  {
        // public static CardTypes convertToType(String cardType) throws TypeNotFoundException {
        switch(cardType) {
            case "red":
                return CardTypes.Red;
            case "blue":
                return CardTypes.Blue;
            case "black":
                return  CardTypes.Black;
            case "white":
                return CardTypes.White;
            default:
                return CardTypes.White;
            // throw new TypeNotFoundException("this type of card has not declared.");


        }
    }

    public static CardRanks convertToRank(String cardRank)  {
        // public static CardRanks convertToRank(String cardRank) throws RankNotFoundException {
        switch (cardRank) {
            case "1": 
                return CardRanks.One;
            case "2": 
                return CardRanks.Two;
            case "3": 
                return CardRanks.Three;
            case "4": 
                return CardRanks.Four;
            case "5": 
                return CardRanks.Five;
            case "6": 
                return CardRanks.Six;
            case "7": 
                return CardRanks.Seven;
            case "8": 
                return CardRanks.Eight;
            case "9": 
                return CardRanks.Nine;
            case "10": 
                return CardRanks.Ten;
            default:
                return CardRanks.Ten;
                // throw new RankNotFoundException("this rank of card has not declared.");
        }
    }
}

class TypeNotFoundException extends java.lang.Exception {
    TypeNotFoundException(String s) {
        super(s);
    }
}

class RankNotFoundException extends java.lang.Exception {
    RankNotFoundException(String s) {
        super(s);
    }
}