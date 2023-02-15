class Location_ML{
    String home,office;
    String  Address(){
        System.out.println(home);
        return home;
    }
}
class Office_ML extends Location_ML {
    String present_ad;
    String Address_office(){
        System.out.println(office);
        return office;
    }
}
class Present_ML extends Office_ML{
    String Address_present(){
        System.out.println(present_ad);
        return present_ad;
    }
}

public class Multilevel_IN {
    public static void main(String arg[]){
        Present_ML ob = new Present_ML();
        ob.home="Erode";
        ob.office= "chennai";
        ob.present_ad ="Tharamani";
        ob.Address();
        ob.Address_office();
        ob.Address_present();
    }
}
