package pl.bekz.factories.fruitmarket_abstractfactory;

import pl.bekz.factories.fruitmarket_abstractfactory.exception.NoSuchFruit;
import pl.bekz.factories.fruitmarket_abstractfactory.factories.FruitFactory;
import pl.bekz.factories.fruitmarket_abstractfactory.fruits.*;

public class FruitMarket {

    private Orange orange;
    private Apple apple;
    private Grapes grapes;
    private Watermelon watermelon;
    private Banana banana;

    void orderFruit(FruitTypes fruitTypes, FruitFactory fruitFactory) {
        Fruit fruit = pickFruit(fruitTypes, fruitFactory);
        prepare();
        box();
    }

     Fruit pickFruit(FruitTypes fruitTypes, FruitFactory fruitFactory) {

        switch (fruitTypes) {
            case APPLE:
                fruitFactory.createApple();
            case WATERMELON:
                fruitFactory.createWatermelon();
            case ORANGE:
                fruitFactory.createOrange();
            case GRAPES:
                fruitFactory.createGrapes();
            case BANANA:
                fruitFactory.createBanana();
            default:
                throw new NoSuchFruit("We don't have this fruit in our market");
        }
    }

    private void prepare() {
        System.out.println("We're polishing " + orderedFruit());
    }

    private void box() {
        System.out.println("We're packing in cardboard bag " + orderedFruit() + "\n");
    }

    private String orderedFruit() {
        if (orange != null) {
            return orange.toString();
        }
        if (apple != null) {
            return apple.toString();
        }
        if (grapes != null) {
            return grapes.toString();
        }
        if (banana != null) {
            return banana.toString();
        }
        if (watermelon != null) {
            return watermelon.toString();
        } else {
            throw new NoSuchFruit("We don't have such fruit");
        }
    }
}
