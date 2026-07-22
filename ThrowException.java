public class ThrowException {
    public static void main(String[] args) {
        int i =20;
        int j =0;

        try{
            j=18/i;
            //throw ll forcefully call the catch block where e = your constructor ;
            if(j==0){
                throw new ArithmeticException("I dont want to see the zero");
            }
        }
        catch(ArithmeticException e){
            System.out.println("This is the error "+e);
        }
    }
}
