package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class acreditarAsegurado {
    WebDriver driver;


    public acreditarAsegurado(WebDriver driver) {
        this.driver = driver;
    }



    //LOGIN

    By userLogin = By.xpath("//*[@id=\"user\"]");
    By userPassword = By.xpath("//*[@id=\"mat-input-1\"]");
    By captcha = By.xpath("//*[@id=\"captchaAnswer\"]");
    By btnIngresar = By.xpath("/html/body/app-root/app-view-login/div/div/div/section/div[3]/form/div[2]/input");
    By btnSelecAuditor = By.xpath("/html/body/app-root/app-view-perfil/div[1]/div/div/div[2]/table/tbody/tr[1]/td[3]/button");
    By busquedaIpress = By.xpath("//*[@id=\"mat-input-3\"]");
    By btnBusquedaIpress = By.xpath("//*[@id=\"dashboard\"]/div[2]/app-view-ipress-iafas/div/div/section/div/form/mat-form-field/div/div[1]/div[2]/button");
    By selectIpress = By.xpath("//*[@id=\"dashboard\"]/div[2]/app-view-ipress-iafas/div/div/section/div/div[1]/div[2]/table/tbody/tr");
    By ingresoIAFAClick = By.xpath("/html/body/app-root/app-theme/div/div/div[2]/app-view-busq-asegurado/div/div/section/div[1]/form/div[1]/div[1]/app-select-iafas/form/mat-form-field/div/div[1]");
    By ingresoIAFA = By.xpath("//*[@id=\"iasfasSearch\"]");
    By selectIAFA = By.xpath("//*[@id=\"mat-option-34\"]");
    By ingresoAsegurado = By.xpath("//*[@id=\"dniApellidoPaterno\"]");
    By btnBuscarAsegurado = By.xpath("//*[@id=\"dashboard\"]/div[2]/app-view-busq-asegurado/div/div/section/div[1]/form/div[2]/div[4]/div/button");
    By selectAseguradodoble = By.xpath("/html/body/app-root/app-theme/div/div/div[2]/app-view-busq-asegurado/div/div/section/div[1]/div[1]/div/div[2]/table/tbody/tr");
    By autorizarBtn = By.xpath("//*[@id=\"dashboard\"]/div[2]/app-view-datos-asegurado/div/div[2]/div/section/div[2]/div[2]/div[2]/button");
    By imprimirAutorizacion = By.xpath("/html/body/div[4]/div/div[6]/button[1]");






    //*[@id="captchaAnswer"]
    //By btnLogin = By.xpath("");


    //LOGIN
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
    public void setIngresoIAFAClick(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement dpListIafas = wait.until(ExpectedConditions.elementToBeClickable(ingresoIAFAClick));
        dpListIafas.click();
    }
    public void setIngresoIAFA(String texto){
        driver.findElement(ingresoIAFA).sendKeys(texto);
    }
    public void setSelectIAFA(){driver.findElement(selectIAFA).click();}
    public void setIngresoAsegurado(String texto){driver.findElement(ingresoAsegurado).sendKeys(texto);}
    public void setBtnBuscarAsegurado(){driver.findElement(btnBuscarAsegurado).click();}
    public void setSelectAseguradodoble(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        Actions dobleClick =  new Actions(driver);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(selectAseguradodoble));
        dobleClick.doubleClick(element).perform();
    }
    public void setAutorizarBtn(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement btnAutorizar = wait.until(ExpectedConditions.elementToBeClickable(autorizarBtn));
        btnAutorizar.click();}

    public void setImprimirAutorizacion(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement btnImprimeAutorizar = wait.until(ExpectedConditions.elementToBeClickable(imprimirAutorizacion));
        btnImprimeAutorizar.click();}

}
