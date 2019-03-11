package pl.bekz.decorator.decorators;

import pl.bekz.decorator.IceCream;

public abstract class ComponentDecorator implements IceCream {
    private  IceCream iceCream;

    public ComponentDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public String description(){
        return iceCream.description();
    }

    @Override
    public double price(){
        return iceCream.price();
    }

    @Override
    public String toString() {
        return description() + " " + price() + " dol";
    }
}
