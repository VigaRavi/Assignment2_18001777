object salary {
   def main(args: Array[String]) {
     val normal_Hour:Int=40;
     val OT_Hour:Int=20;
     val normal_pay:Double=normal_Hour*150;
     val OT_pay:Double=OT_Hour*75;
     val total_pay:Double=OT_pay+normal_pay;
     val takehomesalary:Double=total_pay*90/100;
     println("total:"takehomesalary);
   }
}