public class Node implements Comparable<Node>{
    private int classroomNumber;
    private int endTime;

    public Node(int classroomNumber, int endTime) {
        this.classroomNumber = classroomNumber;
        this.endTime = endTime;
    }

    public int getClassroomNumber() {
        return classroomNumber;
    }

    public int getEndTime() {
        return endTime;
    }

    public void updateEndTime(int newEndTime) {
        this.endTime = newEndTime;
    }

    @Override
    public int compareTo(Node other) {
        /**
         * returns a negative integer, zero, or a positive integer to
         * indicate that the input object is less than, equal or greater
         * than the existing object.
         * -1 input < this
         * 0 input = this
         */
        if (this.getEndTime() == other.getEndTime())
            return 0;
        else if (this.getEndTime() > other.getEndTime())
            return -1;
        else// if (this.getEndTime() < other.getEndTime())
            return 1;
    }
}
