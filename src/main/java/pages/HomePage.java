package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.annotations.AfterMethod;

public class HomePage  extends BasePage{
    public HomePage(WebDriver driver){
        setDriver(driver);
        driver.get("https://ilcarro.web.app/search");
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
    }

   @FindBy(css = "a[href='/login?url=%2Fsearch']")
   WebElement btnLoginHeader;

    public void clickBtnLoginHeader(){
        btnLoginHeader.click();
    }

}
