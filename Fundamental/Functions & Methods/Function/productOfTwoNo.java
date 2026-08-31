import java.util.*;
public class productOfTwoNo {
    
    //Product Function
    public static int CalProduct(int a, int b){
        return a*b;
    }

    //Main Function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("The Product of 2 Numbers is " + CalProduct(a, b));
    }
}
