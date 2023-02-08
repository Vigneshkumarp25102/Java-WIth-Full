class Train_RLTN001{

	String train_no = "RLTN001";
       
   	private String destination_location;
    private String depature_time;
    private String arrvie_time;
    String source_location;
    
    public void train_details(String src_loc,String des_loc,String dep_time,String arv_time){
    this.source_location = src_loc;
    this.destination_location = des_loc;
    this.depature_time = dep_time;
    this.arrvie_time = arv_time;
   
    System.out.print("Train no : "+train_no+"\n");
    System.out.print("Source Location : "+source_location+"\n");
    System.out.print("Destination Location : "+destination_location+"\n");
        System.out.print("Depature time : " +depature_time+"\n");
        System.out.print("Arrive time : " +arrvie_time+"\n\n");
    	
    }
    public void train_details(String junction_1,String junction_2,String junction_3){
  
    System.out.print("Junction 1 : "+junction_1+"\n");
    System.out.print("Junction 2 : "+junction_2+"\n");
    System.out.print("Junction 3 : "+junction_3+"\n");

    }
}

class Main {
  public static void main(String[] args) {
    
    Train_RLTN001 train_1 = new Train_RLTN001();

    train_1.train_details("Chennai","Erode","10:00","15:00");
    train_1.train_details("Vellor","Salem","Erode");
    
  }
}