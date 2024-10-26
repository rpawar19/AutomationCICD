package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static java.time.Duration.ofSeconds;

public class Base {
    public static WebDriver webdriver;

    public void initWebDriver(){
        ChromeOptions option = new ChromeOptions();
        option.addArguments("-remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();
        webdriver = new ChromeDriver(option);
    }
    public void maximizeWindow() {
        webdriver.manage().window().maximize();
    }
    public void closeBrowser() {
        webdriver.close();
    }
    public void quiteBrowser() {
        webdriver.quit();
    }
    public static void waitForElement(By by, int timeOut) {
        WebDriverWait wait = new WebDriverWait(webdriver, ofSeconds(timeOut));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }


    public void pause(int ms){
        try {
            Thread.sleep(ms);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
