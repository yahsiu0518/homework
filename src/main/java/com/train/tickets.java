package com.train;

public class tickets {
   int total_ticket;
   int round_trip;

;

   private Object tickets;

    public tickets (int total_ticket,int round_trip){
       this.total_ticket = total_ticket;
       this.round_trip = round_trip;


   }

   public void print(){
        System.out.println("單程票張數="+total_ticket+"\n"
                +"來回票張數="+round_trip+"\n"
                +"單程票金額=" + (total_ticket*1000)+ "\n"
                +"來回票金額=" + (round_trip*2000*0.9)+"\n"
                +"總折扣金額=" +((round_trip*2000)-(round_trip*2000*0.9f)));

   }






}

