class calculator{

    public int add(int n1,int n2){
        return n1+n2;
    }
    public int add(int n1,int n2,int n3){
        return n1+n2+n3;
    }
    public double add(double n1,double n2){
        return n1+n2;
    }
}



public class MethodOverriding {
    public static void main(String a[]) {
        calculator calc =new calculator();

        System.out.println(calc.add(2, 3));
        System.out.println(calc.add(2, 3,4));

    }
}
