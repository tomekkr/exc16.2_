class Card {
    private Symbol symbol;
    private Suit suit;

    public Card(Symbol symbol, Suit suit) {
        this.symbol = symbol;
        this.suit = suit;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public Suit getSuit() {
        return suit;
    }
}
