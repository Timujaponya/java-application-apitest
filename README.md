# java-application-apitest


Banka Yönetim Sistemi (BM)
Bu proje, bankacılık işlemlerini yönetmek için geliştirilmiş bir web uygulamasıdır. Müşteri hesapları, krediler ve diğer bankacılık işlemlerini yönetmek için kullanılabilir.

Teknolojiler
Java 17
Spring Boot 3.4.3
Spring Data JPA
PostgreSQL
Thymeleaf
Maven
Lombok

Gereksinimler
JDK 17
Maven 3.6+ (veya wrapper kullanabilirsiniz: mvnw)
PostgreSQL
Kurulum

Projeyi klonlayın:
git clone https://github.com/Timujaponya/bm.git
cd bm

PostgreSQL'de bir veritabanı oluşturun.

application.properties dosyasını düzenleyerek veritabanı bağlantı ayarlarını yapılandırın.

Projeyi derleyin:
./mvnw clean install

Çalıştırma
Uygulamayı başlatmak için:
./mvnw spring-boot:run

Uygulama varsayılan olarak http://localhost:8080 adresinde çalışacaktır.

Modüller
Uygulama aşağıdaki ana modüllerden oluşmaktadır:

Müşteri Yönetimi: Müşteri bilgilerinin saklanması ve yönetilmesi
Hesap Yönetimi: Banka hesaplarının yönetimi
Kredi Yönetimi: Kredi işlemlerinin yönetimi
Proje Yapısı
src/
  main/
    java/com/sau/bm/       # Java kaynak kodları
    resources/
      application.properties  # Uygulama yapılandırması
      templates/              # Thymeleaf şablonları
        accounts.html         # Hesaplar sayfası
        customers.html        # Müşteriler sayfası
        index.html            # Ana sayfa
        loans.html            # Krediler sayfası

Lisans
Bu proje MIT lisansı altında lisanslanmıştır. Detaylar için LICENSE dosyasını inceleyebilirsiniz.

Katılımcılar
https://github.com/edanurozpinar
https://github.com/gorkem-cetinkaya
https://github.com/ibrahim5557
