package areacalculator;

import areacalculator.interfaces.CircleArea;
import areacalculator.interfaces.RectangleArea;
import areacalculator.interfaces.TriangleArea;

public class Area {
    public CircleArea circle() {
        return radius -> Math.PI * radius * radius;
    }

    public RectangleArea rectangle() {
        return (length, width) -> length * width;
    }

    public TriangleArea triangle() {
        return (base, height) -> 0.5 * base * height;
    }

    public static void implementation() {
        Area area = new Area();

        System.out.println("Area of Circle: " + area.circle().calculate(7));
        System.out.println("Area of Rectangle: " + area.rectangle().calculate(10, 5));
        System.out.println("Area of Triangle: " + area.triangle().calculate(8, 6));
    }
}
