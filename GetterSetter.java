public class GetterSetter {
    public static void main(String[] args) {
        human me = new human();
        me.setAge(29);
        me.setName("pratik");

        
        

        System.out.println(me.getAge() +" "+me.getName());
        
    }
}





class human{
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age; //this is referenceing the me object
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
}
