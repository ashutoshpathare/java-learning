import java.util.*;
public class twoNumberSum {

    //Function for addition of two numbers
    public static int Calculation(int a, int b){
        int sum = a + b;
        return sum;
    }

    //Main Function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = Calculation(a, b);
        System.out.println("Sum of two NUmbers is " + sum);
    }
}
