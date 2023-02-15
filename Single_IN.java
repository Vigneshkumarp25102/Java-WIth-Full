class Location{
        String home,office;
        String  Address(){
            System.out.println(home);
            return home;
        }
    }
        class Office extends Location {
            String Address_office(){
        System.out.println(office);
        return office;
    }
}
public class Single_IN {
    public static void main(String arg[]){
    Office ob =new Office();
    ob.home="Erode";
    ob.office= "chennai";
    ob.Address();
    System.out.println(ob.office);

    }
}
