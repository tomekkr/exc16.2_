enum Symbol {
    TWO("Two", "Dwójka"),
    THREE("Three", "Trójka"),
    FOUR("Four", "Czwórka"),
    FIVE("Five", "Piątka"),
    SIX("Six", "Szóstka"),
    SEVEN("Seven", "Siódemka"),
    EIGHT("Eight", "Ósemka"),
    NINE("Nine", "Dziewiątka"),
    TEN("Ten", "Dziesiątka"),
    JACK("Jack", "Walet"),
    QUEEN("Queen", "Królowa"),
    KING("King", "Król"),
    ACE("Ace", "As");

    private final String descriptionEN;
    private final String descriptionPL;

    Symbol(String descriptionEN, String descriptionPL) {
        this.descriptionEN = descriptionEN;
        this.descriptionPL = descriptionPL;
    }

    public String getDescriptionEN() {
        return descriptionEN;
    }

    public String getDescriptionPL() {
        return descriptionPL;
    }
}
