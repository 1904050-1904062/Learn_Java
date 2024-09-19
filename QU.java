import java.util.Queue;
import java.util.LinkedList;

public class QU {
    public void show(){
        Queue<Integer> q = new LinkedList<Integer>();

        q.offer(11);
        q.offer(22);
        q.offer(33);
        q.offer(44);
        q.offer(55);

        System.out.println(q);

        int x = q.poll();
        System.out.println(x);
        System.out.println(q);

        while (!q.isEmpty()) {
            System.out.println(q.poll());
        }

        System.out.println(q);

    }
}
