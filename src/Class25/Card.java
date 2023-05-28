package Class25;

import java.util.Iterator;
import java.util.LinkedList;

/*
 Create a Card class that will have interest rate field and card type
  and a constructor that will initialize the fields.
  Create 3 objects of different card and store them into LinkedList.
  Using for loop/advanced for loop/ iterator access all methods of the class.
 */
public class Card {

    private double interestRate;
    private String cardType;

    Card(double interestRate,String cardType){
        this.interestRate=interestRate;
        this.cardType=cardType;
    }

    public void cardCompany(){
        if(cardType.equalsIgnoreCase("Credit")){
            System.out.println("It's a Chase Card");
        }else{
            System.out.println("It's a Well's Fargo Card");
        }
    }
}

class CardTester{
    public static void main(String[] args) {

        LinkedList<Card> card=new LinkedList<>();
            card.add(new Card(0.5,"Credit"));
            card.add(new Card(55.5,"Debit"));
            card.add(new Card(32.2,"Debit"));

            for(Card c:card){
                c.cardCompany();
            }

        for (int i = 0; i < card.size(); i++) {
           Card result= card.get(i);
            result.cardCompany();
        }

        Iterator<Card>cardIterator= card.iterator();
        while(cardIterator.hasNext()){
           Card result= cardIterator.next();
                result.cardCompany();
        }



    }
}
