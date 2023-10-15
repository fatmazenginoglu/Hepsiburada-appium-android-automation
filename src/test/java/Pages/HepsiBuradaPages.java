package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

public class HepsiBuradaPages {

    By clkAcSym= MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.pozitron.hepsiburada:id/account_menu_button\")");
    By searchText=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.pozitron.hepsiburada:id/etSearchBox\")");
    By searchlist=MobileBy.AndroidUIAutomator("new UiSelector().text(\"iphone 15 pro max\")");
    By urundetayBtn=MobileBy.AndroidUIAutomator("new UiSelector().text(\"iPhone 15 Pro Max 256 GB\")");
    By urundetayPage= MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.pozitron.hepsiburada:id/tvProductName\")");
    By geriBtn= MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.pozitron.hepsiburada:id/leftIcon\")");
    By searchPage= MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.pozitron.hepsiburada:id/lytOptionBarSort\")");
    By sepeteekleBtn=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.pozitron.hepsiburada:id/product_detail_add_to_cart_text\")");
    By sepetebasariliMessage=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.pozitron.hepsiburada:id/productSuccesTxt\")");
    By alisverisedevametBtn=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.pozitron.hepsiburada:id/contiuneBasketTxt\")");
    By paylasBtn=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.pozitron.hepsiburada:id/share\")");
    By nativeshare=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"android:id/content_preview_text\")");
    By karsilastirBtn=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.pozitron.hepsiburada:id/compareIcon\")");
    By karsilastirmalist=MobileBy.AndroidUIAutomator("new UiSelector().text(\"Karşılaştırma Listesi\")");
    By karsilastimaurun=MobileBy.AndroidUIAutomator("new UiSelector().text(\"Ürün karşılaştırma listenize eklenmiştir.\")");
    By copkutusuBtn=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.pozitron.hepsiburada:id/compareRemoveIv\")");
    By photosBtn=MobileBy.AndroidUIAutomator("new UiSelector().className(\"android.widget.LinearLayout\").index(2)");
    By photo=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.pozitron.hepsiburada:id/productImage\")");
    By smallphoto=MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/androidx.cardview.widget.CardView[2]/android.widget.ImageView");
    By bigphoto=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.pozitron.hepsiburada:id/zoomableImage\")");
    By copyBtn=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"android:id/copy_button\")");
    By xBtn=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.pozitron.hepsiburada:id/leftIcon\")");

    AppiumDriver driver;
    ElementHelper elementHelper;
    WebDriverWait wait;

    public HepsiBuradaPages(AppiumDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 20);
        this.elementHelper = new ElementHelper(driver);
    }
    public  void clkAccSymbol() {
        driver.findElement(clkAcSym).click();
    }
    public void writesearch() {
        driver.findElement(searchText).click();
        elementHelper.sendKeys(searchText, "phone 15 pro max");
    }
    public void clksearchresult() {driver.findElement(searchlist).click();}
    public void clkurundetay() {driver.findElement(urundetayBtn).click();}
    public void chckUrunDetayPage() {elementHelper.checkVisible(urundetayPage);}
    public void clkgeriBtn() {driver.findElement(geriBtn).click();}
    public void chcksearchPage() {elementHelper.checkVisible(searchPage);}
    public void clksepeteekle() {driver.findElement(sepeteekleBtn).click();}
    public void chcksepetebasarili() {elementHelper.checkVisible(sepetebasariliMessage);}
    public void swipesepetebasarilipopup() {driver.findElement(alisverisedevametBtn).click();}
    public void clkpaylas() {driver.findElement(paylasBtn).click();}
    public void chcknativesharepopup() {elementHelper.checkVisible(nativeshare);}
    public void clkkarsilastir() {driver.findElement(karsilastirBtn).click();}
    public void chckkarsilastirmalist() {elementHelper.checkVisible(karsilastirmalist);}
    public void chckkarsilatirmaurun() {elementHelper.checkVisible(karsilastimaurun);}
    public void clkcopkutusu() {driver.findElement(copkutusuBtn).click();}
    public void clkphotos() {driver.findElement(photosBtn).click();}
    public void chckphotos() {elementHelper.checkVisible(photo);}
    public void clkbigphotos() {driver.findElement(photo).click();}
    public void clksmallphotos() {driver.findElement(smallphoto).click();}
    public void chckbigphotos() {elementHelper.checkVisible(bigphoto);}
    public void clkcopyBtn() {driver.findElement(copyBtn).click();}
    public void clkxBtn() {driver.findElement(xBtn).click();}
}
