package pl.bekz.factories.fruitmarket_simplefactory;

public class FruitMarket {

    private SimpleFactoryFruit factoryFruit;

    public FruitMarket(SimpleFactoryFruit factoryFruit) {
        this.factoryFruit = factoryFruit;
    }

    Fruit orderFruit(FruitTypes type){
        Fruit fruit;

        fruit = factoryFruit.pickFruit(type);
        System.out.println("---- Ordering a " + fruit.getName() + " ----");

        fruit.prepare();
        fruit.box();

        return fruit;
    }

}
