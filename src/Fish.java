public class Fish implements Prey,Predator{
    @Override
    public void flee() {
        System.out.println("The fish is fleeing");
    }



    //In this case we have two interfaces in a class and can access both of it's methods because of this

}
