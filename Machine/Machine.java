package Machines;

public abstract class Machine {
    private String make;
    private Integer weight;
    private String countryOfProduction;

    public Machine(String make, Integer weight, String countryOfProduction) {
        this.make = make;
        this.weight = weight;
        this.countryOfProduction = countryOfProduction;
    }

    protected abstract void printInfo();

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getCountryOfProduction() {
        return countryOfProduction;
    }

    public void setCountryOfProduction(String countryOfProduction) {
        this.countryOfProduction = countryOfProduction;
    }
}
