package org.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RadioButtonPage {

    /* вводим конструктор, инициализация классв */
    public WebDriver driver;
    public RadioButtonPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    /* xpath Element */
    @FindBy(xpath = "//*[contains(text(), 'Radio Button')]")
    private WebElement buttonElements;

    /* xpath yes */
    @FindBy(xpath = "//*[contains(text(), 'Yes')]")
    private WebElement yesButton;

    /* xpath Impressive */
    @FindBy(xpath = "//*[contains(text(), 'Impressive')]")
    private WebElement impressiveButton;

    /* метод клик */
     public void clickElem() {
        buttonElements.click();
        }
     public void clickYes() {
        yesButton.click();
        }
     public void clickImpressive() {
        impressiveButton.click();
        }

}
