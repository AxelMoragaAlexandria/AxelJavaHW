package Class26;


import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/*
Create a Map that will store Employee name and salary.
 Write a logic to retrieve an employee who gets the highest salary.
 Output should be in the below format
John Smith=$100000
 */
public class Task2 {
    public static void main(String[] args) {

        Map<String,Integer>employeeInfo=new LinkedHashMap<>();
                employeeInfo.put("Axel",150000);
                employeeInfo.put("Leandro",135000);
                employeeInfo.put("Brandon",115000);
                employeeInfo.put("Roberto",95000);


                int num=0;
                String name="";

          for(Map.Entry<String,Integer>n: employeeInfo.entrySet()){
                if(n.getValue()>num ){
                    num=n.getValue();
                    name=n.getKey();
                }
          }

        System.out.println(name+"=$"+num);












    }
}
