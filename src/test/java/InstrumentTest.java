import Instruments.Guitar;
import Instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InstrumentTest {
    Guitar guitar;
    ;

    @Before
    public void before(){
        guitar = new Guitar("Gibson", InstrumentType.STRING, "Cherry Red", "Wood", 100.00, 250.00);
    }

    @Test
    public void canPlayInstrument(){
        assertEquals("No stairway? Denied", guitar.playingInstrument());

    }

}
