package jlr.base.page;


import jlr.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.Objects;

public class JLRBrandsPage extends BasePage {

    @FindBy(xpath = "//a[@class='nav-2024__dropdown-item--first'][normalize-space()='Our Brands']")
    WebElement ourBrandsButtonMenu;

//xpath for Rangerover
    @FindBy(xpath = "//a[@class='nav-2024__dropdown-item--first' and normalize-space()='Range Rover']")
    WebElement rangeRoverMenu;


    @FindBy(xpath = "//a[@class='nav-2024__dropdown-item--first' and normalize-space()='Discovery']")
    WebElement discoveryMenu;

    @FindBy(xpath = "//a[@class='nav-2024__dropdown-item--first' and normalize-space()='Jaguar']")
    WebElement jaguarMenu;

    @FindBy(xpath = "//a[@class='nav-2024__dropdown-item--first' and normalize-space()='Defender']")
    WebElement defenderMenu;


    public boolean isRangeRoverVisible() {return rangeRoverMenu.isEnabled();}
    public boolean isdiscoveryVisible() {return discoveryMenu.isEnabled(); }
    public boolean isJaguarVisible() { return jaguarMenu.isEnabled(); }
    public boolean isDefenderVisible() { return defenderMenu.isEnabled(); }




    public void clickourBrands() {
        click(ourBrandsButtonMenu);
    }

    public JLRBrandsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public boolean isOnBrandsPage() {
        return Objects.requireNonNull(driver.getCurrentUrl()).contains("jlr");
    }
}
