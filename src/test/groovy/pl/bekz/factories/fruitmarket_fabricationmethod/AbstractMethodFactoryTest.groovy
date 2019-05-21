package pl.bekz.factories.fruitmarket_fabricationmethod

import pl.bekz.factories.fruitmarket_fabricationmethod.italy.ItalyFruitMarket
import pl.bekz.factories.fruitmarket_fabricationmethod.spain.SpainFruitMarket
import spock.lang.Specification

class AbstractMethodFactoryTest extends Specification {

    def "Should ordered every type fruit from every type market"() {
        given: "Market with was setup"
            FruitMarket italyMarket = new ItalyFruitMarket()
            FruitMarket spainMarket = new SpainFruitMarket()

        when: "Fruits was ordered"
            Fruit spainBanana = spainMarket.orderFruit(FruitTypes.BANANA)
            Fruit spainGrapes = spainMarket.orderFruit(FruitTypes.GRAPES)
            Fruit spainApple = spainMarket.orderFruit(FruitTypes.APPLE)
            Fruit spainWatermelon = spainMarket.orderFruit(FruitTypes.WATERMELON)
            Fruit spainOrange = spainMarket.orderFruit(FruitTypes.ORANGE)

            Fruit italyBanana = italyMarket.orderFruit(FruitTypes.BANANA)
            Fruit italyGrapes = italyMarket.orderFruit(FruitTypes.GRAPES)
            Fruit italyApple = italyMarket.orderFruit(FruitTypes.APPLE)
            Fruit italyWatermelon = italyMarket.orderFruit(FruitTypes.WATERMELON)
            Fruit italyOrange = italyMarket.orderFruit(FruitTypes.ORANGE)

        then: "Every fruit should be ordered"
            "Ordering a Banana from Spain".equals(spainBanana)
            "Ordering a Grapes from Spain".equals(spainGrapes)
            "Ordering a Apple from Spain".equals(spainApple)
            "Ordering a Watermelon from Spain".equals(spainWatermelon)
            "Ordering a Orange from Spain".equals(spainOrange)

            "Ordering a Banana from Italy".equals(italyBanana)
            "Ordering a Grapes from Italy".equals(italyGrapes)
            "Ordering a Apple from Italy".equals(italyApple)
            "Ordering a Watermelon from Italy".equals(italyWatermelon)
            "Ordering a Orange from Italy".equals(italyOrange)
    }
}
