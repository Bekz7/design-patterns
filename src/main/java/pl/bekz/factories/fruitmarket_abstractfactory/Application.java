package pl.bekz.factories.fruitmarket_abstractfactory;

import pl.bekz.factories.fruitmarket_abstractfactory.factories.FactoryProvider;
import pl.bekz.factories.fruitmarket_abstractfactory.factories.FactoryTypes;
import pl.bekz.factories.fruitmarket_abstractfactory.factories.FruitFactory;
import pl.bekz.factories.fruitmarket_abstractfactory.fruits.FruitTypes;

public class Application {

    public static void main(String[] args) {
        FruitMarket market = new FruitMarket();
        FruitFactory italyFactory = FactoryProvider.getFactory(FactoryTypes.ITALY_MARKET_FACTORY);
        FruitFactory spainFactory = FactoryProvider.getFactory(FactoryTypes.SPAIN_MARKET_FACTORY);

        market.pickFruit(FruitTypes.BANANA, italyFactory);
    }
}
