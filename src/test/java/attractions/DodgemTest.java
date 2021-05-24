package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class DodgemTest {

    Dodgems dodgems;
    Visitor visitor1;
    Visitor visitor2;
    Visitor visitor3;

    @Before
    public void setUp() throws Exception {
        dodgems = new Dodgems("Bumper Cars", 5);
        visitor1 = new Visitor(9, 1.2, 40.0);
        visitor2 = new Visitor(12, 1.45, 80.0);
        visitor3 = new Visitor(18, 1.6, 20.0);
    }


    @Test
    public void hasName() {
        assertEquals("Bumper Cars", dodgems.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(5, dodgems.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, dodgems.getVisitCount());
    }

    @Test
    public void checkPrice() {
        assertEquals(2.25, dodgems.priceFor(visitor1), 0.0 );
        assertEquals(2.25, dodgems.priceFor(visitor2), 0.0 );
        assertEquals(4.50, dodgems.priceFor(visitor3), 0.0 );
    }

}
