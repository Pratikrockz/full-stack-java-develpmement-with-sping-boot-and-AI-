class A{
public void show() throws ClassNotFoundException{
Class.forName("demo");
}
}




public class DuckingException {
    public static void main(String[] args) {
        A obj =new A();

        try {
            obj.show();
        } catch (ClassNotFoundException e) {
           
            e.printStackTrace();
        }
    }
}
