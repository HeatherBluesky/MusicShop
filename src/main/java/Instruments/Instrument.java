package Instruments;


public abstract class Instrument implements IPlay, ISell {
    private String manufacturer;
    private InstrumentType instrumentType;
    private String colour;
    private String material;
    private double buyingPrice;
    private double sellingPrice;



    public Instrument(String manufacturer, InstrumentType instrumentType, String colour, String material, double buyingPrice, double sellingPrice) {
        this.manufacturer = manufacturer;
        this.instrumentType = instrumentType;
        this.colour = colour;
        this.material = material;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;

    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }

    public void setInstrumentType(InstrumentType instrumentType) {
        this.instrumentType = instrumentType;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getBuyingPrice() {
        return buyingPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public double calculateMarkup(){
        return this.sellingPrice - this.buyingPrice;
    }
}
