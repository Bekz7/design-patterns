package pl.bekz.factories.fruitmarket_simplefactory;

public class SpainApple extends Fruit {

    public SpainApple() {
        this.name = "Spain Apple";
    }

    @Override
    void prepare() {
        System.out.println("We're leaving apple as it was on the tree");
    }

    @Override
    void box() {
        System.out.println("We're packing in plastic grocery bags");
    }
}
