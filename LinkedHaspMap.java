import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHaspMap {
    public static void main(String arg[]){
        LinkedHashMap<Integer,String > lnmp = new LinkedHashMap<>();

        lnmp.put(1001,"vignesh");
        lnmp.put(1002,"kumar");
        lnmp.put(1005,"chandru");
        lnmp.put(1009,"gokul");
        lnmp.put(1005,"vishnu");


        Iterator itmp= lnmp.entrySet().iterator();
        while (itmp.hasNext()){
            Map.Entry kyvl=(Map.Entry)itmp.next();
            System.out.println(kyvl.getKey()+" "+kyvl.getValue());
        }
        System.out.println(lnmp.entrySet());
        System.out.println(lnmp.get(1003));
        System.out.println(lnmp.containsKey(1004));
    }
}
