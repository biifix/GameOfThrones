package thrones.game;

public enum AffectedAttribute {
    
    ATTACK,
    DEFENCE,
    NONE;

    public static AffectedAttribute getAffectedAttribute(Suit suit) {
        if (suit.isCharacter()) {
            return ATTACK;
        } else if (suit.isDefence()) {
            return DEFENCE;
        } else {
            return NONE;
        }
    }
}