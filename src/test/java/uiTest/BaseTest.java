package uiTest;

import driver.Driver;
import helper.BrowserManager;
import helper.WebElementHelper;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import static pages.Beeline_PAGES.BEELINE_PAGE;

public class BaseTest {
    protected WebDriver driver;
    protected WebElementHelper webElementHelper;
    protected BrowserManager browserManager;
    protected BrowserManager.WindowHelper windowHelper;
    protected BrowserManager.FrameHelper frameHelper;
    public BeelineInitPages beelineInitPages;

    @BeforeClass(alwaysRun = true)
    public void setUp() throws InterruptedException {
        driver = Driver.getDriver();
        webElementHelper = new WebElementHelper();
        browserManager = new BrowserManager(driver);
        windowHelper = new BrowserManager.WindowHelper(driver);
        frameHelper = new BrowserManager.FrameHelper(driver);
        beelineInitPages = new BeelineInitPages();
        beelineInitPages.initPages();
        driver.get(BEELINE_PAGE.getURL());
//        beelineInitPages.loginPage.doLogin();
    }

    @AfterClass(alwaysRun = true)
    public void tearDown(){
        Driver.closeDriver();
    }
}
