package GroupCodingTasks;

public class Task8 {
    public static void main(String[] args) {

/*
Maximum and minimum number in the array?
 */
        int[]number={5,10,15,20,25,30};


        int maxnum=number[0];
        int minnum=number[0];


        for (int i = 0; i < number.length; i++) {
            if(number[i]>maxnum){
                maxnum=number[i];
            }else if(number[i]<minnum){
                minnum=number[i];
            }

        }

        System.out.println("The maxium number in the array is "+maxnum);
        System.out.println("The mininum number in the array is "+minnum);







    }
}
