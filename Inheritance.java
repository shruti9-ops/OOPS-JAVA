class Base{
    int x;
    public int  get(){
        return x;
    }
    public void set(int x){
        this.x = x;

    }
    public void printme(){
        System.out.println("I am the print function");
    }
}
class Derived extends Base{
    public void add(){
        System.out.println("added new properties!!!!!!!!!!");
    }
}
class Animal{
    public void Legs(){
        System.out.println("Animal has 4 legs");
    }
    public void sense(){
        System.out.println("All animals can sense");

    }
    public void move(){
        System.out.println("All animals can move!!");
    }
}
class Dog extends Animal{
    public void breed(){
        System.out.println("The Best breed is: Boxers");
    }
    public void smell(){
        System.out.println("Dogs has a good ability to smell");
    }
    public void Bark(){
        System.out.println("Dogs have barking power!!!");
    }
}
class ConstructorInheritance{
    



    // new added
}
public class Inheritance {
    public static void main(String args[]){
        Base b = new Base();
        b.printme();
        b.set(12);
        System.out.println(b.get());
        Derived d = new Derived();
        d.printme();
        d.set(121);
        System.out.println(d.get());
        d.add();
        Animal a = new Animal();
        a.Legs();
        a.move();
        a.sense();
        Dog dog= new Dog();
        dog.Legs();
        dog.Bark();
        dog.breed();
        dog.smell();
        dog.sense();
        dog.move();
    }
}
