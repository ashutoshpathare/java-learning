public class Recursion1 {
    public static void printNumb(int n) {
        if(n == 0){
            return;
        }
        System.out.println(n);
        printNumb(n-1);
    }
    public static void printNum2(int m) {
        if(m == 6){
            return;
        }
        System.out.println(m);
        printNum2(m+1);
    }
    public static void main(String[] args) {
        int n = 5;
        int m = 1;
        printNumb(n);
        printNum2(m);
    }
}
