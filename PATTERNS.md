## Factory Method Pattern

### Nerede kullanıldı?
CharacterFactory sınıfında

### Neden kullanıldı?
Main sınıfındaki if-else ile nesne oluşturma kaldırıldı.

### Kazanım:
- Kod daha okunabilir oldu
- Yeni karakter eklemek kolaylaştı
- OCP prensibi sağlandı

Facade Pattern:
GameFacade sınıfı ile Main sadeleştirildi.
Oyun başlatma tek noktadan yönetildi.

Adapter Pattern:
ExternalEnemySystem uyumlu hale getirildi.
EnemyAdapter ile mevcut sisteme entegre edildi.