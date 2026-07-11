import tools.AdvCalc;

class Calc{
    public int add(int n1,int n2){
        return n1+n2;
    }
}


/////If we replacing the add method in advcalc it ll show the advcalc add not the add method present in calc

// class AdvCalc extends Calc{

//     public int add(int n1, int n2){
//         return n1+n2+1;
//     }
// }






public class MethodReplacing {
    public static void main(String[] args) {
        AdvCalc calc = new AdvCalc();
        int r=calc.add(2,3 );

        System.out.println(r);
    }
}
