package Math_figures;

public class Triangle {

    int side_a;
    int side_b;
    int side_c;
    int perimeter;

    Triangle(int a, int b, int c) {
        side_a = a;
        side_b = b;
        side_c = c;
    }
    double rectPerimeter() {
        return perimeter = side_a + side_b + side_c;
    }
}