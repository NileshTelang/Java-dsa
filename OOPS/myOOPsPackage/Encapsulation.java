package myOOPsPackage;

//OOPS - > 
            //4 PILLARS - 1 . Encapsulation
            //            2 . Inheritance
            //            3 . Polymorphism
            //            4 . Abstraction

          
public class Encapsulation {

    public static void main(String[] args) {

        bankAccount a1 = new bankAccount();
        bankAccount a2 = new bankAccount();
        a1.username = "Nova Fire";
        //a1.password = "visco"; //visibility is private
        a1.setPassword("visco");
        a2.setPassword("gama");
        System.out.println(a2.getPassword());

        pen p1 = new pen();
        pen p2 = new pen("Sky Blue");
        p2.marks[0]= 100;
        p2.marks[1]=50;

        pen p3 = new pen(p2);

        p2.color = "Red";
        p2.marks[1]=70;
        System.out.println("Pen Color Of Pen 3 Is - "+p3.color); //still sky blue for p3 - > deep copy
        for(int i = 0;i<p3.marks.length;i++){
            System.out.println(p3.marks[i]+" ");                 //shallow copy marks[1] updated
        }
    }
}

// other classes preferred to write below public class


class pen {
    String color;
    int tip;
    int marks [];
    int tipSize(int tipSize){
        tip = tipSize ;
        return tip ;
    }

    pen(){
        System.out.println("Non - parameterized Constructor Called !");
        marks = new int [2];
    }

    pen(String color){
        System.out.println("Parameterized Constructor Called !");
        this.color = color;
        marks = new int [2];
    }

    pen(pen p){
        System.out.println("Shallow Copy Constructor Called !");
        this.color = p.color; //deep copy
        this.tip = p.tip;     //deep copy
        marks = new int[2];
        this.marks = p.marks; //shallow copy - referencial copy for structure like array 
    }

    // pen(pen p){
    //     System.out.println("Deep Copy Constructor Called !");
    //     this.color = p.color; //deep copy
    //     this.tip = p.tip;     //deep copy
    //     marks = new int [2];
    //     for(int i = 0;i<marks.length;i++){
    //         this.marks[i] = p.marks[i]; //deep copy constructor
    //     }
    // }

    //destructors - > Garbage Collectors Inbuilt Destructor
                    //not useful objects get freed up from memory 
    
}

class bankAccount{
    public String username ;
    private String password ;

    //to set password 
    public void setPassword(String pwd){ 
        this.password = pwd;
    }

    //to get password
    public String getPassword(){
        return this.password; //this keyword for that object 
    }
}