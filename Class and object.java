class Train_RLTN001{
	String train_no = "RLTN001";
    String source_location;
   	String destination_location;
    String depature_time;
    String arrvie_time;
    
    void train_details(String src_loc,String des_loc,String dep_time,String arv_time){
    this.source_location = src_loc;
    this.destination_location = des_loc;
    this.depature_time = dep_time;
    this.arrvie_time = arv_time;
 
    System.out.print("Train no : "+train_no+"\n");
    System.out.print("Source Location : "+source_location+"\n");
    System.out.print("Destination Location : "+destination_location+"\n");
        System.out.print("Depature time : " +depature_time+"\n");
        System.out.print("Arrive time : " +arrvie_time+"\n");

    	
    }
}
class Main {
  public static void main(String[] args) {
    
    Train_RLTN001 train_1 = new Train_RLTN001();
    train_1.train_details("Chennai","Madurai","10:00","15:00");
    
  }
}
