class Student{
    String name;
    int marks;
    int rollNo;

}



public class ArrayOfObjects {
    public static void main(String[] args) {
        Student s1 =new Student();
        Student s2 =new Student();
        Student s3 =new Student();

        s1.name="Pratik";
        s1.marks=45;
        s1.rollNo=1;

        s2.name="Max";
        s2.marks=50;
        s2.rollNo=2;

        s3.name="power";
        s3.marks=99;
        s3.rollNo=3;

      
       
        Student arr[] = new Student[3];

        arr[0]=s1;
        arr[1]=s2;
        arr[2]=s3;

        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i].name +" whose roll no is " + arr[i].rollNo+ " got " +arr[i].marks);
        }


      

        

        
    }
}
