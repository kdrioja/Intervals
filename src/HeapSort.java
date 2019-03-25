import java.sql.Array;

public class HeapSort {
    /**
     * O(log n)
     * Sorts an array in place
     * @param A
     */
    public static void heapsort(int[] A) {
        buildMaxHeap(A);
        for (int i = A.length; i > 1; i--) {
            
        }
    }

    /**
     * O(log n)
     * Key to maintaining the max-heap property
     */
    //parent floor of i/2
    //left 2i
    //right 2i + 1
    //but these start from 0 so
    //left 2i + 1
    //right 2i + 2
    public static void maxHeapify(int[] A, int i) {
        //these are all indexes
        int largest = i;
        int left = (2*i) + 1;
        int right = (2*i) + 2;

        if (left < A.length && A[left] > A[i]) {
            largest = left;
        }
        if (right < A.length && A[right] > A[i]) {
            largest = right;
        }
        if (largest != i) {
            //exchange A[i] with A[largest]
            int temp = A[i];
            A[i] = A[largest];
            A[largest] = temp;
            maxHeapify(A, largest);
        }
    }

    public static void buildMaxHeap(int[] A) {
        for (int i = A.length/2; i > -1; i--) {
            maxHeapify(A, i);
        }
    }

}
