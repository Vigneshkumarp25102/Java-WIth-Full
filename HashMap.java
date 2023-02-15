import java.util.Iterator;
import java.util.Map;

public class HashMap {
    public static void main(String arg[]){
        java.util.HashMap<Integer,String> hsmp=new java.util.HashMap<>();

        hsmp.put(101,"Hello");
        hsmp.put(102,"everyone");
        hsmp.put(103,"good morning");
        hsmp.put(104,"to all");

        Iterator itmp= hsmp.entrySet().iterator();
        while (itmp.hasNext()){
            Map.Entry kyvl=(Map.Entry)itmp.next();
            System.out.println(kyvl.getKey()+" "+kyvl.getValue());
        }
        System.out.println(hsmp.entrySet());
        System.out.println(hsmp.get(103));
        System.out.println(hsmp.containsKey(104));

    }
}
