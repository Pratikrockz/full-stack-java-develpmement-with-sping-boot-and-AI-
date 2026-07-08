class Mobile{
    private String name;
    private int MobileCount;

    //Static variable is accessible for any object 

    private static int userId;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public static int getUserId() {
        return userId;
    }
    
    public int getMobileCount() {
        return MobileCount;
    }
    public void setMobileCount(int mobileCount) {
        this.MobileCount = mobileCount;
    }

    public Mobile(String name,int MobileCount){
        this.name=name;
        this.MobileCount=MobileCount;
    }

    public Mobile(){
        
    }

    public void setUserId(int userId){
        Mobile.userId=userId;
    }

    public int getUserId(int userId){
        return userId;
    }

    //Static methods

    public static void user(Mobile obj){
        System.out.println(obj.name+" "+obj.MobileCount+" "+userId);
    }

    
}




public class Staticvariable {
    public static void main(String[] args) {
        Mobile set =new Mobile("samsung",2);

        Mobile set1 =new Mobile("Nokia",10);


        //As userId is static we can write it this format

        //set1.userId=23;
        //set2.userId=23

        set.setUserId(23); //Set the value from set

        Mobile.user(set);

        System.out.println(set.getName()+" "+set.getMobileCount());

        System.out.println(set1.getName()+" "+set1.getMobileCount());

        System.out.println(set1.getUserId()); //Getting the value from set1 
        //System.out.println(Mobile.getUserId());
    }
}
