package Math_figures;

public class Rectangle {

    int side_a;
    int side_b;
    int perimtert ;

    Rectangle(int a, int b) {
        side_a = a;
        side_b = b;
    }
    double rectPerimeter() {
        return perimtert = (side_a + side_b)*2;
    }
}