package Instruments;

public class Piano extends Instrument{
    public Piano(String manufacturer, InstrumentType instrumentType, String colour, String material, double buyingPrice, double sellingPrice) {
        super(manufacturer, instrumentType, colour, material,buyingPrice, sellingPrice);
    }

    @Override
    public String playingInstrument() {
        return "Play that funky music white boy";
    }

}
