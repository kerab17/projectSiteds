package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.acercaDelSITEDSPage;
import utility.BrowserDriver;

public class acercaDelSITEDStep {
    private WebDriver driver;
    private acercaDelSITEDSPage AcercaDelSITEDSPage;
    public acercaDelSITEDStep() {
        this.driver = BrowserDriver.getDriver();
        this.AcercaDelSITEDSPage = new acercaDelSITEDSPage(driver); // Inicializar HomePage con el driver

    }

    @Given("estoy logeado")
    public void estoy_logeado() {
        String tituloSiteds = "Siteds Web - Superintendencia Nacional de Salud";
        Assert.assertEquals(tituloSiteds,driver.getTitle());
    }
    @When("me dirigo a la pantalla acerca del SITEDS")
    public void me_dirigo_a_la_pantalla_acerca_del_siteds() {
        AcercaDelSITEDSPage.ingresoUser("waguirre");
        AcercaDelSITEDSPage.ingresoPassword("Susalud2023");
        AcercaDelSITEDSPage.ingresoCaptcha("123455");
        AcercaDelSITEDSPage.setBtnIngresar();
        AcercaDelSITEDSPage.setBtnSelecAuditor();
        AcercaDelSITEDSPage.setListHerramientas();
        AcercaDelSITEDSPage.setPantallaAcercaDE();

    }
    @Then("visualizo el popup")
    public void visualizo_el_popup() {

    }

}
