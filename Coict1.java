public class Coict1 {
    public int sum(int x, int y){
        return (x + y);
    }
    public int sum(int x, int y, int z){
        return (x + y + z);
    }
    public double sum(double x, double y){
        return (x + y);
    }
    public static void main(String[] args) {
        Coict1 C = new Coict1();
        System.out.println(C.sum(10,20));
        System.out.println(C.sum(10,20,30));
        System.out.println(C.sum(10, 20));
    }
}
