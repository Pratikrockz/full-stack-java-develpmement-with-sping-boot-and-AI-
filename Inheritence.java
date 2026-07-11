import tools.AdvCalc;

public class Inheritence {
    public static void main(String[] args) {
        //Calc calc=new Calc();

        //As advClass is taking the propert of calc so we can use calc mathod also in adv calc
        AdvCalc calc =new AdvCalc();

        int r1=calc.add(5, 5);
        int r2=calc.sub(7, 3);

        int r3=calc.multi(5,5);
        int r4=calc.div(15, 5);

        System.out.println(r1+" "+r2+" "+r3+" "+r4);
    }
}
