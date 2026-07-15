package areacalculator;

public class AreaDemo {

    public static void main(String[] args) {

        Area area = new Area();

        System.out.println("Area of Circle: " + area.circle().calculate(7));
        System.out.println("Area of Rectangle: " + area.rectangle().calculate(10, 5));
        System.out.println("Area of Triangle: " + area.triangle().calculate(8, 6));
    }
}