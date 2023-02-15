import java.util.*;
public class ArrayList {
    public static void main(String[] args) {
        java.util.ArrayList<String> arli = new java.util.ArrayList<String>();
        arli.add("vignesh");
        arli.add("kumar");
        arli.add("chandru");
        arli.add("Full");

        Iterator<String> itli =arli.iterator();
        while (itli.hasNext()){
            System.out.println(itli.next());
        }
        arli.remove(2);
        for (String frli:arli
             ) {
            System.out.println(frli);
        }

    }
}