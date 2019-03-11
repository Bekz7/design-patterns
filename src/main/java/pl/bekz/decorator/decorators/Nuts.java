package pl.bekz.decorator.decorators;

import pl.bekz.decorator.IceCream;

public class Nuts extends ComponentDecorator {

    public Nuts(IceCream iceCream) {
        super( iceCream );
    }

    public String description(){
       final String nutsDescription = " with walnut sprinkles";

        return super.description() + nutsDescription;
    }

    public double price() {
        final double nutsPrice = 2.90;

        return super.price() + nutsPrice;
    }
}
