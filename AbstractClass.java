abstract class Car{
    public abstract void  drive();

    

    public void playmusic(){
        System.out.println("plying...");
    }
}

class updatedCar extends Car{
    public void drive(){
        System.out.println("driving..");
    }
}



public class AbstractClass {
    public static void main(String[] args) {
        Car nano =new updatedCar();
        nano.drive();
        nano.playmusic();
    }
}
