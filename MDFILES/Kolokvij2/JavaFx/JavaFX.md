# JavaFX
JavaFX je Java library za stvaranje grafickih sucelja. Svaka GUI komponenta
je takoder objekt koji se moze koristiti pomocu misa i tipkovnice. U javu je od
samih pocetaka uveden GUI library pod nazivom AWT (Abstract Window Toolkit). Od
Jave SE 1.2 koristi se _Swing_ library koji je primarni skup alata za cuelja u Javi sve do JAVE SE 7
## JavaFX API 
- prvi put je objavljen 2007. godine kao konkuretna tehnlogoija Microsoft Silverlightu
- prva verzija 1.0 objavljena je 2008.godine
- Prije verzije 2.0  koristio se JavaFx Script koji je bio slican JavaScriptu
i prevodio je izvorni kod u bytecode i mogao se izvoditi na JVM
- Od verzije 2.0 koja je objavljena 2011. godine JavaFX je implementiran kao
  skupina librarya
- Objavom Jave 8 objavljena je inačica JavaFX 8

## Primjer JAVAFX aplikacije
```java
public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
    try {
        BorderPane root = new BorderPane();
        Scene scene = new Scene(root,400,400);
        scene.getStylesheets().add(getClass().getResource(
        "application.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.show();
    } catch(Exception e) {
        e.printStackTrace();
    }
}
public static void main(String[] args) {
launch(args);
}
}
```
Objasnjenje:
- Svaka klasa koja predstavlja polaznu točku JavaFX aplikacije mora nasljeđivati klasu
„javafx.application.Application” koja omogućava funkcionalnosti životnog ciklusa
aplikacije kao što su inicijalizacija, pokretanje ili zaustavljanje izvođenja aplikacije
-  Omogućava upravljanje aplikacijom odvojeno od glavne niti
- Sadrži metodu „launch” koja poziva nadjačanu metodu „start”
- Metoda „start” prima objekt klase „javafx.stage.Stage” koji omogućava pokretanje
zasebne niti koja će se izvoditi na grafičkom sučelju aplikacije
- Objekt klase „Scene” potrebno je dodati u objekt klase „Stage” koji omogućava prikaz
grafičkog sučelja
- Koncept JavaFX Scene Graph omogućava korištenje više različitih „Scene” objekata na
jednom „Stage” objektu
- Objekti klase „Scene” omogućavaju postavljanje veličine ekrana, naslova, kao i
  samog organizatora rasporeda komponenti (engl. Layout), npr.: „BorderPane”
- Osim toga omogućeno je definiranje lokacije i naziva CSS datoteke u kojoj se
  nalaze definicije stilova koji se koriste na grafičkom sučelju:
  `scene.getStylesheets().add(getClass().getResource(
  "application.css").toExternalForm());`
- CSS stilovi koji se koriste kod JavaFX-a moraju sadržavati „-fx” prefiks, a mogu se
  primjenjivati korištenjem metode „setStyle”, npr:
  `root.setStyle("-fx-background: rgb(225, 228, 203)");
  primaryStage.setScene(scene);`

## FXML
Scene Builder omogucava dizajniranje grafickog sucelja aplikacije koristenjem
posebno oblikovane XML datoteke koja ima ekstenziju ".fxml" (FX Markup Language)
### Primjer izgleda FXML datoteke:
```java
    <?xml version="1.0" encoding="UTF-8"?>
        <?import javafx.scene.control.*?>
        <?import java.lang.*?>
        <?import javafx.scene.layout.*?>
        <?import javafx.scene.layout.BorderPane?>
<BorderPane prefHeight="287.0" prefWidth="286.0"
        xmlns:fx="http://javafx.com/fxml/1"
        xmlns="http://javafx.com/javafx/8"
        fx:controller="application.SampleController">
<center>
<Button mnemonicParsing="false" text="Moj gumb"
        BorderPane.alignment="CENTER" />
</center>
</BorderPane>
```
## Organizatori rasporeda komponenti
- ### HBox:
  - postavlje elemene te u horiznotalni redak jedan iza drugog
  - Omogucava definiranje razmaka izmedu komponenata koje se mogu mijenjati
  u ovisnosti o velicini komponente (prozora u kojem se nalaze)
  - Primjer:
  ![img.png](img.png)
  ![img_1.png](img_1.png)
- ### VBox:
  - postavlja elemente u vertikalni redak (stupac) jednog ispod drugog
  - Primjer: 
  ![img_2.png](img_2.png)
  ![img_3.png](img_3.png)
- ### FlowPane
  - Omogucava postavljanje komponenti jedne iza druge do kraja raspolozivog retka
  nakon cega se nastavlja u sljedecem retku
  - Primjer:
  ![img_4.png](img_4.png)
- ### BorderPane
  - Omogucava postavaljenje komponenti u pet razlicitih podrucja:
  TOP, LEFT, CETNER, RIGHT, BOTTOM
  - Iako svako podrucje moze imati samo jednu komponentu, moguce je ubaciti drugi
  ugnjezdenji organizator rasporeda komponenti
  - Primjer:
  ![img_5.png](img_5.png)
- ### GridPane
    - Omogucava umetanje elemenata na graficko sucelje koristenjem tablice
  koja ima odreden broj redaka i stupaca
    - Prikladan za kreiranje ekrana koji sadrze forme za unos podataka 