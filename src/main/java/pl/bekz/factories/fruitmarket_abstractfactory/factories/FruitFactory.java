package pl.bekz.factories.fruitmarket_abstractfactory.factories;

import pl.bekz.factories.fruitmarket_abstractfactory.fruits.*;

public interface FruitFactory {

    Apple createApple();
    Orange createOrange();
    Banana createBanana();
    Grapes createGrapes();
    Watermelon createWatermelon();
}
