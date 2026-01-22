package jlr.base.page;


import jlr.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JLRHomePage extends BasePage {

    @FindBy(xpath = "//button[@id='onetrust-accept-btn-handler']")
    WebElement cookiesAcceptall;


    @FindBy(xpath = "//div[contains(@class,'nav-2024__item') and normalize-space()='Company']")
    WebElement companyButtonMenu;

    @FindBy(xpath = "//div[contains(@class,'nav-2024__item')][normalize-space()='Brands']")
    WebElement brandButtonMenu;

    @FindBy(xpath = "//div[contains(@class,'nav-2024__item')][normalize-space()='Investors']")
    WebElement investorsButtonmenu;



    public JLRHomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public boolean isCompanyVisible() { return companyButtonMenu.isDisplayed(); }
    public boolean isBrandsVisible() { return brandButtonMenu.isDisplayed(); }
    public boolean isInvestorsVisible() { return investorsButtonmenu.isDisplayed(); }

    public void clickBrands() {
        click(brandButtonMenu);
    }
    public void clickAcceptAllCookies() {
        click(cookiesAcceptall);
    }
}
