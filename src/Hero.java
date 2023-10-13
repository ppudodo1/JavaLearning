public class Hero extends Person{
    String superpower;
    public Hero(String name, int age, String superpower){
        super(name,age);
        this.superpower = superpower;
    }
    @Override
    public String toString(){
        return super.toString() + " "+this.superpower;
    }
}
