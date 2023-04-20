package myOOPsPackage;
//Polymorphism -> 1 . Compile Time - Method Overloading (static)
//                2 . Run Time - Method Overriding (dynamic)

public class Polymorphism {
    
    public static void main(String[] args) {

        Calculator c = new Calculator();
        System.out.println(c.sum((float)2.5,(float)2.5)); //method overloading - compiler knows which function to call

        Fish pikachu = new Fish();
        pikachu.eat(); //method Overriding
    }
}

// 1 . 0
class Calculator {
    
    int sum (int a, int b){
        return a + b ;
    }

    int sum (int a, int b , int c){
        return a + b + c ;
    }

    float sum (float a, float b){
        return a + b ;
    }
}

// 2 . 0
class Animal {
    void eat(){
        System.out.println("Eats");
    }
}


class Fish extends Animal { 
    void eat(){ //Method Overriding
        System.out.println("Machali Jal ki Raani Hai , usko khana meri manmani Hai ");
    }
}