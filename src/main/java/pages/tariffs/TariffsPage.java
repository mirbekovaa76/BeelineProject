package pages.tariffs;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class TariffsPage extends BasePage {
    @FindBy(xpath = "(//span[@class='label-nav notoSa main__menu-item'])[12]")
    public WebElement tariffsBtn;

    @FindBy(xpath = "//button[@class='accordion-tariff-button mainsite-xl-title not-collapsed']")
    public WebElement monthTariff;

    @FindBy(xpath = "//button[@aria-controls='weekly']")
    public WebElement weekTariff;

    @FindBy(xpath = "//button[@aria-controls='smart']")
    public WebElement smartDevicesTariff;

    @FindBy(xpath = "//button[@aria-controls='other']")
    public WebElement otherTariffs;

    @FindBy(xpath = "//a[@class='archiveTariffLink mainsite-lg-title']")
    public WebElement archiveTariff;

    public TariffsPage clickTariffs(){
        webElementHelper.waitForButtonToBeClickAble(tariffsBtn).click(tariffsBtn);
        return this;
    }

    public TariffsPage expandBtns() {
        webElementHelper
                .click(monthTariff)
                .click(weekTariff)
                .click(smartDevicesTariff)
                .click(otherTariffs)
                .click(archiveTariff);
        return this;
    }
}
