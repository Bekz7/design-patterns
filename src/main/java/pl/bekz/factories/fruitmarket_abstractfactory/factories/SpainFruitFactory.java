package pl.bekz.factories.fruitmarket_abstractfactory.factories;

import pl.bekz.factories.fruitmarket_abstractfactory.fruits.*;

public class SpainFruitFactory implements FruitFactory {

    @Override
    public Apple createApple() {
        return new SuperSweetApple();
    }

    @Override
    public Orange createOrange() {
        return new BloodOrange();
    }

    @Override
    public Banana createBanana() {
        return new RedBanana();
    }

    @Override
    public Grapes createGrapes() {
        return new ChardonnayGrapes();
    }

    @Override
    public Watermelon createWatermelon() {
        return new JubileeWatermelon();
    }
}
