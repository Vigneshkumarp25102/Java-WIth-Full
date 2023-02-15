import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeue {
    public static void main(String arg[]){
        Deque<Integer> arqu=new ArrayDeque<Integer>();

        arqu.add(9);
        arqu.add(2);
        arqu.add(7);
        arqu.add(4);

        for (int frar:arqu
        ) {
            System.out.print(frar+" ");
        }
        System.out.println(arqu.pop());
        System.out.println(arqu.size());

        System.out.println(arqu.getFirst());
        System.out.println(arqu.getLast());
        System.out.println(arqu.contains(3));
    }
}
