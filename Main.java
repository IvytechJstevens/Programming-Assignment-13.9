public class Main {
    public static void main(String[] args) {
        // Creating Circle objects
        Circle circle1 = new Circle(5.0);
        Circle circle2 = new Circle(3.5);
        Circle circle3 = new Circle(5.0);

        // Testing methods
        System.out.println("Circle 1 Area: " + circle1.getArea());
        System.out.println("Circle 2 Perimeter: " + circle2.getPerimeter());
        System.out.println("Circle 3 Radius: " + circle3.getRadius());
        System.out.println("Circle 1 is filled? " + circle1.isFilled());
        System.out.println("Circle 2 color: " + circle2.getColor());

        // Comparing Circles
        if (circle1.compareTo(circle2) > 0)
            System.out.println("Circle 1 is larger than Circle 2");
        else if (circle1.compareTo(circle2) < 0)
            System.out.println("Circle 1 is smaller than Circle 2");
        else
            System.out.println("Circle 1 is equal to Circle 2");

        // Testing equals method
        System.out.println("Circle 1 equals Circle 3? " + circle1.equals(circle3));
    }
}
