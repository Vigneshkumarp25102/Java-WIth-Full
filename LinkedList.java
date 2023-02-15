import java.util.*;
public class LinkedList {
    public static void main(String []arg){
        java.util.LinkedList<Integer> lili= new java.util.LinkedList<Integer>();

        lili.add(101);
        lili.add(102);
        lili.add(103);
        lili.add(104);

        for (int lis=0;lis<lili.size();lis++){
            System.out.println(lili.get(lis));
        }

        lili.set(3,105);
        Iterator<Integer> itli= lili.iterator();
        while (itli.hasNext()){
            System.out.println(itli.next());
        }
    }
}
