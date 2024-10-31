package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.consultaAcreditacionPage;
import pages.descargaAcreditaciones;
import utility.BrowserDriver;

public class descargaAcreditacionStep {
    private WebDriver driver;
    private descargaAcreditaciones DescargaAcreditaciones;
    public descargaAcreditacionStep() {
        this.driver = BrowserDriver.getDriver();
        this.DescargaAcreditaciones = new descargaAcreditaciones(driver); // Inicializar consultaAcreditacionPage con el driver

    }


    @Given("estoy en la web SITEDS")
    public void estoy_en_la_web_siteds() {
        String tituloSiteds = "Siteds Web - Superintendencia Nacional de Salud";
        Assert.assertEquals(tituloSiteds,driver.getTitle());

    }
    @When("quiero descargar acreditaciones en excel")
    public void quiero_descargar_acreditaciones_en_excel() {
        DescargaAcreditaciones.ingresoUser("waguirre");
        DescargaAcreditaciones.ingresoPassword("Susalud2023");
        DescargaAcreditaciones.ingresoCaptcha("123455");
        DescargaAcreditaciones.setBtnIngresar();
        DescargaAcreditaciones.setBtnSelecAuditor();
        DescargaAcreditaciones.setBusquedaIpress("20514964778");
        DescargaAcreditaciones.setBtnBusquedaIpress();
        DescargaAcreditaciones.setSelectIpress();
        DescargaAcreditaciones.setListConsultReport();
        DescargaAcreditaciones.setPantallaDescargaAcred();
        DescargaAcreditaciones.setSelectIAFAS();
        DescargaAcreditaciones.setEscribirIafas("SIS");
        DescargaAcreditaciones.setSelectListSis();
        DescargaAcreditaciones.setBtnBuscarConsultaRegister();
        DescargaAcreditaciones.setSelectMasiveDescargaExcel();
        DescargaAcreditaciones.setDescargaBTNExcel();
    }
    @Then("se descarga las acreditaciones correctamente")
    public void se_descarga_las_acreditaciones_correctamente() {

    }


}
