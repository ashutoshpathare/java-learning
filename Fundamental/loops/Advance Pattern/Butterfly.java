public class Butterfly {
    public static void main(String[] args) {

        int n = 5;

        //upper half
        for(int i=1; i<=n; i++){

            //fisrt part
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            //spaces
            int spaces = 2 * (n - i);
            
            for(int j=1; j<=spaces; j++){
                System.out.print(" ");
            }

            //secoond part
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            System.out.println();
        }

        //lower half
        for(int i=n; i>=1; i--){

            //fisrt part
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            //spaces
            int spaces = 2 * (n - i);
            
            for(int j=1; j<=spaces; j++){
                System.out.print(" ");
            }

            //secoond part
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
