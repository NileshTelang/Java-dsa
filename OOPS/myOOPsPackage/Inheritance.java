package myOOPsPackage;

public class Inheritance {
    
    public static void main(String[] args) {
        Fish arpichu = new Fish();
        System.out.println("\nArpichu\n");
        arpichu.eat();
        arpichu.breath();
        arpichu.swim();

        System.out.println("\n\nPikachu\n");

        Tuna pikachu = new Tuna();
        pikachu.eat(); //from fish 
        pikachu.breath(); //from Animals
        pikachu.swim(); //from tuna
        pikachu.fins = 4 ;//from Fish 

        System.out.println("\n\nPatil\n");

        Birds patil = new Birds();
        patil.eat();
        patil.fly();
    }
}

//base class
class Animal {
    String name;
    void eat(){
        System.out.println("Eats");
    }

    void breath(){
        System.out.println("Breaths");
    }
}

//Inherited / Derived Classes
class Fish extends Animal { //Single - level
    int fins;
    void eat(){
        System.out.println("Machali Jal ki Raani Hai , usko khana meri manmani Hai ");
    }
    void swim(){
        System.out.println("I have fins but i can't swim , i'm useless !");
    }
}

class Tuna extends Fish { // Multi - level  
    void swim(){
        System.out.println("I'm Tuna nd I can Swim");
    }
}

class Birds extends Animal { //Heirarchical
    int feathers;
    void fly(){
        System.out.println("Panchi Banu Udati Firu Mast Gagan Main , Aaj Main Azad Hu Duniya Ki Chaman Se");
    }
}

//overall Hybrid Inheritance Animal -> Fish -> Tuna
//                                  -> Birds

//Multiple Inheritance is absent in java , hence Implemented Indirectly - > through Interfaces 

