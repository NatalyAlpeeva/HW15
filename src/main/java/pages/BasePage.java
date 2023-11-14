package pages;


import driver.WebDriverHolder;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
//    protected WebDriver driver;

    public BasePage() {
//        this.driver = driver;
        PageFactory.initElements(WebDriverHolder.getInstance().getDriver(), this);
    }
}
