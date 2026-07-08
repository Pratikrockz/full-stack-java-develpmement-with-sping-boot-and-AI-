class registry{

    private int rollNo;
    private String name;
    private String section;


    public int getRollNo() {
        return rollNo;
    }
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSection() {
        return section;
    }
    public void setSection(String section) {
        this.section = section;
    }

    //Constructor which ll call itself every time I create a object & it 'll add default value 

    //Default constructor
    public registry(){
        rollNo=23;
        name="alex";
        section="a";
    }
//parameterized constructor
        public registry(int rollNo,String name, String section){
        this.rollNo=rollNo;
        this.name=name;
        this.section=section;

    }

}



public class Constructor {
    public static void main(String[] args) {
        //registry register=new registry(1,"max","c");

        registry register=new registry();
        
        
        System.out.println(register.getName()+" "+register.getRollNo()+" "+register.getSection());

        
    }
}
