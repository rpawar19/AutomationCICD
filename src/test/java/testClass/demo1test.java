package testClass;

import Base.Base;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageClass.demo1;

import java.security.PublicKey;

public class demo1test extends Base {

    public static demo1 demo = new demo1();
    public static String currenturl;
    @Test
    public void testcase1(){
        initWebDriver();
        demo.openSite();
        currenturl=webdriver.getCurrentUrl();
        Assert.assertTrue(currenturl.contains("https://www.google.com"));
    }
    @Test
    public void testcase2(){
        demo.openSite2();
        System.out.printf("This is from TestCase2");
        currenturl=webdriver.getCurrentUrl();
        Assert.assertTrue(currenturl.contains("https://www.pytheta.com/"));
    }
}
