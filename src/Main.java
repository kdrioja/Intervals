import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Interval> intervals = CreateIntervals.getUserInput();

        System.out.println("==========Interval Intervals==========");
        for (int i = 0; i < intervals.size(); i++) {
            System.out.println(intervals.get(i).toString());
        }

        System.out.println("==========Interval Scheduling==========");
        Class classroom = Scheduling.intervalScheduling(intervals);
        System.out.println(classroom);


        System.out.println("==========Interval Partitioning==========");
        HeapSort.maxStartSort(intervals);
        for (int i = 0; i < intervals.size(); i++) {
            System.out.println(intervals.get(i).toString());
        }

        ArrayList<Class> classrooms = Scheduling.intervalPartitioning(intervals);
        for (int i = 0; i < classrooms.size(); i++) {
            System.out.println(classrooms.get(i));
        }
    }
}