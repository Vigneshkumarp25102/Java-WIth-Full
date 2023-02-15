import java.util.Iterator;
import java.util.Queue;

public class PriorityQueue {
    public static void main(String arg[]){
        Queue<String> prqu = new java.util.PriorityQueue<String>();

        prqu.add("Have");
        prqu.add("you");
        prqu.add("done");
        prqu.add("the");
        prqu.add("program");

        Iterator<String> itpr= prqu.iterator();
        while (itpr.hasNext()){
            System.out.print(itpr.next()+" ");
        }

        System.out.println(prqu.remove());
        for (String frpr:prqu
        ) {
            System.out.print(frpr+" ");
        }
        System.out.println(prqu.element());

        System.out.println(prqu.peek());
        System.out.println(prqu.poll());

        for (String frpr:prqu
             ) {
            System.out.print(frpr+" ");
        }
    }
}
