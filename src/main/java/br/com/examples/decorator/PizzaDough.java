package br.com.examples.decorator;

public class PizzaDough implements Pizza{

    private final Pizza pizza;

    PizzaDough(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public Double value() {
        return this.pizza.value()+1.50;
    }

    @Override
    public String type() {
        return "flat bread";
    }
}
