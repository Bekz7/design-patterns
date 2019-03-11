package pl.bekz.decorator;

import pl.bekz.decorator.decorators.ChocolateGlaze;
import pl.bekz.decorator.decorators.Nuts;

public class IceMachine {

    public static void main(String[] args) {
        IceCream iceCream = new VanillaIceCream();
        System.out.println(iceCream);

        IceCream chocoCream = new ChocolateIceCream();
        chocoCream = new Nuts(chocoCream);
        chocoCream = new ChocolateGlaze( chocoCream );
        System.out.println(chocoCream);
    }
}
