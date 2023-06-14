package Instruments;

public class Drums extends Instrument{
    public Drums(String manufacturer, InstrumentType instrumentType, String colour, String material, double buyingPrice, double sellingPrice) {
        super(manufacturer, instrumentType, colour, material, buyingPrice, sellingPrice);
    }

    @Override
    public String playingInstrument() {
        return "dudum tsk";
    }

}
