package com.company;
interface Interface1{
    public void firstMethod1();
    public void firstMethod2();
}
interface Interface2{
    public void secondMethod1();
    public void secondMethod2();
}
interface Interface3{
    public void thirdMethod1();
    public void thirdMethod2();
}
interface ExtendingInterface extends Interface1,Interface2,Interface3{
    public void extendMethod();
}
class ConcreteClass{
    public void concreteMethod(){
        System.out.println("inside concrete class method");
    }

}


public class InterfaceDemo extends ConcreteClass implements ExtendingInterface {

    @Override
    public void firstMethod1() {
        System.out.println("First Interface First Method");
    }

    @Override
    public void firstMethod2() {
        System.out.println("First Interface Second Method");
    }

    @Override
    public void secondMethod1() {
        System.out.println("Second Interface First Method");
    }

    @Override
    public void secondMethod2() {
        System.out.println("Second Interface Second Method");
    }

    @Override
    public void thirdMethod1() {
        System.out.println("Third Interface First Method");
    }

    @Override
    public void thirdMethod2() {
        System.out.println("third Interface Second Method");
    }

    @Override
    public void extendMethod()
    {
        System.out.println("Extending Interface Method");
    }
    public void First(Interface1 firstInterface){
        firstInterface.firstMethod1();
        firstInterface.firstMethod2();
    }
    public void Second(Interface2 secondInterface){
        secondInterface.secondMethod1();
        secondInterface.secondMethod2();
    }
    public void Third(Interface3 thirdInterface){
        thirdInterface.thirdMethod1();
        thirdInterface.thirdMethod2();
    }
    public void Extended(ExtendingInterface extendingInterface){
        extendingInterface.extendMethod();
    }
    public static void main(String args[]){
        InterfaceDemo demo=new InterfaceDemo();
        demo.First(demo);
        demo.Second(demo);
        demo.Third(demo);
        demo.Extended(demo);
    }
}
