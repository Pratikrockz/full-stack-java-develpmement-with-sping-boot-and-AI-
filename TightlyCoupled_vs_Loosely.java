
//This is called tightly couple I have to change everytime the code of developer argument 


// class Desktop{
//     public void machine(){
//         System.out.println("working on desktop");
//     }
// }


// class Laptop {
//     public void machine(){
//         System.out.println("working on laptop");
//     }
// }


// class Developer{
//     public void code( Desktop desk){
//         desk.machine();
//     }
// }




// public class TightlyCoupled_vs_Loosely {
//     public static void main(String[] args) {
//         Desktop desk =new Desktop();
//         Laptop lap =new Laptop();
//         Developer pratik =new Developer();

//        pratik.code(desk);

//     }
// }



/// This is called loosely coupled


/**
 * InnerTightlyCoupled_vs_Loosely
 */
interface InnerTightlyCoupled_vs_Loosely {

    void code();
}



class Desktop implements InnerTightlyCoupled_vs_Loosely{
    public void code(){
        System.out.println("working on desktop");
    }
}


class Laptop implements InnerTightlyCoupled_vs_Loosely {
    public void code(){
        System.out.println("working on laptop");
    }
}

//When i am using interface we dont need to mention the argument each time we just mark it once
class Developer{
    public void code( InnerTightlyCoupled_vs_Loosely desk){
        desk.code();
    }
}




public class TightlyCoupled_vs_Loosely {
    public static void main(String[] args) {
        Desktop desk =new Desktop();
        Laptop lap =new Laptop();
        Developer pratik =new Developer();
            
       pratik.code(lap);

    }
}
