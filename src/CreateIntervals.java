import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class CreateIntervals {
    public static ArrayList<Interval> getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the number of intervals: ");
        int numOfIntervals = scanner.nextInt();
        System.out.println();

        while (numOfIntervals <= 0) {
            System.out.println("Invalid number of intervals.");
            System.out.print("Please enter the number of intervals: ");
            numOfIntervals = scanner.nextInt();
        }

        System.out.print("Please enter the start time of intervals: ");
        int startOfIntervals = scanner.nextInt();
        System.out.println();

        while (startOfIntervals <= 0) {
            System.out.println("Invalid start time of intervals.");
            System.out.print("Please enter the start time of intervals: ");
            startOfIntervals = scanner.nextInt();
        }

        System.out.print("Please enter the end time of intervals: ");
        int endOfIntervals = scanner.nextInt();
        System.out.println();

        while (endOfIntervals <= 0 || endOfIntervals == startOfIntervals) {
            System.out.println("Invalid end time of intervals.");
            System.out.print("Please enter the end time of intervals: ");
            endOfIntervals = scanner.nextInt();
        }

        ArrayList<Interval> intervalsList = createIntervals(numOfIntervals, startOfIntervals, endOfIntervals);
        return intervalsList;
    }

    public static ArrayList<Interval> createIntervals(int numOfIntervals, int start, int end) {
        ArrayList<Interval> intervalsList = new ArrayList<>(numOfIntervals);
        int index = 0;

        while (index < numOfIntervals) {
            Random rand = new Random();
            int intervalStart = rand.nextInt((end - start) + 1) + start;
            int min = intervalStart + 1;
            int intervalEnd = rand.nextInt((end - min) + 1) + intervalStart - min;

            Interval newInterval = new Interval(index, intervalStart, intervalEnd);
            intervalsList.add(newInterval);

            index++;
        }
        return intervalsList;
    }
}