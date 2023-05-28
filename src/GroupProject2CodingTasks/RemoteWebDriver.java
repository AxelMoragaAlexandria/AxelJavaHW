package GroupProject2CodingTasks;


/*
Question #10
10. Provide Implementation for the diagram below.
Then create a test class in which you need to create Objects of ChromeDriver,
FirefoxDrive and SafariDriver classes and see which methods available to them.
 */
public interface RemoteWebDriver extends WebDriver,TakeScreenShot {

    void navigate(String URL);

}
