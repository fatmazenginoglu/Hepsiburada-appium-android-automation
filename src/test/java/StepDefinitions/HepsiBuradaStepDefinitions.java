package StepDefinitions;

import Pages.HepsiBuradaPages;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import util.DriverFactory;

public class HepsiBuradaStepDefinitions {
    HepsiBuradaPages HepsiBuradaPages = new HepsiBuradaPages(DriverFactory.getDriver());

    @Given("Hepsiburada uygulamasına girin")
    public void hepsiburadaUygulamasınaGirin() {
    }

    @When("Arama çubuğuna {string} yazın")
    public void aramaÇubuğunaYazın(String arg0) {
        HepsiBuradaPages.writesearch();
    }

    @When("Arama çubuğunda en üstte çıkan ilk sonuca tıklayın")
    public void aramaÇubuğundaEnÜstteÇıkanIlkSonucaTıklayın() {
        HepsiBuradaPages.clksearchresult();
    }

    @When("Açılan sayfadaki herhangi bir ürüne tıklayın")
    public void açılanSayfadakiHerhangiBirÜrüneTıklayın() {
        HepsiBuradaPages.clkurundetay();
    }

    @Then("Ürün detay sayfası açıldığı görülür")
    public void ürünDetaySayfasıAçıldığıGörülür() {
        HepsiBuradaPages.chckUrunDetayPage();
    }

    @When("Geri butonuna tıklayın")
    public void geriButonunaTıklayın() {
        HepsiBuradaPages.clkgeriBtn();
    }

    @Then("Arama sayfasının açıldığı görülür")
    public void aramaSayfasınınAçıldığıGörülür() {
        HepsiBuradaPages.chcksearchPage();
    }

    @When("Sayfanın en altında sepete ekle butonuna tıklayın")
    public void sayfanınEnAltındaSepeteEkleButonunaTıklayın() {
        HepsiBuradaPages.clksepeteekle();
    }

    @Then("Ürün sepetinizde pop up ı açıldığı görülür\"")
    public void ürünSepetinizdePopUpIAçıldığıGörülür() throws Throwable {    // Write code here that turns the phrase above into concrete actions    throw new cucumber.api.PendingException();}
        HepsiBuradaPages.chcksepetebasarili();
    }

    @When("Pop up aşağı kaydırılır")
    public void popUpAşağıKaydırılır() {
        HepsiBuradaPages.swipesepetebasarilipopup();
    }

    @When("Paylaş butonuna tıklayın")
    public void paylaşButonunaTıklayın() {
        HepsiBuradaPages.clkpaylas();

    }

    @Then("Android native share ekranı açıldığı görülür")
    public void androidNativeShareEkranıAçıldığıGörülür() {
        HepsiBuradaPages.chcknativesharepopup();
    }

    @When("Karşılaştır butonuna tıklayın")
    public void karşılaştırButonunaTıklayın() {
        HepsiBuradaPages.clkkarsilastir();
    }
    @Then("Karşılaştırma Listesi pop up ı açıldığı görülür")
    public void karşılaştırmaListesiPopUpIAçıldığıGörülür() {
        HepsiBuradaPages.chckkarsilastirmalist();
    }
    @Then("Ürünün bu listeye eklendiği görülür\"")
    public void ürününBuListeyeEklendiğiGörülür() throws Throwable {    // Write code here that turns the phrase above into concrete actions    throw new cucumber.api.PendingException();}
        HepsiBuradaPages.chckkarsilatirmaurun();
    }

    @When("Çöp kutusu ikonuna tıklayın")
    public void çöpKutusuIkonunaTıkayın() {
        HepsiBuradaPages.clkcopkutusu();
    }

}
