class A{
    public void show(){
        System.out.println("this is class A");
    }
}


class B extends A{
    
    @Override
    public void show(){
        System.out.println("this is class B");
    }
}



class Annotation{
    public static void main(String[] args) {
        B obj = new B();
        obj.show();

    }
}