/**
 * InnerInterface here we dont need to make public void show();
 * here interfae makes ever method as public abstract
 */
interface A {
void show();
void config();

    
}



class B implements A{ // We have to make every method which are present in interface
    public void show(){
        System.out.println("within show");
    }

    public void config(){
        System.out.println("within config");
    }
}



public class Interface {
    public static void main(String[] args) {
        A obj =new B();
        obj.show();
        obj.config();
    }
}
