


public class Abstraction {
    
    public static void main(String[] args) {
        
        Horse h = new Horse();
        System.out.println(h.legs); //Animal constructor -> Horse Constructor i.e. 5 -> 2
        h.eat();
        h.walk();
        h.changeLegCount(); 
        System.out.println(h.legs);
    }
}

abstract class Animal { //abstract - cannot intantiate
    int legs ;
    void eat(){
        System.out.println("Eats");
    }
    abstract void walk(); //abstract gives idea , cannot define
    Animal(){
        legs = 5;
        System.out.println("Animal Constructor Called !");
    }
}

class Horse extends Animal {
    void walk(){
        System.out.println("Walks On 4 Legs");
    }
    Horse(){
        legs = 2;
        System.out.println("Horse Constructor called !");
    }
    void changeLegCount(){
        legs = 4;
    }
}