package GroupCodingTasks;

public class Task1 {
    public static void main(String[] args) {

/*
Create a program that uses an array to store a list of temperatures for a week,
and then uses a loop to find the highest and lowest temperature for the week.
 */

        int[]temperature={50,34,40,20,90,56,23};

        int highest=temperature[0];
        int lowest=temperature[0];
        for (int i = 0; i < temperature.length; i++) {
                        if(temperature[i]>highest){
                                highest=temperature[i];
                        }else if(temperature[i]<lowest){
                            lowest=temperature[i];
                        }
        }


        System.out.println("The higest temperature of the week is "+ highest);
        System.out.println("The highest temperature of the week is "+ lowest);













    }
}

