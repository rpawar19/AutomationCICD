package testClass;

import Base.Base;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageClass.demo1;

public class demo1test extends Base {

    public static demo1 demo = new demo1();

    @Test
    public void testcase1(){
        initWebDriver();
        demo.openSite();
        demo.getURL();
    }
    @Test
    public void testcase2(){
        demo.openSite();
        pause(10000);
        System.out.printf("This is from TestCase2");
        Assert.assertTrue(false);
    }
}
