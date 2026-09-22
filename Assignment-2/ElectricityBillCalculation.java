class ElectricityBillCalculation{

  static float calculateBill(int units){

    float bill = 0;

    if(units<=100){
      bill = units * 2;
    }

    else if((units > 100) && (units <= 200)){
      bill = (100 * 2) + ((units - 100)*3);
    }

    else if((units > 200) && (units <= 300)){
      bill = (100 * 2) + (100 * 3) + ((units - 200)*5);
    }

    else if(units > 300){

      bill = (100 * 2) + (100 * 3) + (100 * 5)+ ((units - 300)*7);
    }
   return bill; 
  }

  public static void main(String args[]){

    float elecBill = calculateBill(450);

    System.out.println("Calculated Bill is:" +" "+ elecBill);
  }
}
