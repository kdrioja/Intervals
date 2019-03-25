import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.PriorityQueue;

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
        PriorityQueue<Node> queue = new PriorityQueue<>();

        Class firstClass = new Class(0);
        firstClass.addInterval(A.get(0));
        classrooms.add(firstClass);
        queue.offer(new Node(firstClass.getId(), firstClass.getLastEndTime()));
        int classroomCount = 1;

        for (int i = 1; i < A.size(); i++) {

            if (A.get(i).getStartTime() >= queue.peek().getEndTime()) {
                int classroomNumber = queue.peek().getClassroomNumber();
                classrooms.get(classroomNumber).addInterval(A.get(i));
                //queue.offer(new Node(classroomNumber, classrooms.get(classroomNumber).getLastEndTime()));
                queue.peek().updateEndTime(A.get(i).getEndTime());
            }
            else {
                /**
                boolean flag = false;
                Node[] nodes1 = new Node[queue.size()];
                Node[] nodes = queue.toArray(nodes1);

                for (int n = 0; n < nodes.length; n++) {
                    if (nodes[n].getEndTime() <= A.get(i).getStartTime()) {
                        int classroomNumber = nodes[n].getClassroomNumber();
                        classrooms.get(classroomNumber).addInterval(A.get(i));
                        flag = true;
                        break;
                    }

                }*/

                Class newClassroom = new Class(classroomCount);
                newClassroom.addInterval(A.get(i));
                classrooms.add(newClassroom);
                queue.offer(new Node(newClassroom.getId(), newClassroom.getLastEndTime()));
                classroomCount++;

            }
        }

        return classrooms;
    }
}