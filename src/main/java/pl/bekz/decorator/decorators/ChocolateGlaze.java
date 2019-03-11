package pl.bekz.decorator.decorators;

import pl.bekz.decorator.IceCream;

public class ChocolateGlaze extends ComponentDecorator {

    public ChocolateGlaze(IceCream iceCream) {
        super( iceCream );
    }

    public double price(){
        final double chocolateGlazePrice = 3.50;

        return super.price() + chocolateGlazePrice;
    }

    public String description(){
        final String chocolateGlazeDescription = " with chocolate glaze";

        return super.description() + chocolateGlazeDescription;
    }
}
