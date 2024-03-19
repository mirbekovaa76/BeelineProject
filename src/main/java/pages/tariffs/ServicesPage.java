package pages.tariffs;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.security.Key;

public class ServicesPage extends BasePage {

    @FindBy(xpath = "(//button[@id='ru'])[1]")
    public WebElement russianLangBtn;
    @FindBy(xpath = "//div[@class='top-menu__no-link']")
    public WebElement homeServicesBtn;

    // for All Services section
    @FindBy(xpath = "//div[@class='top-menu__no-link']/following-sibling::div[@class='top-menu-child']/a[@class='hotlink__item'][1]")
    public WebElement allServicesBtn;
    @FindBy(xpath = "//a[@class='services-panel-link catalog-component-menu activeItem']")
    public WebElement internetBtn;
    @FindBy(xpath = "(//div[@class='service-card-item-title'])[1]")
    public WebElement tikTokWhatsAppInternetService;
    @FindBy(xpath = "(//p[@class='accordion-main__header-title'])[1]")
    public WebElement aboutServiceInternetFAG;
    @FindBy(xpath = "(//p[@class='accordion-main__header-title'])[2]")
    public WebElement controlServiceInternetFAG;
    @FindBy(xpath = "(//p[@class='accordion-main__header-title'])[3]")
    public WebElement additionalInfoInternetFAG;
    @FindBy(xpath = "(//a[@class='services-panel-link catalog-component-menu'])[1]")
    public WebElement callsBtn;
    @FindBy(xpath = "(//h6[@class='service-card-item service-card-title mb-2'])[1]")
    public WebElement packageCall;
    @FindBy(xpath = "(//p[@class='accordion-main__header-title'])[1]")
    public WebElement aboutServiceCallFAG;
    @FindBy(xpath = "(//p[@class='accordion-main__header-title'])[2]")
    public WebElement controlServiceCallFAG;
    @FindBy(xpath = "(//a[@class='services-panel-link catalog-component-menu'])[2]")
    public WebElement entertainmentBtn;
    @FindBy(xpath = "(//a[@class='services-panel-link catalog-component-menu'])[3]")
    public WebElement internationalCallsBtn;
    @FindBy(xpath = "(//a[@class='services-panel-link catalog-component-menu'])[4]")
    public WebElement roamingBtn;
    @FindBy(xpath = "(//a[@class='services-panel-link catalog-component-menu'])[5]")
    public WebElement othersBtn;


    // for Beeline Bonus section
    @FindBy(xpath = "(//a[@class='hotlink__item'])[2]")
    public WebElement beelineBonusBtn;

    @FindBy(xpath = "(//p[@class='accordion-main__header-title'])[1]")
    public WebElement aboutProgramFAG;

    @FindBy(xpath = "(//p[@class='accordion-main__header-title'])[2]")
    public WebElement termsOfAccumulationFAG;

    @FindBy(xpath = "(//p[@class='accordion-main__header-title'])[3]")
    public WebElement termsOfRedemptionFAG;

    @FindBy(xpath = "(//p[@class='accordion-main__header-title'])[4]")
    public WebElement commandsManagementFAG;

    @FindBy(xpath = "(//p[@class='accordion-main__header-title'])[5]")
    public WebElement additionalTermsFAG;


    // for Internet section
    @FindBy(xpath = "(//a[@class='hotlink__item'])[3]")
    public WebElement forInternetBtn;

    @FindBy(xpath = "(//h6[@class='service-card-item service-card-title mb-2'])[1]")
    public WebElement packageInternetBtn;

    // for Roaming and International calls section:
    @FindBy(xpath = "(//a[@class='hotlink__item'])[4]")
    public WebElement roamingAndInternationalCallsBtn;

    @FindBy(xpath = "//input[@type='search']")
    public WebElement searchCountry;

    @FindBy(xpath = "//button[@class='roaming__btn']")
    public WebElement internationalCallsOnRoamingBtn;

    // for Entertainment section
    @FindBy(xpath = "(//a[@class='hotlink__item'])[5]")
    public WebElement entertainmentSectionBtn;
    @FindBy(xpath = "(//a[@class='services-title vas_link'])[1]")
    public WebElement entertainmentPackage;

    // for InternetSharing section
    @FindBy(xpath = "(//a[@class='hotlink__item'])[6]")
    public WebElement internetSharingBtn;




    public ServicesPage clickAllServices(){
        webElementHelper
                .click(russianLangBtn)
                .click(homeServicesBtn)
                .click(allServicesBtn)
                .click(internetBtn)
                .click(tikTokWhatsAppInternetService)
                .click(aboutServiceInternetFAG)
                .jsClick(controlServiceInternetFAG)
                .jsClick(additionalInfoInternetFAG);
        browserManager.goBack();
        webElementHelper
                .click(callsBtn)
                .waitForButtonToBeClickAble(packageCall).click(packageCall)
                .click(aboutServiceCallFAG)
                .click(controlServiceCallFAG);
        browserManager.goBack();
        webElementHelper
                .click(entertainmentBtn)
                .click(internationalCallsBtn)
                .click(roamingBtn)
                .click(othersBtn);
        return this;
    }

    public ServicesPage clickBeelineBonus(){
        webElementHelper
                .click(homeServicesBtn)
                .click(beelineBonusBtn)
                .click(aboutProgramFAG);
//                .click(termsOfAccumulationFAG)
//                .waitForButtonToBeClickAble(termsOfRedemptionFAG).click(termsOfRedemptionFAG)
//                .click(commandsManagementFAG)
//                .click(additionalTermsFAG);
        return this;
    }

    public ServicesPage clickForInternet(){
        webElementHelper
                .click(homeServicesBtn)
                .click(forInternetBtn)
                .click(packageInternetBtn);
        return this;

    }

    public ServicesPage clickRoaming() throws InterruptedException {
        webElementHelper
                .click(homeServicesBtn)
                .click(roamingAndInternationalCallsBtn)
                .click(searchCountry)
                .sendKeysWithEnter(searchCountry, "Каз");
        searchCountry.sendKeys(Keys.ENTER);
        Thread.sleep(5000);
        webElementHelper
                .click(internationalCallsOnRoamingBtn);
        return this;
    }

    public ServicesPage clickEntertainment(){
        webElementHelper
                .click(homeServicesBtn)
                .click(entertainmentSectionBtn)
                .click(entertainmentPackage);
        return this;
    }

    public ServicesPage clickInternetSharing(){
        webElementHelper
                .click(homeServicesBtn)
                .click(internetSharingBtn);
        browserManager.goBack();
        return this;
    }
}
