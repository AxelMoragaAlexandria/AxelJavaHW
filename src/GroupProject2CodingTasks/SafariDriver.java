package GroupProject2CodingTasks;

/*
Question #10
10. Provide Implementation for the diagram below.
Then create a test class in which you need to create Objects of ChromeDriver,
FirefoxDrive and SafariDriver classes and see which methods available to them.
 */

public class SafariDriver implements RemoteWebDriver{

    String title;
    String URL;
    public void open(String URL){
        this.URL=URL;
        System.out.println("Website is opening");
    }
    public void close(){
        System.out.println("Website is closing");
    }
    public String getTitle(){
        return this.title;
    }
    public void navigate(String URL){
        this.URL=URL;
        System.out.println("Navigating to "+this.URL);
    }
    public void getScreenShot(){
        System.out.println("ScreenShot Taken");
    }
}
