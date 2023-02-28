public class Anagram {
    public static void main(String []arg){
        String word_1="ABC";
        String word_2="BAC";
        short count=0;
        if(word_1.length() == word_2.length()){
        for (int check_1=0;check_1<word_1.length();check_1++){
            for (int check_2=0;check_2<word_2.length();check_2++){
                if(word_1.charAt(check_1)==word_2.charAt(check_2)){
                    count++;
                }
            }
            }
        }else System.out.println("This is not anagram");
        if(count==word_1.length()){
            System.out.println("This is a anagram");
        }else System.out.println("This is not anagram");
    }
}
