public class Bike extends Vehicle{
    void run(){
        System.out.println("Bike is running safely");
    }
    public static void main(String[] args) {
        Bike B = new Bike();
        B.run();
    }
}
