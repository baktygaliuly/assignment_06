package org.terenorda.main.ex2;

public class TestDecorator {
    public static void main(String[] args) {
        Pizza pizza = new Pizza();
        Pizza pizzaWithPepperoni = new PepperoniTopping(pizza);
        Pizza pizzaWithBothToppings = new MushroomTopping(pizzaWithPepperoni);

        System.out.println("Price of base pizza: " + pizza.getPrice());
        System.out.println("Price of pizza with pepperoni: " + pizzaWithPepperoni.getPrice());
        System.out.println("Price of pizza with both toppings: " + pizzaWithBothToppings.getPrice());
    }
}
