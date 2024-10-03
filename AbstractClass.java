abstract class animal{
        abstract void sound(); //abstract method

        void eat(){
            System.out.println("Eating"); //concrete class
        }
    }
    class dog extends animal{
        void sound(){
            System.out.println("Bark!"); //inherits from abstract class
        }
    }
    class cat extends animal{
        void sound(){
            System.out.println("Meow!");
        }

    }

public class AbstractClass {
    public static void main(String[] args) {
        animal dg = new dog();
        animal ct = new cat();

        dg.eat();
        dg.sound();
        ct.eat();
        ct.sound();
    }
}
