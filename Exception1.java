public class Exception1 {
    public static void main(String[] args) {
        try{
            //int num=10/0;        //java.lang.ArithmeticException: / by zero
            //String str ="qwert";
            //int in= Integer.parseInt(str); //java.lang.NumberFormatException: For input string: "qwert"
            //String str =null;
            //System.out.println(str.length());     //java.lang.NullPointerException
            //int a[] =new int[50];     //java.lang.ArrayIndexOutOfBoundsException: 70
            //a[70] = 50;   //java.lang.ArrayIndexOutOfBoundsException: 70
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}