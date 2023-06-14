package Instruments;

public class Saxophone extends Instrument{


    public Saxophone(String manufacturer, InstrumentType instrumentType, String colour, String material, double buyingPrice, double sellingPrice) {
        super(manufacturer, instrumentType, colour, material, buyingPrice, sellingPrice);
    }

    @Override
    public String playingInstrument() {
        return "Take it Sax man";
    }


}
