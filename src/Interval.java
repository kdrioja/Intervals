public class Interval {
    private int number;
    private int startTime;
    private int endTime;

    public Interval(int number, int startTime, int endTime) {
        this.number = number;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public String toString() {
        return "[" + this.number + ", [" + this.startTime + ", " + this.endTime + "]]";
    }

    public int getNumber() {
        return number;
    }

    public int getStartTime() {
        return startTime;
    }

    public int getEndTime() {
        return endTime;
    }
}
