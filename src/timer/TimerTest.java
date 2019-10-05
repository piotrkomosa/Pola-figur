package timer;



class TimerTest {
    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.step();
        timer.step();
        timer.step();
        timer.addMinutes(2);
        timer.addHours(1);
        timer.step();
        timer.step();

        System.out.println(timer.getSeconds());
        System.out.println("Zmierzony czas: " + timer.getTime());
    }
}

