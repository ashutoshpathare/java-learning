import java.util.*; public class cal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number A: ");
        int Num1 = sc.nextInt();
        System.out.println("Enter Number B: ");
        int Num2 = sc.nextInt();
        System.out.println("Enter A Operator: ");
        System.out.println(" 1 +\n 2 -\n 3 *\n 4 /\n 5 %");
        int op = sc.nextInt();

        switch (op){
            case 1 : System.out.println(Num1+Num2);
            break;
            case 2 : System.out.println(Num1-Num2);
            break;
            case 3 : System.out.println(Num1*Num2);
            break;
            case 4 : if(Num2 == 0){
                System.out.println("Invalid");
            } else {
                System.out.println(Num1/Num2);
                }
            break;
            case 5 : if(Num2 ==0){System.out.println("Invalid");} 
                    else {System.out.println(Num1%Num2);}
            break;
            default: System.out.println("INVALID OPERATOR");
        }

    }
}
