package jlr.test;

import jlr.base.BaseTest;
import jlr.base.page.JLRHomePage;
import jlr.base.page.JLRBrandsPage;
import jlr.reports.ExtentTestManager;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JLRHomePageTest extends BaseTest {
    JLRHomePage home;
    JLRBrandsPage brands;
    @Test(priority = 1)
    public void verifyPageTitle(){
        ExtentTestManager.getTest().info("Verification of Webpage Title");
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals(title,"JLR Corporate Website");

    }

    @Test(priority = 2)
    public void verifyNavigationLinks_visiblity() {
        home = new JLRHomePage(driver);
        ExtentTestManager.getTest().info("Verification of Menus");
        home.clickAcceptAllCookies();


        Assert.assertTrue(home.isCompanyVisible());
        Assert.assertTrue(home.isBrandsVisible());
        Assert.assertTrue(home.isInvestorsVisible());

    }

    @Test(priority = 3)
    public void navigateToBrandsPage() {
        home = new JLRHomePage(driver);
        ExtentTestManager.getTest().info("Verification of Navigation to Brands Menu");
        home.clickAcceptAllCookies();
        home.clickBrands();
        brands = new JLRBrandsPage(driver);
        Assert.assertTrue(brands.isOnBrandsPage());

    }
}
