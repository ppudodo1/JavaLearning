# JavaFX MVC
- JavaFX se temelji na MVC (Model View Controller) arhitekturi
- Odvaja slojeve aplikacije koji prestavljauju podatke( Model), graficko
sucelje (View) i poslovnu logiku aplikacije (Controller)
- Poslovna logika se implementira unutar klasa koje povezuju elemente grafickog
sucelja s metodama koje se moraju izvoditi tijekom interakcije korisnika s tim elementima
- Za ostvarivanje veze izmedu grafickog sucelja i poslovne logike, elementima 
grafickog sucelja potrebno je dodijeliti posebne identifikatore

## Controller klasa
- Sadrzi varijable koje po tipu i nazivu odgovaraju elementima grafickog
sucelja, kako bi se mogle koristiti njihove znacajke i atributi
- Naziv Controller klase mora biti povezan s grafickim suceljem koristenjem
FXML konfiguracije
- Svaka Controller klasa treba imati svoju `initialize` metodu odnosno konstruktor
oznacen sa FXML anotacijom koja sadrzi svu logiku potrebnu za incijializaciju
osnovnih postavki elemenata na grafickom sucelju

- ### Primjer povezizavanja Controller klase i FXML datoteke
```fxml
<BorderPane minWidth="-1.0" prefHeight="380.0" prefWidth="558.0"
xmlns:fx="http://javafx.com/fxml/1" xmlns="http://javafx.com/javafx/2.2"
fx:controller="hr.tvz.java.vjezbe.controller.KnjigeController">
```
## Anotacija `@FXML`
- Sluzi za oznacavanje elemenata koji se koriste unutar FXML datoteke
- Moze se koristiti kod varijabli koje predstavljaju graficke elemente
ili metoda koje se pozivaju prilikom interakcije s nekim od grafickih elemenata

## JavaFX zbirke

- Pri radu s podacima na grafickom sucelju JavaFX koristi sljedece zbirke
    - ObservableList: predstavlja listu koja omogucava pracenje promjena na ekranu
    koristenjem Listenera
    - ObservableMap: predstavlja mapu koja omogucava pracenje promjena na ekranu koristenjem Listenera
    - ListChangeListener i MapChangeListener: predstavljaju implementacije Listener klasa koje sluze za primanje notifikacija koje generira objekt klase `ObservableList` I `ObservableMap`
- Neke od korisnih klasa su:
    - FXCollections: sadrzi istovjetne staticke metode onima u klasi java.util.Collections
    - ListChangeListener.Change: instance koje predstavljaju promjene nad ObservableList zbirkom
    - MapChangeListener.Change: instance koje predstavljaju promjene nad ObservableMap zbirkom
### Primjer koristenja ObservableList zbirke
```java
ObservableList<Knjiga> listaKnjiga = FXCollections
.observableArrayList(filtriraneKnjige);
ObservableList<Knjiga> listaKnjiga = FXCollections
        .observableArrayList(filtriraneKnjige);
```
## Povezivanje stupaca tablice sa varijablama u objektima
Primjer:
```java
@FXML
private TableColumn<Knjiga, String> nazivKnjigeColumn;
@FXML
public void initialize() {
        nazivKnjigeColumn.setCellValueFactory(
            new Callback<TableColumn.CellDataFeatures<Knjiga,String>, ObservableValue<String>>() {
                public ObservableValue<String> call(TableColumn.CellDataFeatures<Knjiga, String> param) {
                    return new ReadOnlyStringWrapper(param.getValue().getNaziv());
            }
        });
```
## Povezivanje akcija s izbornikom
- Izbornik za odabir opcija sastoji se od Menu i MenuItem elemenata
Primjer povezivanja MenuItem elementa sa pripadajucom akcijom:
```java
public void prikaziKnjige() {
    try {
        BorderPane knjigaPane =
        FXMLLoader.load(JavaFXGlavna.class.getResource("../javafx/knjige.fxml"));
        JavaFXGlavna.setCenterPane(knjigaPane);
    } catch (IOException e) {
        e.printStackTrace();
    }
}
```

# Dodatno za JavaFX MVC
- ### Nacini za dohvacanje i postavljanje vrijednosti odredenih elemenata
  
  ```java
         @FXML
        private ComboBox<String> category;
        private CheckBox check;
        private ColorPicker colorPicker;
        public void initialize(){
            category.getItems().addAll("Food","Technical equipment","Literature");
            test.setSelected(true);
            colorPicker.setValue(Color.RED); //enum
        }     
        public void getValue(){
            String val = category.getValue();
            Boolean val2 = check.isSelected();
            Color colorvalue = colorPicker.getValue();
        }     
  ```
- ### Postavljanje vrijednosti u tablicu se vrsi pomocu metode `setCellValueFactory`. Evo primjera takve 
metode:
```java
itemNameTableColumn.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<Item,String>, ObservableValue<String>>(){
    public ObservableValue<String> call(TableColumn.CellDataFeatures<Item, String> param) {
        return new ReadOnlyStringWrapper(param.getValue().getName());
    }
});
```
-  Objasnjenje ovog koda:
    - pozivamo `setCellValueFactory` metodu nad objektom kako bi mogli postaviti vrijednost celije na UI-u
    - unutar te metode pozivamo anonimnu klasu (slicno kao u JS-u) naziva `Callback` koja prima dva genericka paramtera
   u nasem slucaju to su podatci o celiji u koju zapisujemo podatke i tip objekta koji cemo zapisivati u celiju u nasem slucaju
   to je `Observable` tip objekta.
    - U nastavku pisemo metodu `call` koja je pokrenuta od strane JavaFX-a kako bi dobili vrijednost koja ce biti zapisana
   u celiji
    - U `call` metodi pisemo `return new ReadOnlyStringWrapper` sto nam daje tip objekta Observable<String> koji se moze
   zapisati na UI
   
- ### Primjer koristenja `ListChangeListener` klase:
```java

    public void initialize() {
        // ... your existing code ...

        // Add a ListChangeListener to the itemsTableView's items
        ObservableList<Item> itemsList = itemsTableView.getItems();
        itemsList.addListener((ListChangeListener<Item>) change -> {
            // Handle changes to the itemsList here
            while (change.next()) {
                if (change.wasAdded()) {
                    // Handle added items
                    System.out.println("Item(s) added");
                }
                if (change.wasRemoved()) {
                    // Handle removed items
                    System.out.println("Item(s) removed");
                }
                // Handle other change types if needed
            }
        });
    }
```