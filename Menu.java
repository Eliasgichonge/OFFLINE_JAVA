// public class Menu {
//     public static void main(String[] args) {
//         try {
//             int numbers []  ={1, 2, 3};
//             System.out.println(numbers[10]); //ArrayIndexOutOfBoundException: Index !0 out of bounds for length 3
//         }
//          catch (Exception e) {
//             System.out.println("Something went wrong");
//         }
//         finally{
//             System.out.println("The 'Try catch' is finished.");
//         }
//     }
// }
public class Menu {

    static void checkAge(int Age){
        if (Age<18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        } else {
            System.out.println("Access granted - You are old enough.");
        }
    }
    public static void main(String[] args) {
        checkAge(15); // Set age to 15 (which is below 18..)
    }
}