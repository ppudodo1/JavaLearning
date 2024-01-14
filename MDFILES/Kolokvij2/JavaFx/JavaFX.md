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

## Zadaci sa kolokvija

1.zad:

![img_6.png](img_6.png)

Riješenje: void initialize() => na ovo mozemo gledati kao konstruktor ekrana koji se ucita u JavaFx

2. zad:

![img_7.png](img_7.png)

Riješenje: FlowPane, HBox, Vbox i BorderPane => Jos provjeriti

3. zad:

![img_8.png](img_8.png)

Riješenje: TextField,

Controller => Ne postoji

Scrollbar izgleda ovako te imamo horizontalni i vertikalni

![img_21.png](img_21.png)


4. zad:

![img_9.png](img_9.png)

GridPane koristi zamijenjene pozicije indeksa za retke i stupce

Primjer:
```java
public class GridPaneExample extends Application {

    @Override
    public void start(Stage primaryStage) {
        GridPane gridPane = new GridPane();

        // Dodajemo nekoliko dugmadi na različite pozicije unutar GridPane-a
        Button button1 = new Button("Button 1");
        gridPane.add(button1, 0, 0); // Stupac 0, Red 0

        Button button2 = new Button("Button 2");
        gridPane.add(button2, 1, 0); // Stupac 1, Red 0

        Button button3 = new Button("Button 3");
        gridPane.add(button3, 0, 1); // Stupac 0, Red 1

        Button button4 = new Button("Button 4");
        gridPane.add(button4, 1, 1); // Stupac 1, Red 1

        Scene scene = new Scene(gridPane, 300, 200);
        primaryStage.setTitle("GridPane Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
```


5. zad:

![img_10.png](img_10.png)

Rijesenje:

![img_11.png](img_11.png)

Kao što piše ovdje ne treba napraviti nista jer se `initialize` metoda ponasa kao konstruktor
odnosno poziva se automatski kada se ucita ekran koji koristi `StartController`.

6. zad:

![img_12.png](img_12.png)

Kao što je obojano crnom bojom vidi se Menu, tocno bi bilo i da kazemo da se vidi 
MenuBar zato sto je MenuBar kontejner za Menu komponente. Menu komponente su u ovom slucaju
`Županije`,`Simpotomi`,`Bolesti`,`Virusi` i `Osobe`. Tko god da je rijesavao ovaj ispit
je zaokruzio MenuItem sto je netocno. MenuItem je komponenta koja nam iskoci kada hoveramo
preko Menu komponente.

Primjer MenuItema i ostalih komponenta:

![img_22.png](img_22.png)

7. zad:

![img_13.png](img_13.png)

Moj primjer:
```java
package hr.java.production;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.ScrollPane;
import javafx.scene.input.MouseButton;
import javafx.stage.Stage;
import javafx.scene.control.MenuItem;

import java.io.IOException;

public class HelloApplication extends Application {
    public static Stage mainstage;
    @Override
    public void start(Stage stage) throws IOException {
        ScrollPane scrollPane = new ScrollPane();
        // Add your content to the scroll pane

        ContextMenu contextMenu = new ContextMenu();
        MenuItem menuItem = new MenuItem("Context Menu Item");
        contextMenu.getItems().add(menuItem);

        scrollPane.setOnMousePressed(event -> {
            if (event.getButton() == MouseButton.SECONDARY) {
                contextMenu.show(stage, event.getScreenX(), event.getScreenY());
            }
        });

        Scene scene = new Scene(scrollPane, 300, 200);
        stage.setScene(scene);
        stage.setTitle("Context Menu Example");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
    public static Stage getStage() {
        return mainstage;
    }
}
```

8. zad:

![img_14.png](img_14.png)

Ovaj zadatak ovdje je klasicna Radovanova igra rijecima. `@FXML` anotacija se koristi
samo kod komponenata koje se nalaze u FXML datoteci. Ta anotacija se koristi kako bi
mogli povezati varijablu ili metodu sa tom grafickom komponentom, ova definicija je uzeta
iz Radovanove prezentacije. Ali prema mome iskustvu ta @FXML anotacija se **moze** i **ne mora**
koristiti sa metodoma, dok je kod varijabli obavezna ako se ne stavi kod varijabli bacat ce gresku.
U zadatku se koristi rijec _potrebno_ te su u pitanje metode nad kojima **NIJE POTREBNO** staviti tu anotaciju, a ne varijable tako da bi tocan
odgovor bio: **Nijednu**. Ps: ja u laboratorijskim vjezbama kad bi pisao metode u `Controller` klasama
nikad nisam koristio `@FXML` anotaciju, samo za varijable. Ovakav zadatak je najbolje ne odgovoriti
ili procitati svaku rijec 100 puta da znate sto Radovan misli, a ni onda nije zagarantiran tocan odgovor.
9. zad:

![img_15.png](img_15.png)
Ovaj zadatak je isto cisti zajeb te ako tocno odgovoris je na srecu. Problem
predstavlja ponudena `ChoiceBox` komponenta koja navodno nije vidljiva, ali `ChoiceBox`
i `ComboBox` su jednaki po izgledu iako imaju razlicite funkcionalnosti. Prema Radovanovom
vidljiv je samo `ComboBox` iako ovo moze vrlo lako biti `ChoiceBox`. Predpostavljam da ako vidi
da puno ljudi prolazi kolokvij samo promjeni odgovor ovdje da bi ih mogao sto vise bacit.

Slika: ChoiceBoxa i ComboBoxa jedan ispod drugog. ChoiceBox je na vrhu

![img_23.png](img_23.png)


10. zad: 

![img_16.png](img_16.png)

Ne postoji `TablePane`. 
11. zad:

![img_17.png](img_17.png)

Evo primjera koda u kojem se koristi ta metoda:
```java
scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
root.setStyle("-fx-background: rgb(225, 228, 203)");
```

Vezano za ovaj zadatak sa dodavanjem stvari. FXML file se dodaje na ovaj nacin. Koristi se metoda `load`
```java
BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("Sample.fxml"))
// ili mozemo koristiti konstruktor FXMLLoader objekta
FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
```

12. zad:

![img_18.png](img_18.png)

Objasnjenje: `FXMl` anotaciju koristimo kada mijenjamo vrijednosti nekog elementa npr. TextFielda ili ComboBoxa,
ali kada imamo `button` ili neki drugi element kojemu ne mijenjamo vrijednost ne moramo koristiti `@FXML` anotaciju. 
Za gornji primjer vjv. u Controller klasi ni necemo definirati button komponentu jer cemo na nju samo dodati metodu u SceneBuilderu.
Stoga su odgovori: `TextField` i `ComboBox`
13. zad:

![img_19.png](img_19.png)

Rijesenje: setValues i setComponents metode ne postoje za ComboBox, niti postoje toArrayList
i observableCollection metode za FXCollections klasu
14. zad:

![img_20.png](img_20.png)

Ovaj zadatak je prije objasnjen
Rijesenje: F

# Dodatno za JavaFX
![javaUi.png](..%2F..%2F..%2F..%2Fkolokvij%2FjavaUi.png)