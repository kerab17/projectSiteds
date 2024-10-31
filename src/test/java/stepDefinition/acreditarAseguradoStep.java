package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.acreditarAsegurado;
import utility.BrowserDriver;

public class acreditarAseguradoStep {
    private WebDriver driver;
    private acreditarAsegurado AcreditarAsegurado;
    public acreditarAseguradoStep() {
        this.driver = BrowserDriver.getDriver();
        this.AcreditarAsegurado = new acreditarAsegurado(driver); // Inicializar HomePage con el driver

    }

    @Given("me encuentro en la web SITEDS")
    public void me_encuentro_en_la_web_siteds() {
        String tituloSiteds = "Siteds Web - Superintendencia Nacional de Salud";
        Assert.assertEquals(tituloSiteds,driver.getTitle());

    }
    @When("ingreso mis credenciales")
    public void ingreso_mis_credenciales() {
        AcreditarAsegurado.ingresoUser("waguirre");
        AcreditarAsegurado.ingresoPassword("Susalud2023");
        AcreditarAsegurado.ingresoCaptcha("123455");
        AcreditarAsegurado.setBtnIngresar();
        AcreditarAsegurado.setBtnSelecAuditor();
        AcreditarAsegurado.setBusquedaIpress("20514964778");
        AcreditarAsegurado.setBtnBusquedaIpress();
        AcreditarAsegurado.setSelectIpress();
        AcreditarAsegurado.setIngresoIAFAClick();
        AcreditarAsegurado.setIngresoIAFA("SIS");
        AcreditarAsegurado.setSelectIAFA();
        AcreditarAsegurado.setIngresoAsegurado("45065975");
        AcreditarAsegurado.setBtnBuscarAsegurado();
        AcreditarAsegurado.setSelectAseguradodoble();
        AcreditarAsegurado.setAutorizarBtn();
        AcreditarAsegurado.setImprimirAutorizacion();

    }
    @Then("debería ingresar a la pantalla principal")
    public void debería_ingresar_a_la_pantalla_principal() {

    }
}
