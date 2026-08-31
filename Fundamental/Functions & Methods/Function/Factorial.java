import java.util.*;
public class Factorial {
    
    //Loop
    public static void printFact(int n){
        if (n<0){
            System.out.println("Invalid Input");
            return;
        }

        //Loop for Factorial
        int factorial = 1;

        for(int i=n; i>=1; i--){
            factorial = factorial * i;
        }

        System.out.println(factorial);
        return;
    }

    //Main Function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printFact(n);
    }
}
