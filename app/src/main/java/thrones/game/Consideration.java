package thrones.game;

public enum Consideration {
    OPPONENT_ATTACK("OA"), 
    OPPONENT_DEFENCE("OD"),
    OPPONENT_MAGIC("OM"),
    TEAM_ATTACK("TA"),
    TEAM_DEFENCE("TD"),
    TEAM_MAGIC("TM");

    private final String abbrev;

    Consideration(String abbrev) {
        this.abbrev = abbrev;
    }
    // convert abbrev to enum
    public static Consideration fromString(String text) {
        if (text == null) {
            return null;
        }

        String value = text.trim().toUpperCase();
       for (Consideration c : Consideration.values()) {
        if (c.abbrev.equals(value) || c.name().equals(value)) {
            return c;
        }
    } 
       return null;
    }


    public String getAbbreviation() {
        return this.abbrev;
    }
}
    

