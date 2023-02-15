import java.util.*;
public class Stack {
    public static void main(String []arg){
        java.util.Stack<Integer> stli = new java.util.Stack<Integer>();

        stli.push(1001);
        stli.push(1002);
        stli.push(1003);
        stli.push(1004);

        Iterator<Integer> itli = stli.iterator();
        while (itli.hasNext()){
            System.out.println(itli.next());
        }
        System.out.println(stli.pop());
        System.out.println(stli.push(1005));

        for (int frst:
           stli  ) {
            System.out.println(frst);
        }
    }

}
