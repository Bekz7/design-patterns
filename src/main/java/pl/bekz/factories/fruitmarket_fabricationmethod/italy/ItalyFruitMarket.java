package pl.bekz.factories.fruitmarket_fabricationmethod.italy;

import pl.bekz.factories.fruitmarket_fabricationmethod.Fruit;
import pl.bekz.factories.fruitmarket_fabricationmethod.FruitMarket;
import pl.bekz.factories.fruitmarket_fabricationmethod.FruitTypes;
import pl.bekz.factories.fruitmarket_fabricationmethod.NoSuchFruit;

public class ItalyFruitMarket extends FruitMarket {

    @Override
    protected Fruit pickFruit(FruitTypes fruit) {
        switch (fruit) {
            case APPLE:
                return new ItalyApple();
            case BANANA:
                return new ItalyBanana();
            case GRAPES:
                return new ItalyGrapes();
            case ORANGE:
                return new ItalyOrange();
            case WATERMELON:
                return new ItalyWatermelon();
            default:
                throw new NoSuchFruit("We don't have this fruit in our Italy Market");
        }
    }
}
