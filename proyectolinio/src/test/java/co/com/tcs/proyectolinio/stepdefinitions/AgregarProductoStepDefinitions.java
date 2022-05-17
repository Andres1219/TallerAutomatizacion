package co.com.tcs.proyectolinio.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class AgregarProductoStepDefinitions {

    WebDriver driver;
    ChromeOptions options;

    @Before
    public  void configuracion(){
        options = new ChromeOptions();
        options.addArguments("--start-maximized","--incognito");
        driver = new ChromeDriver(options);
    }
    @Given("^el usuario se encuentra en la aplicacion linio\\.com\\.co$")
    public void elUsuarioSeEncuentraEnLaAplicacionLinioComCo() {
        driver.get("https://www.linio.com.co/");

    }

    @When("^el usuario selecciona la categoria y productos corecto$")
    public void elUsuarioSeleccionaLaCategoriaYProductosCorecto() {
    }

    @Then("^el usuario ve el mensaje productos seleccionados (.*)$")
    public void elUsuarioVeElMensajeProductosSeleccionados(String arg1) {
    }

}
