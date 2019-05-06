package pl.bekz.factories.fruitmarket_simplefactory;

public class ItalyFruitMarket {

    private static FruitMarket bolognaMarket(){
        SimpleFactoryFruit factoryFruit = new SimpleFactoryFruit();
        return new FruitMarket(factoryFruit);
    }

    public static void main(String[] args) {
        Fruit fruit = bolognaMarket().orderFruit(FruitTypes.ORANGE);
        System.out.println("We ordered a " + fruit.getName());

        fruit = bolognaMarket().orderFruit(FruitTypes.WATERMELON);
        System.out.println("We ordered a " + fruit.getName());
    }
}
