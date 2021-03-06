package Figures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(2.3, 4.5);
        Rectangle rectangle2 = new Rectangle(5.3, 4.5);
        Rectangle rectangle3 = new Rectangle(2.3, 8.5);
        Rectangle rectangle4 = new Rectangle(8.3, 9.8);
        Rectangle rectangle5 = new Rectangle(1.5, 6.7);

        List<Rectangle> rectangles = new ArrayList<>();

        rectangles.add(rectangle1);
        rectangles.add(rectangle2);
        rectangles.add(rectangle3);
        rectangles.add(rectangle4);
        rectangles.add(rectangle5);

        System.out.println();

        Collections.sort(rectangles);

        System.out.println();
    }
}
