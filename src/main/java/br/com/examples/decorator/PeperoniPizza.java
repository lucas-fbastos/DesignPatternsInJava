package br.com.examples.decorator;

public class PeperoniPizza implements Pizza {

    @Override
    public Double value() {
        return 8.50;
    }

    @Override
    public String type() {
        return "peperoni";
    }
}
