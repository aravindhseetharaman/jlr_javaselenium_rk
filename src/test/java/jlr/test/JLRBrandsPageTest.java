package jlr.test;

import jlr.base.BaseTest;
import jlr.base.page.JLRBrandsPage;
import jlr.base.page.JLRHomePage;
import jlr.reports.ExtentTestManager;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class JLRBrandsPageTest extends BaseTest {
    JLRHomePage home;
    JLRBrandsPage brands;
    WebDriverWait wait;
    @Test(priority = 5)
    public void displayBrandsMenu_check_RangeRover_Jaguar() {
        home = new JLRHomePage(driver);
        ExtentTestManager.getTest().info("Verification of RangeRover_Jaguar_Menu_Visbiltiy");
        home.clickAcceptAllCookies();
        home.clickBrands();
        brands = new JLRBrandsPage(driver);
        brands.clickourBrands();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Assert.assertTrue(brands.isRangeRoverVisible());
        Assert.assertTrue(brands.isJaguarVisible());

    }

    @Test(priority = 4)
    public void displayBrandsMenu_check_Defender_Discovery() {
        home = new JLRHomePage(driver);
        ExtentTestManager.getTest().info("Verification of Defender_Discovery_Menu_Visbiltiy");

        home.clickAcceptAllCookies();
        home.clickBrands();
        brands = new JLRBrandsPage(driver);
        brands.clickourBrands();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
       Assert.assertTrue(brands.isDefenderVisible());
        Assert.assertTrue(brands.isdiscoveryVisible());

    }
}
