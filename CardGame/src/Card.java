/**
 * Created by tito on 2018-08-28.
 */
public class Card {
    private Type type;
    private CardValue cardValue;

    public Card (CardValue cardValue, Type type)
    {
        this.cardValue = cardValue;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Card{" +
                "type=" + type +
                ", cardValue=" + cardValue +
                '}';
    }

    public Type getType()
    {
        return type;
    }

    public CardValue getCardValue()
    {
        return cardValue;
    }
}
