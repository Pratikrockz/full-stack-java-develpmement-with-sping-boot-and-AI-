@FunctionalInterface





interface functionalInterface {
    void show();
}


// class A implements functionalInterface{
//     public void show(){
//         System.out.println("within show");
//     }
// }

class LambdaExpression {
    public static void main(String[] args) {
        functionalInterface show = () -> {
            System.out.println("within show");
        };

        show.show();
    }
}