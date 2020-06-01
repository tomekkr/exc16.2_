class Card {
    private NumberAndFace numberAndFace;
    private Suit suit;

    public Card(NumberAndFace numberAndFace, Suit suit) {
        this.numberAndFace = numberAndFace;
        this.suit = suit;
    }

    public NumberAndFace getNumberAndFace() {
        return numberAndFace;
    }

    public Suit getSuit() {
        return suit;
    }
}
