# Akıllı IK API

Bu proje, Akıllı İnsan Kaynakları (IK) yönetim sistemi için bir REST API sağlar. Müşterilerle ilgili çeşitli CRUD işlemlerini yapabilen endpointler içerir. Ayrıca hizmet verilen illeri yönetir.

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

4. Docker Compose ile projeyi ayağa kaldırın:
    ```bash
    docker-compose up --build
    ```

5. API, **http://localhost:2023** adresinden erişilebilir olacak. Veritabanı ise PostgreSQL ile **5432** portunda çalışacaktır.
