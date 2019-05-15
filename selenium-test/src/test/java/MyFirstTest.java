import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class MyFirstTest {

    private WebDriver driver;

    @Before
    public void initWebDriver() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\cydfp\\Downloads\\ui-tests-master\\ui-tests-master\\selenium-test\\src\\test\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test
    public void wrongFirstNameTestShouldFail(){
        driver.get("C:\\Users\\cydfp\\Downloads\\ui-tests-master\\ui-tests-master\\selenium-test\\src\\test\\resources\\index.html");

        WebElement firstName = driver.findElement(By.id("firstName"));
        firstName.sendKeys("a");
        WebElement submit = driver.findElement(By.id("submit-button"));
        submit.click();
        WebElement message = driver.findElement(By.id("Message"));
        assert "Failed".equals(message.getText());
    }
}
