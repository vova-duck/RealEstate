package HomeWork13;

public class LivingRealEstate extends RealEstate{
    private double taxDiscount;
    public LivingRealEstate(String type, int square){
        super( type, square);
        this.taxDiscount = 0.9;

    }
    public  double taxCounter()  {

      double payTax =  super.taxCounter();
     return  payTax * this.taxDiscount;
    }
    public String toString(){
       return super.toString() + " has 10% discount. ";
    }
}
