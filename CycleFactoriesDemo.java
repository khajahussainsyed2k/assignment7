package com.company;
import java.util.ArrayList;
interface Cycle {
    void typeDescription();
}
class Unicycle implements Cycle {
    @Override
    public void typeDescription() {
        System.out.println("Unicycle has Single Wheel");
    }
}

class Bicycle implements Cycle {
    @Override
    public void typeDescription() {
        System.out.println("Bicycle has two Wheels");
    }
}
class Tricycle implements Cycle {
    @Override
    public void typeDescription() {
        System.out.println("Triicycle has Three Wheel");
    }
}
abstract class CycleFactory {
    public abstract Cycle createInstance();
}
class BicycleFactory extends CycleFactory {
    @Override
    public Cycle createInstance() {
        return new Bicycle();
    }
}


class TricycleFactory extends CycleFactory {
    @Override
    public Cycle createInstance() {
        return new Tricycle();
    }
}

class UnicycleFactory extends CycleFactory {
    @Override
    public Cycle createInstance() {
        return new Unicycle();
    }
}

public class CycleFactoriesDemo
{
    public static void main(String args[]) {
        UnicycleFactory unicycleFactory = new UnicycleFactory();
        BicycleFactory bicycleFactory = new BicycleFactory();
        TricycleFactory tricycleFactory = new TricycleFactory();
        //add instances to arraylist
        ArrayList<Cycle> arr = new ArrayList<>();
        arr.add(unicycleFactory.createInstance());
        arr.add(bicycleFactory.createInstance());
        arr.add(tricycleFactory.createInstance());
        //for every item array list i.e instances of classes we are calling the method
        for(Cycle cycle:arr)
            cycle.typeDescription();
    }
}