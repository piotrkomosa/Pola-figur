package Math_figures;

public class Square {

    int side_a;
    int side_b;
    int area;

    Square(int a, int b) {
        side_a = a;
        side_b = b;
    }
    double squareArea() {
        return area = side_a * side_b;
    }
}