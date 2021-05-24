package attractions;

import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ITicketed {

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

    public double defaultPrice()
    {
        return 8.40;
    }

    public double priceFor(Visitor visitor){
        double height = visitor.getHeight();
        if (height >= 2.0) {
            return (this.defaultPrice())*2;
        } else {
            return this.defaultPrice();
        }
    }
}
