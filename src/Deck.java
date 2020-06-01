import java.util.ArrayList;
import java.util.List;

class Deck {
    private ArrayList<Card> cards;

    public Deck() {
        this.cards = new ArrayList<>();
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void addAllCards() {
        List<Symbol> symbols = List.of(Symbol.values());
        List<Suit> suits = List.of(Suit.values());
        for (Symbol synbol : symbols) {
            for (Suit suit : suits) {
                cards.add(new Card(synbol, suit));
            }
        }
    }

    public void printCards(Language language) {
        switch (language) {
            case EN -> printInEnglish();
            case PL -> printInPolish();
        }
    }

    private void printInPolish() {
        for (int i = 0; i < getCards().size(); i++) {
            System.out.println(cards.get(i).getSymbol().getDescriptionPL()
                    + " " + cards.get(i).getSuit().getDescriptionPL());
        }
    }

    private void printInEnglish() {
        for (int i = 0; i < getCards().size(); i++) {
            System.out.println(cards.get(i).getSymbol().getDescriptionEN()
                    + " of " + cards.get(i).getSuit().getDescriptionEN());
        }
    }
}
