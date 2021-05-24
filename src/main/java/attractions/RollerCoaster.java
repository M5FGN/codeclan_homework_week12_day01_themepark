package attractions;

import people.Visitor;

public class RollerCoaster  extends Attraction {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }


    public Boolean isAllowedTo(Visitor visitor) {
        int age = visitor.getAge();
        double height = visitor.getHeight();
        if (age >= 12 && height >= 1.45) {
            return true;
        } else {
            return false;
        }
    }
}
