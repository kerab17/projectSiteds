package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class acercaDelSITEDSPage {
    WebDriver driver;

    public acercaDelSITEDSPage(WebDriver driver) {
        this.driver = driver;
    }

    By userLogin = By.xpath("//*[@id=\"user\"]");
    By userPassword = By.xpath("//*[@id=\"mat-input-1\"]");
    By captcha = By.xpath("//*[@id=\"captchaAnswer\"]");
    By btnIngresar = By.xpath("/html/body/app-root/app-view-login/div/div/div/section/div[3]/form/div[2]/input");
    By btnSelecAuditor = By.xpath("/html/body/app-root/app-view-perfil/div[1]/div/div/div[2]/table/tbody/tr[1]/td[3]/button");
    By listHerramientas = By.xpath("//*[@id=\"sidebar\"]/div[2]/ul/li[4]");
    By pantallaAcercaDE = By.xpath("//*[@id=\"2373\"]/li[2]");


    public void ingresoUser(String texto){
        driver.findElement(userLogin).sendKeys(texto);
    }
    public void ingresoPassword(String texto){
        driver.findElement(userPassword).sendKeys(texto);
    }
    public void ingresoCaptcha(String texto){driver.findElement(captcha).sendKeys(texto);}
    public void setBtnIngresar(){driver.findElement(btnIngresar).click();}
    public void setBtnSelecAuditor() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement btn = wait.until(ExpectedConditions.elementToBeClickable(btnSelecAuditor));
        btn.click();
    }
    public void setListHerramientas(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement btnListHerramientas = wait.until(ExpectedConditions.elementToBeClickable(listHerramientas));
        btnListHerramientas.click();
    }
    public void setPantallaAcercaDE(){
        // Hacer clic en el botón que abre la nueva pestaña con el PDF
        driver.findElement(pantallaAcercaDE).click();


    }
}
