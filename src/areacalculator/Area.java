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
}
