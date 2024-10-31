package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.manualUsuarioPage;
import utility.BrowserDriver;

public class manualUsuarioStep {
    private WebDriver driver;
    private manualUsuarioPage ManualUsuarioPagee;
    public manualUsuarioStep() {
        this.driver = BrowserDriver.getDriver();
        this.ManualUsuarioPagee = new manualUsuarioPage(driver); // Inicializar consultaAcreditacionPage con el driver

    }

    @Given("hago el login a la web Siteds")
    public void hago_el_login_a_la_web_siteds() {
        String tituloSiteds = "Siteds Web - Superintendencia Nacional de Salud";
        Assert.assertEquals(tituloSiteds,driver.getTitle());
    }
    @When("realizo la descarga del manual")
    public void realizo_la_descarga_del_manual() {
        ManualUsuarioPagee.ingresoUser("waguirre");
        ManualUsuarioPagee.ingresoPassword("Susalud2023");
        ManualUsuarioPagee.ingresoCaptcha("123455");
        ManualUsuarioPagee.setBtnIngresar();
        ManualUsuarioPagee.setBtnSelecAuditor();
        ManualUsuarioPagee.setListHerramientas();
        ManualUsuarioPagee.setPantallaManual();
    }
    @Then("la descarga se realiza correctamente")
    public void la_descarga_se_realiza_correctamente() {

    }




}
