import java.util.ArrayList;

public class HeapSort {

    public static void maxEndSort(ArrayList<Interval> A) {
        int heapSize = A.size();

        buildMaxEndHeap(A, heapSize);

        for (int i = heapSize - 1; i > -1; i--) {
            Interval temp = A.get(0);
            A.set(0, A.get(i));
            A.set(i, temp);
            maxEndHeapify(A, 0, i);
        }
    }

    public static void maxStartSort(ArrayList<Interval> A) {
        int heapSize = A.size();

        buildMaxStartHeap(A, heapSize);

        for (int i = heapSize - 1; i > -1; i--) {
            Interval temp = A.get(0);
            A.set(0, A.get(i));
            A.set(i, temp);
            maxStartHeapify(A, 0, i);
        }
    }

    public static void maxEndHeapify(ArrayList<Interval> A, int i, int heapSize) {
        int largest = i;
        int left = (2 * i) + 1;
        int right = (2 * i) + 2;

        if (left < heapSize && A.get(left).getEndTime() > A.get(largest).getEndTime()) {
            largest = left;
        }
        if (right < heapSize && A.get(right).getEndTime() > A.get(largest).getEndTime()) {
            largest = right;
        }
        if (largest != i) {
            Interval temp = A.get(i);
            A.set(i, A.get(largest));
            A.set(largest, temp);
            maxEndHeapify(A, largest, heapSize);
        }
    }

    public static void maxStartHeapify(ArrayList<Interval> A, int i, int heapSize) {
        int largest = i;
        int left = (2 * i) + 1;
        int right = (2 * i) + 2;

        if (left < heapSize && A.get(left).getStartTime() > A.get(largest).getStartTime()) {
            largest = left;
        }
        if (right < heapSize && A.get(right).getStartTime() > A.get(largest).getStartTime()) {
            largest = right;
        }
        if (largest != i) {
            Interval temp = A.get(i);
            A.set(i, A.get(largest));
            A.set(largest, temp);
            maxStartHeapify(A, largest, heapSize);
        }
    }

    public static void buildMaxEndHeap(ArrayList<Interval> A, int heapSize) {
        for (int i = (heapSize / 2) - 1; i > -1; i--) {
            maxEndHeapify(A, i, heapSize);
        }
    }

    public static void buildMaxStartHeap(ArrayList<Interval> A, int heapSize) {
        for (int i = (heapSize / 2) - 1; i >= 0; i--) {
            maxStartHeapify(A, i, heapSize);
        }
    }
}