public class Bits {
    public static void main(String[] args) {
        int n = 5;
        int position = 2;
        int mask = 1<<position;

        if((mask & n) == 0) {
            System.out.println("Bit was zero");
        } else {
            System.out.println("Bit was one");
        }
    }
}
