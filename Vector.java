import java.util.*;
public class Vector {
    public static void main(String arg[]){
        java.util.Vector<String> vtli=new java.util.Vector<String>();
        vtli.add("I'm");
        vtli.add("Vignesh");
        vtli.add("from");
        vtli.add("Erode");

        for (String frli:vtli
             ) {
            System.out.print(frli+" ");
        }

        System.out.println(vtli.get(1));
        System.out.println(vtli.capacity());
        System.out.println(vtli.elementAt(3));
    }
}
