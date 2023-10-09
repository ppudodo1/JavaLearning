public class Human {
    String name;
    int age;
    int weight;
    public Human(){

    }
    public Human(String name, int age){
        this.name = name;
        this.age = age;
    }
    public Human(String name, int age, int weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    void eat(){
        System.out.println("You ate");
    }
}
