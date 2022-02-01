package com.company;
abstract class Rodent{
    Rodent(){
        System.out.println("inside rodent's constructor");
        }
    public abstract void eat();
    public abstract void display();
}

class Mouse extends Rodent{
    Mouse(){
        System.out.println("inside mouse's constructor");
    }
    public void eat(){
        System.out.println("mouse is having breakfast");
    }
    public void display(){
        System.out.println("I am a mouse");
    }
}

class Gerbil extends Rodent{
    Gerbil(){
        System.out.println("inside Gerbil's constructor");
    }
    public void eat(){
        System.out.println("Gerbil is having lunch");
    }
    public void display(){
        System.out.println("I am a gerbil");
    }
}

class Hamster extends Rodent{
    Hamster(){
        System.out.println("inside Hamster's constructor");
    }
    public void eat(){
        System.out.println("Hamster is having dinnner");
    }
    public void display(){
        System.out.println("I am a hamster");
    }
}

public class MainClass {

    public static void main(String[] args) {
	// write your code here
        Rodent[] rodent = new Rodent[3];
        rodent[0] = new Mouse();
        rodent[0].eat();
        rodent[0].display();
        rodent[1] = new Gerbil();
        rodent[1].eat();
        rodent[1].display();
        rodent[2] = new Hamster();
        rodent[2].eat();
        rodent[2].display();
    }
}
