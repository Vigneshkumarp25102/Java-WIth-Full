import java.util.Iterator;

public class TreeSet {
    public static void main(String []arg){
        java.util.TreeSet<String> trst=new java.util.TreeSet<>();

        trst.add("vijay");
        trst.add("akash");
        trst.add("kumar");
        trst.add("gokul");

        Iterator<String> ittr=trst.iterator();
        while (ittr.hasNext()){
            System.out.println(ittr.next());
        }

        System.out.println(trst.ceiling("gokul"));

    }
}
