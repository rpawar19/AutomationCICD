package pageClass;

import Base.Base;

public class demo1 extends Base {

    public void openSite(){
        webdriver.get("https://google.com");

    }
    public void getURL(){
        String url = webdriver.getCurrentUrl();
        System.out.println("Current Page URL is : "+url);

    }
    public void closeBrowser(){
        webdriver.close();
    }
}
