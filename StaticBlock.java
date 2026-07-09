class Student{
    String name;
    static int roll;
    String divison;

    Student(){
        name="pratik";
        divison="A";
        //roll=1;
        System.out.println("within constructor");
        

    }
    //Constructor calling everytime when new obj is creating and each time  
    // static variable in creating which is not needed so introduced static block 

    static{
        roll=1;
        System.out.println("within static block");
    }



}




public class StaticBlock {
    public static void main(String[] args) throws ClassNotFoundException {
       

        //If we not creating any consructor static block also not created to achive that we have to use a method

        Class.forName("Student");

        // Student obj1=new Student();

        //System.out.println(obj1.name+" "+obj1.divison+" "+ obj1.roll);
    }
}
