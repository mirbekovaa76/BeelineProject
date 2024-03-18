package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    @FindBy(xpath = "//button[@class='login-button']")
    public WebElement loginBtn;

    @FindBy(xpath = "//input[@id='phone-input']")
    public WebElement mobileNumberInput;

    @FindBy(xpath = "//button[@class='mainsite-button-form']")
    public WebElement getCodeBtn;

    @FindBy(xpath = "//input[@id='otp-input']")
    public WebElement otpInput;

    public LoginPage doLogin() throws InterruptedException {
        webElementHelper
                .click(loginBtn)
                .sendKeys(mobileNumberInput, "773386909")
                .click(getCodeBtn)
                .sendKeys(otpInput, "1000")
                .waitForElementToBeDisplayed(otpInput);
        Thread.sleep(10000);

        return this;
    }
}
