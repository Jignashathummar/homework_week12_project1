package Electronics;
/**
 * 1. Test name verifyUserShouldNavigateToCellPhonesPageSuccessfully()
 * 1.1 Mouse Hover on “Electronics” Tab
 * 1.2 Mouse Hover on “Cell phones” and click
 * 1.3 Verify the text “Cell phones”
 * 2. Test name verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully()
 * 2.1 Mouse Hover on “Electronics” Tab
 * 2.2 Mouse Hover on “Cell phones” and click
 * 2.3 Verify the text “Cell phones”
 * 2.4 Click on List View Tab
 * 2.5 Click on product name “Nokia Lumia 1020” link
 * 2.6 Verify the text “Nokia Lumia 1020”
 * 2.7 Verify the price “$349.00”
 * 2.8 Change quantity to 2
 * 2.9 Click on “ADD TO CART” tab
 * 2.10 Verify the Message "The product has been added to your shopping cart" on Top
 * green Bar
 * After that close the bar clicking on the cross button.
 * 2.11 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
 * 2.12 Verify the message "Shopping cart"
 * 2.13 Verify the quantity is 2
 * 2.14 Verify the Total $698.00
 * 2.15 click on checkbox “I agree with the terms of service”
 * 2.16 Click on “CHECKOUT”
 * 2.17 Verify the Text “Welcome, Please Sign In!”
 * 2.18 Click on “REGISTER” tab
 * 2.19 Verify the text “Register”
 * 2.20 Fill the mandatory fields
 * 2.21 Click on “REGISTER” Button
 * 2.22 Verify the message “Your registration completed”
 * 2.23 Click on “CONTINUE” tab
 * 2.24 Verify the text “Shopping card”
 * 2.25 click on checkbox “I agree with the terms of service”
 * 2.26 Click on “CHECKOUT”
 * 2.27 Fill the Mandatory fields
 * 2.28 Click on “CONTINUE”
 * 2.29 Click on Radio Button “2nd Day Air ($0.00)”
 * 2.30 Click on “CONTINUE”
 * 2.31 Select Radio Button “Credit Card”
 * 2.32 Select “Visa” From Select credit card dropdown
 * 2.33 Fill all the details
 * 2.34 Click on “CONTINUE”
 * 2.35 Verify “Payment Method” is “Credit Card”
 * 2.36 Verify “Shipping Method” is “2nd Day Air”
 * 2.37 Verify Total is “$698.00”
 * 2.38 Click on “CONFIRM”
 * 2.39 Verify the Text “Thank You”
 * 2.40 Verify the message “Your order has been successfully processed!”
 * 2.41 Click on “CONTINUE”
 * 2.42 Verify the text “Welcome to our store”
 * 2.43 Click on “Logout” link
 * 2.44 Verify the URL is “https://demo.nopcommerce.com/”
 */

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

import java.util.Random;

public class ElectronicsTest extends Utility {
    Random random = new Random();
    int num = random.nextInt(900);

    @Before
    public void openBrowser() {
        openBrowser(baseUrl);
    }

    @Test
   // 1. Test name verifyUserShouldNavigateToCellPhonesPageSuccessfully()
    public void verifyUserShouldNavigateToCellPhonesPageSuccessfully() {
        //1.1 Mouse Hover on “Electronics” Tab
        mouseHoverToElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']"));
        //1.2 Mouse Hover on “Cell phones” and click
        clickOnElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Cell phones']"));
        //1.3 Verify the text “Cell phones”
        verifyElements("Verify the text “Cell phones”", "Cell phones", By.xpath("//h1[normalize-space()='Cell phones']"));
    }

