@ProductDetailPage
Feature: Product Detail Page Test Scenarios
  Background:
  Kullanıcı uygulamayı açmıştır

  @UrunDetayGeriButonu-1
  Scenario: Ürün Detay-Geri Butonu

    Given Hepsiburada uygulamasına girin
    When Arama çubuğuna "phone 15 pro max" yazın
    When Arama çubuğunda en üstte çıkan ilk sonuca tıklayın
    When Açılan sayfadaki herhangi bir ürüne tıklayın
    Then Ürün detay sayfası açıldığı görülür
    When Geri butonuna tıklayın
    Then Arama sayfasının açıldığı görülür

  @UrunDetaySepeteEkle-28
  Scenario: Ürün Detay-Sepete Ekle

    Given Hepsiburada uygulamasına girin
    When Arama çubuğuna "phone 15 pro max" yazın
    When Arama çubuğunda en üstte çıkan ilk sonuca tıklayın
    When Açılan sayfadaki herhangi bir ürüne tıklayın
    When Sayfanın en altında sepete ekle butonuna tıklayın
    Then Ürün sepetinizde pop up ı açıldığı görülür"
    When Pop up aşağı kaydırılır
    Then Ürün detay sayfası açıldığı görülür

  @UrunDetayPaylas-2
  Scenario: Ürün Detay-Paylaş
    Given Hepsiburada uygulamasına girin
    When Arama çubuğuna "phone 15 pro max" yazın
    When Arama çubuğunda en üstte çıkan ilk sonuca tıklayın
    When Açılan sayfadaki herhangi bir ürüne tıklayın
    When Paylaş butonuna tıklayın
    Then Android native share ekranı açıldığı görülür

  @UrunDetayKarsilastir-3
  Scenario: Ürün Detay-Karşılaştır
    Given Hepsiburada uygulamasına girin
    When Arama çubuğuna "phone 15 pro max" yazın
    When Arama çubuğunda en üstte çıkan ilk sonuca tıklayın
    When Açılan sayfadaki herhangi bir ürüne tıklayın
    When Karşılaştır butonuna tıklayın
    Then Karşılaştırma Listesi pop up ı açıldığı görülür
    Then Ürünün bu listeye eklendiği görülür"
    When Çöp kutusu ikonuna tıklayın
    Then Ürün detay sayfası açıldığı görülür


