package zad3;

public class TestRadio {

    public static void main(String[] args) {

        Radio radio = new Radio(500, 350, "FM");

        radio.increaseLoud(50);
        System.out.println(radio.loud);

        radio.decreaseLoud(75);
        System.out.println(radio.loud);

        radio.decreaseFreq();
        System.out.println(radio.freq);

        radio.increaseFreq();
        System.out.println(radio.freq);

        radio.moduationAM();
        System.out.println(radio.moduation);

        radio.moduationFM();
        System.out.println(radio.moduation);


    }
}
