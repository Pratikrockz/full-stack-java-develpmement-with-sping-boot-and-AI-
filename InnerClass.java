class A{
    public void show(){
        System.out.println("this is A");
    }
}



public class InnerClass {
    public static void main(String[] args) {
       //// A show=new A(); 
       // show.show();

        //If we want to change the behaviour of class A using inner class

        A show=new A(){
            public void show(){
                System.out.println("this is inner class");
            }
        };

        show.show();
        


    }
}
