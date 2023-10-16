package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepdefinitions {

    AmazonPage amazonPage;

    @Given("kullanici amazonUrl anasayfaya gider")
    public void kullanici_amazon_url_anasayfaya_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }
    @Given("arama kutusuna Nutella yazip aratir")
    public void arama_kutusuna_nutella_yazip_aratir() {
        amazonPage= new AmazonPage();
        amazonPage.aramaKutusu.sendKeys("Nutella" + Keys.ENTER);
    }
    @Then("arama sonuclarinin Nutella icerdigini test eder")
    public void arama_sonuclarinin_nutella_icerdigini_test_eder() {
        amazonPage= new AmazonPage();
        String expectedIcerik = "Nutella";
        String actualAramaSonucu = amazonPage.sonucYaziElementi.getText();
        Assert.assertTrue(actualAramaSonucu.contains(expectedIcerik));
    }
    @Then("sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.closeDriver();
    }
}
