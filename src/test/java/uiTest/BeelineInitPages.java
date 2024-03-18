package uiTest;

import org.testng.annotations.BeforeClass;
import pages.LoginPage;
import pages.tariffs.TariffsPage;

public class BeelineInitPages {
    public LoginPage loginPage;
    public TariffsPage tariffsPage;

    @BeforeClass(alwaysRun = true)
    public void initPages(){
        loginPage = new LoginPage();
        tariffsPage = new TariffsPage();
    }
}
