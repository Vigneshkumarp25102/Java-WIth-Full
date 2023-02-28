public class Anagram {
    public static void main(String []arg){
    String strOne = "ABC";
    String strTwo = "CAB";
    char[] arrOne= strOne.toCharArray();
    char[] arrTwo= strTwo.toCharArray();
    int strCount=0;

    if(strOne.length()==strTwo.length()) {
        for (int loopFirstStr = 0; loopFirstStr < strOne.length(); loopFirstStr++) {
            for (int loopSecondStr = 0; loopSecondStr < strTwo.length(); loopSecondStr++) {
                if (arrOne[loopFirstStr] == arrTwo[loopSecondStr]) {
                    strCount++;
                    arrTwo[loopSecondStr]=0;
                }
            }
        }
        if(strCount==strOne.length()) {
            System.out.println("This is anagram");
        }
    }else System.out.println("This is not anagram");
    }
}

//                    strTwo.substring(strTwo.charAt(loopSecondStr),0);
//                strTwo.replace(strTwo.charAt(loopSecondStr),' ');
//                    strTwo.replace(strTwo.charAt(loopSecondStr),' ');
