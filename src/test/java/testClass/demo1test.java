package testClass;

import Base.Base;
import org.testng.annotations.Test;
import pageClass.demo1;

public class demo1test extends Base {

    public static demo1 demo = new demo1();

    @Test
    public void testcase1(){
        initWebDriver();
        demo.openSite();
        demo.closeBrowser();
    }
}
