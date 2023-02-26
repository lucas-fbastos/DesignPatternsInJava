package br.com.examples.decorator;

public class DecoratorTest {

    public static void main(String... args){
        Pizza peperoni = new PeperoniPizza();
        Pizza especialDough = new PizzaDough(peperoni);

        System.out.println("The " + peperoni.type()+" pizza value is: "+ peperoni.value());

        System.out.println("The add of "+ especialDough.type() + " dough value is: "+ especialDough.value());
    }
}
