package com.company;
class FirstOuterClass {
    class FirstInnerClass{
        public FirstInnerClass(String variable){
            System.out.println("First Inner Class Variable : "+variable);
        }

    }
}
class SecondOuterClass extends FirstOuterClass{
    class SecondInnerClass extends FirstInnerClass{

        public SecondInnerClass(String variable) {
            super(variable);
            System.out.println("Second Inner Class  Variable: "+variable);
        }
    }
}

public class Assignment7.5 {

    public static void main(String[] args) {
        // write your code here
        FirstOuterClass firstOuterClass=new FirstOuterClass();
        //creating first inner class object using instance of outer class
        FirstOuterClass.FirstInnerClass firstInnerClass=firstOuterClass.new FirstInnerClass("Hello");
        SecondOuterClass secondOuterClass=new SecondOuterClass();
        SecondOuterClass.SecondInnerClass secondInnerClass=secondOuterClass.new SecondInnerClass("World");
    }
}


