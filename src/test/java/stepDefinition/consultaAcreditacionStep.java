package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.consultaAcreditacionPage;
import utility.BrowserDriver;

public class consultaAcreditacionStep {
    private WebDriver driver;
    private consultaAcreditacionPage ConsultaAcreditacionPage;
    public consultaAcreditacionStep() {
        this.driver = BrowserDriver.getDriver();
        this.ConsultaAcreditacionPage = new consultaAcreditacionPage(driver); // Inicializar consultaAcreditacionPage con el driver

    }

    @Given("encuentro en la web SITEDS")
    public void encuentro_en_la_web_siteds() {
        String tituloSiteds = "Siteds Web - Superintendencia Nacional de Salud";
        Assert.assertEquals(tituloSiteds,driver.getTitle());

    }

    @When("quiero consultar las acreditaciones")
    public void quiero_consultar_las_acreditaciones() {
        ConsultaAcreditacionPage.ingresoUser("waguirre");
        ConsultaAcreditacionPage.ingresoPassword("Susalud2023");
        ConsultaAcreditacionPage.ingresoCaptcha("123455");
        ConsultaAcreditacionPage.setBtnIngresar();
        ConsultaAcreditacionPage.setBtnSelecAuditor();
        ConsultaAcreditacionPage.setBusquedaIpress("20514964778");
        ConsultaAcreditacionPage.setBtnBusquedaIpress();
        ConsultaAcreditacionPage.setSelectIpress();
        ConsultaAcreditacionPage.setListConsultReport();
        ConsultaAcreditacionPage.setPantallaAcredSiteds();
        ConsultaAcreditacionPage.setSelectIAFAS();
        ConsultaAcreditacionPage.setEscribirIafas("SIS");
        ConsultaAcreditacionPage.setSelectListSis();
        ConsultaAcreditacionPage.setBtnBuscarConsultaRegister();
        ConsultaAcreditacionPage.setSelectRegistrodeConsulta();
    }

    @Then("se muestra una lista de las autorizaciones en fecha filtrada")
    public void se_muestra_una_lista_de_las_autorizaciones_en_fecha_filtrada() {

    }
}
