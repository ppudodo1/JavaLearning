# Zadaci vezani uz polimorfizam i nasljedivanje
1. Na koje sve od navedenih nacina je moguce kreirati objekt klase "VeleucilisteJave" koja
nasljeduje klasu ObrazovnaUstanova i implementira sucelje "VisokoSkolska" (moguce vise odgovora)?
```java
public class VeleucilisteJave extends ObrazovnaUstanova implements VisokoSkolska{}
public class ObrazovnaUstanova{}
public interface VisokoSkolska{}
public class Main {

    public static void main(String[] args) {
        VeleucilisteJave veleucilisteJave = new VeleucilisteJave(); // Tocno
        VeleucilisteJave veleucilisteJave1 = new ObrazovnaUstanova();// Netocno
        ObrazovnaUstanova veleucilisteJave2 = new VeleucilisteJave();// Tocno
        VeleucilisteJave veleucilisteJave3 = new VisokoSkolska(); // Netocno
        VisokoSkolska veleucilisteJave4 = new VeleucilisteJave(); // Tocno
        ObrazovnaUstanova veleucilisteJave5 = new VisokoSkolska();//Netocno
    }
        
}
```
Objasnjenje: Mozemo kreirati objekt nadklase pomocu poziva konstruktora podklase, a obrnuto ne mozemo. Ovo je nacelo
polimorfizma.

2. Sto ce ispisati sljedeci program?
```java
public abstract class Prva{
    public abstract void metoda();
    public abstract String metoda();
}
public class Druga extends Prva{
    @Override
    public void metoda(){
        System.out.println("Pozvana je prva metoda");
    }
    @Override
    public String metoda(){
        System.out.println("Pozvana je druga metoda");
        // ovdje vec mozemo zamjetiti gresku jer u metodi nismo stavili return
        // a u deklaraciji imamo return type String
    }
}
public class Main {

    public static void main(String[] args) {
       Prva objekt = new Druga(); // ovo je u redu radi nacela polimorfizma
        objekt.metoda(); // ovo je prva metoda koja bi trebala biti pozvana
        String vrijednost = objekt.metoda(); // druga metoda sa return type String
        System.out.println(vrijednost);
    }
        
}
```
Objasnjenje: Ovdje se nece nista ispisati jer ce compiler javljati gresku i prije prevodanje
jer nismo naveli return u metodi koja vraca `String`

# Zadaci vezani uz iznimke
1. Koje od navedenih Iznimaka se ne smiju obradivati od strane programera?
NullPointerException, IOException, InputMismatchException, SQLException, FileNotFoundException,
StackOverFlowError.

Odgovor: `NullPointerExcepetion` i `StackOverFlowError`. `NullPointerException` se po nekim
nacelima programiranja ne bi smio hvatati jer bi onda vrsili neke operacije nad `null` 
vrijednostima sto moze dovesti do velikih bugova u aplikaciji. Dok `StackOverFlowError`
je greska pri trosenju memorije stoga odnosno potrosili smo memoriju racunala. Bilo sto sto
nasljeduje exception `Error` se NE SMIJE OBRADIVATI.
2. Sto nedostaje sljedecem programskom isjecku kako bi na ispravan nacin odredivao prosjek
ocjena na ispitima studenata te bacati oznacenu iznimku u slucaju negativne ocjene?
```java
default BigDecimal odrediProsjekOcjenaNaIspitima(Ispit[] ispiti) throws 
NemoguceOdreditiProsjekStudentaException{
    int suma = 0;
    for(Ispit ispit: ispiti){
        if(ispit.getOcjena() == Glavna.OCJENANEDOVOLJAN){
            throw new NemoguceOdreditiProsjekStudentaException("Nemoguce")
        }    
        suma += ispit.getOcjena();
    }
    if(ispiti.length>0){
        float prosjek = (float) suma / ispiti.length;
        return new BigDecimal(prosjek)
    }else{
        return new BigDecimal(1);    
    }
    
}
```
Odgovor: Ne treba promijeniti nista kod ce raditi sasvim u redu. Ako dode do bacanja iznimke
program ce se zaustaviti i nece dalje racunati sumu.
3. Koje iznimke su bile koristene u prve tri laboratorijeske vjezbe?
IOException, NullPointerException, InputMismatchException, FileNotFoundException,
ArrayIndexOutOfBoundsExceptin, nijedna od navedenih.

Odgovor: InputMismatchException
4. Sto od navedenoga je nuzno promijeniti kako bi se mogla prevesti metoda bez sintaksnih 
pogresaka i izracunavao iznos poreza uz bacanje iznimke u slucaju preniske cijene, ako se
radi o neoznacenoj iznimci
```java
public default BigDecimal izracunaj(int vrijednost){
    if(vrijednost<10000){
        throw new Preniska("Vrijednsot ne smije biti manja od 10000!");
    }
    return cijena = cijena*3;
}
```
Odgovor: Nista se ne treba promijeniti jer je programski isjecak u potpunosti ispravan
5. Koja je razlika izmedu kljucnih rijeci `throw` i `throws`
Odgovor: `throw` se koristi kod svih bacanja iznimaka, a `throws` kod deklaracije metode
koja moze baciti iznimku