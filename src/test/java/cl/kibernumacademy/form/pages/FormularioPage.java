package cl.kibernumacademy.form.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

public class FormularioPage {
    private WebDriver driver;

    // Localizadores
    private By firstName = By.id("firstName");
    private By lastName = By.id("lastName");
    private By userEmail = By.id("userEmail");

    private By genderMale = By.id("genderMale");
    private By genderFemale = By.id("genderFemale");
    private By genderOther = By.id("genderOther");

    private By userNumber = By.id("userNumber");

    private By hobbyReading = By.id("hobbyReading");
    private By hobbyMusic = By.id("hobbyMusic");
    private By hobbySports = By.id("hobbySports");

    private By currentAddress = By.id("currentAddress");
    private By stateSelect = By.id("stateSelect");
    private By citySelect = By.id("citySelect");
    private By submitButton = By.id("submitBtn"); // Verifica este ID en el HTML

    private By modalBodyContent = By.id("confirmationModal");

    // Constructor
    public FormularioPage(WebDriver driver) {
        this.driver = driver;
    }

    // Métodos de interacción
    public void setFirstName(String name) {
        driver.findElement(firstName).clear();
        driver.findElement(firstName).sendKeys(name);
    }

    public void setLastName(String last) {
        driver.findElement(lastName).clear();
        driver.findElement(lastName).sendKeys(last);
    }

    public void setUserEmail(String email) {
        driver.findElement(userEmail).clear();
        driver.findElement(userEmail).sendKeys(email);
    }

    public void setAddress(String address) {
        driver.findElement(currentAddress).clear();
        driver.findElement(currentAddress).sendKeys(address);
    }

    public void setMobile(String mobile) {
        driver.findElement(userNumber).clear();
        driver.findElement(userNumber).sendKeys(mobile);
    }

    public void selectGender(String gender) {
        switch (gender.toLowerCase()) { // dejar todo en minuscula
            case "masculino":
                driver.findElement(genderMale).click();// buscar el radio button localiziador es genderMale
                break;
            case "femenino":
                driver.findElement(genderFemale).click();
                break;
            case "otro  ":
                driver.findElement(genderOther).click();
                break;
            default:
                System.out.println("Genero no válido");
        }
    }

    public void selectHobby(String hobby) {
        switch (hobby.toLowerCase()) {
            case "lectura":
                driver.findElement(hobbyReading).click();
                break;
            case "música":
                driver.findElement(hobbyMusic).click();
                break;
            case "deportes":
                driver.findElement(hobbySports).click();
                break;
        }
    }

    public void selectState(String stateName) {
        new Select(driver.findElement(stateSelect)).selectByVisibleText(stateName);
    }

    public void selectCity(String cityName) {
        new Select(driver.findElement(citySelect)).selectByVisibleText(cityName);
    }

    public void clickSubmit() {
        driver.findElement(submitButton).click();
    }

    public String getModalText() {
        return driver.findElement(modalBodyContent).getText();
    }
}
