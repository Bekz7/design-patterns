package pl.bekz.factories.fruitmarket_abstractfactory;

import pl.bekz.factories.fruitmarket_abstractfactory.exception.NoSuchFruit;
import pl.bekz.factories.fruitmarket_abstractfactory.factories.FruitFactory;
import pl.bekz.factories.fruitmarket_abstractfactory.fruits.*;

public class FruitMarket {

    private String orderedFruit;

    void orderFruit(FruitTypes fruitTypes, FruitFactory fruitFactory) {
        Fruit fruit = pickFruit(fruitTypes, fruitFactory);
        orderedFruit = fruit.toString();
        prepare();
        box();
    }

    Fruit pickFruit(FruitTypes fruitTypes, FruitFactory fruitFactory) {

        switch (fruitTypes) {
            case APPLE:
                return fruitFactory.createApple();
            case WATERMELON:
                return fruitFactory.createWatermelon();
            case ORANGE:
                return fruitFactory.createOrange();
            case GRAPES:
                return fruitFactory.createGrapes();
            case BANANA:
                return fruitFactory.createBanana();
            default:
                throw new NoSuchFruit("We don't have this fruit in our market");
        }
    }

    private void prepare() {
        System.out.println("We're polishing " + orderedFruit);
    }

    private void box() {
        System.out.println("We're packing in cardboard bag " + orderedFruit + "\n");
    }
}
