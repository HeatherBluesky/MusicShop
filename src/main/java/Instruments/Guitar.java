package Instruments;

public class Guitar extends Instrument{

    public Guitar(String manufacturer, InstrumentType instrumentType, String colour, String material, double buyingPrice, double sellingPrice) {
        super(manufacturer, instrumentType, colour, material, buyingPrice, sellingPrice);
    }

    @Override
    public String playingInstrument() {
        return "No stairway? Denied";
    }


}
