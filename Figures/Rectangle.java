package Figures;

public class Rectangle implements Comparable{
    private double weight;
    private double height;

    public Rectangle(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }



    @Override
    public int compareTo(Object o) {
        Rectangle otherRectangle = (Rectangle) o;

        if(this.height * this.weight < otherRectangle.height * otherRectangle.weight){
            return -1;
        } else if(this.height * this.weight > otherRectangle.height * otherRectangle.weight){
            return 1;
        }

        return 0;
    }
}
