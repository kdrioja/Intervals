public class HeapSort {

    public static void maxSort(int A[]) {
        int heapSize = A.length;

        buildMaxHeap(A, heapSize);

        for (int i = heapSize - 1; i > -1; i--) {
            int temp = A[0];
            A[0] = A[i];
            A[i] = temp;
            maxHeapify(A, 0, i);
        }
    }

    public static void minSort(int A[]) {
        int heapSize = A.length;

        buildMinHeap(A, heapSize);

        for (int i = heapSize - 1; i > -1; i--) {
            int temp = A[0];
            A[0] = A[i];
            A[i] = temp;
            minHeapify(A, 0, i);
        }
    }

    public static void maxHeapify(int A[], int i, int heapSize) {
        //these are all indexes
        int largest = i;
        int left = (2 * i) + 1;
        int right = (2 * i) + 2;

        if (left < heapSize && A[left] > A[largest]) {
            largest = left;
        }
        if (right < heapSize && A[right] > A[largest]) {
            largest = right;
        }
        if (largest != i) {
            //exchange A[i] with A[largest]
            int temp = A[i];
            A[i] = A[largest];
            A[largest] = temp;
            maxHeapify(A, largest, heapSize);
        }
    }

    public static void minHeapify(int A[], int i, int heapSize) {
        int smallest = i;
        int left = (2 * i) + 1;
        int right = (2 * i) + 2;

        if (left < heapSize && A[left] < A[smallest]) {
            smallest = left;
        }
        if (right < heapSize && A[right] < A[smallest]) {
            smallest = right;
        }
        if (smallest != i) {
            //exchange A[i] with A[largest]
            int temp = A[i];
            A[i] = A[smallest];
            A[smallest] = temp;
            minHeapify(A, smallest, heapSize);
        }
    }

    public static void buildMaxHeap(int A[], int heapSize) {
        for (int i = (heapSize / 2) - 1; i > -1; i--) {
            maxHeapify(A, i, heapSize);
        }
    }

    public static void buildMinHeap(int A[], int heapSize) {
        for (int i = (heapSize / 2) - 1; i >= 0; i--) {
            minHeapify(A, i, heapSize);
        }
    }
}