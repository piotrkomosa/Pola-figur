package zad3;

public class Radio {

    int loud;
    int freq;
    String moduation;


    public Radio(int l, int f, String m) {

        loud = l;
        freq = f;
        moduation = m;

    }

    public void increaseLoud(int loud1) {
        loud += loud1;
    }

    public void decreaseLoud(int loud1) {
        loud -= loud1;
    }

    public void increaseFreq() {
        freq += 1;
    }

    public void decreaseFreq() {
        freq -= 1;
    }

    public void moduationAM() {
        moduation = "AM";
    }

    public void moduationFM() {
        moduation = "FM";
    }


}