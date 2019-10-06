package Math_figures;

public class Square {
    public static void main(String[] args) {

    }
        int side_a;
        int side_b;
        int area;

    Square(int a, int b) {
        side_a = a;
        side_b = b;
    }
    void squareArea() {
        area = side_a * side_b;


        Square square1 = new Square(10, 10);
        double squareArea = square1.squareArea();
        System.out.println(squareArea);

    }
}
