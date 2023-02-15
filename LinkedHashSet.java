import java.util.Iterator;

public class LinkedHashSet {
    public static void main(String arg[]){
        java.util.LinkedHashSet<String> lnst=new java.util.LinkedHashSet<String>();

        lnst.add("vignesh");
        lnst.add("boopalan");
        lnst.add("sanjai");
        lnst.add("vishnu");

        Iterator<String> itln=lnst.iterator();
        while (itln.hasNext()){
            System.out.println(itln.next());
        }

    }
}
