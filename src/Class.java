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

    public int getLastEndTime() {
        return intervals.get(intervals.size() - 1).getEndTime();
    }

    public int getId() {
        return id;
    }

    public ArrayList<Interval> getIntervals() {
        return intervals;
    }

    public String toString() {
        StringBuilder string = new StringBuilder("Class[id=" + this.id + ", intervals=[");

        for (int i = 0; i < this.intervals.size() - 1; i++) {
            string.append(this.intervals.get(i).toString() + ",  ");
        }

        string.append(this.intervals.get(intervals.size() - 1) +  "]");

        return string.toString();
    }
}
