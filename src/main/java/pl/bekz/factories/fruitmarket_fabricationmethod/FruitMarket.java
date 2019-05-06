package pl.bekz.factories.fruitmarket_fabricationmethod;

public abstract class FruitMarket {

    protected abstract Fruit pickFruit(FruitTypes fruit);

    Fruit orderFruit(FruitTypes type){
        Fruit fruit = pickFruit(type);

        System.out.println("\n---- Ordering a " + fruit.getName() + " ----");

        fruit.prepare();
        fruit.box();

        return fruit;
    }
}
