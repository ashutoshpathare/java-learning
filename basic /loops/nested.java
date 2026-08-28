public class nested {
    public static void main(String[] args) {
        int x = 50;
        int y = 40;
        for(int i = 1; i < x; i++){
            for(int j = 1; j < y; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
