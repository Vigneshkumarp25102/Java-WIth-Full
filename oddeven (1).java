import java.util.*;
class Main {
  public static void main(String[] args) {
    int arr_1[]={1,4,5,9};
    int arr_2[]={8,7,5,2};
    
    ArrayList<Integer> arr_lis = new ArrayList<>();
    HashSet<Integer> arr_eve = new HashSet<>();
    HashSet<Integer> arr_odd = new HashSet<>();
    ArrayList<Integer> arr_odd_des = new ArrayList<>();

    for(int i=0;i<arr_1.length;i++){
    	arr_lis.add(arr_1[i]);
    }
    for(int j=0;j<arr_2.length;j++){
    	arr_lis.add(arr_2[j]);
    }
    
    System.out.print("Combining both array : "+arr_lis+"\n\n");
    
    for(int k=0;k<arr_lis.size();k++){
    if(arr_lis.get(k)%2==0){
    	arr_eve.add(arr_lis.get(k));
    }
    }
    for(int l=0;l<arr_lis.size();l++){
    if(arr_lis.get(l)%2!=0){
   		arr_odd.add(arr_lis.get(l));
    }
    }
    
    System.out.print("odd numbers : ");
    
    for(int m=0;m<arr_odd.size();m++){
    System.out.print(arr_odd.toArray()[m]+",");
    }
    
    System.out.println();

    System.out.print("Even numbers : ");
    
    for(int n=0;n<arr_eve.size();n++){
    System.out.print(arr_eve.toArray()[n]+",");
    }
    
    System.out.println("\n");

    for(int g=arr_odd.size()-1;g>=0;g--){
    int i = (Integer) arr_odd.toArray()[g];
    arr_odd_des.add(i);
    }
    
    System.out.print("Result : ");
    
    int arr_com = Math.max(arr_eve.size(), arr_odd.size());

    for(int p=0;p<arr_com;p++){
    if(p<arr_eve.size()){
    System.out.print(arr_eve.toArray()[p]+",");
    }
    if(p<arr_odd.size()){
    System.out.print(arr_odd_des.get(p)+",");
    }
    }
  }
}
