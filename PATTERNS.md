## Factory Method Pattern

### Nerede kullanıldı?
CharacterFactory sınıfında

### Neden kullanıldı?
Main sınıfındaki if-else ile nesne oluşturma kaldırıldı.

### Kazanım:
- Kod daha okunabilir oldu
- Yeni karakter eklemek kolaylaştı
- OCP prensibi sağlandı


## Adapter Pattern (Phase 2)

### Nerede kullanıldı?
EnemyAdapter sınıfında kullanıldı.

### Neden kullanıldı?
ExternalEnemySystem mevcut Character yapısıyla uyumsuzdu.

### Kazanım
- External sistem entegre edildi
- Mevcut kod değiştirilmedi
- Uyumluluk sağlandı

---

## Facade Pattern (Phase 2)

### Nerede kullanıldı?
GameFacade sınıfında kullanıldı.

### Neden kullanıldı?
Main sınıfındaki oyun başlatma karmaşıklığını azaltmak için.

### Kazanım
- Main sadeleşti
- Sistem tek giriş noktasına sahip oldu
- Kod okunabilirliği arttı