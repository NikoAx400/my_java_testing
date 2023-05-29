package org.example;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class TestDemoQaPracticeForm {

    /* объявление статистических переменных с классами, которые созданы radiobuttonpage textboxpage*/
    public static PracticeFormPage FormPage;
    public static WebDriver driver;



    @BeforeClass // аннотация, указывает что метод выполняется один раз
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\OneDrive\\Рабочий стол\\project_Ax400\\java_selen\\chromedriver.exe");
        driver = new ChromeDriver();

        /* объявление экземпляры с классами, которые созданы radiobuttonpage textboxpage*/
        FormPage = new PracticeFormPage(driver);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://demoqa.com/automation-practice-form");

    }

    @Test
    public void PracticeForm() {
        FormPage.inputfirstName("Michail");
        FormPage.inputLastName("Dronogov");
        FormPage.inputEmail("Dr@mail.ru");
        FormPage.inputMobile("8906798058");
        FormPage.inputdateOfBirth("10 Feb 1985");
        FormPage.inputsubjects("physics, programming");
        FormPage.inputcurrentAddress("Moscow, street Dragunova, 6");
        FormPage.clickGenderMale();
        FormPage.clickHobbiesReading();

    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
    }

}
