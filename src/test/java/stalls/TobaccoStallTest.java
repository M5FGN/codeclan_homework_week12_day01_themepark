package stalls;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;
    Visitor visitor1;
    Visitor visitor2;
    Visitor visitor3;

    @Before
    public void setUp() throws Exception {
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1, 1);
        visitor1 = new Visitor(14, 1.2, 40.0);
        visitor2 = new Visitor(18, 1.45, 80.0);
        visitor3 = new Visitor(21, 1.6, 20.0);
    }

    @Test
    public void hasName() {
        assertEquals("Jacks Drum", tobaccoStall.getName());
    }

    @Test
    public void hasOwner() {
        assertEquals("Jack Jarvis", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(ParkingSpot.B1, tobaccoStall.getParkingSpot());
    }

    @Test
    public void visitorIsAllowed()
    {
    assertEquals(false, tobaccoStall.isAllowedTo(visitor1));
    assertEquals(true, tobaccoStall.isAllowedTo(visitor2));
    assertEquals(true, tobaccoStall.isAllowedTo(visitor3));
    }
}
