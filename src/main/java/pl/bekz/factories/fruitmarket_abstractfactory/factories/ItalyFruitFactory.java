package pl.bekz.factories.fruitmarket_abstractfactory.factories;

import pl.bekz.factories.fruitmarket_abstractfactory.fruits.*;

public class ItalyFruitFactory implements FruitFactory {

    @Override
    public Apple createApple() {
        return new MildlySweetApple();
    }

    @Override
    public Orange createOrange() {
        return new NavelOrange();
    }

    @Override
    public Banana createBanana() {
        return new PlantainsBanana();
    }

    @Override
    public Grapes createGrapes() {
        return new CarmenereGrapes();
    }

    @Override
    public Watermelon createWatermelon() {
        return new TendergoldWatermelon();
    }


}
