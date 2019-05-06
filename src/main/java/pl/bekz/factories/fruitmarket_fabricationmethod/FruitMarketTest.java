package pl.bekz.factories.fruitmarket_fabricationmethod;

import pl.bekz.factories.fruitmarket_fabricationmethod.italy.ItalyFruitMarket;
import pl.bekz.factories.fruitmarket_fabricationmethod.spain.SpainFruitMarket;

public class FruitMarketTest {

    public static void main(String[] args) {

        FruitMarket spainMarket = new SpainFruitMarket();
        FruitMarket italyMarket = new ItalyFruitMarket();

        Fruit fruit = spainMarket.orderFruit(FruitTypes.ORANGE);

        fruit = italyMarket.orderFruit(FruitTypes.GRAPES);
    }
}
