package zad1;

public class CarController {




    public void turbo(Car car) {
        car.power *= 1.1;
    }

    public void increaseSpeed(Car car, int speed1) {
        car.speed += speed1;
    }

    public void decreaseSpeed(Car car, int speed1) {
        car.speed -= speed1;
    }


    }
