package uiTest.tariffs;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.tariffs.TariffsPage;
import uiTest.BaseTest;

@Listeners
public class TariffsTest extends BaseTest {
    TariffsPage tariffsPage = new TariffsPage();
    @Test
    public void tariffs() {
        tariffsPage
                .clickTariffs()
                .expandBtns();
    }
}
