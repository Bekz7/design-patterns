package pl.bekz.factories.fruitmarket_abstractfactory.exception;

public class NoSuchFactory extends RuntimeException {

    public NoSuchFactory(String message) {
        super(message);
    }
}
