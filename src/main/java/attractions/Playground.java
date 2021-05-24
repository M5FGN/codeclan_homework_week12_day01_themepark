package attractions;

import people.Visitor;

public class Playground extends Attraction {

    public Playground(String name, int rating) {
        super(name, rating);
    }

    public Boolean isAllowedTo(Visitor visitor) {
        int age = visitor.getAge();
        if (age <= 15) {
            return true;
        } else {
            return false;
        }
    }
}
