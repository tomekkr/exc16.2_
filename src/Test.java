class Test {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.addAllCards();
        String language = Language.askUser();
        deck.printCards(Language.valueOf(language));
    }
}
