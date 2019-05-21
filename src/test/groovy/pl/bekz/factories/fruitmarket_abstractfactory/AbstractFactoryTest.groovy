package pl.bekz.factories.fruitmarket_abstractfactory

import pl.bekz.factories.fruitmarket_abstractfactory.factories.FactoryProvider
import pl.bekz.factories.fruitmarket_abstractfactory.factories.FactoryTypes
import pl.bekz.factories.fruitmarket_abstractfactory.factories.FruitFactory
import spock.lang.Specification

class AbstractFactoryTest extends Specification {
    
    def "Should pick every kind fruit from factories by every market"(){
        given: "Fruits market providing"
            FruitMarket market = new FruitMarket()
            
            FruitFactory italyFactory = FactoryProvider.getFactory(FactoryTypes.ITALY_MARKET_FACTORY)
            FruitFactory spainFactory = FactoryProvider.getFactory(FactoryTypes.SPAIN_MARKET_FACTORY)
        
        when: "Every type of fruit in every markets was ordered"
            final italyApple = market.orderFruit italyFactory.createApple()
            final italyBanana = market.orderFruit italyFactory.createBanana()
            final italyGrapes = market.orderFruit italyFactory.createGrapes()
            final italyOrange = market.orderFruit italyFactory.createOrange()
            final italyWatermelon = market.orderFruit italyFactory.createWatermelon()

            final spainApple = market.orderFruit spainFactory.createApple()
            final spainBanana = market.orderFruit spainFactory.createBanana()
            final spainGrapes = market.orderFruit spainFactory.createGrapes()
            final spainOrange = market.orderFruit spainFactory.createOrange()
            final spainWatermelon = market.orderFruit spainFactory.createWatermelon()

        then: "Every fruit should be ordered properly"
            "Apple".contains(italyApple)
            "Banana".contains(italyBanana)
            "Grapes".contains(italyGrapes)
            "Orange".contains(italyOrange)
            "Watermelon".contains(italyWatermelon)

            "Apple".contains(spainApple)
            "Banana".contains(spainBanana)
            "Grapes".contains(spainGrapes)
            "Orange".contains(spainOrange)
            "Watermelon".contains(spainWatermelon)
    }
}
