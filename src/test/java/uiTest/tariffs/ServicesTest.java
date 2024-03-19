package uiTest.tariffs;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.tariffs.ServicesPage;
import uiTest.BaseTest;

public class ServicesTest extends BaseTest {

    ServicesPage servicesPage = new ServicesPage();
    @Test(description = "click all services in All services section")
    public void services() throws InterruptedException {
        servicesPage
                .clickAllServices()
                .clickBeelineBonus()
                .clickForInternet()
                .clickRoaming()
                .clickEntertainment()
                .clickInternetSharing();
    }
}
