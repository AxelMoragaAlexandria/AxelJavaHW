package GroupProject2CodingTasks;


/*
Question #9
Create Registration Class in which you would have variables as email,
userName and password that have an access scope only within its own class.
 After creating an object of the class user should be able to call
 methods and in each method separately pass values to set users email, username and password.
Requirements:
A. Valid email consider to be only yahoo
B. Valid userName and password cannot be empty and should be of
length larger than 6 characters. Also valid password cannot contain userName.
 */
public class Registration {

    private String email;
    private String userName;
   private String password;

    public void setEmail(String email){
        this.email=email;
        if(email.contains("yahoo")){
            System.out.println(this.email + " is a valid Email");
        }else{
            System.out.println("Not Valid");
        }
    }
    public void setUserName(String userName){
        this.userName=userName;
            if(!userName.isEmpty() && userName.length()>6){
                System.out.println(this.userName);
            }else{
                System.out.println("Please enter Valid username");
            }
    }

    public void setPassword(String password){
       this.password=password;
        if(!password.isEmpty() && password.length()>6 && !password.contains(userName)){
            System.out.println(this.password+ " is a valid Password");
        }else{
            System.out.println("Please enter Valid Password");
        }
    }



    public static void main(String[] args) {
        Registration obj=new Registration();
                obj.setEmail("moragaaxel@yahoo.com");
                obj.setUserName("Axel");
                obj.setPassword("Axel123");
    }
}
