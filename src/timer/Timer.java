package timer;
class Timer {
    long seconds;

    void addSeconds(int seconds) {
        this.seconds += seconds;
    }

    void addMinutes(int minutes) {
        this.seconds += (minutes * 60);
    }

    void addHours(int hours) {
        this.seconds += (hours * 60 * 60);
    }

    void step() {
        seconds++;
    }

    long getSeconds() {
        return seconds;
    }

    String getTime() {
        long hours = seconds / 3600;
        long secondsRemaining = seconds % 3600;
        long minutes = secondsRemaining / 60;
        secondsRemaining = secondsRemaining % 60;
        return hours+":"+minutes+":"+secondsRemaining;
    }
}
