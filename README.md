# Akıllı IK API

Bu proje, Müşteri yönetim sistemi için bir REST API sağlar. Müşterilerle hizmet verilen illerle ilgili çeşitli CRUD işlemlerini yapabilen endpointler içerir.

## Endpointler

### Müşteri Endpoints

| HTTP Method | URL                            | Açıklama                                         |
|-------------|---------------------------------|--------------------------------------------------|
| POST        | /api/musteri/musteri-ekle       | Yeni bir müşteri ekler                           |
| GET         | /api/musteri/musteri-listesi    | Tüm müşterileri listeler                         |
| POST        | /api/musteri/musteri-dogrula    | Müşteri bilgilerini doğrular                     |

### Hizmet Verilen İl Endpoints

| HTTP Method | URL                              | Açıklama                                        |
|-------------|-----------------------------------|-------------------------------------------------|
| POST        | /api/musteri/hizmet-verilen-il-ekle | Yeni bir hizmet verilen il ekler                |
| GET         | /api/musteri/hizmet-verilen-iller  | Tüm hizmet verilen illeri listeler              |

## Kurulum ve Çalıştırma

### Maven İle Çalıştırma

1. Projeyi klonlayın:
    ```bash
    git clone https://github.com/yakuperenermurat/akilli-ik.git
    ```

2. Proje dizinine gidin:
    ```bash
    cd akilli-ik
    ```

3. Gerekli bağımlılıkları yükleyin ve projeyi çalıştırın:
    ```bash
    mvn clean install
    mvn spring-boot:run
    ```

⚠️ **Uyarı:** Uygulamanın başlatılabilmesi için **localhost** üzerinde çalışan PostgreSQL veritabanına, **5432** portu üzerinden erişilebilmelidir. Bu yapılandırma sağlanmadan uygulama çalışmayacaktır.

### Docker ile Çalıştırma

Projeyi Docker kullanarak ayağa kaldırmak için aşağıdaki adımları izleyin:

1. **Docker ve Docker Compose** yüklü olduğundan emin olun.

2. Projeyi klonlayın:
    ```bash
    git clone https://github.com/yakuperenermurat/akilli-ik.git
    ```

3. Proje dizinine gidin:
    ```bash
    cd akilli-ik
    ```

4. API, **http://localhost:2023** adresinden erişilebilir olacak.

5. Docker Compose ile projeyi ayağa kaldırın:
    ```bash
    docker-compose up --build
    ```

6. API, **http://localhost:2023** adresinden erişilebilir olacaktır. Veritabanı ise PostgreSQL ile **5432** portunda çalışacaktır.

## Postman Koleksiyonu

API'yi test etmek için Postman kullanabilirsiniz. Tüm endpointleri içeren hazır bir Postman koleksiyonu, `akilli-ik.postman_collection.json` adıyla projeye eklenmiştir. Bu dosyayı Postman'e import ederek API isteklerini kolayca test edebilirsiniz.

1. Postman'de **Import** butonuna tıklayın.
2. `akilli-ik.postman_collection.json` dosyasını seçin ve import edin.
3. API isteklerini hızlıca çalıştırabilirsiniz.