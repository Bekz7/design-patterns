package pl.bekz.factories.fruitmarket_simplefactory;

public class SimpleFactoryFruit {

    Fruit pickFruit(String type){
        Fruit fruit = null;

        if ("apple".equals(type)){
            fruit = new Apple();
        }else if ("banana".equals(type)){
            fruit = new Banana();
        }else if ("orange".equals(type)){
            fruit = new Orange();
        } else if ("grapes".equals(type)){
            fruit = new Grapes();
        }else if ("watermelon".equals(type)){
            fruit = new Watermelon();
        }
        return fruit;
    }
}
