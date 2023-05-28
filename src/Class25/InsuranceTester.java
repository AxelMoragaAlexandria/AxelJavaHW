package Class25;

import java.util.ArrayList;
import java.util.Iterator;

/*

 */
public class InsuranceTester {
    public static void main(String[] args) {

        ArrayList<Insurance>objects=new ArrayList<>();
        objects.add(new Car("Amica","Honda"));
        objects.add(new Pet("Figo","Dog"));
        objects.add(new Health("Kaiser","Roberto"));

        //Enhanced for loop
        for(Insurance i:objects){
            i.getQuote();
            i.cancelInsurance();
        }

        //Regular for loop
        for (int i = 0; i < objects.size(); i++) {
            Insurance result=objects.get(i);
            result.cancelInsurance();
            result.getQuote();
        }
        // Iterator
        Iterator<Insurance> insuranceIterator= objects.iterator();

        while(insuranceIterator.hasNext()){
          Insurance result= insuranceIterator.next();
          result.getQuote();
          result.cancelInsurance();
        }



    }
}
