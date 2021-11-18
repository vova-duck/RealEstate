package HomeWork13;

public class RetailRealEstate extends RealEstate{
   private int profit;
   private double taxCoefficient;

   public RetailRealEstate(String type, int square, int profit){
      super(type, square);
      this.profit = profit;
      this.taxCoefficient = 1.1;
   }
   public  double taxCounter()  {

      double taxPay = super.taxCounter();
      if (this.profit<=100){
         return taxPay;
      }else return taxPay * this.taxCoefficient;
   }
   public String toString(){
     return super.toString()+" has to pay fee (10%) for profit more that 100.";
   }
}
