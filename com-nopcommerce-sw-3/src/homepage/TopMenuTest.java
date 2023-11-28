package homepage;
/**
 * 1. create class "TopMenuTest"
 * 1.1 create method with name "selectMenu" it has one parameter name "menu" of type
 * string
 * 1.2 This method should click on the menu whatever name is passed as parameter.
 * 1.3. create the @Test method name verifyPageNavigation.use selectMenu method to
 * select the Menu and click on it and verify the page navigation.
 */

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

import java.util.List;

public class TopMenuTest extends Utility {
    @Before
    //Open Browser
    public void openBrowser() {
        openBrowser(baseUrl);
    }

    @Test
    public void verifyPageNavigation() {
        selectMenu("Computers");
        verifyElements("Verify Top Menu", "Computers", By.xpath("//h1[contains(text(),'Computers')]"));
    }

    //1.1 create method with name "selectMenu" it has one parameter name "menu" of type string
    public void selectMenu(String menu) {
        //1.2 This method should click on the menu whatever name is passed as parameter.
        List<WebElement> menulist = driver.findElements(By.xpath("//ul[@class='top-menu notmobile']/li"));
        for (WebElement name : menulist) {
            System.out.println(name.getText());
            if (name.getText().equalsIgnoreCase(menu)) {
                name.click();
                break;
            }
        }
    }

    @After
    public void close() {
        closeBrowser();
    }
}
