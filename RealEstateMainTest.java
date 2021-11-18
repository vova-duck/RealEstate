package HomeWork13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class RealEstateMainTest {
    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        String input;
        System.out.println("To create property type anything, to prevent or stop type quit");
        ArrayList<RealEstate> properties = new ArrayList<>();
        {
            while (!(input = reader.readLine()).equals("quit")) {
                System.out.println("choose your property type RETAIL, LIVING or INDUSTRIAL");
                RealEstate realEstate = realEstateBuilder(RealEstateTypes.valueOf(reader.readLine()));
                properties.add(realEstate);
                System.out.println("To create property type anything, to prevent or stop type quit");
            }
            for (RealEstate realEstate:properties){
                System.out.println(realEstate);
                System.out.println(" To pay" + realEstate.taxCounter());
            }


        }
    }



    public static RealEstate realEstateBuilder(RealEstateTypes types) throws IOException {
        RealEstate realEstate;
        switch (types) {
            case RETAIL:
            String type;
            int square;
            int profit;
            System.out.println("You choose Retail type");
            type = "Retail";
            System.out.println("type square of property");
            square = dataReceive();
            System.out.println("type profit");
            profit = dataReceive();
           realEstate =  new RetailRealEstate(type, square, profit);

break;
            case INDUSTRIAL:
                System.out.println("you choose industrial type");
                type = "Industrial";
                System.out.println("type square of property");
                square = dataReceive();
                realEstate = new IndustrialRealEstate(type, square);
break;
            case LIVING:
                System.out.println("you choose Living type");
                type = "Living";
                System.out.println("type square of property");
                square = dataReceive();
                realEstate =   new LivingRealEstate(type, square);
break;
            default:
                throw new IllegalStateException("theres no property like this " + types);
        }
        return realEstate;
    }

    public static int dataReceive () throws IOException {
        int data;
          data = Integer.parseInt(reader.readLine());
        if (data<= 0){
            System.out.println("Type correct data");
            dataReceive();
        }
       return data;
    }


}

