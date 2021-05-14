import java.util.LinkedList;

public class Pile extends MyStack implements PileInterface {
    MyStack pile;

    public Pile() {
        pile = new MyStack();
    }

    public Card peek()
    {
        if(pile.isEmpty())
            return null;
        else
            return (Card)pile.top();
    }

    public void addCard( Card card ) {
        pile.push(card);
    }

    public Card removeCard() {

        if (pile.isEmpty())
            return null;
        else{

            return (Card) pile.pop();
        }
    }
}
