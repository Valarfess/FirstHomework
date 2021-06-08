import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Base {
    ChromeDriver driver;

    @BeforeTest
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Fess\\IdeaProjects\\chromedriver.exe");
        driver = new ChromeDriver();
    }
    @AfterTest
    public void exit (){
        driver.quit();
    }
}
