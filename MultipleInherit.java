interface animal{
    void eat();
} 
interface aquatic{
    void drink();
}
class amphibian implements animal,aquatic{
    public void eat(){
        System.out.println("Eating");
    }
    public void drink(){
        System.out.println("Drinking");
    }
}

public class MultipleInherit {
    public static void main(String[] args) {
        amphibian ab = new amphibian();
        ab.drink();
        ab.eat();
    }
}
