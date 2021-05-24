package stalls;

import people.Visitor;

public class TobaccoStall extends Stall {

    public TobaccoStall(String name, String ownerName, ParkingSpot parkingSpot, int rating) {
        super(name, ownerName, parkingSpot, rating);
    }

    public Boolean isAllowedTo(Visitor visitor) {
        int age = visitor.getAge();
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }
}
