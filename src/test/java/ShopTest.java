import Instruments.Drums;
import Instruments.InstrumentType;
import Instruments.Saxophone;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Saxophone saxophone;
    Drums drum;

    @Before
    public void before(){
        shop = new Shop("Jimmy Egypt's", 2000.00);
        saxophone = new Saxophone("Lisa Simpson", InstrumentType.BRASS, "Gold", "Brass", 150.00, 300.00);
        drum = new Drums("Animal", InstrumentType.PERCUSSION, "Purple", "Raw Hide", 300.00, 750.00);
    }

    @Test
    public void canAddStock(){
        shop.addStock(saxophone);
        assertEquals(1, shop.getStock().size());
    }

    @Test
    public void canSellItem(){
        shop.addStock(saxophone);
        shop.addStock(drum);
        shop.sellItem(saxophone);
        assertEquals(1,shop.getStock().size() );
        assertEquals(2150.00, shop.getTill(), 0.00);

    }

}
