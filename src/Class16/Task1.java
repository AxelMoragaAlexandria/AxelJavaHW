package Class16;

public class Task1 {
    /*
Create a method that will accept an array as parameters and will return a sum
of all elements from that array. Method should be visibly only within
same package and accessible by the creating an instance of the class.

 */



    int sum(int[]arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];

        }
        return sum;

    }

    public static void main(String[] args) {
        Task1 obj=new Task1();
        int[]arr2={5,10,15};
        int result= obj.sum(arr2);
        System.out.println(result);
    }
}

