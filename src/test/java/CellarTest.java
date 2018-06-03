import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CellarTest {
    private Cellar cellar;

    @Before
    public void setUp() throws Exception {
        cellar = new Cellar();
    }

    @Test
    public void startsEmpty() {
        assertEquals(0, cellar.wineCount());
    }

//    @Test
//    public void canAddWine() {
//        Wine wine = new Wine("Fog Head Reserve", "Chardonnay", 2013);
//        cellar.add(wine);
//        assertEquals(1, cellar.wineCount());
//    }
//
//    @Test
//    public void canRemoveWine() {
//        Wine wine = new Wine("Errazuriz Estate", "Merlot", 2015);
//        cellar.add(wine);
//        cellar.remove(wine);
//        assertEquals(0, cellar.wineCount());
//    }
//
//    @Test
//    public void canGetOldestWine() {
//        // arrange
//        Wine merlot = new Wine("Errazuriz Estate", "Merlot", 2015);
//        cellar.add(merlot);
//
//        Wine rioja = new Wine("La Rioja Alta", "Tempranillo", 2007);
//        cellar.add(rioja);
//
//        Wine chardonnay = new Wine("Fog Head Reserve", "Chardonnay", 2013);
//        cellar.add(chardonnay);
//
//        // act
//        Wine oldestWine = cellar.getOldestWine();
//
//        // assert
//        assertEquals(rioja, oldestWine);
//    }
}
