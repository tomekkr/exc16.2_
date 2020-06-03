enum Suit {
    CLUBS("clubs", "żołądź"),
    DIAMONDS("diamonds", "dzwonek"),
    HEARTS("hearts", "serce"),
    SPADES("spades", "wino");

    private final String descriptionEN;
    private final String descriptionPL;

    Suit(String descriptionEN, String descriptionPL) {
        this.descriptionEN = descriptionEN;
        this.descriptionPL = descriptionPL;
    }

    public String getDescriptionPL() {
        return descriptionPL;
    }

    public String getDescriptionEN() {
        return descriptionEN;
    }
}
