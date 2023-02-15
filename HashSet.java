import java.util.Iterator;
import java.util.Set;

public class HashSet {
    public static void main(String aarg[]){
        Set<String> hsst=new java.util.HashSet<String>();
        hsst.add("akash");
        hsst.add("Vignesh");
        hsst.add("raja");
        hsst.add("gokul");

        Iterator<String> iths= hsst.iterator();
        while (iths.hasNext()){
            System.out.println(iths.next());
        }
        System.out.println(hsst.contains("Vignesh"));

    }
}
