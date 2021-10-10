package chapter7.normalcards;

public enum Suits {
    SPADE, CLUB, HEART, DIAMOND;

    @Override
    public String toString() {
        return switch (this) {
            case CLUB -> "Club";
            case HEART -> "Heart";
            case SPADE -> "Spade";
            case DIAMOND -> "Diamond";
        };
    }
}
