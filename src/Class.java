import java.util.ArrayList;

public class Class {
    private int id;
    private ArrayList<Interval> intervals;

    public Class(int id) {
        this.id = id;
        this.intervals = new ArrayList<>();
    }

    public void addInterval(Interval interval) {
         this.intervals.add(interval);
    }

    public int getId() {
        return id;
    }

    public ArrayList<Interval> getIntervals() {
        return intervals;
    }
}
