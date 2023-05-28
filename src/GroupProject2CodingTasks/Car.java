package GroupProject2CodingTasks;
/*
Create a Class Car that would have the following fields:
carPrice and color and method calculateSalePrice() which should be returning a price of the car.
Create 2 sub classes: Sedan and Truck.
The Truck class has a field as weight and has its own implementation of calculateSalePrice() method in which returned price is calculated as following:
if weight>2000 then returned price car should include 10% discount, otherwise 20% discount.
The Sedan class has field as length and also does it is own implementation of calculateSalePrice():
if length of sedan is >20 feet then returned car price should include 5% discount, otherwise 10% discount
 */
public class Car {

    double carPrice;
    String carColor;

    Car(double carPrice,String carColor){
        this.carPrice=carPrice;
        this.carColor=carColor;
    }
    public double calculateSalePrice(){
        return carPrice;
    }
}

class Truck extends Car {
    double weight;

    Truck(double carPrice, String carColor, double weight) {
        super(carPrice, carColor);
        this.weight = weight;
    }

    @Override
    public double calculateSalePrice() {
        double discountedPrice =0;
        if (weight > 2000) {
            discountedPrice=(carPrice * 10) / 100;
           discountedPrice=carPrice-discountedPrice;

        } else {
            discountedPrice = (carPrice * 20) / 100;
            discountedPrice=carPrice-discountedPrice;
        }
        return discountedPrice;
    }
}
    class Sedan extends Car{
        int length;
            Sedan(double carPrice,String carColor,int length){
                super(carPrice, carColor);
                this.length=length;
            }
            @Override
            public double calculateSalePrice(){
                double discountedPrice=0;
                if(length>20){
                   discountedPrice=(carPrice*5)/100;
                   discountedPrice=carPrice-discountedPrice;
                }else{
                    discountedPrice=(carPrice*10)/100;
                    discountedPrice=carPrice-discountedPrice;
                }
                return discountedPrice;
            }

    }

    class CarTester{
        public static void main(String[] args) {
            Car truck=new Truck(5500,"Blue",4000);
           double result= truck.calculateSalePrice();
            System.out.println("The discounted price for the Truck is: "+result);
            Car sedan=new Sedan(3000,"Red",21);
               double result2= sedan.calculateSalePrice();
            System.out.println("The discounted price for the Sedan is: "+result2);


         }
    }



