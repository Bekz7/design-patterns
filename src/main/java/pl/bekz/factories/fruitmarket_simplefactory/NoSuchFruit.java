package pl.bekz.factories.fruitmarket_simplefactory;

public class NoSuchFruit extends RuntimeException {

    public NoSuchFruit(String message) {
        super(message);
    }
}
