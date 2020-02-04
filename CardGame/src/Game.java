import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by tito on 2018-08-29.
 */
public class Game {

    private ArrayList<Card> cards;

    public Game(int amount) {
        this.cards = new ArrayList();
        for (int i = 0; i < amount; i++) {
            for (Type t : Type.values()) {
                for (CardValue cv : CardValue.values()) {
                    Card card = new Card(cv, t);
                    cards.add(card);
                }
            }
        }
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public Card pick() {
        Card card = cards.get(0);
        cards.remove(0);
        return card;
    }

    public void Shuffle() {
        Collections.shuffle(cards);
    }

    public void sort() {
        //TODO implement sort
    }
}