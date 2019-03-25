import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        /**
        ArrayList<Interval> intervals = CreateIntervals.getUserInput();

        System.out.println("==========Interval Intervals==========");
        for (int i = 0; i < intervals.size(); i++) {
            System.out.println(intervals.get(i).toString());
        }

        System.out.println("==========Interval Scheduling==========");


        System.out.println("==========Interval Partitioning==========");

        */
        int[] a = {9, 8, 4, 5, 3, 1, 7, 6, 2, 0, 11, 22};
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        HeapSort.maxSort(a);
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        HeapSort.minSort(a);
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

    }
}