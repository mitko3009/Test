package Machines;

public class CoffeeMachine extends Machine{
    private Double coffeeQuantity;

    public CoffeeMachine(String make, Integer weight, String countryOfProduction, Double coffeeQuantity) {
        super(make, weight, countryOfProduction);
        this.setCoffeeQuantity(coffeeQuantity);
    }

    public Double getCoffeeQuantity() {
        return coffeeQuantity;
    }

    public void setCoffeeQuantity(Double coffeeQuantity) {
        this.coffeeQuantity = coffeeQuantity;
    }

    @Override
    protected void printInfo() {
        StringBuilder builder = new StringBuilder();
        builder.append(String.format("Make: %s",super.getMake())).append(System.lineSeparator()).
                append(String.format("Weight: %d",super.getWeight())).append(System.lineSeparator()).
                append(String.format("Country of production: %s",super.getCountryOfProduction())).append(System.lineSeparator()).
                append(String.format("Coffee quantity: %.2f",this.coffeeQuantity));

        System.out.println(builder.toString().trim());
    }

    public void getCoffee(){
        this.coffeeQuantity -= 1;
    }

    public void loadCoffee(Integer quantity){
        if (quantity >= 0){
            this.coffeeQuantity += quantity;
        }else{
            throw new IllegalArgumentException("Invalid quantity");
        }
    }
}
