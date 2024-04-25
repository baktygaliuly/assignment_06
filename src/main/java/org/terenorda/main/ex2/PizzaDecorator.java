package org.terenorda.main.ex2;

abstract class PizzaDecorator extends Pizza {
    protected Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza; // Reference to the base Pizza object
    }

    public abstract double getPrice();
}

