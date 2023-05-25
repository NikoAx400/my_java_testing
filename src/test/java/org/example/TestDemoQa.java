package org.example;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class TestDemoQa {

    /* объявление статистических переменных с классами, которые созданы radiobuttonpage textboxpage*/
    public static RadioButtonPage RadioPage;
    public static TextBoxPage TextPage;
    public static WebDriver driver;



    @BeforeClass // аннотация, указывает что метод выполняется один раз
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\OneDrive\\Рабочий стол\\project_Ax400\\java_selen\\chromedriver.exe");
        driver = new ChromeDriver();

        /* объявление экземпляры с классами, которые созданы radiobuttonpage textboxpage*/
        RadioPage = new RadioButtonPage(driver);
        TextPage = new TextBoxPage(driver);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://demoqa.com/elements");

    }

    @Test
    public void RadioButtonPage() {
        RadioPage.clickElem();
        RadioPage.clickYes();
        RadioPage.clickImpressive();
    }

    @Test
    public void TextBoxPage() {
        TextPage.clickButton();
        TextPage.inputFieldNameText("Grachev Alecsey Ivanovich");
        TextPage.inputFieldEmailText("DM@mail.ru");
        TextPage.AreaFieldCurrentAdress("г. Москва, ул. 5");
        TextPage.AreaFieldAPermamentAdress("г. Москва, ул. 5");
        String fname = TextPage.fullName();
        Assert.assertEquals("Grachev Alecsey Ivanovich", fname);
    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
    }

}
