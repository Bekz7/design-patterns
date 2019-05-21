package pl.bekz.factories.fruitmarket_simplefactory;

public class SimpleFactoryFruit {

    Fruit pickFruit(FruitTypes type) {
        Fruit fruit;

        switch (type) {
            case APPLE:
                return fruit = new Apple();
            case BANANA:
                return fruit = new Banana();
            case GRAPES:
                return fruit = new Grapes();
            case ORANGE:
                return fruit = new Orange();
            case WATERMELON:
                return fruit = new Watermelon();
            default:
                throw new NoSuchFruit("We don't have selected fruit");
        }
    }
}
