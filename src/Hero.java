public  class Hero extends Person{
    String superpower;
    public Hero(String superpower){

        this.superpower = superpower;
    }
    @Override
    public String toString(){
        return this.superpower;
    }

    @Override
    void speak() {
        System.out.println("Hi");
    }
}
