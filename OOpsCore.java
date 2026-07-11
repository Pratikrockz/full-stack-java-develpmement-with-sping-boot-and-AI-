//Super class is always present in each class which is actually calling default constructor
// not parametarised constructor 

//If we want to call super class parametarised constructor we have to pass value then we have to mention super(2)

// This ll call the very constructor of any class whose object is creating


///// Super ll call the super class constructor  This ll call the every constructor of that same class
class a{
    public a(){
        super() ; 
        System.out.println("in a");
    }

    public a(int n){
        super();
        System.out.println("in a int");
    }
}

class b extends a{
   
    public b(){
        super();
        System.out.println("in b");
    }

    public b(int n){
        this();
        //super(5);
        System.out.println("in b int");
    }
}









public class OOpsCore {
    public static void main(String[] args) {
        //a A= new a();

       // a A= new a(5);
       
       b B = new b(5);

    }
}
