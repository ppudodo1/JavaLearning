public interface Prey extends Predator{

    void flee(); // interfaces work like abstract classes and can contain abstract methods
    public static boolean provjeri(String tekst){
        if(tekst == null || tekst.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
}
