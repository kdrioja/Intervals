import java.util.ArrayList;

public class Scheduling {
    public static Class intervalScheduling(ArrayList<Interval> A) {
        HeapSort.maxEndSort(A);
        Class classroom = new Class(0);
        classroom.addInterval(A.get(0));

        for (int i = 1; i < A.size(); i++) {
            if (A.get(i).getStartTime() >= classroom.getLastEndTime()) {
                classroom.addInterval(A.get(i));
            }
        }

        return classroom;
    }

    public static ArrayList<Class> intervalPartitioning(ArrayList<Interval> A) {
        ArrayList<Class> classrooms = new ArrayList();
        HeapSort.maxStartSort(A);

        



        return classrooms;
    }
}
