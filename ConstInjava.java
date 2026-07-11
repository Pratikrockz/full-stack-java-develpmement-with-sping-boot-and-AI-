//final c an be used to const in variable method and class


class Pratik{
    // public final void show(){  // If we not using final it can override easily but if we use final It can not be over ride  
    //     System.out.println("It is pratik"); 
    // }

    public  void show(){  // If we not using final it can override easily but if we use final It can not be over ride  
        System.out.println("It is pratik"); 
    }
}

class John extends Pratik{
    public void show(){
        System.out.println("It is pratik");
    }
}





public class ConstInjava {
    public static void main(String[] args) {
        John john =new John();

        john.show();
    }
}
