package GroupProject2CodingTasks;

/*
Question #10
10. Provide Implementation for the diagram below.
Then create a test class in which you need to create Objects of ChromeDriver,
FirefoxDrive and SafariDriver classes and see which methods available to them.
 */
public class WebDriverTestClass {
    public static void main(String[] args) {
        RemoteWebDriver driver=new ChromeDriver();
                driver.open("https://facebook.com");
                driver.navigate("https://amazon.com");
                driver.close();
                driver.getScreenShot();
              String title=driver.getTitle();
        System.out.println(title);


        RemoteWebDriver driver2=new FireFoxDiver();
        driver.open("https://youtube.com");
        driver.navigate("https://giant.com");
        driver.close();
        driver.getScreenShot();
        String title2=driver.getTitle();
        System.out.println(title2);

        RemoteWebDriver driver3=new SafariDriver();
        driver.open("https://spotify.com");
        driver.navigate("https://target.com");
        driver.close();
        driver.getScreenShot();
        String title3=driver.getTitle();
        System.out.println(title3);







    }
}
