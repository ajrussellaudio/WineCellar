import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WineTest {
    private Wine wine;

    @Before
    public void setUp() {
        wine = new Wine("La Rioja Alta", "Tempranillo");
    }

    @Test
    public void hasName() {
        assertEquals("La Rioja Alta", wine.getName());
    }

    @Test
    public void canSetName() {
        wine.setName("La Rioja Alta Gran Reserva");
        assertEquals("La Rioja Alta Gran Reserva", wine.getName());
    }

    @Test
    public void hasGrape() {
        assertEquals("Tempranillo", wine.getGrape());
    }
}