    @Test
//Test name verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully()
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException {
        String email = "jamesbond" + num + "@gmail.com";
        //2.1 Mouse Hover on “Electronics” Tab
        mouseHoverToElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']"));
        //2.2 Mouse Hover on “Cell phones” and click
        clickOnElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Cell phones']"));
        //2.3 Verify the text “Cell phones”
        verifyElements("Verify the text “Cell phones”", "Cell phones", By.xpath("//h1[normalize-space()='Cell phones']"));
        //2.4 Click on List View Tab
        clickOnElement(By.xpath("//a[normalize-space()='List']"));
        //2.5 Click on product name “Nokia Lumia 1020” link
        sleep(2);
        clickOnElement(By.xpath("//h2[@class='product-title']//a[contains(text(),'Nokia Lumia 1020')]"));
        //2.6 Verify the text “Nokia Lumia 1020”
        verifyElements("Verify the text “Nokia Lumia 1020”", "Nokia Lumia 1020", By.xpath("//h1[normalize-space()='Nokia Lumia 1020']"));
        //2.7 Verify the price “$349.00”
        verifyElements("Verify the price “$349.00”", "$349.00", By.xpath("//span[@id='price-value-20']"));
        //2.8 Change quantity to 2
        clearElement(By.xpath("//input[@id='product_enteredQuantity_20']"));
        sendTextToElement(By.id("product_enteredQuantity_20"), "2");
        sleep(2);
        //2.9 Click on “ADD TO CART” tab
        clickOnElement(By.xpath("//button[@id='add-to-cart-button-20']"));
        //2.10 Verify the Message "The product has been added to your shopping cart" on Top green Bar
        verifyElements("Verify the Message \"The product has been added to your shopping cart\" on Top green Bar", "The product has been added to your shopping cart", By.xpath("//p[@class='content']"));
        //close the bar clicking on the cross button.
        clickOnElement(By.xpath("//span[@title='Close']"));
        //2.11 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        mouseHoverToElement(By.xpath("//a[@class='ico-cart']"));
        clickOnElement(By.xpath("//button[normalize-space()='Go to cart']"));
        //2.12 Verify the message "Shopping cart"
        verifyElements("Verify the message \"Shopping cart\"", "Shopping cart", By.xpath("//h1[normalize-space()='Shopping cart']"));
        //2.13 Verify the quantity is 2
        clearElement(By.className("qty-input"));
        sendTextToElement(By.className("qty-input"), "2");
        sleep(2);
        clickOnElement(By.id("updatecart"));        //2.14 Verify the Total $698.00
        sleep(2);
        clearElement(By.className("qty-input"));
        verifyElements("Verify the Total $698.00", "$698.00", By.xpath("//span[@class='value-summary']//strong[contains(text(),'$698.00')]"));
        //2.15 click on checkbox “I agree with the terms of service”
        clickOnElement(By.xpath("//input[@id='termsofservice']"));
        //2.16 Click on “CHECKOUT”
        clickOnElement(By.xpath("//button[@id='checkout']"));
        //2.17 Verify the Text “Welcome, Please Sign In!”
        verifyElements("Verify the Text “Welcome, Please Sign In!”", "Welcome, Please Sign In!", By.xpath("//h1[normalize-space()='Welcome, Please Sign In!']"));
        //2.18 Click on “REGISTER” tab
        sleep(1);
        clickOnElement(By.xpath("//button[normalize-space()='Register']"));
        //2.19 Verify the text “Register”
        verifyElements("Verify the text “Register”", "Register", By.xpath("//h1[normalize-space()='Register']"));
        //2.20 Fill the mandatory fields
        sendTextToElement(By.xpath("//input[@id='FirstName']"), "James");
        sendTextToElement(By.xpath("//input[@id='LastName']"), "Bond");
        sendTextToElement(By.xpath("//input[@id='Email']"), "james+1@gmail.com");
        sendTextToElement(By.xpath("//input[@id='Password']"), "JamesBond123");
        sendTextToElement(By.xpath("//input[@id='ConfirmPassword']"), "JamesBond123");
        //2.21 Click on “REGISTER” Button
        clickOnElement(By.xpath("//button[@id='register-button']"));
        //2.22 Verify the message “Your registration completed”
        verifyElements("Verify the message “Your registration completed”", "Your registration completed", By.xpath("//div[@class='result']"));
        //2.23 Click on “CONTINUE” tab
        clickOnElement(By.xpath("//a[normalize-space()='Continue']"));
        //2.24 Verify the text “Shopping card”
        sleep(2);
        verifyElements("Verify the text “Shopping card”", "Shopping cart", By.xpath("//h1[normalize-space()='Shopping cart']"));
               clickOnElement(By.xpath("//a[normalize-space()='Log in']"));
        sendTextToElement(By.id("Email"), "james+1@gmail.com");
        sendTextToElement(By.id("Password"), "JamesBond123");
        //clickOnElement(By.xpath("//button[normalize-space()='Log in']"));
        //2.25 click on checkbox “I agree with the terms of service”
        clickOnElement(By.id("termsofservice"));
        //2.26 Click on “CHECKOUT”
        clickOnElement(By.id("checkout"));
        //2.27 Fill the Mandatory fields
        sendTextToElement(By.id("BillingNewAddress_FirstName"), "James");
        sendTextToElement(By.id("BillingNewAddress_LastName"), "Bond");
        sendTextToElement(By.id("BillingNewAddress_Email"), "jamesbond@gmail.com");
        selectByVisibleTextFromDropDown(By.id("BillingNewAddress_CountryId"), "Angola");
        sendTextToElement(By.id("BillingNewAddress_City"), "London");
        sendTextToElement(By.id("BillingNewAddress_Address1"), "Oxford Road");
        sendTextToElement(By.id("BillingNewAddress_ZipPostalCode"), "NW1 2ZQ");
        sendTextToElement(By.id("BillingNewAddress_PhoneNumber"), "07432543216");
        //2.28 Click on “CONTINUE”
        clickOnElement(By.xpath("//button[@onclick='Billing.save()']"));
        //2.29 Click on Radio Button “2nd Day Air ($0.00)”
        clickOnCheckBoxAndRadioButton(By.tagName("body"));
        //2.30 Click on “CONTINUE”
        clickOnElement(By.className("button-1 shipping-method-next-step-button"));
        //2.31 Select Radio Button “Credit Card”
        clickOnCheckBoxAndRadioButton(By.xpath("//label[normalize-space()='Credit Card']"));
        clickOnElement(By.xpath("//button[@class='button-1 payment-method-next-step-button']"));
        //2.32 Select “Visa” From Select credit card dropdown
        selectByVisibleTextFromDropDown(By.xpath("//select[@id='CreditCardType']"), "Visa");
        //2.33 Fill all the details
        sendTextToElement(By.id("CardholderName"), "James Bond");
        sendTextToElement(By.xpath("//input[@id='CardNumber']"), "4001919257537193");
        sendTextToElement(By.xpath("//select[@id='ExpireMonth']"), "9");
        sendTextToElement(By.xpath("//select[@id='ExpireYear']"), "2026");
        sendTextToElement(By.xpath("//input[@id='CardCode']"), "123");
        //2.34 Click on “CONTINUE”
        clickOnElement(By.className("button-1 payment-info-next-step-button"));
        //2.35 Verify “Payment Method” is “Credit Card”
        verifyElements("Verify “Payment Method” is “Credit Card”", "Payment Method: Credit Card", By.xpath("//li[@class='payment-method']"));
        //2.36 Verify “Shipping Method” is “2nd Day Air”
        verifyElements("Verify “Shipping Method” is “2nd Day Air”", "Shipping Method: Next Day Air", By.xpath("//span[normalize-space()='Next Day Air']"));
        //2.37 Verify Total is “$698.00”
        verifyElements("Verify Total is “$698.00”", "Total:\t$698.00", By.xpath("//span[@class='value-summary']//strong[contains(text(),'$698.00')]"));
        //2.38 Click on “CONFIRM”
        clickOnElement(By.className("button-1 confirm-order-next-step-button"));
        //2.39 Verify the Text “Thank You”
        verifyElements("Verify the Text “Thank You”", "Thank you", By.xpath("//h1[normalize-space()='Thank you']"));
        //2.40 Verify the message “Your order has been successfully processed!”
        verifyElements("Verify the message “Your order has been successfully processed!”", "Your order has been successfully processed!", By.xpath("//div[@class='section order-completed']//div[@class='title']"));
        //2.41 Click on “CONTINUE”
        clickOnElement(By.xpath("//button[normalize-space()='Continue']"));
        //2.42 Verify the text “Welcome to our store”
        verifyElements("Verify the text “Welcome to our store”", "Welcome to our store", By.xpath("//h2[normalize-space()='Welcome to our store']"));
        //2.43 Click on “Logout” link
        clickOnElement(By.xpath("//a[normalize-space()='Log out']"));
        //2.44 Verify the URL is “https://demo.nopcommerce.com/”
        verifyElements("Verify the URL is “https://demo.nopcommerce.com/”", "https://demo.nopcommerce.com/", "https://demo.nopcommerce.com/");

    }

    @After
    public void close() {
        closeBrowser();
    }
}
