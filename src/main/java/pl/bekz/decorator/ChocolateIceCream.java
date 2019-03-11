package pl.bekz.decorator;

import pl.bekz.decorator.IceCream;

public class ChocolateIceCream implements IceCream {

    @Override
    public String description() {
        return "Chocolate ice cream";
    }

    @Override
    public double price() {
        return 5.00;
    }

    @Override
    public String toString() {
        return description() + " " + price() + " dol";
    }
}
