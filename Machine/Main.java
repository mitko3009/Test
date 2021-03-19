package Machines;

public class Main {
    public static void main(String[] args) {

        CoffeeMachine coffeeMachine = new CoffeeMachine("Kimbo", 200,"Germany", 13.);

        coffeeMachine.printInfo();

        coffeeMachine.getCoffee();

        System.out.println();

        coffeeMachine.printInfo();

        coffeeMachine.loadCoffee(18);

        System.out.println();

        coffeeMachine.printInfo();
    }
}
