# Problems Found

## 1. if-else karmaşası
Yeni nesne eklendikçe if-else bloğu büyüyor.

## 2. Tek sınıf çok iş yapıyor
GameObject hem player hem enemy davranışını yönetiyor.

## 3. String ile tip kontrolü
Hatalı yazım riskli (örn: "plaeyr").

## 4. Open/Closed violation
Yeni özellik için mevcut kodu değiştirmek gerekiyor.

## 5. Kod esnek değil
Yeni oyun nesnesi eklemek zor ve riskli.

---

# AI Karşılaştırma

## AI Ne dedi?
- Factory Method
- Strategy Pattern
- State Pattern

## Ben ne buldum?
- if-else problemi
- tek sınıf sorunu
- hardcoded type

## Fark
AI Strategy önerdi, ben önce Factory Method ile çözmeyi uygun gördüm.