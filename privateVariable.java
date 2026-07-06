
class human{
    private int age ;
    private String name;

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    public void setAge(int a){
        age=a;
    }

    public void setName(String n){
        name=n;
    }
}



public class privateVariable {
    public static void main(String[] args) {
        human me =new human();
        // me.age=11;
        // me.name="pratik";
        //System.out.println(me.name +" "+ me.age);

        me.setAge(27);

        me.setName("pratik");


        System.out.println(me.getName() +" "+ me.getAge());
    }
}
