package org.example;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PracticeFormPage {

    /* вводим конструктор, инициализация классв */
    public WebDriver driver;
    public PracticeFormPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    /* xpath PracticeFormElements */
    @FindBy(xpath = "//*[contains(text(), 'Practice Form')]")
    private WebElement practiceFormElements;

    @FindBy(xpath = "//*[text() = 'Name']//ancestor-or-self::*[contains(@id, 'userName-wrapper')]//input[contains(@id, 'firstName')]")
    private WebElement firstName;

    /* xpath lastName */
    @FindBy(xpath = "//*[text() = 'Name']//ancestor-or-self::*[contains(@id, 'userName-wrapper')]//input[contains(@id, 'lastName')]")
    private WebElement lastName;

    /* xpath email */
    @FindBy(xpath = "//*[text() = 'Email']//ancestor-or-self::*[contains(@id, 'userEmail-wrapper')]//input[contains(@id, 'userEmail')]")
    private WebElement email;

    /* xpath mobile */
    @FindBy(xpath = "//*[text() = \"Mobile\"]//ancestor-or-self::*[contains(@id, 'userNumber-wrapper')]//input[contains(@id, 'userNumber')]")
    private WebElement mobile;

    /* xpath dateOfBirth*/
    @FindBy(xpath = "//*[text() = 'Date of Birth']//ancestor-or-self::*[contains(@id, 'dateOfBirth-wrapper')]//input[contains(@id, 'dateOfBirthInput')]")
    private WebElement dateOfBirth;

    /* xpath currentAddress */
    @FindBy(xpath = "//*[text() = 'Current Address']//ancestor-or-self::*[contains(@id, 'currentAddress-wrapper')]//textarea[contains(@id, 'currentAddress')]")
    private WebElement currentAddress;

    /* xpath subjects */
    @FindBy(xpath = "//*[text() = 'Subjects']//ancestor-or-self::*[contains(@id, 'subjectsWrapper')]//input[contains(@id, 'subjectsInput')]")
    private WebElement subjects;

    /* xpath checkbox male */
    @FindBy(xpath = "//*[text() = 'Gender']//ancestor-or-self::*[contains(@id, 'genterWrapper')]//label[(text() =  \"Male\")]")
    private WebElement male;

    /* xpath checkbox female */
    @FindBy(xpath = "//*[text() = 'Gender']//ancestor-or-self::*[contains(@id, 'genterWrapper')]//label[(text() =  \"Female\")]")
    private WebElement female;

    /* xpath checkbox other */
    @FindBy(xpath = "//*[text() = 'Gender']//ancestor-or-self::*[contains(@id, 'genterWrapper')]//label[(text() =  \"Other\")]")
    private WebElement other;

    /* xpath checkbox Sports */
    @FindBy(xpath = "//*[text() = 'Hobbies']//ancestor-or-self::*[contains(@id, 'hobbiesWrapper')]//label[(text() =  \"Sports\")]")
    private WebElement sports;

    /* xpath checkbox Reading */
    @FindBy(xpath = "//*[text() = 'Hobbies']//ancestor-or-self::*[contains(@id, 'hobbiesWrapper')]//label[(text() =  \"Reading\")]")
    private WebElement reading;

    /* xpath checkbox Music */
    @FindBy(xpath = "//*[text() = 'Hobbies']//ancestor-or-self::*[contains(@id, 'hobbiesWrapper')]//label[(text() =  \"Music\")]")
    private WebElement music;



    /* метод клик */
    public void clickpracticeForm() {
        practiceFormElements.click();
    }

    public void clickGenderMale() {
        male.click();
    }
    public void clickGenderFemale() {
        female.click();
    }
    public void clickGenderOther() {
        other.click();
    }

    public void clickHobbiesSports() {
        sports.click();
    }
    public void clickHobbiesReading() {
        reading.click();
    }
    public void clickHobbiesMusic() {
        music.click();
    }


    /* метод ввода в поле */
    public void inputfirstName(String name_text) {
        firstName.clear();
        firstName.sendKeys(name_text);
        String value_name = firstName.getAttribute("value");
        Assert.assertEquals(name_text, value_name);
    }
    public void inputLastName(String lastName_text) {
        lastName.clear();
        lastName.sendKeys(lastName_text);
        String value_lastName = lastName.getAttribute("value");
        Assert.assertEquals(lastName_text, value_lastName);
    }
    public void inputEmail(String email_text) {
        email.clear();
        email.sendKeys(email_text);
        String value_email = email.getAttribute("value");
        Assert.assertEquals(email_text, value_email);
    }
    public void inputMobile(String mobile_text) {
        mobile.clear();
        mobile.sendKeys(mobile_text);
        String value_mobile = mobile.getAttribute("value");
        Assert.assertEquals(mobile_text, value_mobile);
    }
    public void inputdateOfBirth(String dateOfBirth_text) {
        dateOfBirth.clear();
        dateOfBirth.sendKeys(dateOfBirth_text);
        String value_dateOfBirth = dateOfBirth.getAttribute("value");
        Assert.assertEquals(dateOfBirth_text, value_dateOfBirth);
    }
    public void inputsubjects(String subjects_text) {
        subjects.clear();
        subjects.sendKeys(subjects_text);
        String value_subjects = subjects.getAttribute("value");
        System.out.println(value_subjects);
       /* Assert.assertEquals(subjects_text, value_subjects);*/
    }
    public void inputcurrentAddress(String currentAddress_text) {
        currentAddress.clear();
        currentAddress.sendKeys(currentAddress_text);
        String value_currentAddress = currentAddress.getAttribute("value");
        Assert.assertEquals(currentAddress_text, value_currentAddress);
    }

}
