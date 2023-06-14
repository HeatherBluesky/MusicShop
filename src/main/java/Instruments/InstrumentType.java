package Instruments;

public enum InstrumentType {

    WOODWIND ("Woodwind"),
    STRING ("String"),
    BRASS ("Brass"),
    PERCUSSION ("Percussion"),
    KEYS ("Keys");

    private final String type;
    InstrumentType (String type){
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
