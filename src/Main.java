import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Interval> intervals = CreateIntervals.getUserInput();

        for (int i = 0; i < intervals.size(); i++) {
            System.out.println(intervals.get(i).toString());
        }
    }
}
