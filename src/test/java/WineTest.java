import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WineTest {
    private Wine wine;

    @Before
    public void setUp() {
        wine = new Wine("La Rioja Alta");
    }

    @Test
    public void hasName() {
        assertEquals("La Rioja Alta", wine.getName());
    }
}
