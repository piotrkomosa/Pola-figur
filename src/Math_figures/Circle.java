package Math_figures;

public class Circle {

    int radius_r;
    double area;

    Circle(int r) {
        radius_r = r;
    }
    double circleArea() {
        return area = radius_r * radius_r * Math.PI;
    }
}

