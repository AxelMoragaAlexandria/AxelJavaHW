package Class20;

public class CreditCard {
/*
Create a class CreditCard and define variable balance and interest.
Create an instance method that will calculate interest based on the given balance.
Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
Call the method by creating an object of each of the three classes.
 */

    double balance;
    double interest;

            public double totalInterest(double balance, double interest){
                this.balance=balance;
                this.interest=interest;

                return this.balance*this.interest;
            }

}

class Visa extends CreditCard{


}
class AX extends CreditCard{
    @Override
    public double totalInterest(double balance, double interest){
        System.out.print("American Express ");
        return balance*interest;
    }

}

class mainTester{
    public static void main(String[] args) {
        CreditCard credit=new CreditCard();
            double result = credit.totalInterest(1000,0.18);
        System.out.println(result);


        Visa visa=new Visa();
               double result1= visa.totalInterest(500,0.5);
        System.out.println(result1);

        
        AX ax=new AX();
       double result2= ax.totalInterest(2000,0.6);
        System.out.println(result2);
    }
}
