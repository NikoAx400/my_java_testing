package org.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TextBoxPage {

    /* вводим конструктор, инициализация классв */
    public WebDriver driver;
    public TextBoxPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    /* xpath Element */
    @FindBy(xpath = "//*[contains(text(), 'Text Box')]")
    private WebElement textBoxElements;

    /* xpath Full Name */
    @FindBy(xpath = "//*[text() = 'Full Name']//ancestor-or-self::*[contains(@id, 'user') and contains (@id, 'wrapper')]//input")
    private WebElement fullnamefield;

    /* xpath EmailField */
    @FindBy(xpath = "//*[text() = 'Email']//ancestor-or-self::*[contains(@id, 'user') and contains (@id, 'wrapper')]//input")
    private WebElement emailfield;

    /* xpath Current Address */
    @FindBy(xpath = "//*[text() = 'Current Address']//ancestor-or-self::*[contains(@id, 'Address-wrapper')]//textarea")
    private WebElement currentAddressfield;

    /* xpath Permanent Address */
    @FindBy(xpath = "//*[text() = 'Permanent Address']//ancestor-or-self::*[contains(@id, 'Address-wrapper')]//textarea")
    private WebElement permanentAddressfield;



    /* метод клик */
    public void clickButton() {
        textBoxElements.click();
    }

    /* метод ввода в поле */
    public void inputFieldNameText(String fn_text) {
        fullnamefield.sendKeys(fn_text);
    }
    public void inputFieldEmailText(String e_text) {
        emailfield.sendKeys(e_text);
    }

    public void AreaFieldCurrentAdress(String ca_text) {
        currentAddressfield.sendKeys(ca_text);
    }

    public void AreaFieldAPermamentAdress(String pa_text) {
        permanentAddressfield.sendKeys(pa_text);
    }

    public String fullName() {
       String f_name = fullnamefield.getAttribute("value");
       String e_field = emailfield.getAttribute("value");
       System.out.println(f_name);
       return f_name;
    }

}
