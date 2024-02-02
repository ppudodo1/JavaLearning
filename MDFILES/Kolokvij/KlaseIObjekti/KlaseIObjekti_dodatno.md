# Dodatno za klase i objekte

Primjer scannera bez import deklaracije:
```java
    java.util.Scanner unos = new java.util.Scanner(System.in);
```

## Primitivni tipovi
- primitni tipovi nemaju metode poput `equals`,`compareTo` itd.
- Operacije nad njima se vrse standarnim putem

## Referenti tipovi
- Primjer pretvaranja primitinih tipova u referentne.
```java
            int a = 1;
            int b = 1;
            Integer aRef = a; // ovdje se koristi autoboxing
            Integer aRef2 = Integer.valueOf(a); // ovo vrijedi za sve referentne tipove
            Integer aRef3 = new Integer(1); // ovo se u prijasnjim verzijama jave moglo al se vise ne moze
            BigDecimal test = new BigDecimal(1); // za BigDecimal to jos vrijedi
            BigDecimal test2 = new BigDecimal("1"); // ovo isto radi btw.
            Double db = new Double(1); // ne radi vise
            Float ft = new Float(1); // ne radi vise
            String st = new String("dwada"); // ovo se moze
            
            System.out.println(st);
```
Svi referentni tipovi u javi sadrze neke metode koje nam omogucavaju rad sa njima. Neke od tih metoda su:

- `compareTo` usporeduje dvije vrijednosti i vraca -1,0 ili 1
- `equals` vraca true ili false ako su vrijednosti iste
- `doubleValue`, `intValue` itd. Ne postoji `stringValue`. Ove metode vracaju primitivni tip podatka.

## LocalDateTime

Primjeri: 

```java
//instanciranje
LocalDateTime currentDateTime = LocalDateTime.now();

// instanciranje sa odredenim parametrima
LocalDateTime specificDateTime = LocalDateTime.of(2024, 2, 2, 12, 30);

// predaja Stringa kao parametra u LocalDateTime objekt
String dateStr = "2024-02-02T15:45:30";
LocalDateTime parsedDateTime = LocalDateTime.parse(dateStr);

// dodavanje, oduzimanje dane, sate i minute
LocalDateTime futureDateTime = currentDateTime.plusDays(7).minusHours(3).plusMinutes(15);

// dohvacanje komponenti LocalDateTime instance

int year = specificDateTime.getYear();
int month = specificDateTime.getMonthValue();
int day = specificDateTime.getDayOfMonth();
int hour = specificDateTime.getHour();
int minute = specificDateTime.getMinute();

// formatiranje datuma
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
String formattedDateTime = currentDateTime.format(formatter);

// Razdavanje LocalDateTime na LocalDate i LocalTime
LocalDate datePart = specificDateTime.toLocalDate();
LocalTime timePart = specificDateTime.toLocalTime();

// Racunanje razlike izmedu dvije LocalDateTime instance

Duration duration = Duration.between(currentDateTime, specificDateTime);
long daysDifference = duration.toDays();

// Provjervamo je li godina na preskok
boolean isLeapYear = specificDateTime.toLocalDate().isLeapYear();
```

## Switch-case u javi 13
```java
String vrijednost = "2";
String poruka = switch(vrijednost) {
case "1" -> "Odabrana je prva opcija!"; // Omoguceno koristenje labmda izraza u switch-caseu
case "2" -> "Odabrana je druga opcija!";
default -> "Odabrana je podrazumijevana opcija";
};
System.out.println(poruka);

String godisnjeDoba = "Jesen";
String translated = switch (godisnjeDoba) {
case "Proljece":
yield "Spring";
case "Ljeto":
yield "Summer";
case "Jesen":
yield "Fall";
case "Zima":
yield "Winter";
default:
yield "Unknown";
};
System.out.println("Prevedeno godišnje doba: " + translated)
```