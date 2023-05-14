public class Cards {
    CardRanks cardRank;
    CardTypes cardType;

    public Cards(){

    }

    public Cards(CardRanks cardRank, CardTypes cardType){
        this.cardRank = cardRank;
        this.cardType = cardType;
    }

    public static CardTypes convertToType(String cardType) throws TypeNotFoundException {
        switch(cardType) {
            case "red":
                return Red;
                break;
            case "blue":
                return Blue;
                break;
            case "black":
                return  Black;
                break;
            case "white":
                return White;
                break;
            default:
                throw new TypeNotFoundException("this type of card has not declared.");
                break;

        }
    }

    public static CardRanks convertToRank(String cardRank) throws RankNotFoundException {
        switch (cardRank) {
            case 1: 
                return One;
                break;
            case 2: 
                return Two;
                break;
            case 3: 
                return Three;
                break;
            case 4: 
                return Four;
                break;
            case 5: 
                return Five;
                break;
            case 6: 
                return Six;
                break;
            case 7: 
                return Seven;
                break;
            case 8: 
                return Eight;
                break;
            case 9: 
                return Nine;
                break;
            case 10: 
                return Ten;
                break;
            default:
                throw new RankNotFoundException("this rank of card has not declared.");
                break;
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