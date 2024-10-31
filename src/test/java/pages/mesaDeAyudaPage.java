package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Instant;

public class mesaDeAyudaPage {
    WebDriver driver;

    public mesaDeAyudaPage(WebDriver driver){
        this.driver = driver;
    }

    By userLogin = By.xpath("//*[@id=\"user\"]");
    By userPassword = By.xpath("//*[@id=\"mat-input-1\"]");
    By captcha = By.xpath("//*[@id=\"captchaAnswer\"]");
    By btnIngresar = By.xpath("/html/body/app-root/app-view-login/div/div/div/section/div[3]/form/div[2]/input");
    By btnSelecAuditor = By.xpath("/html/body/app-root/app-view-perfil/div[1]/div/div/div[2]/table/tbody/tr[1]/td[3]/button");
    By listHerramientas = By.xpath("//*[@id=\"sidebar\"]/div[2]/ul/li[4]");
    By pantallaMesaAyuda = By.xpath("//*[@id=\"2373\"]/li[3]");
    By busquedaMAyuda = By.xpath("//*[@id=\"landing_page\"]/div[2]/div[1]/form/input[2]");
    By btnBusqueda = By.xpath("//*[@id=\"landing_page\"]/div[2]/div[1]/form/button");

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
        public void setPantallaMesaAyuda(){
            // Hacer clic en el botón que abre la nueva pestaña con el PDF
            WebDriverWait wait = new WebDriverWait(driver, 10);
            driver.findElement(pantallaMesaAyuda).click();

            for (String nombreFor : driver.getWindowHandles()) {
                driver.switchTo().window(nombreFor);
            }

        }
        public void setBusquedaMAyuda(String texto){
            WebDriverWait wait = new WebDriverWait(driver, 10);

            // Esperar a que la nueva página esté completamente cargada
            wait.until(driver -> ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete"));

            // Esperar hasta que el elemento busquedaMAyuda esté visible en la nueva pestaña
            wait.until(ExpectedConditions.visibilityOfElementLocated(busquedaMAyuda));

            // Encontrar el elemento y enviar texto
            WebElement btnListHerramientas = wait.until(ExpectedConditions.elementToBeClickable(busquedaMAyuda));
            btnListHerramientas.sendKeys(texto);

        }
        public void setBtnBusqueda(){driver.findElement(btnBusqueda).click();}
}
