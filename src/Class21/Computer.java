package Class21;
/*
Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
Define common behavior within and some fields in parent class and override some of the methods in child classes
Define some methods specific to child classes
Create objects of child classes and store them into array. Loop through each object and execute available methods.
 */
public class Computer {
    String color;
    String Processor;
    String HardDrive;
    double weight;
    Computer(String color,String Processor,String HardDrive,double weight){
        this.color=color;
        this.Processor=Processor;
        this.HardDrive=HardDrive;
        this.weight=weight;
    }
    public void unlockComputer(){
        System.out.println("Turning on the computer and homepage is displayed");
    }
    public void playGames(){
        System.out.println("Computer is using energy to play the game");
    }
    public void audioSound(){
        System.out.println("Audio is playing from the computer");
    }
    public void closeComputer(){
        System.out.println("Computer is shutting off");
    }
}

class Apple extends Computer{
        Apple(String color,String Processor,String HardDrive,double weight){
           super(color, Processor, HardDrive, weight);
        }
        @Override
            public void unlockComputer(){
                System.out.println("Apple uses TouchID to unlock computer");
            }
            @Override
            public void audioSound(){
                System.out.println("Apple speakers consists of two pairs of dual force-canceling woofers and two tweeters.");
            }
            public void AppleMac(){
                System.out.println("Has Face ID and and Great BatteryLife");
            }
}

class Lenovo extends Computer{
        Lenovo(String color,String Processor,String HardDrive,double weight){
                    super(color, Processor, HardDrive, weight);
        }
        @Override
    public void unlockComputer(){
        System.out.println("Lenovo requires Password to unlock Computer");
    }
    @Override
    public void audioSound(){
        System.out.println("Lenovo speakers consists of 2 x 2W Stereo Speakers");
    }
    public void LenoTime(){
        System.out.println("Has quick response time");
    }

}


class HP extends Computer{
    HP(String color,String Processor,String HardDrive,double weight) {
        super(color, Processor, HardDrive, weight);
    }
    @Override
    public void unlockComputer(){
        System.out.println("HP requires Password and Security Question to unlock Computer");
    }
    @Override
    public void audioSound(){
        System.out.println("HP speakers consists of Bang & Olufsen; Dual speakers ");
    }
    public void HPPower(){
        System.out.println("Durability is hard and stiff");
    }


}

class Dell extends Computer{
    Dell(String color,String Processor,String HardDrive,double weight){
        super(color, Processor, HardDrive, weight);
    }
    @Override
    public void unlockComputer(){
        System.out.println("Dell Automatically unlocks the computer");
    }
    public void audioSound(){
        System.out.println("Dell consists of Stereo speakers with Waves MaxxAudio® Pro, 2 W x 2/n");
    }
    public void DellScreen(){
        System.out.println("Dell has curved Screens with top HD quality");
    }


}


