package pl.bekz.factories.fruitmarket_abstractfactory.factories;

import pl.bekz.factories.fruitmarket_abstractfactory.exception.NoSuchFactory;

public class FactoryProvider {

    public static FruitFactory getFactory(FactoryTypes factoryTypes){
        if (FactoryTypes.ITALY_MARKET_FACTORY == factoryTypes){
            return new ItalyFruitFactory();
        } else if (FactoryTypes.SPAIN_MARKET_FACTORY == factoryTypes){
            return new SpainFruitFactory();
        } else {
            throw new NoSuchFactory("We dont have that kind factory");
        }
    }
}
