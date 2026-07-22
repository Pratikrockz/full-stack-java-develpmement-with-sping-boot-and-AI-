public class ExceptionHandle {
    public static void main(String[] args) {
        int i=9;
        int j =0;
        int arr []=new int [5];
        String str= null;
        try{
            j=18/i;
            System.out.println(str.length());
            System.out.println(arr[5]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Stay within your limit "+e);
        }
        catch(ArithmeticException e){
            System.out.println("can not divide any number by 0 "+e);
        }
        //When we are not sure what is the actual error 
        // this Exception is super class of all exception it should be at bottom
        catch(Exception e){
            System.out.println("Rest of all exception "+e);
        }
        

        System.out.println(j);

        System.out.println("last");
    }
}
