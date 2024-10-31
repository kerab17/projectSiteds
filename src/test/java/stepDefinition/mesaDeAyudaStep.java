package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.mesaDeAyudaPage;
import utility.BrowserDriver;

public class mesaDeAyudaStep {
    private WebDriver driver;
    private mesaDeAyudaPage MesaDeAyudaPage;

    public mesaDeAyudaStep(){
        this.driver = BrowserDriver.getDriver();
        this.MesaDeAyudaPage = new mesaDeAyudaPage(driver);
    }

    @Given("estoy logeado a la web")
    public void estoy_logeado_a_la_web() {
        String tituloSiteds = "Siteds Web - Superintendencia Nacional de Salud";
        Assert.assertEquals(tituloSiteds,driver.getTitle());
    }
    @When("me dirigo a la pantalla Mesa de Ayuda")
    public void me_dirigo_a_la_pantalla_mesa_de_ayuda() {
        MesaDeAyudaPage.ingresoUser("waguirre");
        MesaDeAyudaPage.ingresoPassword("Susalud2023");
        MesaDeAyudaPage.ingresoCaptcha("123455");
        MesaDeAyudaPage.setBtnIngresar();
        MesaDeAyudaPage.setBtnSelecAuditor();
        MesaDeAyudaPage.setListHerramientas();
        MesaDeAyudaPage.setPantallaMesaAyuda();
        MesaDeAyudaPage.setBusquedaMAyuda("solicitud");
        MesaDeAyudaPage.setBtnBusqueda();
    }
    @Then("realizo una consulta")
    public void realizo_una_consulta() {

    }
}
