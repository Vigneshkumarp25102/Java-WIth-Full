public class Exception2 {
    public static void main(String arg[]){
        try {
            try {
                int num = 50 / 0;
            } catch (NullPointerException e){
                System.out.println(e + "hi");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e + "kjn");
            }
        }
        catch (Exception e){
            System.out.println(e+"out");
        }
    }

}
