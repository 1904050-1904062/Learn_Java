import java.util.LinkedList;
import java.util.Iterator;


public class List {
    public void show(){
        LinkedList<Integer> l = new LinkedList<>();

        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(50);


        System.out.println(l);
        System.out.println(l.getFirst());
        System.out.println(l.getLast());
        l.removeFirst();
        l.removeLast();
        System.out.println(l);
        System.out.println(l.getFirst());
        System.out.println(l.getLast());
        System.out.println(l);

        l.add(11);
        System.out.println(l);

        l.addFirst(1);
        l.addLast(100);
        System.out.println(l);
        System.out.println(l.get(4));

        Iterator<Integer> i = l.iterator();

        while (i.hasNext()) {
            System.out.println(i.next());
        }
        System.out.println(l);
        l.poll();
        System.out.println(l);
        l.poll();
        System.out.println(l);

        int x = l.poll();
        System.out.println("Hand = "+x);
        System.out.println(l);
    }
}
