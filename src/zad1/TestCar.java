package zad1;

public class TestCar {

    public static void main(String[] args) {

        Car car = new Car("Audi", 200, 220);
        CarController carCon = new CarController();
        carCon.turbo(car);

        carCon.decreaseSpeed(car, 25);
        System.out.println(car.name + " " + car.power + " " + car.speed);

        carCon.increaseSpeed(car, 50);
        System.out.println(car.name + " " + car.power + " " + car.speed);


    }
}
