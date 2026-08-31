import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Value for A: ");
        int A = scanner.nextInt();
        System.out.println("Enter a Value for B: ");
        int B = scanner.nextInt();

        if(A == B) {
            System.out.println("Equal to");
        } else {
            if (A > B) {
                System.out.println("A is greater than B");
            } else {
               System.out.println("B is greater than A");
            }
        }
    }
}