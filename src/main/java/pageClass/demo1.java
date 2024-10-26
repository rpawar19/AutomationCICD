package pageClass;

import Base.Base;

public class demo1 extends Base {

    public void openSite(){
        webdriver.get("https://google.com");

    }
    public void closeBrowser(){
        webdriver.quit();
    }
}
