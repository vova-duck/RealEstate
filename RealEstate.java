package HomeWork13;


public class RealEstate {
    private String type;
    private int square;

    public RealEstate(){
    }

    public RealEstate(String type, int square){
        this.type = type;
        this.square = square;
    }

    public String getType() {
        return type;
    }
    public void setType(String  type){
        this.type = type;
    }
    public int getSquare(){
        return square;
    }
    public void setSquare(int square){
        this.square = square;
    }
    public  double taxCounter()  {
        int square = getSquare();
        return square * 5;

    }
    public String toString(){
        return "this is " + this.type + " type, square is " + this.square +"." ;
    }
}

