package Class25;
/*
Create a class Insurance that will have an attribute as insuranceName and unimplemented behaviour as getQuote and cancelInsurance.
 Create 3 subclasses Car, Pet, Health. Car class has its own attribute as carModel and Class Pet has petType attribute.
 Create 3 objects of the subclasses and store them in ArrayList. Using for loop/advanced for loop/ iterator access all methods of the class.
 */
public abstract class Insurance {
    private String insuranceName;

    public abstract void getQuote();

    public abstract void cancelInsurance();
    Insurance(String insuranceName){
        this.insuranceName=insuranceName;
    }

}

class Car extends Insurance{

  private String carModel;

  Car(String insuranceName,String carModel){
      super(insuranceName);
      this.carModel=carModel;
  }

  @Override
    public void getQuote(){
      System.out.println("SAVE UP TO 25% ON AUTO THAT LOVES YOU BACK.*");
  }

  @Override
    public void cancelInsurance(){
      System.out.println("Insurance for "+carModel+" is cancelled");
  }


}

class Pet extends Insurance{

  private String petType;

  Pet(String insuranceName,String petType){
      super(insuranceName);
      this.petType=petType;
  }
  @Override
  public void getQuote(){
      System.out.println("America's favorite pet insurer and #1 choice for pet parents for more than four decades");
  }
  public void cancelInsurance(){
      System.out.println("Insurance for Pet "+petType+" is cancelled");
  }

}

class Health extends Insurance{

    private String name;

    Health(String insuranceName,String name){
       super(insuranceName);
       this.name=name;
    }

    public void getQuote(){
        System.out.println("With our health care,you'll get personalized care, top-notch doctors and specialists, and the convenience of having many services under one roof");
    }
    public void cancelInsurance(){
        System.out.println("Insurance is terminated for "+name);
    }



}
