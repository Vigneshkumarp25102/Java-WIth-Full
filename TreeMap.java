import java.util.Iterator;
import java.util.Map;

public class TreeMap {
    public static void main(String arg[]){
        java.util.TreeMap<Integer,String> trmp=new java.util.TreeMap<>();

        trmp.put(201,"I'm");
        trmp.put(202,"become a");
        trmp.put(204,"software Engineering");
        trmp.put(203,"junior");

        Iterator itmp= trmp.entrySet().iterator();
        while (itmp.hasNext()){
            Map.Entry kyvl=(Map.Entry)itmp.next();
            System.out.println(kyvl.getKey()+" "+kyvl.getValue());
        }
        System.out.println(trmp.entrySet());
        System.out.println(trmp.get(1003));
        System.out.println(trmp.containsKey(1004));

    }
}
