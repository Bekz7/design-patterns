package pl.bekz.factories.fruitmarket_fabricationmethod.spain;

import pl.bekz.factories.fruitmarket_fabricationmethod.Fruit;
import pl.bekz.factories.fruitmarket_fabricationmethod.FruitMarket;
import pl.bekz.factories.fruitmarket_fabricationmethod.FruitTypes;
import pl.bekz.factories.fruitmarket_fabricationmethod.NoSuchFruit;

public class SpainFruitMarket extends FruitMarket {


    @Override
    protected Fruit pickFruit(FruitTypes fruit) {

        switch (fruit) {
            case APPLE:
                return new SpainApple();
            case BANANA:
                return new SpainBanana();
            case ORANGE:
                return new SpainOrange();
            case GRAPES:
                return new SpainGrapes();
            case WATERMELON:
                return new SpainWatermelon();
            default:
                throw new NoSuchFruit("We don't have this fruit in our Spain Market");
        }
    }
}
