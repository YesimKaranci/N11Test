@N11_Test_Automation_Project
  Feature:N11 test senaryoları
    N11 web sitesine giriş yapmak amacıyla
    Giriş sayfasını görüntülemek istiyorum

    @Geçerli_kullanıcı_ile_uygulamaya_giriş_kontrolü
    Scenario Outline: Geçerli kullanıcı ile uygulamaya giriş kontrolü
      Given Web sitesinde açılan sayfadan giriş yap butonuna tıklanır
      When Web sitesine başarılı giriş için <email> ve <password> yazılır
      And Giriş yap ekranında girilen geçerli bilgilerden sonra giriş yap butonuna tıklanır
      Then Başarılı giriş yapıldığına dair anasayfanın geldiği kontrol edilir

      Examples:
        | username | parola |
        | itsmeyesim@gmail.com| N1123456 |

    @Geçerli_kullanıcı_ile_başarılı_giriş_yaptıktan_sonra_ürün_aratma
    Scenario Outline: Geçerli kullanıcı ile uygulamaya başarılı giriş yaptıktan sonra ürün aratma
      Given Web sitesinde açılan sayfadan giriş yap butonuna tıklanır
      When Web sitesine başarılı giriş için <email> ve <password> yazılır
      And Giriş yap ekranında girilen geçerli bilgilerden sonra giriş yap butonuna tıklanır
      Then Başarılı giriş yapıldığına dair anasayfanın geldiği kontrol edilir
      Then Giriş yaptıktan sonra arama bölümünün geldiği kontrol edilir
      When Anasayfada arama alanına <product> yazılır ve arama butonuna tıklanır
      And  Arama sonucunda çıkan ürünler sayfasında swipe yapılır
      And  Arama sonuçlarında ikinci sayfa açılır
      Then Arama sonuçlarında ikinci sayfanın açıldığı kontrol edilir

      Examples:
        | username | parola | product |
        | itsmeyesim@gmail.com | N1123456 | bilgisayar |

    @Geçerli_kullanıcı_ile_başarılı_giriş_yaptıktan_sonra_rastgele_ürün_seçimi
    Scenario Outline: Geçerli kullanıcı ile uygulamaya başarılı giriş yaptıktan sonra rastgele ürün seçimi
      Given Web sitesinde açılan sayfadan giriş yap butonuna tıklanır
      When Web sitesine başarılı giriş için <email> ve <password> yazılır
      And Giriş yap ekranında girilen geçerli bilgilerden sonra giriş yap butonuna tıklanır
      Then Başarılı giriş yapıldığına dair anasayfanın geldiği kontrol edilir
      When Anasayfada arama alanına <product> yazılır ve arama butonuna tıklanır
      And  Arama sonucunda çıkan ürünler sayfasında swipe yapılır
      And  Arama sonuçlarında ikinci sayfa açılır
      And Arama sonuçları arasından ratgele bir ürün seçilir

      Examples:
        | username | parola | product |
        | itsmeyesim@gmail.com | N1123456 | bilgisayar |

    @Geçerli_kullanıcı_ile_başarılı_giriş_yaptıktan_sonra_sepete_ürün_ekleme
    Scenario Outline: Geçerli kullanıcı ile başarılı giriş yaptıktan sonra sepete ürün ekleme
      Given Web sitesinde açılan sayfadan giriş yap butonuna tıklanır
      When Web sitesine başarılı giriş için <email> ve <password> yazılır
      And Giriş yap ekranında girilen geçerli bilgilerden sonra giriş yap butonuna tıklanır
      Then Başarılı giriş yapıldığına dair anasayfanın geldiği kontrol edilir
      When Anasayfada arama alanına <product> yazılır ve arama butonuna tıklanır
      And  Arama sonucunda çıkan ürünler sayfasında swipe yapılır
      And  Arama sonuçlarında ikinci sayfa açılır
      And Arama sonuçları arasından ratgele bir ürün seçilir
      And Ürün sepete eklenir ve sepete gidilir ürün fiyatı seçilen ile aynı mı karşılaştırılır
      And Adet arttırılarak ürün adedinin iki olduğu doğrulanır


      Examples:
        | username | parola | product |
        | itsmeyesim@gmail.com | N1123456 | bilgisayar |

    @Geçerli_kullanıcı_ile_başarılı_giriş_yaptıktan_sonra_sepetten_ürün_silme
    Scenario Outline: Geçerli kullanıcı ile başarılı giriş yaptıktan sonra sepetten ürün silme
      Given Web sitesinde açılan sayfadan giriş yap butonuna tıklanır
      When Web sitesine başarılı giriş için <email> ve <password> yazılır
      And Giriş yap ekranında girilen geçerli bilgilerden sonra giriş yap butonuna tıklanır
      Then Başarılı giriş yapıldığına dair anasayfanın geldiği kontrol edilir
      When Anasayfada arama alanına <product> yazılır ve arama butonuna tıklanır
      And  Arama sonucunda çıkan ürünler sayfasında swipe yapılır
      And  Arama sonuçlarında ikinci sayfa açılır
      And Arama sonuçları arasından ratgele bir ürün seçilir
      And Ürün sepete eklenir ve sepete gidilir ürün fiyatı seçilen ile aynı mı karşılaştırılır
      And Ürün sepetten silinir
      Then Sepetin boş olduğu kontrol edilir


      Examples:
        | username | parola | product |
        | itsmeyesim@gmail.com | N1123456 | bilgisayar |