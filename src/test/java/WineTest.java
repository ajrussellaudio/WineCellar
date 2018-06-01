import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class

WineTest {
    private Wine wine;

    @Before
    public void setUp() {
        wine = new Wine("La Rioja Alta", "Tempranillo", 2007);
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
        assertEquals("Tempranillo", wine.getVarietal());
    }

    @Test
    public void hasVintage() {
        assertEquals(2007, wine.getVintage());
    }

    @Test
    public void canGetAgeInYears() {
        assertEquals(11, wine.getAge());
    }
}
