package pl.bekz.decorator

import pl.bekz.decorator.decorators.ChocolateGlaze
import pl.bekz.decorator.decorators.Nuts
import spock.lang.Specification

class IceCreamTest extends Specification {

    def "Operator should make vanilla iceCream with nuts and chocolate glaze"(){

        given:"Operator invokes ice machine"
            IceCream iceCream = new VanillaIceCream()

        when:"Operator adds additives to the ice cream"
            iceCream = new Nuts(iceCream)
            iceCream = new ChocolateGlaze(iceCream)

        then:"The order is ready"
            ("Vanilla ice cream with walnut sprinkles with chocolate glaze 11.4 dol").equals(iceCream.toString())
    }
}
