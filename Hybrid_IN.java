class Location_HY{
    String home,office,present_ad,permanent_ad;
    String  Address(){
        System.out.println(home);
        return home;
    }
}
class Office_HY extends Location_HY {
    String Address_office(){
        System.out.println(office);
        return office;
    }
}
class Present_HY extends Location_HY{
    String Address_present(){
        System.out.println(present_ad);
        return present_ad;
    }
}
class Permanent_HY extends Office_HY{
    String Address_permanent(){
        System.out.println(permanent_ad);
        return permanent_ad;
    }
}
public class Hybrid_IN {
    public static void main(String arg[]){
        Office_HI ob =new Office_HI();
        Present_HI ob2 = new Present_HI();
        Permanent_HI ob3 = new Permanent_HI();
        ob.home="Erode";
        ob.office= "chennai";
        ob2.present_ad ="Tharamni";
        ob3.permanent_ad="Comibatore";
        ob.Address();
        ob.Address_office();
        ob2.Address_present();
        ob3.Address_permanent();
    }
}