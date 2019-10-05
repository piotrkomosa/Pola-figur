package Math_figures;

public class ShapeCalculator {

    public static void main(String[] args) {
        Square square1 = new Square(10, 10);
        square1.squareArea();
        System.out.println("Powierzchnia kwadratu wynosi " + square1.area + " cm2.");
        Rectangle rectangle1 = new Rectangle(25, 50);
        rectangle1.rectPerimeter();
        System.out.println("Obwód prostokąta wynosi " + rectangle1.perimtert +" cm.");
        Triangle triangle1 = new Triangle(30, 40, 50);
        triangle1.rectPerimeter();
        System.out.println("Obwód prostokąta wynosi " + triangle1.perimeter+ " cm.");
        Circle circle1 = new Circle(10);
        circle1.circleArea();
        System.out.printf("Powierzchnia koła wynosi %.1f cm2." , circle1.area );
    }
}











