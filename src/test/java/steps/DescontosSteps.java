package steps;

import cucumber.api.java.pt.Dada;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DescontosSteps {

    WebDriver driver = new ChromeDriver();

    @Dada("^que estou no site da qazando")
    public void acessar_site_qazando() {
        driver.get("https://qazando.com.br/curso.html");
        driver.findElement(By.id(""));
//        Assert.assertArrayEquals(true, );
    }

    @Quando("^quando eu preencho meu e-mail$")
    public void quando_eu_preencho_meu_e_mail() throws InterruptedException {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollTo(8,10000)");
        Thread.sleep(2000);
        driver.findElement(By.id("email")).sendKeys("joyce.maciel@gmail.com");
    }

    @Quando("^clico em ganhar cupom$")
    public void clico_em_ganhar_cupom() {
        driver.findElement(By.id("button")).click();
    }

    @Entao("^eu vejo o codigo de desconto$")
    public void eu_vejo_o_codigo_de_desconto() {
        String texto_cupon = driver.findElement(By.cssSelector("#cupom > h2 > span")).getText();
        System.out.println(texto_cupon);

        driver.quit();
    }
}
