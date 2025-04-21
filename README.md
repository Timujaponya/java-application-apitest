Elbette! İşte tüm içeriği tek bir yazı halinde, düzgün biçimlendirilmiş bir `README.md` formatında:

---

# Banka Yönetim Sistemi (BM)

Bu proje, bankacılık işlemlerini yönetmek için geliştirilmiş bir web uygulamasıdır. Müşteri hesapları, krediler ve diğer bankacılık işlemlerini yönetmek için kullanılabilir.

## Teknolojiler

Bu projede aşağıdaki teknolojiler kullanılmıştır:

- Java 17  
- Spring Boot 3.4.3  
- Spring Data JPA  
- PostgreSQL  
- Thymeleaf  
- Maven  
- Lombok  

## Gereksinimler

Projeyi çalıştırmak için aşağıdaki yazılımlar sisteminizde kurulu olmalıdır:

- JDK 17  
- Maven 3.6+ (veya proje ile gelen `mvnw`)  
- PostgreSQL

## Kurulum

İlk olarak projeyi bilgisayarınıza klonlayın:

```
git clone https://github.com/Timujaponya/bm.git
cd bm
```

Daha sonra PostgreSQL üzerinde bir veritabanı oluşturun. Örneğin:

```
CREATE DATABASE banka_yonetim;
```

Ardından `src/main/resources/application.properties` dosyasını açın ve veritabanı bağlantı bilgilerinizi girin:

```
spring.datasource.url=jdbc:postgresql://localhost:5432/banka_yonetim
spring.datasource.username=postgres
spring.datasource.password=sifreniz
```

Projeyi derlemek için:

```
./mvnw clean install
```

## Çalıştırma

Uygulamayı başlatmak için aşağıdaki komutu çalıştırabilirsiniz:

```
./mvnw spring-boot:run
```

Varsayılan olarak uygulama `http://localhost:8080` adresinde çalışacaktır.

## Modüller

Uygulama aşağıdaki ana modüllerden oluşmaktadır:

- **Müşteri Yönetimi**: Müşteri bilgilerinin saklanması ve yönetilmesi  
- **Hesap Yönetimi**: Banka hesaplarının yönetimi  
- **Kredi Yönetimi**: Kredi işlemlerinin yönetimi

## Proje Yapısı

Proje klasör yapısı şu şekildedir:

```
src/
  main/
    java/
      com/sau/bm/         -> Java kaynak kodları
    resources/
      application.properties  -> Uygulama yapılandırması
      templates/              -> Thymeleaf şablonları
        accounts.html         -> Hesaplar sayfası
        customers.html        -> Müşteriler sayfası
        index.html            -> Ana sayfa
        loans.html            -> Krediler sayfası
```

## Lisans

Bu proje MIT lisansı altında lisanslanmıştır. Detaylar için `LICENSE` dosyasını inceleyebilirsiniz.

## Katılımcılar

- [@edanurozpinar](https://github.com/edanurozpinar)  
- [@gorkem-cetinkaya](https://github.com/gorkem-cetinkaya)  
- [@ibrahim5557](https://github.com/ibrahim5557)

---
