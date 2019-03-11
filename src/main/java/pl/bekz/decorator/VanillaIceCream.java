package pl.bekz.decorator;

public class VanillaIceCream implements IceCream {

    @Override
    public String description() {
        return "Vanilla ice cream";
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
