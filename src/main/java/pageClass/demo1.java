package pageClass;

import Base.Base;
import dev.failsafe.internal.util.Assert;

public class demo1 extends Base {

    public void openSite(){
        webdriver.get("https://www.google.com");

    }
    public void openSite2(){
        webdriver.get("https:www.vipsha.com");
    }
    public void getURL(){
        String url = webdriver.getCurrentUrl();
        System.out.println("Current Page URL is : "+url);

    }
    public void closeBrowser(){
        webdriver.close();
    }
}
