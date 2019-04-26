package pl.bekz.factories.fruitmarket_simplefactory;

public class FruitMarket {

    private SimpleFactoryFruit factoryFruit;

    public FruitMarket(SimpleFactoryFruit factoryFruit) {
        this.factoryFruit = factoryFruit;
    }

    Fruit orderFruit(String type){
        Fruit fruit;

        fruit = factoryFruit.pickFruit(type);

        fruit.prepare();
        fruit.box();

        return fruit;
    }

}
