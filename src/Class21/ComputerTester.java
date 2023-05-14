package Class21;

public class ComputerTester {
    public static void main(String[] args) {

        Computer[]comp={new Apple("White","Apple M2 chip","16-core Neural Engine",15.5),
        new Lenovo("Black", "Lucien AMD Ryzen 5","8GB DDR4-3200 RAM",13.4),
        new HP("Blue","Intel® Core™ i5-1240P","256 GB PCIe® NVMe™ M.2 SSD",16.4),
                new Dell("Green","12th Gen Intel® Core™ i7-1255U","512 GB, M.2, PCIe NVMe, SSD",20.5)};


        for(Computer compu:comp){
            compu.unlockComputer();
            compu.closeComputer();
            compu.audioSound();
            compu.playGames();

            if(compu instanceof Apple){
                ((Apple)compu).AppleMac();
            }else if(compu instanceof Lenovo){
                ((Lenovo)compu).LenoTime();
            }else if(compu instanceof HP){
                ((HP)compu).HPPower();
            }else if(compu instanceof Dell){
                ((Dell)compu).DellScreen();
            }

        }

    }
}
