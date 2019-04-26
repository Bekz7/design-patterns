package pl.bekz.factories.fruitmarket_simplefactory;

public abstract class Fruit {

    String name;
    String type;

    public String getName() {
        return name;
    }

    void prepare() {
        System.out.println("We're polishing " + getName());
    }

    void box() {
        System.out.println("We're packing in cardboard bag " + getName());
    }

    @Override
    public String toString() {
        StringBuilder display = new StringBuilder();
        display.append("---- ").append(name).append(" ----\n");
        display.append(type).append("\n");

        return display.toString();
    }
}
