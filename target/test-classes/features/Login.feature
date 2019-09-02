@Giris_Sayfası
  Feature:Login test senaryoları
    Hepsi burada web sitesine giriş yapmak amacıyla
    Giriş sayfasını görüntülemek istiyorum

  @Geçersiz_kullanıcı_ile_uygulamaya_giriş_kontrolü
    Scenario Outline: Geçersiz kullanıcı ile uygulamaya giriş yapmaya çalışma senaryo
    And Hepsi burada web sitesinde giriş yap butonuna tıklanır
    And Açılan listeden giriş yap butonuna tıklanır
    And Giriş yap ekranında başarısız giriş için kullanıcı adı alanına <username> yazılır
    And Giriş yap ekranında başarısız giriş için parola alanına <parola> yazılır
    And Giriş yap ekranında girilen geçersiz bilgilerden sonra giriş butonuna tıklanır
    And E posta adresiniz ya da şifreniz yanlış uyarı mesajının geldiği kontrol edilir

    Examples:
      | username | parola |
      | yesimkaranci@gmail.com | 123456 |

    @Geçerli_kullanıcı_ile_uygulamaya_giriş_kontrolü
    Scenario Outline: Geçerli kullanıcı ile uygulamaya giriş yapmaya çalışma senaryo
      And Hepsi burada web sitesinde login butonuna tıklanır
      And Hepsi burada web sitesinde açılan listeden giriş yap butonuna tıklanır
      And Giriş yap ekranında başarılı giriş için kullanıcı adı alanına <username> yazılır
      And Giriş yap ekranında başarılı giriş için parola alanına <parola> yazılır
      And Giriş yap ekranında girilen geçerli bilgilerden sonra giriş butonuna tıklanır
      And Başarılı giriş yapıldığına dair anasayfanın geldiği kontrol edilir

      Examples:
        | username | parola |
        | yesimtestautomation@hotmail.com| H.12345 |

    @Geçerli_kullanıcı_ile_uygulamaya_başarılı_giriş_yaptıktan_sonra_swipe_kontrolü
    Scenario Outline: Geçerli kullanıcı ile uygulamaya başarılı giriş yaptıktan sonra swipe senaryo
      And Hepsi burada web sitesinde login butonuna tıklanır
      And Hepsi burada web sitesinde açılan listeden giriş yap butonuna tıklanır
      And Giriş yap ekranında başarılı giriş için kullanıcı adı alanına <username> yazılır
      And Giriş yap ekranında başarılı giriş için parola alanına <parola> yazılır
      And Giriş yap ekranında girilen geçerli bilgilerden sonra giriş butonuna tıklanır
      And Başarılı giriş yapıldığına dair anasayfanın geldiği kontrol edilir
      And Gelen ekranda swipe yaptırılır ve keşfet bulunur
      And Keşfet altında listelenenlerden kitapa tıklanır.

      Examples:
        | username | parola |
        | yesimtestautomation@hotmail.com| H.12345 |

    @Geçerli_kullanıcı_ile_başarılı_giriş_yaptıktan_sonra_arama_yapma
    Scenario Outline: Geçerli kullanıcı ile uygulamaya başarılı giriş yaptıktan sonra arama yapma
      And Hepsi burada web sitesinde login butonuna tıklanır
      And Hepsi burada web sitesinde açılan listeden giriş yap butonuna tıklanır
      And Giriş yap ekranında başarılı giriş için kullanıcı adı alanına <username> yazılır
      And Giriş yap ekranında başarılı giriş için parola alanına <parola> yazılır
      And Giriş yap ekranında girilen geçerli bilgilerden sonra giriş butonuna tıklanır
      And Başarılı giriş yapıldığına dair anasayfanın geldiği kontrol edilir
      And Giriş yaptıktan sonra arama bölümünün geldiği kontrol edilir
      And Ürün ismi yazılarak arama butonuna tıklanır ve arama alanına <product> yazılır

      Examples:
        | username | parola | product |
        | yesimtestautomation@hotmail.com | H.12345 | iphone7 |

    @Geçerli_kullanıcı_ile_başarılı_giriş_yaptıktan_sonra_arama_yapılır_istenilen_ürün_seçilir
    Scenario Outline: Geçerli kullanıcı ile uygulamaya başarılı giriş yaptıktan sonra arama yapılıp istenilen ürün seçilir
      And Hepsi burada web sitesinde login butonuna tıklanır
      And Hepsi burada web sitesinde açılan listeden giriş yap butonuna tıklanır
      And Giriş yap ekranında başarılı giriş için kullanıcı adı alanına <username> yazılır
      And Giriş yap ekranında başarılı giriş için parola alanına <parola> yazılır
      And Giriş yap ekranında girilen geçerli bilgilerden sonra giriş butonuna tıklanır
      And Başarılı giriş yapıldığına dair anasayfanın geldiği kontrol edilir
      And Giriş yaptıktan sonra arama bölümünün geldiği kontrol edilir
      And Ürün ismi yazılarak arama butonuna tıklanır ve arama alanına <product> yazılır
      And Arama sonucunda çıkan ürünler sayfasında swipe yapılır
      And Listelenen seçenekler arasından istenilen ürüne tıklanır
      And Ürün sepete eklenir

      Examples:
        | username | parola | product |
        | yesimtestautomation@hotmail.com | H.12345 | iphone7 |