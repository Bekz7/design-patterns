package pl.bekz.factories.fruitmarket_simplefactory;

public class SimpleFactoryFruit {

    Fruit pickFruit(FruitTypes type) {
        Fruit fruit;

        switch (type) {
            case APPLE:
                fruit = new Apple();
            case BANANA:
                fruit = new Banana();
            case GRAPES:
                fruit = new Grapes();
            case ORANGE:
                fruit = new Orange();
            case WATERMELON:
                fruit = new Watermelon();
            default:
                throw new NoSuchFruit("We don't have selected fruit");
        }
    }
}
