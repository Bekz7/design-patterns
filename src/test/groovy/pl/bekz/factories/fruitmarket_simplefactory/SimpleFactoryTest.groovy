package pl.bekz.factories.fruitmarket_simplefactory

import spock.lang.Specification

class SimpleFactoryTest extends Specification {

    def "Should order every type of fruit"(){
        given: "Fruit Market"

        when: "Fruit is ordered"
            Fruit orange = bolognaMarket().orderFruit(FruitTypes.ORANGE)
            Fruit banana = bolognaMarket().orderFruit(FruitTypes.BANANA)
            Fruit watermelon = bolognaMarket().orderFruit(FruitTypes.WATERMELON)
            Fruit apple = bolognaMarket().orderFruit(FruitTypes.APPLE)
            Fruit grapes = bolognaMarket().orderFruit(FruitTypes.GRAPES)

        then:"Should pick up right fruit"
        "Orange" == orange.getName()
        "Banana" == banana.getName()
        "Watermelon" == watermelon.getName()
        "Apple" == apple.getName()
        "Grapes" == grapes.getName()
    }

    private static FruitMarket bolognaMarket(){
        SimpleFactoryFruit fruitFactory = new SimpleFactoryFruit()
        return new FruitMarket(fruitFactory)
    }
}
