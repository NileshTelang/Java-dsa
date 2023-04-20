

//Interfaces - > 1 . Multiple Inheritance 
//               2 . Total Abstraction
//static keyword
//super keyword

public class Interfaces {

    public static void main(String[] args) {

        Queen q = new Queen();
        q.moves();

        Nil nil = new Nil();
        nil.god();
        nil.human();
        nil.name = "Nil";
        Nil.name = "Nova"; //we can call static keyword with class name

        Nil pikachu = new Nil();
        System.out.println("Tell me your God -> " + pikachu.getGodName());

        B nova = new B();
        System.out.println(nova.powers);
    }
}

interface ChessPlayer {
    void moves(); // public , abstact by default
}

class Queen implements ChessPlayer {
    public void moves() {
        System.out.println("All D");
    }
}

class Rook implements ChessPlayer {
    public void moves() {
        System.out.println("UNL Moves - U D L R");
    }
}

class King implements ChessPlayer {
    public void moves() {
        System.out.println("1 Move - U D L R");
    }
}

// multiple inheritance
interface God {
    void god();
}

interface Human {
    void human();
}

class Nil implements God, Human {

    int powers = 7 ;
    
    public void god() {
        System.out.println();
    }

    public void human() {
        System.out.println("I'm Humanly God");
    }

    // static keyword
    static String name;

    static String getGodName() {
        return name;
    }

    Nil() {
        System.out.println("\nNil Called");
    }

}

class A extends Nil {
    A() {
        super.powers = 5; //immediate parent class variable invoked , powers changed
        System.out.println("\nA Called");
    }
}

class B extends A {
    B() {
        super(); // immediate parent constructor invoked
        // super.powers = 7;
        System.out.println("\nB Called");
    }
}
