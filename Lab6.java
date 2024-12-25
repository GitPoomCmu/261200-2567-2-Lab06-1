public class Lab6 {
    public static void main(String[] args) {
        //Animal cat = new Animal();
        Cow myCow = new Cow("Wagyu");
        Duck myDuck = new Duck("Donald");
        Pig myPig = new Pig("John");
        Owl myOwl = new Owl("Hooty");
        Duck cookedDuck = new PekingDuck("JiaThongHeng");

        myDuck.clean(myCow);
        myDuck.clean(myDuck);
        myDuck.clean(myPig);
        myDuck.clean(myOwl);
        cookedDuck.clean(myDuck);
    }
}

// Main Animal class
abstract class Animal{
    protected String name;
    public String getName() {
        return name;
    }
    abstract public void sound();
}

// Childs of Animal
 // Cow
class Cow extends Animal{
    public Cow(String name){
        this.name = name;
    }
    public void sound(){
        System.out.println("Moo!");
    }
    public void milk(){
        System.out.println("Milked");
    }
}
 // Duck
class Duck extends Animal implements Flyable{
    public Duck(String name){
        this.name = name;
    }
    public void sound(){
        System.out.println("Quack!");
    }
    public void swim(){
        System.out.println("Splash!");
    }
    public void fly(){
        System.out.println("Flap! Flap!");
    }
    public void glide(){
        System.out.println("Whoosh!");
    }
    public void clean(Animal animal){
        System.out.println(this.name + " is cleaning " + animal.name);
    }
}
class PekingDuck extends Duck{
    public PekingDuck(String name){
        super(name);
    }
    public void beCrispy(){
        System.out.println("Grob grob! :P");
    }
    public void clean(Animal animal){
        System.out.println("I can't clean, I'm dead. -" + this.name);
    }
}
 // Pig
class Pig extends Animal{
    public Pig(String name){
        this.name = name;
    }
    public void sound(){
        System.out.println("Oink!");
    }
    public void bacon(){
        System.out.println("RIP");
    }
}
 // Owl
class Owl extends Animal implements Flyable{
    public Owl(String name){
        this.name = name;
    }
    public void sound(){
        System.out.println("Hoot!");
    }
    public void fly(){
        System.out.println("Flap! Flap!");
    }
    public void glide(){
        System.out.println("Whoosh!");
    }
}