package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class descargaAcreditaciones {
    WebDriver driver;

    public descargaAcreditaciones(WebDriver driver) {
        this.driver = driver;
    }

    By userLogin = By.xpath("//*[@id=\"user\"]");
    By userPassword = By.xpath("//*[@id=\"mat-input-1\"]");
    By captcha = By.xpath("//*[@id=\"captchaAnswer\"]");
    By btnIngresar = By.xpath("/html/body/app-root/app-view-login/div/div/div/section/div[3]/form/div[2]/input");
    By btnSelecAuditor = By.xpath("/html/body/app-root/app-view-perfil/div[1]/div/div/div[2]/table/tbody/tr[1]/td[3]/button");
    By busquedaIpress = By.xpath("//*[@id=\"mat-input-3\"]");
    By btnBusquedaIpress = By.xpath("//*[@id=\"dashboard\"]/div[2]/app-view-ipress-iafas/div/div/section/div/form/mat-form-field/div/div[1]/div[2]/button");
    By selectIpress = By.xpath("//*[@id=\"dashboard\"]/div[2]/app-view-ipress-iafas/div/div/section/div/div[1]/div[2]/table/tbody/tr");
    By listConsultReport = By.xpath("//*[@id='sidebar']/div[2]/ul/li[3]/a");
    By pantallaDescargaAcred = By.xpath("/html/body/app-root/app-theme/div/app-sidebar/nav/div[2]/ul/li[3]/ul/li[2]/a");
    By selectIAFAS = By.xpath("/html/body/app-root/app-theme/div/div/div[2]/app-view-descarga-acreditaciones/div/div/section/div[2]/form/div/div[2]/div/div[1]/app-select-iafas/form/mat-form-field/div/div[1]");
    By escribirIafas = By.xpath("//*[@id=\"iasfasSearch\"]");
    By selectListSis = By.xpath("//*[@id=\"mat-option-65\"]/span");
    By btnBuscarConsultaRegister = By.xpath("//*[@id=\"dashboard\"]/div[2]/app-view-descarga-acreditaciones/div/div/section/div[2]/form/div/div[2]/div/div[3]/div[1]/div[2]/button");
    By selectMasiveDescargaExcel = By.xpath("/html/body/app-root/app-theme/div/div/div[2]/app-view-descarga-acreditaciones/div/div/section/div[2]/div[2]/table/thead/tr/th[1]/mat-checkbox/label/span[1]");
    By descargaBTNExcel = By.xpath("//*[@id=\"dashboard\"]/div[2]/app-view-descarga-acreditaciones/div/div/section/div[3]/button");

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
    public void setBusquedaIpress(String texto) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement txtlabelIpress = wait.until(ExpectedConditions.elementToBeClickable(busquedaIpress));
        txtlabelIpress.sendKeys(texto);
    }
    public void setBtnBusquedaIpress(){driver.findElement(btnBusquedaIpress).click();}
    public void setSelectIpress(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        Actions dobleClick =  new Actions(driver);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(selectIpress));
        dobleClick.doubleClick(element).perform();
    }
    public void setListConsultReport(){
        WebDriverWait wait = new WebDriverWait(driver, 20);
        WebElement listConsultaReport = wait.until(ExpectedConditions.elementToBeClickable(listConsultReport));
        listConsultaReport.click();
    }
    public void setPantallaDescargaAcred(){driver.findElement(pantallaDescargaAcred).click();}

    public void setSelectIAFAS() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement txtLabelIafas = wait.until(ExpectedConditions.elementToBeClickable(selectIAFAS));
        txtLabelIafas.click();
    }
    public void setEscribirIafas(String texto){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement escribeIAFAS = wait.until(ExpectedConditions.elementToBeClickable(escribirIafas));
        escribeIAFAS.sendKeys(texto);
    }
    public void setSelectListSis(){
        driver.findElement(selectListSis).click();
    }
    public void setBtnBuscarConsultaRegister(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement selectbtn = wait.until(ExpectedConditions.elementToBeClickable(btnBuscarConsultaRegister));
        selectbtn.click();
    }

    public void setSelectMasiveDescargaExcel(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement selectbtn = wait.until(ExpectedConditions.elementToBeClickable(selectMasiveDescargaExcel));
        selectbtn.click();
    }

    public void setDescargaBTNExcel(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement btnExcel = wait.until(ExpectedConditions.elementToBeClickable(descargaBTNExcel));
        // Asegura que el botón esté visible
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", btnExcel);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", btnExcel);



    }
}
